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
import org.openapitools.client.model.WarehouseOfferDTO;



/**
  * Информация об остатках товаров на складе.
 **/

public class WarehouseOffersDTO  {
  
 /**
   * Идентификатор склада.
  **/
  private Long warehouseId;

 /**
   * Информация об остатках.
  **/
  private List<WarehouseOfferDTO> offers = new ArrayList<>();

 /**
   * Идентификатор склада.
   * @return warehouseId
  **/
  public Long getWarehouseId() {
    return warehouseId;
  }

  /**
    * Set warehouseId
  **/
  public void setWarehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
  }

  public WarehouseOffersDTO warehouseId(Long warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

 /**
   * Информация об остатках.
   * @return offers
  **/
  public List<WarehouseOfferDTO> getOffers() {
    return offers;
  }

  /**
    * Set offers
  **/
  public void setOffers(List<WarehouseOfferDTO> offers) {
    this.offers = offers;
  }

  public WarehouseOffersDTO offers(List<WarehouseOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public WarehouseOffersDTO addOffersItem(WarehouseOfferDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseOffersDTO {\n");
    
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

