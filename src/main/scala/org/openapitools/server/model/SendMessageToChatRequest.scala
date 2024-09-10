package org.openapitools.server.model


/**
 * В какой чат нужно отправить сообщение и текст сообщения.
 *
 * @param message Текст сообщения. Максимальная длина — 4096 символа. for example: ''null''
*/
final case class SendMessageToChatRequest (
  message: String
)

