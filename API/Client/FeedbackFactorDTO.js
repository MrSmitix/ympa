goog.provide('API.Client.FeedbackFactorDTO');

/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 * @record
 */
API.Client.FeedbackFactorDTO = function() {}

/**
 * Идентификатор параметра.
 * @type {!number}
 * @export
 */
API.Client.FeedbackFactorDTO.prototype.id;

/**
 * Название параметра. Например, `Скорость обработки заказа`.
 * @type {!string}
 * @export
 */
API.Client.FeedbackFactorDTO.prototype.title;

/**
 * Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
 * @type {!string}
 * @export
 */
API.Client.FeedbackFactorDTO.prototype.description;

/**
 * Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
 * @type {!number}
 * @export
 */
API.Client.FeedbackFactorDTO.prototype.value;

