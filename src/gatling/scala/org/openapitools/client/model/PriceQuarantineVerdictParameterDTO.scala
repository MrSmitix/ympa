
package org.openapitools.client.model


case class PriceQuarantineVerdictParameterDTO (
    _name: PriceQuarantineVerdictParamNameType,
    /* Значение параметра. */
    _value: String
)
object PriceQuarantineVerdictParameterDTO {
    def toStringBody(var_name: Object, var_value: Object) =
        s"""
        | {
        | "name":$var_name,"value":$var_value
        | }
        """.stripMargin
}
