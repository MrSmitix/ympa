package models

// OrderDto - Заказ.
type OrderDto struct {

	// Идентификатор заказа.
	Id int64 `json:"id,omitempty"`

	Status OrderStatusType `json:"status,omitempty"`

	Substatus OrderSubstatusType `json:"substatus,omitempty"`

	CreationDate string `json:"creationDate,omitempty"`

	UpdatedAt string `json:"updatedAt,omitempty"`

	Currency CurrencyType `json:"currency,omitempty"`

	// Платеж покупателя. 
	ItemsTotal float32 `json:"itemsTotal,omitempty"`

	// Стоимость доставки. 
	DeliveryTotal float32 `json:"deliveryTotal,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
	// Deprecated
	BuyerItemsTotal float32 `json:"buyerItemsTotal,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
	// Deprecated
	BuyerTotal float32 `json:"buyerTotal,omitempty"`

	// Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
	BuyerItemsTotalBeforeDiscount float32 `json:"buyerItemsTotalBeforeDiscount,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
	// Deprecated
	BuyerTotalBeforeDiscount float32 `json:"buyerTotalBeforeDiscount,omitempty"`

	PaymentType OrderPaymentType `json:"paymentType,omitempty"`

	PaymentMethod OrderPaymentMethodType `json:"paymentMethod,omitempty"`

	// Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
	Fake bool `json:"fake,omitempty"`

	// Список товаров в заказе.
	Items []OrderItemDto `json:"items"`

	// Список субсидий по типам.
	Subsidies *[]OrderSubsidyDto `json:"subsidies,omitempty"`

	Delivery OrderDeliveryDto `json:"delivery,omitempty"`

	Buyer OrderBuyerDto `json:"buyer,omitempty"`

	// Комментарий к заказу.
	Notes string `json:"notes,omitempty"`

	TaxSystem OrderTaxSystemType `json:"taxSystem,omitempty"`

	// **Только для модели DBS**  Запрошена ли отмена. 
	CancelRequested bool `json:"cancelRequested,omitempty"`

	ExpiryDate string `json:"expiryDate,omitempty"`
}
