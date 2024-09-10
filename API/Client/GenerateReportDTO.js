goog.provide('API.Client.GenerateReportDTO');

/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 * @record
 */
API.Client.GenerateReportDTO = function() {}

/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 * @type {!string}
 * @export
 */
API.Client.GenerateReportDTO.prototype.reportId;

/**
 * Ожидаемая продолжительность генерации в миллисекундах.
 * @type {!number}
 * @export
 */
API.Client.GenerateReportDTO.prototype.estimatedGenerationTime;

