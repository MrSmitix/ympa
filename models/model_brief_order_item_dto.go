package models

// BriefOrderItemDto - Информация о маркированном товаре.
type BriefOrderItemDto struct {

	// Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
	Id int64 `json:"id,omitempty"`

	Vat OrderVatType `json:"vat,omitempty"`

	// Количество единиц товара.
	Count int32 `json:"count,omitempty"`

	// Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
	Price float32 `json:"price,omitempty"`

	// Название товара.
	OfferName string `json:"offerName,omitempty"`

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Переданные вами коды маркировки.
	Instances *[]OrderItemInstanceDto `json:"instances,omitempty"`
}
