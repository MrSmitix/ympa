goog.provide('API.Client.EnrichedModelDTO');

/**
 * Модель товара.
 * @record
 */
API.Client.EnrichedModelDTO = function() {}

/**
 * Идентификатор модели товара.
 * @type {!number}
 * @export
 */
API.Client.EnrichedModelDTO.prototype.id;

/**
 * Название модели товара.
 * @type {!string}
 * @export
 */
API.Client.EnrichedModelDTO.prototype.name;

/**
 * @type {!API.Client.ModelPriceDTO}
 * @export
 */
API.Client.EnrichedModelDTO.prototype.prices;

/**
 * Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
 * @type {!Array<!API.Client.ModelOfferDTO>}
 * @export
 */
API.Client.EnrichedModelDTO.prototype.offers;

/**
 * Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
 * @type {!number}
 * @export
 */
API.Client.EnrichedModelDTO.prototype.offlineOffers;

/**
 * Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
 * @type {!number}
 * @export
 */
API.Client.EnrichedModelDTO.prototype.onlineOffers;

