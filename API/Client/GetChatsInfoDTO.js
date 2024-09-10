goog.provide('API.Client.GetChatsInfoDTO');

/**
 * Список чатов.
 * @record
 */
API.Client.GetChatsInfoDTO = function() {}

/**
 * Информация о чатах.
 * @type {!Array<!API.Client.GetChatInfoDTO>}
 * @export
 */
API.Client.GetChatsInfoDTO.prototype.chats;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.GetChatsInfoDTO.prototype.paging;

