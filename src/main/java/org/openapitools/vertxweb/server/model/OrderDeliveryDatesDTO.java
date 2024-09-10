package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Диапазон дат доставки.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDeliveryDatesDTO   {
  
  private String fromDate;
  private String toDate;
  private String fromTime;
  private String toTime;
  private String realDeliveryDate;

  public OrderDeliveryDatesDTO () {

  }

  public OrderDeliveryDatesDTO (String fromDate, String toDate, String fromTime, String toTime, String realDeliveryDate) {
    this.fromDate = fromDate;
    this.toDate = toDate;
    this.fromTime = fromTime;
    this.toTime = toTime;
    this.realDeliveryDate = realDeliveryDate;
  }

    
  @JsonProperty("fromDate")
  public String getFromDate() {
    return fromDate;
  }
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

    
  @JsonProperty("toDate")
  public String getToDate() {
    return toDate;
  }
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

    
  @JsonProperty("fromTime")
  public String getFromTime() {
    return fromTime;
  }
  public void setFromTime(String fromTime) {
    this.fromTime = fromTime;
  }

    
  @JsonProperty("toTime")
  public String getToTime() {
    return toTime;
  }
  public void setToTime(String toTime) {
    this.toTime = toTime;
  }

    
  @JsonProperty("realDeliveryDate")
  public String getRealDeliveryDate() {
    return realDeliveryDate;
  }
  public void setRealDeliveryDate(String realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDeliveryDatesDTO orderDeliveryDatesDTO = (OrderDeliveryDatesDTO) o;
    return Objects.equals(fromDate, orderDeliveryDatesDTO.fromDate) &&
        Objects.equals(toDate, orderDeliveryDatesDTO.toDate) &&
        Objects.equals(fromTime, orderDeliveryDatesDTO.fromTime) &&
        Objects.equals(toTime, orderDeliveryDatesDTO.toTime) &&
        Objects.equals(realDeliveryDate, orderDeliveryDatesDTO.realDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, toDate, fromTime, toTime, realDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryDatesDTO {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
    sb.append("    realDeliveryDate: ").append(toIndentedString(realDeliveryDate)).append("\n");
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
