package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class OptionValuesLimitedDTO {
    /* Идентификатор значения ограничивающей характеристики. */
    Long limitingOptionValueId
    /* Идентификаторы допустимых значений ограничиваемой характеристики.  */
    List<Long> optionValueIds = new ArrayList<>()
}
