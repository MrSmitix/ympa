goog.provide('API.Client.ScrollingPagerDTO');

/**
 * Информация о страницах результатов.
 * @record
 */
API.Client.ScrollingPagerDTO = function() {}

/**
 * Идентификатор следующей страницы результатов.
 * @type {!string}
 * @export
 */
API.Client.ScrollingPagerDTO.prototype.nextPageToken;

/**
 * Идентификатор предыдущей страницы результатов.
 * @type {!string}
 * @export
 */
API.Client.ScrollingPagerDTO.prototype.prevPageToken;

