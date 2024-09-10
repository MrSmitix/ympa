
package org.openapitools.client.model


case class QualityRatingComponentDTO (
    /* Значение составляющей в процентах. */
    _value: Double,
    _componentType: QualityRatingComponentType
)
object QualityRatingComponentDTO {
    def toStringBody(var_value: Object, var_componentType: Object) =
        s"""
        | {
        | "value":$var_value,"componentType":$var_componentType
        | }
        """.stripMargin
}
