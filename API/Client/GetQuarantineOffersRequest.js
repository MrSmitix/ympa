goog.provide('API.Client.GetQuarantineOffersRequest');

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 * @record
 */
API.Client.GetQuarantineOffersRequest = function() {}

/**
 * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetQuarantineOffersRequest.prototype.offerIds;

/**
 * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
 * @type {!Array<!API.Client.OfferCardStatusType>}
 * @export
 */
API.Client.GetQuarantineOffersRequest.prototype.cardStatuses;

/**
 * Фильтр по категориям на Маркете.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GetQuarantineOffersRequest.prototype.categoryIds;

/**
 * Фильтр по брендам.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetQuarantineOffersRequest.prototype.vendorNames;

/**
 * Фильтр по тегам.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetQuarantineOffersRequest.prototype.tags;

