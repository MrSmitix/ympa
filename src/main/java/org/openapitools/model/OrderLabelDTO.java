package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParcelBoxLabelDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Данные для печати ярлыка.
 */

@Schema(name = "OrderLabelDTO", description = "Данные для печати ярлыка.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderLabelDTO {

  private Long orderId;

  private Integer placesNumber;

  private String url;

  @Valid
  private List<@Valid ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>();

  public OrderLabelDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderLabelDTO(Long orderId, Integer placesNumber, String url, List<@Valid ParcelBoxLabelDTO> parcelBoxLabels) {
    this.orderId = orderId;
    this.placesNumber = placesNumber;
    this.url = url;
    this.parcelBoxLabels = parcelBoxLabels;
  }

  public OrderLabelDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return orderId
   */
  @NotNull 
  @Schema(name = "orderId", description = "Идентификатор заказа.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public OrderLabelDTO placesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
    return this;
  }

  /**
   * Количество коробок в заказе.
   * @return placesNumber
   */
  @NotNull 
  @Schema(name = "placesNumber", description = "Количество коробок в заказе.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("placesNumber")
  public Integer getPlacesNumber() {
    return placesNumber;
  }

  public void setPlacesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
  }

  public OrderLabelDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
   * @return url
   */
  @NotNull 
  @Schema(name = "url", description = "URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OrderLabelDTO parcelBoxLabels(List<@Valid ParcelBoxLabelDTO> parcelBoxLabels) {
    this.parcelBoxLabels = parcelBoxLabels;
    return this;
  }

  public OrderLabelDTO addParcelBoxLabelsItem(ParcelBoxLabelDTO parcelBoxLabelsItem) {
    if (this.parcelBoxLabels == null) {
      this.parcelBoxLabels = new ArrayList<>();
    }
    this.parcelBoxLabels.add(parcelBoxLabelsItem);
    return this;
  }

  /**
   * Информация на ярлыке.
   * @return parcelBoxLabels
   */
  @NotNull @Valid 
  @Schema(name = "parcelBoxLabels", description = "Информация на ярлыке.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parcelBoxLabels")
  public List<@Valid ParcelBoxLabelDTO> getParcelBoxLabels() {
    return parcelBoxLabels;
  }

  public void setParcelBoxLabels(List<@Valid ParcelBoxLabelDTO> parcelBoxLabels) {
    this.parcelBoxLabels = parcelBoxLabels;
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

