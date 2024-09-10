
package org.openapitools.client.model


case class SearchShipmentsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[SearchShipmentsResponseDTO]
)
object SearchShipmentsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
