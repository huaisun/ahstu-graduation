package com.huaisun.graduation.milk.form;

import com.huaisun.graduation.common.form.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author sunruiguang
 * @date 2019/3/20
 * Updated by sunruiguang on 2019/3/20.
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel
@Data
public class MilkMenuForm extends PageForm {

    @ApiModelProperty(value = "奶茶名", dataType = "String")
    private String milkName;

}