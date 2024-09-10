
package org.openapitools.client.model


case class SuggestPricesResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[SuggestPricesResultDTO]
)
object SuggestPricesResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
