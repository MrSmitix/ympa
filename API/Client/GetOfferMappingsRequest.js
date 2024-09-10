goog.provide('API.Client.GetOfferMappingsRequest');

/**
 * @record
 */
API.Client.GetOfferMappingsRequest = function() {}

/**
 * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetOfferMappingsRequest.prototype.offerIds;

/**
 * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
 * @type {!Array<!API.Client.OfferCardStatusType>}
 * @export
 */
API.Client.GetOfferMappingsRequest.prototype.cardStatuses;

/**
 * Фильтр по категориям на Маркете.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GetOfferMappingsRequest.prototype.categoryIds;

/**
 * Фильтр по брендам.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetOfferMappingsRequest.prototype.vendorNames;

/**
 * Фильтр по тегам.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetOfferMappingsRequest.prototype.tags;

/**
 * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
 * @type {!boolean}
 * @export
 */
API.Client.GetOfferMappingsRequest.prototype.archived;

