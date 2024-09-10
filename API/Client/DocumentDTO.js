goog.provide('API.Client.DocumentDTO');

/**
 * Информация о документе.
 * @record
 */
API.Client.DocumentDTO = function() {}

/**
 * @type {!API.Client.OrderDocumentStatusType}
 * @export
 */
API.Client.DocumentDTO.prototype.status;

/**
 * Номер документа.
 * @type {!string}
 * @export
 */
API.Client.DocumentDTO.prototype.number;

/**
 * Дата создания документа.
 * @type {!API.Client.date}
 * @export
 */
API.Client.DocumentDTO.prototype.date;

