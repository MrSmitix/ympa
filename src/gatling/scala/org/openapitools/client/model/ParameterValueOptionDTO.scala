
package org.openapitools.client.model


case class ParameterValueOptionDTO (
    /* Идентификатор значения. */
    _id: Long,
    /* Значение. */
    _value: String,
    /* Описание значения. */
    _description: Option[String]
)
object ParameterValueOptionDTO {
    def toStringBody(var_id: Object, var_value: Object, var_description: Object) =
        s"""
        | {
        | "id":$var_id,"value":$var_value,"description":$var_description
        | }
        """.stripMargin
}
