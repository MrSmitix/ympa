package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Диапазон дат доставки.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryDatesDTO   {
  
  private String fromDate;
  private String toDate;
  private String fromTime;
  private String toTime;
  private String realDeliveryDate;

  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("fromDate")
  public String getFromDate() {
    return fromDate;
  }
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("toDate")
  public String getToDate() {
    return toDate;
  }
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  /**
   * Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;. 
   **/
  
  @ApiModelProperty(value = "Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. ")
  @JsonProperty("fromTime")
  public String getFromTime() {
    return fromTime;
  }
  public void setFromTime(String fromTime) {
    this.fromTime = fromTime;
  }

  /**
   * Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;. 
   **/
  
  @ApiModelProperty(value = "Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. ")
  @JsonProperty("toTime")
  public String getToTime() {
    return toTime;
  }
  public void setToTime(String toTime) {
    this.toTime = toTime;
  }

  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  
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
    return Objects.equals(this.fromDate, orderDeliveryDatesDTO.fromDate) &&
        Objects.equals(this.toDate, orderDeliveryDatesDTO.toDate) &&
        Objects.equals(this.fromTime, orderDeliveryDatesDTO.fromTime) &&
        Objects.equals(this.toTime, orderDeliveryDatesDTO.toTime) &&
        Objects.equals(this.realDeliveryDate, orderDeliveryDatesDTO.realDeliveryDate);
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

