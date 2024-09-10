package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CategoryDTO {
    /* Идентификатор категории. */
    Long id
    /* Название категории. */
    String name
    /* Дочерние категории. */
    List<CategoryDTO> children
}
