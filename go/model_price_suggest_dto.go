// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// PriceSuggestDto - Тип цены.
type PriceSuggestDto struct {

	Type PriceSuggestType `json:"type,omitempty"`

	// Цена в рублях.
	Price float32 `json:"price,omitempty"`
}

// AssertPriceSuggestDtoRequired checks if the required fields are not zero-ed
func AssertPriceSuggestDtoRequired(obj PriceSuggestDto) error {
	return nil
}

// AssertPriceSuggestDtoConstraints checks if the values respects the defined constraints
func AssertPriceSuggestDtoConstraints(obj PriceSuggestDto) error {
	return nil
}
