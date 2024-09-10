
package org.openapitools.client.model


case class DeleteOffersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[DeleteOffersDTO]
)
object DeleteOffersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
