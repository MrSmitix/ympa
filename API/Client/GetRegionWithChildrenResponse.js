goog.provide('API.Client.GetRegionWithChildrenResponse');

/**
 * @record
 */
API.Client.GetRegionWithChildrenResponse = function() {}

/**
 * @type {!API.Client.FlippingPagerDTO}
 * @export
 */
API.Client.GetRegionWithChildrenResponse.prototype.pager;

/**
 * @type {!API.Client.RegionDTO}
 * @export
 */
API.Client.GetRegionWithChildrenResponse.prototype.regions;

