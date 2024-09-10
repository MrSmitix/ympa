
package org.openapitools.client.model


case class CreateOutletResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OutletResponseDTO]
)
object CreateOutletResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
