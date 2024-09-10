package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.UpdateOfferMappingResultDTO;

@Canonical
class UpdateOfferMappingsResponse {
    
    ApiResponseStatusType status
    /* Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  */
    List<UpdateOfferMappingResultDTO> results
}
