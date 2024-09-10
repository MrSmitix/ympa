goog.provide('API.Client.ChatMessageDTO');

/**
 * Информация о сообщениях.
 * @record
 */
API.Client.ChatMessageDTO = function() {}

/**
 * Идентификатор сообщения.
 * @type {!number}
 * @export
 */
API.Client.ChatMessageDTO.prototype.messageId;

/**
 * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.ChatMessageDTO.prototype.createdAt;

/**
 * @type {!API.Client.ChatMessageSenderType}
 * @export
 */
API.Client.ChatMessageDTO.prototype.sender;

/**
 * Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
 * @type {!string}
 * @export
 */
API.Client.ChatMessageDTO.prototype.message;

/**
 * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
 * @type {!Array<!API.Client.ChatMessagePayloadDTO>}
 * @export
 */
API.Client.ChatMessageDTO.prototype.payload;

