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
import org.openapitools.client.model.ParcelBoxLabelDTO;



/**
  * Данные для печати ярлыка.
 **/

public class OrderLabelDTO  {
  
 /**
   * Идентификатор заказа.
  **/
  private Long orderId;

 /**
   * Количество коробок в заказе.
  **/
  private Integer placesNumber;

 /**
   * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
  **/
  private String url;

 /**
   * Информация на ярлыке.
  **/
  private List<ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>();

 /**
   * Идентификатор заказа.
   * @return orderId
  **/
  public Long getOrderId() {
    return orderId;
  }

  /**
    * Set orderId
  **/
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public OrderLabelDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Количество коробок в заказе.
   * @return placesNumber
  **/
  public Integer getPlacesNumber() {
    return placesNumber;
  }

  /**
    * Set placesNumber
  **/
  public void setPlacesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
  }

  public OrderLabelDTO placesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
    return this;
  }

 /**
   * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  /**
    * Set url
  **/
  public void setUrl(String url) {
    this.url = url;
  }

  public OrderLabelDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Информация на ярлыке.
   * @return parcelBoxLabels
  **/
  public List<ParcelBoxLabelDTO> getParcelBoxLabels() {
    return parcelBoxLabels;
  }

  /**
    * Set parcelBoxLabels
  **/
  public void setParcelBoxLabels(List<ParcelBoxLabelDTO> parcelBoxLabels) {
    this.parcelBoxLabels = parcelBoxLabels;
  }

  public OrderLabelDTO parcelBoxLabels(List<ParcelBoxLabelDTO> parcelBoxLabels) {
    this.parcelBoxLabels = parcelBoxLabels;
    return this;
  }

  public OrderLabelDTO addParcelBoxLabelsItem(ParcelBoxLabelDTO parcelBoxLabelsItem) {
    this.parcelBoxLabels.add(parcelBoxLabelsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLabelDTO {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    placesNumber: ").append(toIndentedString(placesNumber)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    parcelBoxLabels: ").append(toIndentedString(parcelBoxLabels)).append("\n");
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

