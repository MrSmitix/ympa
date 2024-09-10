package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ModelOfferDTO;
import org.openapitools.model.ModelPriceDTO;

@Canonical
class EnrichedModelDTO {
    /* Идентификатор модели товара. */
    Long id
    /* Название модели товара. */
    String name
    
    ModelPriceDTO prices
    /* Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  */
    List<ModelOfferDTO> offers
    /* Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. */
    Integer offlineOffers
    /* Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. */
    Integer onlineOffers
}
