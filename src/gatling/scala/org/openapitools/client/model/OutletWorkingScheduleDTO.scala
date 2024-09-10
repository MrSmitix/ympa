
package org.openapitools.client.model


case class OutletWorkingScheduleDTO (
    /* Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников.  */
    _workInHoliday: Option[Boolean],
    /* Список расписаний работы точки продаж.  */
    _scheduleItems: List[OutletWorkingScheduleItemDTO]
)
object OutletWorkingScheduleDTO {
    def toStringBody(var_workInHoliday: Object, var_scheduleItems: Object) =
        s"""
        | {
        | "workInHoliday":$var_workInHoliday,"scheduleItems":$var_scheduleItems
        | }
        """.stripMargin
}
