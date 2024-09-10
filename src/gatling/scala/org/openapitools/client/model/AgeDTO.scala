
package org.openapitools.client.model


case class AgeDTO (
    /* Значение.  */
    _value: Number,
    _ageUnit: AgeUnitType
)
object AgeDTO {
    def toStringBody(var_value: Object, var_ageUnit: Object) =
        s"""
        | {
        | "value":$var_value,"ageUnit":$var_ageUnit
        | }
        """.stripMargin
}
