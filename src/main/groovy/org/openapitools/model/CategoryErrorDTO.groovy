package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CategoryErrorType;

@Canonical
class CategoryErrorDTO {
    /* Идентификатор категории. */
    Long categoryId
    
    CategoryErrorType type
}
