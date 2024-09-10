package models

// ReturnItemDto - Список товаров в возврате.
type ReturnItemDto struct {

	// SKU на Маркете.
	MarketSku int64 `json:"marketSku,omitempty"`

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	ShopSku string `json:"shopSku" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Количество единиц товара.
	Count int64 `json:"count"`

	// Список решений по возврату.
	Decisions *[]ReturnDecisionDto `json:"decisions,omitempty"`

	// Список логистических позиций возврата.
	Instances *[]ReturnInstanceDto `json:"instances,omitempty"`

	// Список трек-кодов для почтовых отправлений.
	Tracks *[]TrackDto `json:"tracks,omitempty"`
}
