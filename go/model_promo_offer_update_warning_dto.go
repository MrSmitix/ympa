// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// PromoOfferUpdateWarningDto - Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
type PromoOfferUpdateWarningDto struct {

	Code PromoOfferUpdateWarningCodeType `json:"code"`

	// Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
	CampaignIds *[]int64 `json:"campaignIds,omitempty"`
}

// AssertPromoOfferUpdateWarningDtoRequired checks if the required fields are not zero-ed
func AssertPromoOfferUpdateWarningDtoRequired(obj PromoOfferUpdateWarningDto) error {
	elements := map[string]interface{}{
		"code": obj.Code,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPromoOfferUpdateWarningDtoConstraints checks if the values respects the defined constraints
func AssertPromoOfferUpdateWarningDtoConstraints(obj PromoOfferUpdateWarningDto) error {
	return nil
}
