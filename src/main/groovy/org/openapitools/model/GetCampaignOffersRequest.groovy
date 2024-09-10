package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCampaignStatusType;

@Canonical
class GetCampaignOffersRequest {
    /* Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     */
    List<String> offerIds
    /* Фильтр по статусам товаров.  */
    List<OfferCampaignStatusType> statuses
    /* Фильтр по категориям на Маркете. */
    List<Integer> categoryIds
    /* Фильтр по брендам. */
    List<String> vendorNames
    /* Фильтр по тегам. */
    List<String> tags
}
