package org.openapitools.server.model


/**
 * Запрос на передачу ключей цифровых товаров.
 *
 * @param items Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же.  for example: ''null''
*/
final case class ProvideOrderDigitalCodesRequest (
  items: Seq[OrderDigitalItemDTO]
)

