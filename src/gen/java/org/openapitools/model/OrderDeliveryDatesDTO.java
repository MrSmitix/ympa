package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Диапазон дат доставки.
 **/

@ApiModel(description = "Диапазон дат доставки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryDatesDTO   {
  @JsonProperty("fromDate")
  private String fromDate;

  @JsonProperty("toDate")
  private String toDate;

  @JsonProperty("fromTime")
  private String fromTime;

  @JsonProperty("toTime")
  private String toTime;

  @JsonProperty("realDeliveryDate")
  private String realDeliveryDate;

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  public OrderDeliveryDatesDTO fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("fromDate")
  public String getFromDate() {
    return fromDate;
  }
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  public OrderDeliveryDatesDTO toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("toDate")
  public String getToDate() {
    return toDate;
  }
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  /**
   * Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
   **/
  public OrderDeliveryDatesDTO fromTime(String fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  
  @ApiModelProperty(value = "Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. ")
  @JsonProperty("fromTime")
  public String getFromTime() {
    return fromTime;
  }
  public void setFromTime(String fromTime) {
    this.fromTime = fromTime;
  }

  /**
   * Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
   **/
  public OrderDeliveryDatesDTO toTime(String toTime) {
    this.toTime = toTime;
    return this;
  }

  
  @ApiModelProperty(value = "Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. ")
  @JsonProperty("toTime")
  public String getToTime() {
    return toTime;
  }
  public void setToTime(String toTime) {
    this.toTime = toTime;
  }

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  public OrderDeliveryDatesDTO realDeliveryDate(String realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
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

