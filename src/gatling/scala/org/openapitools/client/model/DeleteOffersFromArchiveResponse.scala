
package org.openapitools.client.model


case class DeleteOffersFromArchiveResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[DeleteOffersFromArchiveDTO]
)
object DeleteOffersFromArchiveResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
