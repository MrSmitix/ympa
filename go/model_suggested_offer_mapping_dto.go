// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// SuggestedOfferMappingDto - Товар с соответствующей карточкой на Маркете.
type SuggestedOfferMappingDto struct {

	Offer SuggestedOfferDto `json:"offer,omitempty"`

	Mapping GetMappingDto `json:"mapping,omitempty"`
}

// AssertSuggestedOfferMappingDtoRequired checks if the required fields are not zero-ed
func AssertSuggestedOfferMappingDtoRequired(obj SuggestedOfferMappingDto) error {
	if err := AssertSuggestedOfferDtoRequired(obj.Offer); err != nil {
		return err
	}
	if err := AssertGetMappingDtoRequired(obj.Mapping); err != nil {
		return err
	}
	return nil
}

// AssertSuggestedOfferMappingDtoConstraints checks if the values respects the defined constraints
func AssertSuggestedOfferMappingDtoConstraints(obj SuggestedOfferMappingDto) error {
	if err := AssertSuggestedOfferDtoConstraints(obj.Offer); err != nil {
		return err
	}
	if err := AssertGetMappingDtoConstraints(obj.Mapping); err != nil {
		return err
	}
	return nil
}
