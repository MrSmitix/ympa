
package org.openapitools.client.model


case class GetChatHistoryRequest (
    /* Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. */
    _messageIdFrom: Option[Long]
)
object GetChatHistoryRequest {
    def toStringBody(var_messageIdFrom: Object) =
        s"""
        | {
        | "messageIdFrom":$var_messageIdFrom
        | }
        """.stripMargin
}
