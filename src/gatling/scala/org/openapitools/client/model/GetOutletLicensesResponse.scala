
package org.openapitools.client.model


case class GetOutletLicensesResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OutletLicensesResponseDTO]
)
object GetOutletLicensesResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
