package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о ярлыке для коробки.
 */

@Schema(name = "ParcelBoxLabelDTO", description = "Информация о ярлыке для коробки.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParcelBoxLabelDTO {

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

  public ParcelBoxLabelDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ParcelBoxLabelDTO(String url, String supplierName, String deliveryServiceName, Long orderId, String orderNum, String recipientName, Long boxId, String fulfilmentId, String place, String weight, String deliveryServiceId) {
    this.url = url;
    this.supplierName = supplierName;
    this.deliveryServiceName = deliveryServiceName;
    this.orderId = orderId;
    this.orderNum = orderNum;
    this.recipientName = recipientName;
    this.boxId = boxId;
    this.fulfilmentId = fulfilmentId;
    this.place = place;
    this.weight = weight;
    this.deliveryServiceId = deliveryServiceId;
  }

  public ParcelBoxLabelDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
   * @return url
   */
  @NotNull 
  @Schema(name = "url", description = "Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ParcelBoxLabelDTO supplierName(String supplierName) {
    this.supplierName = supplierName;
    return this;
  }

  /**
   * Юридическое название магазина.
   * @return supplierName
   */
  @NotNull 
  @Schema(name = "supplierName", description = "Юридическое название магазина.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supplierName")
  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  public ParcelBoxLabelDTO deliveryServiceName(String deliveryServiceName) {
    this.deliveryServiceName = deliveryServiceName;
    return this;
  }

  /**
   * Юридическое название службы доставки.
   * @return deliveryServiceName
   */
  @NotNull 
  @Schema(name = "deliveryServiceName", description = "Юридическое название службы доставки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deliveryServiceName")
  public String getDeliveryServiceName() {
    return deliveryServiceName;
  }

  public void setDeliveryServiceName(String deliveryServiceName) {
    this.deliveryServiceName = deliveryServiceName;
  }

  public ParcelBoxLabelDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Идентификатор заказа в системе Маркета.
   * @return orderId
   */
  @NotNull 
  @Schema(name = "orderId", description = "Идентификатор заказа в системе Маркета.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ParcelBoxLabelDTO orderNum(String orderNum) {
    this.orderNum = orderNum;
    return this;
  }

  /**
   * Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
   * @return orderNum
   */
  @NotNull 
  @Schema(name = "orderNum", description = "Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderNum")
  public String getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(String orderNum) {
    this.orderNum = orderNum;
  }

  public ParcelBoxLabelDTO recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  /**
   * Фамилия и инициалы получателя заказа.
   * @return recipientName
   */
  @NotNull 
  @Schema(name = "recipientName", description = "Фамилия и инициалы получателя заказа.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recipientName")
  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  public ParcelBoxLabelDTO boxId(Long boxId) {
    this.boxId = boxId;
    return this;
  }

  /**
   * Идентификатор коробки.
   * @return boxId
   */
  @NotNull 
  @Schema(name = "boxId", description = "Идентификатор коробки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("boxId")
  public Long getBoxId() {
    return boxId;
  }

  public void setBoxId(Long boxId) {
    this.boxId = boxId;
  }

  public ParcelBoxLabelDTO fulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
    return this;
  }

  /**
   * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
   * @return fulfilmentId
   */
  @NotNull 
  @Schema(name = "fulfilmentId", description = "Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fulfilmentId")
  public String getFulfilmentId() {
    return fulfilmentId;
  }

  public void setFulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
  }

  public ParcelBoxLabelDTO place(String place) {
    this.place = place;
    return this;
  }

  /**
   * Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
   * @return place
   */
  @NotNull 
  @Schema(name = "place", description = "Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("place")
  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public ParcelBoxLabelDTO weight(String weight) {
    this.weight = weight;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
   * @return weight
   */
  @NotNull 
  @Schema(name = "weight", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("weight")
  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public ParcelBoxLabelDTO deliveryServiceId(String deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

  /**
   * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
   * @return deliveryServiceId
   */
  @NotNull 
  @Schema(name = "deliveryServiceId", description = "Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deliveryServiceId")
  public String getDeliveryServiceId() {
    return deliveryServiceId;
  }

  public void setDeliveryServiceId(String deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  public ParcelBoxLabelDTO deliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Адрес получателя.
   * @return deliveryAddress
   */
  
  @Schema(name = "deliveryAddress", description = "Адрес получателя.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryAddress")
  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public ParcelBoxLabelDTO shipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

  /**
   * Дата отгрузки в формате `dd.MM.yyyy`.
   * @return shipmentDate
   */
  
  @Schema(name = "shipmentDate", description = "Дата отгрузки в формате `dd.MM.yyyy`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

