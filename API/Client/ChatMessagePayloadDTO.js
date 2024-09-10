goog.provide('API.Client.ChatMessagePayloadDTO');

/**
 * Информация о приложенных к сообщению файлах.
 * @record
 */
API.Client.ChatMessagePayloadDTO = function() {}

/**
 * Имя файла.
 * @type {!string}
 * @export
 */
API.Client.ChatMessagePayloadDTO.prototype.name;

/**
 * Ссылка для скачивания файла.
 * @type {!string}
 * @export
 */
API.Client.ChatMessagePayloadDTO.prototype.url;

/**
 * Размер файла в байтах.
 * @type {!number}
 * @export
 */
API.Client.ChatMessagePayloadDTO.prototype.size;

