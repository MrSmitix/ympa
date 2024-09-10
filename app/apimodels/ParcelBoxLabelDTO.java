package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о ярлыке для коробки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ParcelBoxLabelDTO   {
  @JsonProperty("url")
  @NotNull

  private String url;

  @JsonProperty("supplierName")
  @NotNull

  private String supplierName;

  @JsonProperty("deliveryServiceName")
  @NotNull

  private String deliveryServiceName;

  @JsonProperty("orderId")
  @NotNull

  private Long orderId;

  @JsonProperty("orderNum")
  @NotNull

  private String orderNum;

  @JsonProperty("recipientName")
  @NotNull

  private String recipientName;

  @JsonProperty("boxId")
  @NotNull

  private Long boxId;

  @JsonProperty("fulfilmentId")
  @NotNull

  private String fulfilmentId;

  @JsonProperty("place")
  @NotNull

  private String place;

  @JsonProperty("weight")
  @NotNull

  private String weight;

  @JsonProperty("deliveryServiceId")
  @NotNull

  private String deliveryServiceId;

  @JsonProperty("deliveryAddress")
  
  private String deliveryAddress;

  @JsonProperty("shipmentDate")
  
  private String shipmentDate;

  public ParcelBoxLabelDTO url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
   * @return url
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

