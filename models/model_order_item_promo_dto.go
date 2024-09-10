package models

// OrderItemPromoDto - Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
type OrderItemPromoDto struct {

	Type OrderPromoType `json:"type"`

	// Размер пользовательской скидки в валюте покупателя. 
	Discount float32 `json:"discount,omitempty"`

	// Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
	Subsidy float32 `json:"subsidy,omitempty"`

	// Идентификатор акции поставщика. 
	ShopPromoId string `json:"shopPromoId,omitempty"`

	// Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
	MarketPromoId string `json:"marketPromoId,omitempty"`
}
