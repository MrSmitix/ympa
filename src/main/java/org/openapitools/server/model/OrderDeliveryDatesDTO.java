package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Диапазон дат доставки.
 */
public class OrderDeliveryDatesDTO   {

    private String fromDate;
    private String toDate;
    private String fromTime;
    private String toTime;
    private String realDeliveryDate;

    /**
     * Default constructor.
     */
    public OrderDeliveryDatesDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderDeliveryDatesDTO.
     *
     * @param fromDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     * @param toDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     * @param fromTime Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;. 
     * @param toTime Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;. 
     * @param realDeliveryDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     */
    public OrderDeliveryDatesDTO(
        String fromDate, 
        String toDate, 
        String fromTime, 
        String toTime, 
        String realDeliveryDate
    ) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.realDeliveryDate = realDeliveryDate;
    }



    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    /**
     * Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
     * @return fromTime
     */
    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    /**
     * Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
     * @return toTime
     */
    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     * @return realDeliveryDate
     */
    public String getRealDeliveryDate() {
        return realDeliveryDate;
    }

    public void setRealDeliveryDate(String realDeliveryDate) {
        this.realDeliveryDate = realDeliveryDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

