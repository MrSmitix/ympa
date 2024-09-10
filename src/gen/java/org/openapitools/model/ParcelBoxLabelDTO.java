package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о ярлыке для коробки.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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
   **/
  
  @ApiModelProperty(required = true, value = "Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). ")
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Юридическое название магазина.
   **/
  
  @ApiModelProperty(required = true, value = "Юридическое название магазина.")
  @JsonProperty("supplierName")
  @NotNull
  public String getSupplierName() {
    return supplierName;
  }
  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  /**
   * Юридическое название службы доставки.
   **/
  
  @ApiModelProperty(required = true, value = "Юридическое название службы доставки.")
  @JsonProperty("deliveryServiceName")
  @NotNull
  public String getDeliveryServiceName() {
    return deliveryServiceName;
  }
  public void setDeliveryServiceName(String deliveryServiceName) {
    this.deliveryServiceName = deliveryServiceName;
  }

  /**
   * Идентификатор заказа в системе Маркета.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор заказа в системе Маркета.")
  @JsonProperty("orderId")
  @NotNull
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина. 
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. ")
  @JsonProperty("orderNum")
  @NotNull
  public String getOrderNum() {
    return orderNum;
  }
  public void setOrderNum(String orderNum) {
    this.orderNum = orderNum;
  }

  /**
   * Фамилия и инициалы получателя заказа.
   **/
  
  @ApiModelProperty(required = true, value = "Фамилия и инициалы получателя заказа.")
  @JsonProperty("recipientName")
  @NotNull
  public String getRecipientName() {
    return recipientName;
  }
  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  /**
   * Идентификатор коробки.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор коробки.")
  @JsonProperty("boxId")
  @NotNull
  public Long getBoxId() {
    return boxId;
  }
  public void setBoxId(Long boxId) {
    this.boxId = boxId;
  }

  /**
   * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д. 
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. ")
  @JsonProperty("fulfilmentId")
  @NotNull
  public String getFulfilmentId() {
    return fulfilmentId;
  }
  public void setFulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
  }

  /**
   * Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;. 
   **/
  
  @ApiModelProperty(required = true, value = "Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. ")
  @JsonProperty("place")
  @NotNull
  public String getPlace() {
    return place;
  }
  public void setPlace(String place) {
    this.place = place;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;. 
   **/
  
  @ApiModelProperty(required = true, value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. ")
  @JsonProperty("weight")
  @NotNull
  public String getWeight() {
    return weight;
  }
  public void setWeight(String weight) {
    this.weight = weight;
  }

  /**
   * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).")
  @JsonProperty("deliveryServiceId")
  @NotNull
  public String getDeliveryServiceId() {
    return deliveryServiceId;
  }
  public void setDeliveryServiceId(String deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  /**
   * Адрес получателя.
   **/
  
  @ApiModelProperty(value = "Адрес получателя.")
  @JsonProperty("deliveryAddress")
  public String getDeliveryAddress() {
    return deliveryAddress;
  }
  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  /**
   * Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.
   **/
  
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
    return Objects.equals(this.url, parcelBoxLabelDTO.url) &&
        Objects.equals(this.supplierName, parcelBoxLabelDTO.supplierName) &&
        Objects.equals(this.deliveryServiceName, parcelBoxLabelDTO.deliveryServiceName) &&
        Objects.equals(this.orderId, parcelBoxLabelDTO.orderId) &&
        Objects.equals(this.orderNum, parcelBoxLabelDTO.orderNum) &&
        Objects.equals(this.recipientName, parcelBoxLabelDTO.recipientName) &&
        Objects.equals(this.boxId, parcelBoxLabelDTO.boxId) &&
        Objects.equals(this.fulfilmentId, parcelBoxLabelDTO.fulfilmentId) &&
        Objects.equals(this.place, parcelBoxLabelDTO.place) &&
        Objects.equals(this.weight, parcelBoxLabelDTO.weight) &&
        Objects.equals(this.deliveryServiceId, parcelBoxLabelDTO.deliveryServiceId) &&
        Objects.equals(this.deliveryAddress, parcelBoxLabelDTO.deliveryAddress) &&
        Objects.equals(this.shipmentDate, parcelBoxLabelDTO.shipmentDate);
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

