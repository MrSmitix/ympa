package models

// UpdateOfferMappingResultDto - Ошибки и предупреждения, которые появились из-за переданных характеристик.
type UpdateOfferMappingResultDto struct {

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Ошибки — информация в каталоге не обновится.
	Errors *[]OfferMappingErrorDto `json:"errors,omitempty"`

	// Предупреждения — информация в каталоге обновится.
	Warnings *[]OfferMappingErrorDto `json:"warnings,omitempty"`
}
