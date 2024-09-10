package models

// OfferCardDto - Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
type OfferCardDto struct {

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	Mapping GetMappingDto `json:"mapping,omitempty"`

	// Список характеристик с их значениями. 
	ParameterValues *[]ParameterValueDto `json:"parameterValues,omitempty"`

	CardStatus OfferCardStatusType `json:"cardStatus,omitempty"`

	// Процент заполненности карточки.
	ContentRating int32 `json:"contentRating,omitempty"`

	// Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
	Recommendations *[]OfferCardRecommendationDto `json:"recommendations,omitempty"`

	// Ошибки в контенте, препятствующие размещению товара на витрине.
	Errors *[]OfferErrorDto `json:"errors,omitempty"`

	// Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
	Warnings *[]OfferErrorDto `json:"warnings,omitempty"`
}
