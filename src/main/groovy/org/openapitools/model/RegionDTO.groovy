package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RegionType;

@Canonical
class RegionDTO {
    /* Идентификатор региона. */
    Long id
    /* Название региона. */
    String name
    
    RegionType type
    
    RegionDTO parent
    /* Дочерние регионы. */
    List<RegionDTO> children
}
