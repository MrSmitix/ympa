
package org.openapitools.client.model


case class ApiResponse (
    _status: Option[ApiResponseStatusType]
)
object ApiResponse {
    def toStringBody(var_status: Object) =
        s"""
        | {
        | "status":$var_status
        | }
        """.stripMargin
}
