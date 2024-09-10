
package org.openapitools.client.model


case class ParameterValueDTO (
    /* Идентификатор характеристики. */
    _parameterId: Long,
    /* Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию. */
    _unitId: Option[Long],
    /* Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`.  */
    _valueId: Option[Long],
    /* Значение. */
    _value: Option[String]
)
object ParameterValueDTO {
    def toStringBody(var_parameterId: Object, var_unitId: Object, var_valueId: Object, var_value: Object) =
        s"""
        | {
        | "parameterId":$var_parameterId,"unitId":$var_unitId,"valueId":$var_valueId,"value":$var_value
        | }
        """.stripMargin
}
