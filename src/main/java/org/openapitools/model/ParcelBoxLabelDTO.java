/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Информация о ярлыке для коробки.
 */

@ApiModel(description = "Информация о ярлыке для коробки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParcelBoxLabelDTO   {
  
  private String url;
  private String supplierName;
  private String deliveryServiceName;
  private Long orderId;
  private String orderNum;
  private String recipientName;
  private Long boxId;
  private String fulfilmentId;
  private String place;
  private String weight;
  private String deliveryServiceId;
  private String deliveryAddress;
  private String shipmentDate;

  /**
   * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
   */
  public ParcelBoxLabelDTO url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). ")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Юридическое название магазина.
   */
  public ParcelBoxLabelDTO supplierName(String supplierName) {
    this.supplierName = supplierName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Юридическое название магазина.")
  @JsonProperty("supplierName")
  public String getSupplierName() {
    return supplierName;
  }
  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  /**
   * Юридическое название службы доставки.
   */
  public ParcelBoxLabelDTO deliveryServiceName(String deliveryServiceName) {
    this.deliveryServiceName = deliveryServiceName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Юридическое название службы доставки.")
  @JsonProperty("deliveryServiceName")
  public String getDeliveryServiceName() {
    return deliveryServiceName;
  }
  public void setDeliveryServiceName(String deliveryServiceName) {
    this.deliveryServiceName = deliveryServiceName;
  }

  /**
   * Идентификатор заказа в системе Маркета.
   */
  public ParcelBoxLabelDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор заказа в системе Маркета.")
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
   */
  public ParcelBoxLabelDTO orderNum(String orderNum) {
    this.orderNum = orderNum;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. ")
  @JsonProperty("orderNum")
  public String getOrderNum() {
    return orderNum;
  }
  public void setOrderNum(String orderNum) {
    this.orderNum = orderNum;
  }

  /**
   * Фамилия и инициалы получателя заказа.
   */
  public ParcelBoxLabelDTO recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Фамилия и инициалы получателя заказа.")
  @JsonProperty("recipientName")
  public String getRecipientName() {
    return recipientName;
  }
  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  /**
   * Идентификатор коробки.
   */
  public ParcelBoxLabelDTO boxId(Long boxId) {
    this.boxId = boxId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор коробки.")
  @JsonProperty("boxId")
  public Long getBoxId() {
    return boxId;
  }
  public void setBoxId(Long boxId) {
    this.boxId = boxId;
  }

  /**
   * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
   */
  public ParcelBoxLabelDTO fulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. ")
  @JsonProperty("fulfilmentId")
  public String getFulfilmentId() {
    return fulfilmentId;
  }
  public void setFulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
  }

  /**
   * Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
   */
  public ParcelBoxLabelDTO place(String place) {
    this.place = place;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. ")
  @JsonProperty("place")
  public String getPlace() {
    return place;
  }
  public void setPlace(String place) {
    this.place = place;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
   */
  public ParcelBoxLabelDTO weight(String weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. ")
  @JsonProperty("weight")
  public String getWeight() {
    return weight;
  }
  public void setWeight(String weight) {
    this.weight = weight;
  }

  /**
   * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
   */
  public ParcelBoxLabelDTO deliveryServiceId(String deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).")
  @JsonProperty("deliveryServiceId")
  public String getDeliveryServiceId() {
    return deliveryServiceId;
  }
  public void setDeliveryServiceId(String deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  /**
   * Адрес получателя.
   */
  public ParcelBoxLabelDTO deliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  
  @ApiModelProperty(value = "Адрес получателя.")
  @JsonProperty("deliveryAddress")
  public String getDeliveryAddress() {
    return deliveryAddress;
  }
  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  /**
   * Дата отгрузки в формате `dd.MM.yyyy`.
   */
  public ParcelBoxLabelDTO shipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата отгрузки в формате `dd.MM.yyyy`.")
  @JsonProperty("shipmentDate")
  public String getShipmentDate() {
    return shipmentDate;
  }
  public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelBoxLabelDTO parcelBoxLabelDTO = (ParcelBoxLabelDTO) o;
    return Objects.equals(url, parcelBoxLabelDTO.url) &&
        Objects.equals(supplierName, parcelBoxLabelDTO.supplierName) &&
        Objects.equals(deliveryServiceName, parcelBoxLabelDTO.deliveryServiceName) &&
        Objects.equals(orderId, parcelBoxLabelDTO.orderId) &&
        Objects.equals(orderNum, parcelBoxLabelDTO.orderNum) &&
        Objects.equals(recipientName, parcelBoxLabelDTO.recipientName) &&
        Objects.equals(boxId, parcelBoxLabelDTO.boxId) &&
        Objects.equals(fulfilmentId, parcelBoxLabelDTO.fulfilmentId) &&
        Objects.equals(place, parcelBoxLabelDTO.place) &&
        Objects.equals(weight, parcelBoxLabelDTO.weight) &&
        Objects.equals(deliveryServiceId, parcelBoxLabelDTO.deliveryServiceId) &&
        Objects.equals(deliveryAddress, parcelBoxLabelDTO.deliveryAddress) &&
        Objects.equals(shipmentDate, parcelBoxLabelDTO.shipmentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, supplierName, deliveryServiceName, orderId, orderNum, recipientName, boxId, fulfilmentId, place, weight, deliveryServiceId, deliveryAddress, shipmentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelBoxLabelDTO {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    supplierName: ").append(toIndentedString(supplierName)).append("\n");
    sb.append("    deliveryServiceName: ").append(toIndentedString(deliveryServiceName)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderNum: ").append(toIndentedString(orderNum)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    fulfilmentId: ").append(toIndentedString(fulfilmentId)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    deliveryServiceId: ").append(toIndentedString(deliveryServiceId)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    shipmentDate: ").append(toIndentedString(shipmentDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

