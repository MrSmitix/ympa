
package org.openapitools.client.model


case class GetReturnsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[PagedReturnsDTO]
)
object GetReturnsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
