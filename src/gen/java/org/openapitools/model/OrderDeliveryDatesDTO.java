package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Диапазон дат доставки.
 */
@ApiModel(description="Диапазон дат доставки.")

public class OrderDeliveryDatesDTO  {
  
 /**
  * Формат даты: `ДД-ММ-ГГГГ`. 
  */
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  private String fromDate;

 /**
  * Формат даты: `ДД-ММ-ГГГГ`. 
  */
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  private String toDate;

 /**
  * Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
  */
  @ApiModelProperty(value = "Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. ")
  private String fromTime;

 /**
  * Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
  */
  @ApiModelProperty(value = "Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. ")
  private String toTime;

 /**
  * Формат даты: `ДД-ММ-ГГГГ`. 
  */
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  private String realDeliveryDate;
 /**
  * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
  * @return fromDate
  */
  @JsonProperty("fromDate")
  public String getFromDate() {
    return fromDate;
  }

  /**
   * Sets the <code>fromDate</code> property.
   */
 public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  /**
   * Sets the <code>fromDate</code> property.
   */
  public OrderDeliveryDatesDTO fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

 /**
  * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
  * @return toDate
  */
  @JsonProperty("toDate")
  public String getToDate() {
    return toDate;
  }

  /**
   * Sets the <code>toDate</code> property.
   */
 public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  /**
   * Sets the <code>toDate</code> property.
   */
  public OrderDeliveryDatesDTO toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

 /**
  * Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;. 
  * @return fromTime
  */
  @JsonProperty("fromTime")
  public String getFromTime() {
    return fromTime;
  }

  /**
   * Sets the <code>fromTime</code> property.
   */
 public void setFromTime(String fromTime) {
    this.fromTime = fromTime;
  }

  /**
   * Sets the <code>fromTime</code> property.
   */
  public OrderDeliveryDatesDTO fromTime(String fromTime) {
    this.fromTime = fromTime;
    return this;
  }

 /**
  * Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;. 
  * @return toTime
  */
  @JsonProperty("toTime")
  public String getToTime() {
    return toTime;
  }

  /**
   * Sets the <code>toTime</code> property.
   */
 public void setToTime(String toTime) {
    this.toTime = toTime;
  }

  /**
   * Sets the <code>toTime</code> property.
   */
  public OrderDeliveryDatesDTO toTime(String toTime) {
    this.toTime = toTime;
    return this;
  }

 /**
  * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
  * @return realDeliveryDate
  */
  @JsonProperty("realDeliveryDate")
  public String getRealDeliveryDate() {
    return realDeliveryDate;
  }

  /**
   * Sets the <code>realDeliveryDate</code> property.
   */
 public void setRealDeliveryDate(String realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
  }

  /**
   * Sets the <code>realDeliveryDate</code> property.
   */
  public OrderDeliveryDatesDTO realDeliveryDate(String realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

