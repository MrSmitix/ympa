package models

// OrderItemDto - Список товаров в заказе.
type OrderItemDto struct {

	// Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
	Id int64 `json:"id,omitempty"`

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Название товара.
	OfferName string `json:"offerName,omitempty"`

	// Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
	Price float32 `json:"price,omitempty"`

	// Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
	BuyerPrice float32 `json:"buyerPrice,omitempty"`

	// Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
	BuyerPriceBeforeDiscount float32 `json:"buyerPriceBeforeDiscount,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
	// Deprecated
	PriceBeforeDiscount float32 `json:"priceBeforeDiscount,omitempty"`

	// Количество единиц товара.
	Count int32 `json:"count,omitempty"`

	Vat OrderVatType `json:"vat,omitempty"`

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	ShopSku string `json:"shopSku,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
	// Deprecated
	Subsidy float32 `json:"subsidy,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
	// Deprecated
	PartnerWarehouseId string `json:"partnerWarehouseId,omitempty"`

	// Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
	Promos *[]OrderItemPromoDto `json:"promos,omitempty"`

	// Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
	Instances *[]OrderItemInstanceDto `json:"instances,omitempty"`

	// Информация об удалении товара из заказа. 
	Details *[]OrderItemDetailDto `json:"details,omitempty"`

	// Список субсидий по типам.
	Subsidies *[]OrderItemSubsidyDto `json:"subsidies,omitempty"`

	// Список необходимых маркировок товара.
	RequiredInstanceTypes *[]OrderItemInstanceType `json:"requiredInstanceTypes,omitempty"`
}
