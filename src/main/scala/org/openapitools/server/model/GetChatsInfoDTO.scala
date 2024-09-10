package org.openapitools.server.model


/**
 * Список чатов.
 *
 * @param chats Информация о чатах. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class GetChatsInfoDTO (
  chats: Seq[GetChatInfoDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

