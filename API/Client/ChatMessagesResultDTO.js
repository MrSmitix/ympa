goog.provide('API.Client.ChatMessagesResultDTO');

/**
 * Информация о сообщениях.
 * @record
 */
API.Client.ChatMessagesResultDTO = function() {}

/**
 * Идентификатор заказа.
 * @type {!number}
 * @export
 */
API.Client.ChatMessagesResultDTO.prototype.orderId;

/**
 * Информация о сообщениях.
 * @type {!Array<!API.Client.ChatMessageDTO>}
 * @export
 */
API.Client.ChatMessagesResultDTO.prototype.messages;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.ChatMessagesResultDTO.prototype.paging;

