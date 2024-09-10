package org.openapitools.server.model


/**
 * Информация о сообщениях.
 *
 * @param orderId Идентификатор заказа. for example: ''null''
 * @param messages Информация о сообщениях. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class ChatMessagesResultDTO (
  orderId: Long,
  messages: Seq[ChatMessageDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

