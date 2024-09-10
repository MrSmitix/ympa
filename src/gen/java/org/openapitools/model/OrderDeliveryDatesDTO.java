/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Диапазон дат доставки.
 */
@ApiModel(description = "Диапазон дат доставки.")
@JsonPropertyOrder({
  OrderDeliveryDatesDTO.JSON_PROPERTY_FROM_DATE,
  OrderDeliveryDatesDTO.JSON_PROPERTY_TO_DATE,
  OrderDeliveryDatesDTO.JSON_PROPERTY_FROM_TIME,
  OrderDeliveryDatesDTO.JSON_PROPERTY_TO_TIME,
  OrderDeliveryDatesDTO.JSON_PROPERTY_REAL_DELIVERY_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryDatesDTO   {
  public static final String JSON_PROPERTY_FROM_DATE = "fromDate";
  @JsonProperty(JSON_PROPERTY_FROM_DATE)
  private String fromDate;

  public static final String JSON_PROPERTY_TO_DATE = "toDate";
  @JsonProperty(JSON_PROPERTY_TO_DATE)
  private String toDate;

  public static final String JSON_PROPERTY_FROM_TIME = "fromTime";
  @JsonProperty(JSON_PROPERTY_FROM_TIME)
  private String fromTime;

  public static final String JSON_PROPERTY_TO_TIME = "toTime";
  @JsonProperty(JSON_PROPERTY_TO_TIME)
  private String toTime;

  public static final String JSON_PROPERTY_REAL_DELIVERY_DATE = "realDeliveryDate";
  @JsonProperty(JSON_PROPERTY_REAL_DELIVERY_DATE)
  private String realDeliveryDate;

  public OrderDeliveryDatesDTO fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return fromDate
   **/
  @JsonProperty(value = "fromDate")
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public OrderDeliveryDatesDTO toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return toDate
   **/
  @JsonProperty(value = "toDate")
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public OrderDeliveryDatesDTO fromTime(String fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;. 
   * @return fromTime
   **/
  @JsonProperty(value = "fromTime")
  @ApiModelProperty(value = "Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. ")
  
  public String getFromTime() {
    return fromTime;
  }

  public void setFromTime(String fromTime) {
    this.fromTime = fromTime;
  }

  public OrderDeliveryDatesDTO toTime(String toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;. 
   * @return toTime
   **/
  @JsonProperty(value = "toTime")
  @ApiModelProperty(value = "Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. ")
  
  public String getToTime() {
    return toTime;
  }

  public void setToTime(String toTime) {
    this.toTime = toTime;
  }

  public OrderDeliveryDatesDTO realDeliveryDate(String realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
    return this;
  }

  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return realDeliveryDate
   **/
  @JsonProperty(value = "realDeliveryDate")
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  
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

