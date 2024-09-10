goog.provide('API.Client.GenerateGoodsTurnoverRequest');

/**
 * Данные, необходимые для генерации отчета. 
 * @record
 */
API.Client.GenerateGoodsTurnoverRequest = function() {}

/**
 * Идентификатор кампании.
 * @type {!number}
 * @export
 */
API.Client.GenerateGoodsTurnoverRequest.prototype.campaignId;

/**
 * Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
 * @type {!API.Client.date}
 * @export
 */
API.Client.GenerateGoodsTurnoverRequest.prototype.date;

