package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FieldStateType;
import org.openapitools.model.PriceCompetitivenessType;

@Canonical
class GetOfferRecommendationsRequest {
    /* Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. */
    List<String> offerIds
    
    FieldStateType cofinancePriceFilter
    
    FieldStateType recommendedCofinancePriceFilter
    
    PriceCompetitivenessType competitivenessFilter
}
