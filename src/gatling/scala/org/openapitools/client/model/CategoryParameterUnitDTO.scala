
package org.openapitools.client.model


case class CategoryParameterUnitDTO (
    /* Единица измерения по умолчанию. */
    _defaultUnitId: Long,
    /* Допустимые единицы измерения. */
    _units: List[UnitDTO]
)
object CategoryParameterUnitDTO {
    def toStringBody(var_defaultUnitId: Object, var_units: Object) =
        s"""
        | {
        | "defaultUnitId":$var_defaultUnitId,"units":$var_units
        | }
        """.stripMargin
}
