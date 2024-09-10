
package org.openapitools.client.model


case class ParameterValueConstraintsDTO (
    /* Минимальное число. */
    _minValue: Option[Double],
    /* Максимальное число. */
    _maxValue: Option[Double],
    /* Максимальная длина текста. */
    _maxLength: Option[Integer]
)
object ParameterValueConstraintsDTO {
    def toStringBody(var_minValue: Object, var_maxValue: Object, var_maxLength: Object) =
        s"""
        | {
        | "minValue":$var_minValue,"maxValue":$var_maxValue,"maxLength":$var_maxLength
        | }
        """.stripMargin
}
