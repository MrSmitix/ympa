// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// ModelDto - Модель товара.
type ModelDto struct {

	// Идентификатор модели товара.
	Id int64 `json:"id,omitempty"`

	// Название модели товара.
	Name string `json:"name,omitempty"`

	Prices ModelPriceDto `json:"prices,omitempty"`
}

// AssertModelDtoRequired checks if the required fields are not zero-ed
func AssertModelDtoRequired(obj ModelDto) error {
	if err := AssertModelPriceDtoRequired(obj.Prices); err != nil {
		return err
	}
	return nil
}

// AssertModelDtoConstraints checks if the values respects the defined constraints
func AssertModelDtoConstraints(obj ModelDto) error {
	if err := AssertModelPriceDtoConstraints(obj.Prices); err != nil {
		return err
	}
	return nil
}
