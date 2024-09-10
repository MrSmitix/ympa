goog.provide('API.Client.ParcelBoxDTO');

/**
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 * @record
 */
API.Client.ParcelBoxDTO = function() {}

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 * @type {!number}
 * @export
 */
API.Client.ParcelBoxDTO.prototype.id;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 * @type {!string}
 * @export
 */
API.Client.ParcelBoxDTO.prototype.fulfilmentId;

