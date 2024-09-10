package models

// OrderLabelDto - Данные для печати ярлыка.
type OrderLabelDto struct {

	// Идентификатор заказа.
	OrderId int64 `json:"orderId"`

	// Количество коробок в заказе.
	PlacesNumber int32 `json:"placesNumber"`

	// URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
	Url string `json:"url"`

	// Информация на ярлыке.
	ParcelBoxLabels []ParcelBoxLabelDto `json:"parcelBoxLabels"`
}
