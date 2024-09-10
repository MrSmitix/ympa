// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// AddOffersToArchiveRequest - Товары, которые нужно поместить в архив. 
type AddOffersToArchiveRequest struct {

	// Список товаров, которые нужно поместить в архив.
	OfferIds []string `json:"offerIds"`
}

// AssertAddOffersToArchiveRequestRequired checks if the required fields are not zero-ed
func AssertAddOffersToArchiveRequestRequired(obj AddOffersToArchiveRequest) error {
	elements := map[string]interface{}{
		"offerIds": obj.OfferIds,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAddOffersToArchiveRequestConstraints checks if the values respects the defined constraints
func AssertAddOffersToArchiveRequestConstraints(obj AddOffersToArchiveRequest) error {
	return nil
}
