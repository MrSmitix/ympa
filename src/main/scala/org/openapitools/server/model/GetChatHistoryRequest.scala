package org.openapitools.server.model


/**
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 *
 * @param messageIdFrom Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. for example: ''null''
*/
final case class GetChatHistoryRequest (
  messageIdFrom: Option[Long] = None
)

