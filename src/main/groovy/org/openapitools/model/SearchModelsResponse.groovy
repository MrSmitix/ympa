package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.ModelDTO;

@Canonical
class SearchModelsResponse {
    /* Список моделей товаров. */
    List<ModelDTO> models = new ArrayList<>()
    
    CurrencyType currency
    /* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
    Long regionId
    
    FlippingPagerDTO pager
}
