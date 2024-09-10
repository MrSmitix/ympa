
package org.openapitools.client.model


case class TurnoverDTO (
    _turnover: TurnoverType,
    /* Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) */
    _turnoverDays: Option[Double]
)
object TurnoverDTO {
    def toStringBody(var_turnover: Object, var_turnoverDays: Object) =
        s"""
        | {
        | "turnover":$var_turnover,"turnoverDays":$var_turnoverDays
        | }
        """.stripMargin
}
