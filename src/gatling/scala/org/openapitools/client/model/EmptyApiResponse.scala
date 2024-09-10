
package org.openapitools.client.model


case class EmptyApiResponse (
    _status: Option[ApiResponseStatusType]
)
object EmptyApiResponse {
    def toStringBody(var_status: Object) =
        s"""
        | {
        | "status":$var_status
        | }
        """.stripMargin
}
