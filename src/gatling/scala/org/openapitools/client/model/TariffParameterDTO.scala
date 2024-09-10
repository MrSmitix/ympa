
package org.openapitools.client.model


case class TariffParameterDTO (
    /* Название параметра. */
    _name: String,
    /* Значение параметра. */
    _value: String
)
object TariffParameterDTO {
    def toStringBody(var_name: Object, var_value: Object) =
        s"""
        | {
        | "name":$var_name,"value":$var_value
        | }
        """.stripMargin
}
