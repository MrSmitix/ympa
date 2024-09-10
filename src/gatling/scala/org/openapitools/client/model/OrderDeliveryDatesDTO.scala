
package org.openapitools.client.model


case class OrderDeliveryDatesDTO (
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    _fromDate: Option[String],
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    _toDate: Option[String],
    /* Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.  */
    _fromTime: Option[String],
    /* Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.  */
    _toTime: Option[String],
    /* Формат даты: `ДД-ММ-ГГГГ`.  */
    _realDeliveryDate: Option[String]
)
object OrderDeliveryDatesDTO {
    def toStringBody(var_fromDate: Object, var_toDate: Object, var_fromTime: Object, var_toTime: Object, var_realDeliveryDate: Object) =
        s"""
        | {
        | "fromDate":$var_fromDate,"toDate":$var_toDate,"fromTime":$var_fromTime,"toTime":$var_toTime,"realDeliveryDate":$var_realDeliveryDate
        | }
        """.stripMargin
}
