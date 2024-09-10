goog.provide('API.Client.ProvideOrderDigitalCodesRequest');

/**
 * Запрос на передачу ключей цифровых товаров.
 * @record
 */
API.Client.ProvideOrderDigitalCodesRequest = function() {}

/**
 * Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
 * @type {!Array<!API.Client.OrderDigitalItemDTO>}
 * @export
 */
API.Client.ProvideOrderDigitalCodesRequest.prototype.items;

