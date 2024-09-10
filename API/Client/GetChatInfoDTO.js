goog.provide('API.Client.GetChatInfoDTO');

/**
 * Информация о чатах.
 * @record
 */
API.Client.GetChatInfoDTO = function() {}

/**
 * Идентификатор чата.
 * @type {!number}
 * @export
 */
API.Client.GetChatInfoDTO.prototype.chatId;

/**
 * Идентификатор заказа.
 * @type {!number}
 * @export
 */
API.Client.GetChatInfoDTO.prototype.orderId;

/**
 * @type {!API.Client.ChatType}
 * @export
 */
API.Client.GetChatInfoDTO.prototype.type;

/**
 * @type {!API.Client.ChatStatusType}
 * @export
 */
API.Client.GetChatInfoDTO.prototype.status;

/**
 * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.GetChatInfoDTO.prototype.createdAt;

/**
 * Дата и время последнего сообщения в чате.
 * @type {!Date}
 * @export
 */
API.Client.GetChatInfoDTO.prototype.updatedAt;

