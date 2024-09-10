package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.CategoryErrorDTO;
import org.openapitools.model.MaxSaleQuantumDTO;

@Canonical
class GetCategoriesMaxSaleQuantumResponse {
    
    ApiResponseStatusType status
    /* Категории и лимит на установку кванта и минимального количества товаров. */
    List<MaxSaleQuantumDTO> results = new ArrayList<>()
    /* Ошибки, которые появились из-за переданных категорий. */
    List<CategoryErrorDTO> errors
}
