package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OrderDeliveryDatesDTO {
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    String fromDate
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    String toDate
    /* Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.  */
    String fromTime
    /* Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.  */
    String toTime
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    String realDeliveryDate
}
