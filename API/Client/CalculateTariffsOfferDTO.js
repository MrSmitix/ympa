goog.provide('API.Client.CalculateTariffsOfferDTO');

/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 * @record
 */
API.Client.CalculateTariffsOfferDTO = function() {}

/**
 * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
 * @type {!number}
 * @export
 */
API.Client.CalculateTariffsOfferDTO.prototype.categoryId;

/**
 * Цена на товар в рублях.
 * @type {!number}
 * @export
 */
API.Client.CalculateTariffsOfferDTO.prototype.price;

/**
 * Длина товара в сантиметрах.
 * @type {!number}
 * @export
 */
API.Client.CalculateTariffsOfferDTO.prototype.length;

/**
 * Ширина товара в сантиметрах.
 * @type {!number}
 * @export
 */
API.Client.CalculateTariffsOfferDTO.prototype.width;

/**
 * Высота товара в сантиметрах.
 * @type {!number}
 * @export
 */
API.Client.CalculateTariffsOfferDTO.prototype.height;

/**
 * Вес товара в килограммах.
 * @type {!number}
 * @export
 */
API.Client.CalculateTariffsOfferDTO.prototype.weight;

/**
 * Квант продажи — количество единиц товара в одном товарном предложении.
 * @type {!number}
 * @export
 */
API.Client.CalculateTariffsOfferDTO.prototype.quantity;

