package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParcelBoxLabelDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные для печати ярлыка.
 */
@ApiModel(description="Данные для печати ярлыка.")

public class OrderLabelDTO  {
  
 /**
  * Идентификатор заказа.
  */
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  private Long orderId;

 /**
  * Количество коробок в заказе.
  */
  @ApiModelProperty(required = true, value = "Количество коробок в заказе.")
  private Integer placesNumber;

 /**
  * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
  */
  @ApiModelProperty(required = true, value = "URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). ")
  private String url;

 /**
  * Информация на ярлыке.
  */
  @ApiModelProperty(required = true, value = "Информация на ярлыке.")
  @Valid
  private List<@Valid ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>();
 /**
  * Идентификатор заказа.
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
  public OrderLabelDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
  * Количество коробок в заказе.
  * @return placesNumber
  */
  @JsonProperty("placesNumber")
  @NotNull
  public Integer getPlacesNumber() {
    return placesNumber;
  }

  /**
   * Sets the <code>placesNumber</code> property.
   */
 public void setPlacesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
  }

  /**
   * Sets the <code>placesNumber</code> property.
   */
  public OrderLabelDTO placesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
    return this;
  }

 /**
  * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
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
  public OrderLabelDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Информация на ярлыке.
  * @return parcelBoxLabels
  */
  @JsonProperty("parcelBoxLabels")
  @NotNull
  public List<@Valid ParcelBoxLabelDTO> getParcelBoxLabels() {
    return parcelBoxLabels;
  }

  /**
   * Sets the <code>parcelBoxLabels</code> property.
   */
 public void setParcelBoxLabels(List<@Valid ParcelBoxLabelDTO> parcelBoxLabels) {
    this.parcelBoxLabels = parcelBoxLabels;
  }

  /**
   * Sets the <code>parcelBoxLabels</code> property.
   */
  public OrderLabelDTO parcelBoxLabels(List<@Valid ParcelBoxLabelDTO> parcelBoxLabels) {
    this.parcelBoxLabels = parcelBoxLabels;
    return this;
  }

  /**
   * Adds a new item to the <code>parcelBoxLabels</code> list.
   */
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

