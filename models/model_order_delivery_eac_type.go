package models
// OrderDeliveryEacType : Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
type OrderDeliveryEacType string

// List of OrderDeliveryEacType
const (
	MERCHANT_TO_COURIER OrderDeliveryEacType = "MERCHANT_TO_COURIER"
	COURIER_TO_MERCHANT OrderDeliveryEacType = "COURIER_TO_MERCHANT"
	CHECKING_BY_MERCHANT OrderDeliveryEacType = "CHECKING_BY_MERCHANT"
)
