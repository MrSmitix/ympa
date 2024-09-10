package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ParcelBoxLabelDTO;

/**
 * Данные для печати ярлыка.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderLabelDTO   {
  
  private Long orderId;
  private Integer placesNumber;
  private String url;
  private List<ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>();

  public OrderLabelDTO () {

  }

  public OrderLabelDTO (Long orderId, Integer placesNumber, String url, List<ParcelBoxLabelDTO> parcelBoxLabels) {
    this.orderId = orderId;
    this.placesNumber = placesNumber;
    this.url = url;
    this.parcelBoxLabels = parcelBoxLabels;
  }

    
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("placesNumber")
  public Integer getPlacesNumber() {
    return placesNumber;
  }
  public void setPlacesNumber(Integer placesNumber) {
    this.placesNumber = placesNumber;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("parcelBoxLabels")
  public List<ParcelBoxLabelDTO> getParcelBoxLabels() {
    return parcelBoxLabels;
  }
  public void setParcelBoxLabels(List<ParcelBoxLabelDTO> parcelBoxLabels) {
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
