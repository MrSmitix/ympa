goog.provide('API.Client.OfferCardDTO');

/**
 * Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 * @record
 */
API.Client.OfferCardDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.OfferCardDTO.prototype.offerId;

/**
 * @type {!API.Client.GetMappingDTO}
 * @export
 */
API.Client.OfferCardDTO.prototype.mapping;

/**
 * Список характеристик с их значениями. 
 * @type {!Array<!API.Client.ParameterValueDTO>}
 * @export
 */
API.Client.OfferCardDTO.prototype.parameterValues;

/**
 * @type {!API.Client.OfferCardStatusType}
 * @export
 */
API.Client.OfferCardDTO.prototype.cardStatus;

/**
 * Процент заполненности карточки.
 * @type {!number}
 * @export
 */
API.Client.OfferCardDTO.prototype.contentRating;

/**
 * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
 * @type {!Array<!API.Client.OfferCardRecommendationDTO>}
 * @export
 */
API.Client.OfferCardDTO.prototype.recommendations;

/**
 * Ошибки в контенте, препятствующие размещению товара на витрине.
 * @type {!Array<!API.Client.OfferErrorDTO>}
 * @export
 */
API.Client.OfferCardDTO.prototype.errors;

/**
 * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
 * @type {!Array<!API.Client.OfferErrorDTO>}
 * @export
 */
API.Client.OfferCardDTO.prototype.warnings;

