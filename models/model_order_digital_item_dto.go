package models

// OrderDigitalItemDto - Ключ цифрового товара.
type OrderDigitalItemDto struct {

	// Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
	Id int64 `json:"id"`

	// Сам ключ.
	Code string `json:"code"`

	// Инструкция по активации.
	Slip string `json:"slip"`

	// Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
	ActivateTill string `json:"activate_till"`
}
