package models
// OfferMappingErrorType : Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `EMPTY_MARKET_CATEGORY` — не указана категория Маркета при передаче характеристик категории. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). * `INVALID_PICKER_URL` — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
type OfferMappingErrorType string

// List of OfferMappingErrorType
const (
	UNKNOWN_CATEGORY OfferMappingErrorType = "UNKNOWN_CATEGORY"
	CATEGORY_MISMATCH OfferMappingErrorType = "CATEGORY_MISMATCH"
	EMPTY_MARKET_CATEGORY OfferMappingErrorType = "EMPTY_MARKET_CATEGORY"
	UNKNOWN_PARAMETER OfferMappingErrorType = "UNKNOWN_PARAMETER"
	UNEXPECTED_BOOLEAN_VALUE OfferMappingErrorType = "UNEXPECTED_BOOLEAN_VALUE"
	NUMBER_FORMAT OfferMappingErrorType = "NUMBER_FORMAT"
	VALUE_BLANK OfferMappingErrorType = "VALUE_BLANK"
	INVALID_UNIT_ID OfferMappingErrorType = "INVALID_UNIT_ID"
	INVALID_GROUP_ID_LENGTH OfferMappingErrorType = "INVALID_GROUP_ID_LENGTH"
	INVALID_GROUP_ID_CHARACTERS OfferMappingErrorType = "INVALID_GROUP_ID_CHARACTERS"
	INVALID_PICKER_URL OfferMappingErrorType = "INVALID_PICKER_URL"
)
