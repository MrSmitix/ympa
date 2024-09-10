goog.provide('API.Client.ReportInfoDTO');

/**
 * Статус генерации и ссылка на готовый отчет.
 * @record
 */
API.Client.ReportInfoDTO = function() {}

/**
 * @type {!API.Client.ReportStatusType}
 * @export
 */
API.Client.ReportInfoDTO.prototype.status;

/**
 * @type {!API.Client.ReportSubStatusType}
 * @export
 */
API.Client.ReportInfoDTO.prototype.subStatus;

/**
 * Дата и время запроса на генерацию.
 * @type {!Date}
 * @export
 */
API.Client.ReportInfoDTO.prototype.generationRequestedAt;

/**
 * Дата и время завершения генерации.
 * @type {!Date}
 * @export
 */
API.Client.ReportInfoDTO.prototype.generationFinishedAt;

/**
 * Ссылка на готовый отчет.
 * @type {!string}
 * @export
 */
API.Client.ReportInfoDTO.prototype.file;

/**
 * Ожидаемая продолжительность генерации в миллисекундах.
 * @type {!number}
 * @export
 */
API.Client.ReportInfoDTO.prototype.estimatedGenerationTime;

