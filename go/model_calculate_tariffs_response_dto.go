// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// CalculateTariffsResponseDto - Расчет стоимости услуг.
type CalculateTariffsResponseDto struct {

	// Стоимость услуг.
	Offers []CalculateTariffsOfferInfoDto `json:"offers"`
}

// AssertCalculateTariffsResponseDtoRequired checks if the required fields are not zero-ed
func AssertCalculateTariffsResponseDtoRequired(obj CalculateTariffsResponseDto) error {
	elements := map[string]interface{}{
		"offers": obj.Offers,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Offers {
		if err := AssertCalculateTariffsOfferInfoDtoRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCalculateTariffsResponseDtoConstraints checks if the values respects the defined constraints
func AssertCalculateTariffsResponseDtoConstraints(obj CalculateTariffsResponseDto) error {
	for _, el := range obj.Offers {
		if err := AssertCalculateTariffsOfferInfoDtoConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
