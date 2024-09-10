
package org.openapitools.client.model


case class TimePeriodDTO (
    /* Продолжительность в указанных единицах. */
    _timePeriod: Integer,
    _timeUnit: TimeUnitType,
    /* Комментарий. */
    _comment: Option[String]
)
object TimePeriodDTO {
    def toStringBody(var_timePeriod: Object, var_timeUnit: Object, var_comment: Object) =
        s"""
        | {
        | "timePeriod":$var_timePeriod,"timeUnit":$var_timeUnit,"comment":$var_comment
        | }
        """.stripMargin
}
