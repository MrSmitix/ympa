package models
// RecipientType : Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
type RecipientType string

// List of RecipientType
const (
	SHOP RecipientType = "SHOP"
	DELIVERY_SERVICE RecipientType = "DELIVERY_SERVICE"
	POST RecipientType = "POST"
)
