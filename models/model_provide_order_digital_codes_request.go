package models

// ProvideOrderDigitalCodesRequest - Запрос на передачу ключей цифровых товаров.
type ProvideOrderDigitalCodesRequest struct {

	// Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
	Items []OrderDigitalItemDto `json:"items"`
}
