goog.provide('API.Client.FlippingPagerDTO');

/**
 * Модель для пагинации.
 * @record
 */
API.Client.FlippingPagerDTO = function() {}

/**
 * Сколько всего найдено элементов.
 * @type {!number}
 * @export
 */
API.Client.FlippingPagerDTO.prototype.total;

/**
 * Начальный номер найденного элемента на странице.
 * @type {!number}
 * @export
 */
API.Client.FlippingPagerDTO.prototype.from;

/**
 * Конечный номер найденного элемента на странице.
 * @type {!number}
 * @export
 */
API.Client.FlippingPagerDTO.prototype.to;

/**
 * Текущая страница.
 * @type {!number}
 * @export
 */
API.Client.FlippingPagerDTO.prototype.currentPage;

/**
 * Общее количество страниц.
 * @type {!number}
 * @export
 */
API.Client.FlippingPagerDTO.prototype.pagesCount;

/**
 * Размер страницы.
 * @type {!number}
 * @export
 */
API.Client.FlippingPagerDTO.prototype.pageSize;

