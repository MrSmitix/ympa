package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о ярлыке для коробки.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public ParcelBoxLabelDTO () {

  }

  public ParcelBoxLabelDTO (String url, String supplierName, String deliveryServiceName, Long orderId, String orderNum, String recipientName, Long boxId, String fulfilmentId, String place, String weight, String deliveryServiceId, String deliveryAddress, String shipmentDate) {
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
    this.deliveryAddress = deliveryAddress;
    this.shipmentDate = shipmentDate;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("supplierName")
  public String getSupplierName() {
    return supplierName;
  }
  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

    
  @JsonProperty("deliveryServiceName")
  public String getDeliveryServiceName() {
    return deliveryServiceName;
  }
  public void setDeliveryServiceName(String deliveryServiceName) {
    this.deliveryServiceName = deliveryServiceName;
  }

    
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("orderNum")
  public String getOrderNum() {
    return orderNum;
  }
  public void setOrderNum(String orderNum) {
    this.orderNum = orderNum;
  }

    
  @JsonProperty("recipientName")
  public String getRecipientName() {
    return recipientName;
  }
  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

    
  @JsonProperty("boxId")
  public Long getBoxId() {
    return boxId;
  }
  public void setBoxId(Long boxId) {
    this.boxId = boxId;
  }

    
  @JsonProperty("fulfilmentId")
  public String getFulfilmentId() {
    return fulfilmentId;
  }
  public void setFulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
  }

    
  @JsonProperty("place")
  public String getPlace() {
    return place;
  }
  public void setPlace(String place) {
    this.place = place;
  }

    
  @JsonProperty("weight")
  public String getWeight() {
    return weight;
  }
  public void setWeight(String weight) {
    this.weight = weight;
  }

    
  @JsonProperty("deliveryServiceId")
  public String getDeliveryServiceId() {
    return deliveryServiceId;
  }
  public void setDeliveryServiceId(String deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

    
  @JsonProperty("deliveryAddress")
  public String getDeliveryAddress() {
    return deliveryAddress;
  }
  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

    
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
