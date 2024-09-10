package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParcelBoxLabelDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные для печати ярлыка.
 **/
@ApiModel(description="Данные для печати ярлыка.")

public class OrderLabelDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
 /**
   * Идентификатор заказа.
  **/
  private Long orderId;

  @ApiModelProperty(required = true, value = "Количество коробок в заказе.")
 /**
   * Количество коробок в заказе.
  **/
  private Integer placesNumber;

  @ApiModelProperty(required = true, value = "URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). ")
 /**
   * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
  **/
  private String url;

  @ApiModelProperty(required = true, value = "Информация на ярлыке.")
 /**
   * Информация на ярлыке.
  **/
  private List<ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>();
 /**
   * Идентификатор заказа.
   * @return orderId
  **/
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }

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
  @JsonProperty("placesNumber")
  public Integer getPlacesNumber() {
    return placesNumber;
  }

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
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

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
  @JsonProperty("parcelBoxLabels")
  public List<ParcelBoxLabelDTO> getParcelBoxLabels() {
    return parcelBoxLabels;
  }

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLabelDTO orderLabelDTO = (OrderLabelDTO) o;
    return Objects.equals(this.orderId, orderLabelDTO.orderId) &&
        Objects.equals(this.placesNumber, orderLabelDTO.placesNumber) &&
        Objects.equals(this.url, orderLabelDTO.url) &&
        Objects.equals(this.parcelBoxLabels, orderLabelDTO.parcelBoxLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, placesNumber, url, parcelBoxLabels);
  }

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

