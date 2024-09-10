package models

type SetOrderDeliveryTrackCodeRequest struct {

	// Трек‑номер посылки.
	TrackCode string `json:"trackCode"`

	// Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	DeliveryServiceId int64 `json:"deliveryServiceId"`
}
