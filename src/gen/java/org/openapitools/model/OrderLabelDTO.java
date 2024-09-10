package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParcelBoxLabelDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Данные для печати ярлыка.
 **/
@ApiModel(description = "Данные для печати ярлыка.")
@JsonTypeName("OrderLabelDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderLabelDTO   {
  private Long orderId;
  private Integer placesNumber;
  private String url;
  private @Valid List<@Valid ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>();

  /**
   * Идентификатор заказа.
   **/
  public OrderLabelDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  @JsonProperty("orderId")
  @NotNull public Long getOrderId() {
    return orderId;
  }

  @JsonProperty("orderId")
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Количество коробок в заказе.
   **/
  public OrderLabelDTO placesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Количество коробок в заказе.")
  @JsonProperty("placesNumber")
  @NotNull public Integer getPlacesNumber() {
    return placesNumber;
  }

  @JsonProperty("placesNumber")
  public void setPlacesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
  }

  /**
   * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
   **/
  public OrderLabelDTO url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). ")
  @JsonProperty("url")
  @NotNull public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Информация на ярлыке.
   **/
  public OrderLabelDTO parcelBoxLabels(List<@Valid ParcelBoxLabelDTO> parcelBoxLabels) {
    this.parcelBoxLabels = parcelBoxLabels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация на ярлыке.")
  @JsonProperty("parcelBoxLabels")
  @NotNull @Valid public List<@Valid ParcelBoxLabelDTO> getParcelBoxLabels() {
    return parcelBoxLabels;
  }

  @JsonProperty("parcelBoxLabels")
  public void setParcelBoxLabels(List<@Valid ParcelBoxLabelDTO> parcelBoxLabels) {
    this.parcelBoxLabels = parcelBoxLabels;
  }

  public OrderLabelDTO addParcelBoxLabelsItem(ParcelBoxLabelDTO parcelBoxLabelsItem) {
    if (this.parcelBoxLabels == null) {
      this.parcelBoxLabels = new ArrayList<>();
    }

    this.parcelBoxLabels.add(parcelBoxLabelsItem);
    return this;
  }

  public OrderLabelDTO removeParcelBoxLabelsItem(ParcelBoxLabelDTO parcelBoxLabelsItem) {
    if (parcelBoxLabelsItem != null && this.parcelBoxLabels != null) {
      this.parcelBoxLabels.remove(parcelBoxLabelsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

