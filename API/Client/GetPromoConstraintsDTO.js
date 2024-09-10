goog.provide('API.Client.GetPromoConstraintsDTO');

/**
 * Ограничения в акции.
 * @record
 */
API.Client.GetPromoConstraintsDTO = function() {}

/**
 * Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
 * @type {!Array<!number>}
 * @export
 */
API.Client.GetPromoConstraintsDTO.prototype.warehouseIds;

