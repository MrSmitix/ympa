package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о ярлыке для коробки.
 */
@ApiModel(description="Информация о ярлыке для коробки.")

public class ParcelBoxLabelDTO  {
  
 /**
  * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
  */
  @ApiModelProperty(required = true, value = "Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). ")
  private String url;

 /**
  * Юридическое название магазина.
  */
  @ApiModelProperty(required = true, value = "Юридическое название магазина.")
  private String supplierName;

 /**
  * Юридическое название службы доставки.
  */
  @ApiModelProperty(required = true, value = "Юридическое название службы доставки.")
  private String deliveryServiceName;

 /**
  * Идентификатор заказа в системе Маркета.
  */
  @ApiModelProperty(required = true, value = "Идентификатор заказа в системе Маркета.")
  private Long orderId;

 /**
  * Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
  */
  @ApiModelProperty(required = true, value = "Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. ")
  private String orderNum;

 /**
  * Фамилия и инициалы получателя заказа.
  */
  @ApiModelProperty(required = true, value = "Фамилия и инициалы получателя заказа.")
  private String recipientName;

 /**
  * Идентификатор коробки.
  */
  @ApiModelProperty(required = true, value = "Идентификатор коробки.")
  private Long boxId;

 /**
  * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
  */
  @ApiModelProperty(required = true, value = "Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. ")
  private String fulfilmentId;

 /**
  * Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
  */
  @ApiModelProperty(required = true, value = "Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. ")
  private String place;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
  */
  @ApiModelProperty(required = true, value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. ")
  private String weight;

 /**
  * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  */
  @ApiModelProperty(required = true, value = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).")
  private String deliveryServiceId;

 /**
  * Адрес получателя.
  */
  @ApiModelProperty(value = "Адрес получателя.")
  private String deliveryAddress;

 /**
  * Дата отгрузки в формате `dd.MM.yyyy`.
  */
  @ApiModelProperty(value = "Дата отгрузки в формате `dd.MM.yyyy`.")
  private String shipmentDate;
 /**
  * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
  * @return url
  */
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public ParcelBoxLabelDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Юридическое название магазина.
  * @return supplierName
  */
  @JsonProperty("supplierName")
  @NotNull
  public String getSupplierName() {
    return supplierName;
  }

  /**
   * Sets the <code>supplierName</code> property.
   */
 public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  /**
   * Sets the <code>supplierName</code> property.
   */
  public ParcelBoxLabelDTO supplierName(String supplierName) {
    this.supplierName = supplierName;
    return this;
  }

 /**
  * Юридическое название службы доставки.
  * @return deliveryServiceName
  */
  @JsonProperty("deliveryServiceName")
  @NotNull
  public String getDeliveryServiceName() {
    return deliveryServiceName;
  }

  /**
   * Sets the <code>deliveryServiceName</code> property.
   */
 public void setDeliveryServiceName(String deliveryServiceName) {
    this.deliveryServiceName = deliveryServiceName;
  }

  /**
   * Sets the <code>deliveryServiceName</code> property.
   */
  public ParcelBoxLabelDTO deliveryServiceName(String deliveryServiceName) {
    this.deliveryServiceName = deliveryServiceName;
    return this;
  }

 /**
  * Идентификатор заказа в системе Маркета.
  * @return orderId
  */
  @JsonProperty("orderId")
  @NotNull
  public Long getOrderId() {
    return orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
 public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
  public ParcelBoxLabelDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
  * Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина. 
  * @return orderNum
  */
  @JsonProperty("orderNum")
  @NotNull
  public String getOrderNum() {
    return orderNum;
  }

  /**
   * Sets the <code>orderNum</code> property.
   */
 public void setOrderNum(String orderNum) {
    this.orderNum = orderNum;
  }

  /**
   * Sets the <code>orderNum</code> property.
   */
  public ParcelBoxLabelDTO orderNum(String orderNum) {
    this.orderNum = orderNum;
    return this;
  }

 /**
  * Фамилия и инициалы получателя заказа.
  * @return recipientName
  */
  @JsonProperty("recipientName")
  @NotNull
  public String getRecipientName() {
    return recipientName;
  }

  /**
   * Sets the <code>recipientName</code> property.
   */
 public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  /**
   * Sets the <code>recipientName</code> property.
   */
  public ParcelBoxLabelDTO recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

 /**
  * Идентификатор коробки.
  * @return boxId
  */
  @JsonProperty("boxId")
  @NotNull
  public Long getBoxId() {
    return boxId;
  }

  /**
   * Sets the <code>boxId</code> property.
   */
 public void setBoxId(Long boxId) {
    this.boxId = boxId;
  }

  /**
   * Sets the <code>boxId</code> property.
   */
  public ParcelBoxLabelDTO boxId(Long boxId) {
    this.boxId = boxId;
    return this;
  }

 /**
  * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д. 
  * @return fulfilmentId
  */
  @JsonProperty("fulfilmentId")
  @NotNull
  public String getFulfilmentId() {
    return fulfilmentId;
  }

  /**
   * Sets the <code>fulfilmentId</code> property.
   */
 public void setFulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
  }

  /**
   * Sets the <code>fulfilmentId</code> property.
   */
  public ParcelBoxLabelDTO fulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
    return this;
  }

 /**
  * Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;. 
  * @return place
  */
  @JsonProperty("place")
  @NotNull
  public String getPlace() {
    return place;
  }

  /**
   * Sets the <code>place</code> property.
   */
 public void setPlace(String place) {
    this.place = place;
  }

  /**
   * Sets the <code>place</code> property.
   */
  public ParcelBoxLabelDTO place(String place) {
    this.place = place;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;. 
  * @return weight
  */
  @JsonProperty("weight")
  @NotNull
  public String getWeight() {
    return weight;
  }

  /**
   * Sets the <code>weight</code> property.
   */
 public void setWeight(String weight) {
    this.weight = weight;
  }

  /**
   * Sets the <code>weight</code> property.
   */
  public ParcelBoxLabelDTO weight(String weight) {
    this.weight = weight;
    return this;
  }

 /**
  * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  * @return deliveryServiceId
  */
  @JsonProperty("deliveryServiceId")
  @NotNull
  public String getDeliveryServiceId() {
    return deliveryServiceId;
  }

  /**
   * Sets the <code>deliveryServiceId</code> property.
   */
 public void setDeliveryServiceId(String deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  /**
   * Sets the <code>deliveryServiceId</code> property.
   */
  public ParcelBoxLabelDTO deliveryServiceId(String deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

 /**
  * Адрес получателя.
  * @return deliveryAddress
  */
  @JsonProperty("deliveryAddress")
  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  /**
   * Sets the <code>deliveryAddress</code> property.
   */
 public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  /**
   * Sets the <code>deliveryAddress</code> property.
   */
  public ParcelBoxLabelDTO deliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

 /**
  * Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.
  * @return shipmentDate
  */
  @JsonProperty("shipmentDate")
  public String getShipmentDate() {
    return shipmentDate;
  }

  /**
   * Sets the <code>shipmentDate</code> property.
   */
 public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  /**
   * Sets the <code>shipmentDate</code> property.
   */
  public ParcelBoxLabelDTO shipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

