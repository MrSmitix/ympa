package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UnitDTO;

@Canonical
class CategoryParameterUnitDTO {
    /* Единица измерения по умолчанию. */
    Long defaultUnitId
    /* Допустимые единицы измерения. */
    List<UnitDTO> units = new ArrayList<>()
}
