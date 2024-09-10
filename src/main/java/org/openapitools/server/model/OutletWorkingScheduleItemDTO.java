/**
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

package org.openapitools.server.model;

import org.openapitools.server.model.DayOfWeekType;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Расписание работы точки продаж.
  */

public class OutletWorkingScheduleItemDTO  {
  
  @JsonbProperty("startDay")
  private DayOfWeekType startDay;

  @JsonbProperty("endDay")
  private DayOfWeekType endDay;

 /**
  * Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
  */
  @JsonbProperty("startTime")
  private String startTime;

 /**
  * Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
  */
  @JsonbProperty("endTime")
  private String endTime;

  /**
   * Get startDay
   * @return startDay
   **/
  public DayOfWeekType getStartDay() {
    return startDay;
  }

  /**
   * Set startDay
   */
  public void setStartDay(DayOfWeekType startDay) {
    this.startDay = startDay;
  }

  public OutletWorkingScheduleItemDTO startDay(DayOfWeekType startDay) {
    this.startDay = startDay;
    return this;
  }

  /**
   * Get endDay
   * @return endDay
   **/
  public DayOfWeekType getEndDay() {
    return endDay;
  }

  /**
   * Set endDay
   */
  public void setEndDay(DayOfWeekType endDay) {
    this.endDay = endDay;
  }

  public OutletWorkingScheduleItemDTO endDay(DayOfWeekType endDay) {
    this.endDay = endDay;
    return this;
  }

  /**
   * Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. 
   * @return startTime
   **/
  public String getStartTime() {
    return startTime;
  }

  /**
   * Set startTime
   */
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public OutletWorkingScheduleItemDTO startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. 
   * @return endTime
   **/
  public String getEndTime() {
    return endTime;
  }

  /**
   * Set endTime
   */
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public OutletWorkingScheduleItemDTO endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletWorkingScheduleItemDTO {\n");
    
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    endDay: ").append(toIndentedString(endDay)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

