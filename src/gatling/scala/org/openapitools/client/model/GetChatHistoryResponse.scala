
package org.openapitools.client.model


case class GetChatHistoryResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[ChatMessagesResultDTO]
)
object GetChatHistoryResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
