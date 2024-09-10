package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCardStatusType;

@Canonical
class GetQuarantineOffersRequest {
    /* Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  */
    List<String> offerIds
    /* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
    List<OfferCardStatusType> cardStatuses
    /* Фильтр по категориям на Маркете. */
    List<Integer> categoryIds
    /* Фильтр по брендам. */
    List<String> vendorNames
    /* Фильтр по тегам. */
    List<String> tags
}
