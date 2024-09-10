goog.provide('API.Client.ReturnInstanceDTO');

/**
 * Логистическая информация по возврату.
 * @record
 */
API.Client.ReturnInstanceDTO = function() {}

/**
 * @type {!API.Client.ReturnInstanceStockType}
 * @export
 */
API.Client.ReturnInstanceDTO.prototype.stockType;

/**
 * @type {!API.Client.ReturnInstanceStatusType}
 * @export
 */
API.Client.ReturnInstanceDTO.prototype.status;

/**
 * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
 * @type {!string}
 * @export
 */
API.Client.ReturnInstanceDTO.prototype.cis;

/**
 * Международный идентификатор мобильного оборудования.
 * @type {!string}
 * @export
 */
API.Client.ReturnInstanceDTO.prototype.imei;

