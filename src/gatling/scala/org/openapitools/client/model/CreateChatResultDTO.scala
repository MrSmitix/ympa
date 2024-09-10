
package org.openapitools.client.model


case class CreateChatResultDTO (
    /* Идентификатор чата. */
    _chatId: Long
)
object CreateChatResultDTO {
    def toStringBody(var_chatId: Object) =
        s"""
        | {
        | "chatId":$var_chatId
        | }
        """.stripMargin
}
