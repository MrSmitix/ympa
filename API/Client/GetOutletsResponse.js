goog.provide('API.Client.GetOutletsResponse');

/**
 * Ответ на запрос информации о точках продаж.
 * @record
 */
API.Client.GetOutletsResponse = function() {}

/**
 * Информация о точках продаж.
 * @type {!Array<!API.Client.FullOutletDTO>}
 * @export
 */
API.Client.GetOutletsResponse.prototype.outlets;

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.GetOutletsResponse.prototype.paging;

/**
 * @type {!API.Client.FlippingPagerDTO}
 * @export
 */
API.Client.GetOutletsResponse.prototype.pager;

