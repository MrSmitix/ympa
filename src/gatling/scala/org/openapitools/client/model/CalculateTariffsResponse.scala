
package org.openapitools.client.model


case class CalculateTariffsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[CalculateTariffsResponseDTO]
)
object CalculateTariffsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
