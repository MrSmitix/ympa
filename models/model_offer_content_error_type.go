package models
// OfferContentErrorType : Типы ошибок:  * `OFFER_NOT_FOUND` — такого товара нет в каталоге. * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). 
type OfferContentErrorType string

// List of OfferContentErrorType
const (
	OFFER_NOT_FOUND OfferContentErrorType = "OFFER_NOT_FOUND"
	UNKNOWN_CATEGORY OfferContentErrorType = "UNKNOWN_CATEGORY"
	CATEGORY_MISMATCH OfferContentErrorType = "CATEGORY_MISMATCH"
	UNKNOWN_PARAMETER OfferContentErrorType = "UNKNOWN_PARAMETER"
	UNEXPECTED_BOOLEAN_VALUE OfferContentErrorType = "UNEXPECTED_BOOLEAN_VALUE"
	NUMBER_FORMAT OfferContentErrorType = "NUMBER_FORMAT"
	VALUE_BLANK OfferContentErrorType = "VALUE_BLANK"
	INVALID_UNIT_ID OfferContentErrorType = "INVALID_UNIT_ID"
	INVALID_GROUP_ID_LENGTH OfferContentErrorType = "INVALID_GROUP_ID_LENGTH"
	INVALID_GROUP_ID_CHARACTERS OfferContentErrorType = "INVALID_GROUP_ID_CHARACTERS"
)
