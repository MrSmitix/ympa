
package org.openapitools.client.model


case class ValueRestrictionDTO (
    /* Идентификатор ограничивающей характеристики. */
    _limitingParameterId: Long,
    /* Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. */
    _limitedValues: List[OptionValuesLimitedDTO]
)
object ValueRestrictionDTO {
    def toStringBody(var_limitingParameterId: Object, var_limitedValues: Object) =
        s"""
        | {
        | "limitingParameterId":$var_limitingParameterId,"limitedValues":$var_limitedValues
        | }
        """.stripMargin
}
