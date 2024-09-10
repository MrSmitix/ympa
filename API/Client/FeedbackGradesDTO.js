goog.provide('API.Client.FeedbackGradesDTO');

/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 * @record
 */
API.Client.FeedbackGradesDTO = function() {}

/**
 * Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
 * @type {!number}
 * @export
 */
API.Client.FeedbackGradesDTO.prototype.average;

/**
 * Количество пользователей, считающих отзыв полезным.
 * @type {!number}
 * @export
 */
API.Client.FeedbackGradesDTO.prototype.agreeCount;

/**
 * Количество пользователей, считающих отзыв бесполезным.
 * @type {!number}
 * @export
 */
API.Client.FeedbackGradesDTO.prototype.rejectCount;

/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 * @type {!Array<!API.Client.FeedbackFactorDTO>}
 * @export
 */
API.Client.FeedbackGradesDTO.prototype.factors;

