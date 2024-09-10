goog.provide('API.Client.CalculateTariffsParametersDTO');

/**
 * Параметры для расчета стоимости услуг.
 * @record
 */
API.Client.CalculateTariffsParametersDTO = function() {}

/**
 * Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
 * @type {!number}
 * @export
 */
API.Client.CalculateTariffsParametersDTO.prototype.campaignId;

/**
 * @type {!API.Client.SellingProgramType}
 * @export
 */
API.Client.CalculateTariffsParametersDTO.prototype.sellingProgram;

/**
 * @type {!API.Client.PaymentFrequencyType}
 * @export
 */
API.Client.CalculateTariffsParametersDTO.prototype.frequency;

