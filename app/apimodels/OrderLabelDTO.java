package apimodels;

import apimodels.ParcelBoxLabelDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Данные для печати ярлыка.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderLabelDTO   {
  @JsonProperty("orderId")
  @NotNull

  private Long orderId;

  @JsonProperty("placesNumber")
  @NotNull

  private Integer placesNumber;

  @JsonProperty("url")
  @NotNull

  private String url;

  @JsonProperty("parcelBoxLabels")
  @NotNull
@Valid

  private List<@Valid ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>();

  public OrderLabelDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Идентификатор заказа.
   * @return orderId
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(orderId, orderLabelDTO.orderId) &&
        Objects.equals(placesNumber, orderLabelDTO.placesNumber) &&
        Objects.equals(url, orderLabelDTO.url) &&
        Objects.equals(parcelBoxLabels, orderLabelDTO.parcelBoxLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, placesNumber, url, parcelBoxLabels);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

