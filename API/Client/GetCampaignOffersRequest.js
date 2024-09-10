goog.provide('API.Client.GetCampaignOffersRequest');

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 * @record
 */
API.Client.GetCampaignOffersRequest = function() {}

/**
 * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetCampaignOffersRequest.prototype.offerIds;

/**
 * Фильтр по статусам товаров. 
 * @type {!Array<!API.Client.OfferCampaignStatusType>}
 * @export
 */
API.Client.GetCampaignOffersRequest.prototype.statuses;

/**
 * Фильтр по категориям на Маркете.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GetCampaignOffersRequest.prototype.categoryIds;

/**
 * Фильтр по брендам.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetCampaignOffersRequest.prototype.vendorNames;

/**
 * Фильтр по тегам.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetCampaignOffersRequest.prototype.tags;

