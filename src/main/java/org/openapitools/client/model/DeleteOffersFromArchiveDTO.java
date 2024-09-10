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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.NoSuchElementException;



/**
  * Товары, которые не удалось восстановить из архива.
 **/

public class DeleteOffersFromArchiveDTO  {
  
 /**
   * Список товаров, которые не удалось восстановить из архива.
  **/
  private List<String> notUnarchivedOfferIds = null;

 /**
   * Список товаров, которые не удалось восстановить из архива.
   * @return notUnarchivedOfferIds
  **/
  public List<String> getNotUnarchivedOfferIds() {
    return notUnarchivedOfferIds;
  }

  /**
    * Set notUnarchivedOfferIds
  **/
  public void setNotUnarchivedOfferIds(List<String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
  }

  public DeleteOffersFromArchiveDTO notUnarchivedOfferIds(List<String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
    return this;
  }

  public DeleteOffersFromArchiveDTO addNotUnarchivedOfferIdsItem(String notUnarchivedOfferIdsItem) {
    this.notUnarchivedOfferIds.add(notUnarchivedOfferIdsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOffersFromArchiveDTO {\n");
    
    sb.append("    notUnarchivedOfferIds: ").append(toIndentedString(notUnarchivedOfferIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

