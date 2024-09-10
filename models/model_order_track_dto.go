package models

// OrderTrackDto - Информация о трек-номере посылки (DBS).
type OrderTrackDto struct {

	// Трек‑номер посылки.
	TrackCode string `json:"trackCode,omitempty"`

	// Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	DeliveryServiceId int64 `json:"deliveryServiceId,omitempty"`
}
