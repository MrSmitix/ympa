goog.provide('API.Client.SendMessageToChatRequest');

/**
 * В какой чат нужно отправить сообщение и текст сообщения.
 * @record
 */
API.Client.SendMessageToChatRequest = function() {}

/**
 * Текст сообщения. Максимальная длина — 4096 символа.
 * @type {!string}
 * @export
 */
API.Client.SendMessageToChatRequest.prototype.message;

