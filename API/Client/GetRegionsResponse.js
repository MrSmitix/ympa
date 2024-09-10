goog.provide('API.Client.GetRegionsResponse');

/**
 * @record
 */
API.Client.GetRegionsResponse = function() {}

/**
 * Регион доставки.
 * @type {!Array<!API.Client.RegionDTO>}
 * @export
 */
API.Client.GetRegionsResponse.prototype.regions;

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.GetRegionsResponse.prototype.paging;

