goog.provide('API.Client.EacVerificationResultDTO');

/**
 * Результат выполнения запроса.
 * @record
 */
API.Client.EacVerificationResultDTO = function() {}

/**
 * @type {!API.Client.EacVerificationStatusType}
 * @export
 */
API.Client.EacVerificationResultDTO.prototype.verificationResult;

/**
 * Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
 * @type {!number}
 * @export
 */
API.Client.EacVerificationResultDTO.prototype.attemptsLeft;

