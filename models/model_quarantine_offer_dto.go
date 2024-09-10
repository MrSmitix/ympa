package models

// QuarantineOfferDto - Товар в карантине.
type QuarantineOfferDto struct {

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId,omitempty" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	CurrentPrice BasePriceDto `json:"currentPrice,omitempty"`

	LastValidPrice BasePriceDto `json:"lastValidPrice,omitempty"`

	// Причины попадания товара в карантин.
	Verdicts *[]PriceQuarantineVerdictDto `json:"verdicts,omitempty"`
}
