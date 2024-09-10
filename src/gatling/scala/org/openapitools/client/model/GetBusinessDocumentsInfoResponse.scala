
package org.openapitools.client.model


case class GetBusinessDocumentsInfoResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OrderBusinessDocumentsDTO]
)
object GetBusinessDocumentsInfoResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
