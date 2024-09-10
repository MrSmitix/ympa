goog.provide('API.Client.PagedReturnsDTO');

/**
 * Возвраты.
 * @record
 */
API.Client.PagedReturnsDTO = function() {}

/**
 * @type {!API.Client.ForwardScrollingPagerDTO}
 * @export
 */
API.Client.PagedReturnsDTO.prototype.paging;

/**
 * Список возвратов.
 * @type {!Array<!API.Client.ReturnDTO>}
 * @export
 */
API.Client.PagedReturnsDTO.prototype.returns;

