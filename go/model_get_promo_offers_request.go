// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// GetPromoOffersRequest - Получение списка товаров, которые участвуют или могут участвовать в акции.
type GetPromoOffersRequest struct {

	// Идентификатор акции.
	PromoId string `json:"promoId"`

	StatusType PromoOfferParticipationStatusFilterType `json:"statusType,omitempty"`
}

// AssertGetPromoOffersRequestRequired checks if the required fields are not zero-ed
func AssertGetPromoOffersRequestRequired(obj GetPromoOffersRequest) error {
	elements := map[string]interface{}{
		"promoId": obj.PromoId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertGetPromoOffersRequestConstraints checks if the values respects the defined constraints
func AssertGetPromoOffersRequestConstraints(obj GetPromoOffersRequest) error {
	return nil
}
