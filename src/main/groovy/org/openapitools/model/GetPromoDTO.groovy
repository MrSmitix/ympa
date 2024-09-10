package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChannelType;
import org.openapitools.model.GetPromoAssortmentInfoDTO;
import org.openapitools.model.GetPromoBestsellerInfoDTO;
import org.openapitools.model.GetPromoConstraintsDTO;
import org.openapitools.model.GetPromoMechanicsInfoDTO;
import org.openapitools.model.PromoPeriodDTO;

@Canonical
class GetPromoDTO {
    /* Идентификатор акции. */
    String id
    /* Название акции. */
    String name
    
    PromoPeriodDTO period
    /* Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  */
    Boolean participating
    
    GetPromoAssortmentInfoDTO assortmentInfo
    
    GetPromoMechanicsInfoDTO mechanicsInfo
    
    GetPromoBestsellerInfoDTO bestsellerInfo
    /* Список каналов продвижения товаров. */
    List<ChannelType> channels
    
    GetPromoConstraintsDTO constraints
}
