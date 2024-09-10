// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// GetPromosResultDto - Информация об акциях Маркета.
type GetPromosResultDto struct {

	// Акции Маркета.
	Promos []GetPromoDto `json:"promos"`
}

// AssertGetPromosResultDtoRequired checks if the required fields are not zero-ed
func AssertGetPromosResultDtoRequired(obj GetPromosResultDto) error {
	elements := map[string]interface{}{
		"promos": obj.Promos,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Promos {
		if err := AssertGetPromoDtoRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertGetPromosResultDtoConstraints checks if the values respects the defined constraints
func AssertGetPromosResultDtoConstraints(obj GetPromosResultDto) error {
	for _, el := range obj.Promos {
		if err := AssertGetPromoDtoConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
