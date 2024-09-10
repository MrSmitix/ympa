package models
// OfferConditionType : Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
type OfferConditionType string

// List of OfferConditionType
const (
	PREOWNED OfferConditionType = "PREOWNED"
	SHOWCASESAMPLE OfferConditionType = "SHOWCASESAMPLE"
	REFURBISHED OfferConditionType = "REFURBISHED"
	REDUCTION OfferConditionType = "REDUCTION"
	RENOVATED OfferConditionType = "RENOVATED"
	NOT_SPECIFIED OfferConditionType = "NOT_SPECIFIED"
)
