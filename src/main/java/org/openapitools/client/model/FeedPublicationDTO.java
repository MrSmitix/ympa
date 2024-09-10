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
import org.openapitools.client.model.FeedPublicationFullDTO;
import org.openapitools.client.model.FeedPublicationPriceAndStockUpdateDTO;
import org.openapitools.client.model.FeedStatusType;



/**
  * Информация о последней публикации предложений из прайс-листа на Маркете.
 **/

public class FeedPublicationDTO  {
  
  private FeedStatusType status;

  private FeedPublicationFullDTO full;

  private FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;

 /**
   * Get status
   * @return status
  **/
  public FeedStatusType getStatus() {
    return status;
  }

  /**
    * Set status
  **/
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  public FeedPublicationDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get full
   * @return full
  **/
  public FeedPublicationFullDTO getFull() {
    return full;
  }

  /**
    * Set full
  **/
  public void setFull(FeedPublicationFullDTO full) {
    this.full = full;
  }

  public FeedPublicationDTO full(FeedPublicationFullDTO full) {
    this.full = full;
    return this;
  }

 /**
   * Get priceAndStockUpdate
   * @return priceAndStockUpdate
  **/
  public FeedPublicationPriceAndStockUpdateDTO getPriceAndStockUpdate() {
    return priceAndStockUpdate;
  }

  /**
    * Set priceAndStockUpdate
  **/
  public void setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.priceAndStockUpdate = priceAndStockUpdate;
  }

  public FeedPublicationDTO priceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.priceAndStockUpdate = priceAndStockUpdate;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPublicationDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    priceAndStockUpdate: ").append(toIndentedString(priceAndStockUpdate)).append("\n");
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
