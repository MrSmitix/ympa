
package org.openapitools.client.model


case class OutletWorkingScheduleItemDTO (
    _startDay: DayOfWeekType,
    _endDay: DayOfWeekType,
    /* Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`.  */
    _startTime: String,
    /* Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`.  */
    _endTime: String
)
object OutletWorkingScheduleItemDTO {
    def toStringBody(var_startDay: Object, var_endDay: Object, var_startTime: Object, var_endTime: Object) =
        s"""
        | {
        | "startDay":$var_startDay,"endDay":$var_endDay,"startTime":$var_startTime,"endTime":$var_endTime
        | }
        """.stripMargin
}
