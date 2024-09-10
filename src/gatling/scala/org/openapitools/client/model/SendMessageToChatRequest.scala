
package org.openapitools.client.model


case class SendMessageToChatRequest (
    /* Текст сообщения. Максимальная длина — 4096 символа. */
    _message: String
)
object SendMessageToChatRequest {
    def toStringBody(var_message: Object) =
        s"""
        | {
        | "message":$var_message
        | }
        """.stripMargin
}
