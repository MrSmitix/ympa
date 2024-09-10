/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.OfferCardStatusType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetOfferCardsContentStatusRequest {
  
  @SerializedName("offerIds")
  private Set<String> offerIds = null;
  @SerializedName("cardStatuses")
  private Set<OfferCardStatusType> cardStatuses = null;
  @SerializedName("categoryIds")
  private Set<Integer> categoryIds = null;

  /**
   * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
   **/
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ")
  public Set<String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(Set<String> offerIds) {
    this.offerIds = offerIds;
  }

  /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   **/
  @ApiModelProperty(value = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
  public Set<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }
  public void setCardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  /**
   * Фильтр по категориям на Маркете.
   **/
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  public Set<Integer> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = (GetOfferCardsContentStatusRequest) o;
    return (this.offerIds == null ? getOfferCardsContentStatusRequest.offerIds == null : this.offerIds.equals(getOfferCardsContentStatusRequest.offerIds)) &&
        (this.cardStatuses == null ? getOfferCardsContentStatusRequest.cardStatuses == null : this.cardStatuses.equals(getOfferCardsContentStatusRequest.cardStatuses)) &&
        (this.categoryIds == null ? getOfferCardsContentStatusRequest.categoryIds == null : this.categoryIds.equals(getOfferCardsContentStatusRequest.categoryIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.offerIds == null ? 0: this.offerIds.hashCode());
    result = 31 * result + (this.cardStatuses == null ? 0: this.cardStatuses.hashCode());
    result = 31 * result + (this.categoryIds == null ? 0: this.categoryIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferCardsContentStatusRequest {\n");
    
    sb.append("  offerIds: ").append(offerIds).append("\n");
    sb.append("  cardStatuses: ").append(cardStatuses).append("\n");
    sb.append("  categoryIds: ").append(categoryIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
