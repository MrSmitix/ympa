// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// DeletePromoOffersRequest - Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
type DeletePromoOffersRequest struct {

	// Идентификатор акции.
	PromoId string `json:"promoId"`

	// Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
	DeleteAllOffers bool `json:"deleteAllOffers,omitempty"`

	// Товары, которые нужно убрать из акции.
	OfferIds *[]string `json:"offerIds,omitempty"`
}

// AssertDeletePromoOffersRequestRequired checks if the required fields are not zero-ed
func AssertDeletePromoOffersRequestRequired(obj DeletePromoOffersRequest) error {
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

// AssertDeletePromoOffersRequestConstraints checks if the values respects the defined constraints
func AssertDeletePromoOffersRequestConstraints(obj DeletePromoOffersRequest) error {
	return nil
}
