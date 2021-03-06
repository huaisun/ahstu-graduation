$(function () {
    milk.loadMilkMenu();
    milk.editClick();
    milk.clearMilkModal();
    milk.selectUser();
});

var milk = {};

//通过接口获取数据
milk.loadMilkMenu = function () {
    $.ajax({
        url: '/sun/milk/searchMilkMenu',
        data: {isShelf: 1},
        type: 'GET',
        success: function (result) {
            $("#milk-menu").html("");
            var start = '<div class="card-deck">';
            var list = '';
            $.each(result.data, function (item, val) {
                var card = '<div class="card col-md-2"><img src="../static/images/milk/' + val.milkAddress +
                    '" class="card-img-top" alt="' + val.milkName +
                    '"><div class="card-body"><h5 class="card-title">' + val.milkName +
                    '</h5><p class="card-text">价格:&nbsp;<code>$' + val.milkPrice +
                    '</code></p><button type="button" class="btn btn-outline-warning btn-sm float-left" onclick="milkDown(' + val.id +
                    ')">下架</button><button type="button" class="btn btn-outline-success btn-sm float-right" onclick="buyMilk(' + val.id +
                    ')">下单</button></div></div>';
                if ((item + 1) % 5 === 1) {
                    list = list + start + card;
                } else if ((item + 1) % 5 === 0) {
                    list = list + card + '</div>';
                } else {
                    list = list + card;
                }
            });
            $('#milk-menu').append(list);
        }
    });
};

//通过返回的数据进行渲染到表格中
milk.loadMilkTable = function () {
    $.ajax({
        url: '/sun/milk/searchMilkMenu',
        type: 'GET',
        data: {},
        success: function (result) {
            $("#milk-menu-table").html("");
            $.each(result.data, function (item, val) {
                var table = '<tr><th scope="row">' + (item + 1) +
                    '</th><td>' + val.milkName +
                    '</td><td>' + val.milkPrice +
                    '</td><td>' + val.milkAddress +
                    '</td><td><i class="mdi mdi-tooltip-edit text-warning" data-toggle="modal" data-target="#exampleModal" title="编辑" onclick="editMilk(' + val.id +
                    ')">&nbsp;&nbsp;&nbsp;&nbsp;</i><i class="mdi mdi-delete text-danger" title="删除" onclick="deleteMilk(' + val.id +
                    ')">&nbsp;&nbsp;&nbsp;&nbsp;</i><i class="mdi mdi-upload text-danger milk-up" title="上架" onclick="milkUp(' + val.id +
                    ')"></i></td></tr>';
                $("#milk-menu-table").append(table);
                if (val.isShelf === 1) {
                    $(".milk-up").hide();
                }
            });
        }
    });
};

milk.editClick = function () {
    $("#editMilkTable").click(function () {
        milk.loadMilkTable();
    })
};

milk.closeClick = function () {
    $('#exampleModal').on('hidden.bs.modal', function () {
        $("#exampleModalLabel").html("添加奶茶菜单");
        $("#editModal").css('z-index', 1041);
    });
};

milk.checkMilkAddress = function () {
    var address = $("#inputMilkAddress").val();
    return !(address === undefined || address === "" || address.trim() === "");
};

milk.checkMilkPrice = function () {
    var price = $("#inputMilkPrice").val();
    var reg = /^[0-9]+(\.[0-9]{2})?$/;
    if (price === undefined || price === '' || price.trim() === '') {
        return false;
    }
    return !!price.match(reg);
};

milk.checkMilkName = function () {
    var name = $("#inputMilkName").val();
    return !(name === undefined || name === "" || name.trim() === "");

};

milk.clearMilkModal = function () {
    $('#exampleModal').on('hidden.bs.modal', function () {
        $("#inputMilkName").val('');
        $("#inputMilkPrice").val('');
        $("#inputMilkAddress").val('');
    });
};

milk.selectUser = function () {
    $("#buyUser").click(function () {
        $("#userPopover").popover('show');
    });
};

function editMilk(id) {
    $("#editModal").css('z-index', 999);
    $("#exampleModalLabel").html("编辑奶茶菜单");
    $.ajax({
        url: '/sun/milk/getMilk',
        type: 'GET',
        data: {id: id},
        success: function (result) {
            $("#inputMilkId").val(result.data.id);
            $("#inputMilkName").val(result.data.milkName);
            $("#inputMilkPrice").val(result.data.milkPrice);
            $("#inputMilkAddress").val(result.data.milkAddress);
        }
    });
    milk.closeClick();
}

function deleteMilk(id) {
    var msg = confirm("确定删除吗?");
    if (msg) {
        $.ajax({
            url: 'sun/user/deleteUser',
            type: 'DELETE',
            data: {id: id},
            success: function (result) {
                alert(result.msg);
                user.loadUser();
            }
        })
    }
}

function milkDown(id) {
    var msg = confirm("确定下架吗?");
    if (msg) {
        $.ajax({
            url: '/sun/milk/save_update',
            type: 'POST',
            data: {
                id: id, isShelf: 0
            },
            success: function (result) {
                if (result.code === 1)
                    milk.loadMilkMenu();
                else {
                    alert(result.msg);
                }
            }
        })
    }
}

function milkUp(id) {
    $.ajax({
        url: '/sun/milk/save_update',
        type: 'POST',
        data: {
            id: id, isShelf: 1
        },
        success: function (result) {
            if (result.code === 1)
                milk.loadMilkMenu();
            else {
                alert(result.msg);
            }
        }
    })
}

function buyMilk(id) {
    $('#buyMilkModal').modal('show');
    $.ajax({
        url: '/sun/milk/getMilk',
        type: 'GET',
        data: {id: id},
        success: function (result) {
            return result;
        }
    });
}
