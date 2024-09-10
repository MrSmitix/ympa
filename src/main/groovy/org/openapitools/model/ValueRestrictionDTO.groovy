package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OptionValuesLimitedDTO;

@Canonical
class ValueRestrictionDTO {
    /* Идентификатор ограничивающей характеристики. */
    Long limitingParameterId
    /* Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. */
    List<OptionValuesLimitedDTO> limitedValues = new ArrayList<>()
}
