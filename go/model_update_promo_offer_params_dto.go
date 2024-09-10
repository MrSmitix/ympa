// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// UpdatePromoOfferParamsDto - Параметры товара, который участвует в акции.
type UpdatePromoOfferParamsDto struct {

	DiscountParams UpdatePromoOfferDiscountParamsDto `json:"discountParams,omitempty"`
}

// AssertUpdatePromoOfferParamsDtoRequired checks if the required fields are not zero-ed
func AssertUpdatePromoOfferParamsDtoRequired(obj UpdatePromoOfferParamsDto) error {
	if err := AssertUpdatePromoOfferDiscountParamsDtoRequired(obj.DiscountParams); err != nil {
		return err
	}
	return nil
}

// AssertUpdatePromoOfferParamsDtoConstraints checks if the values respects the defined constraints
func AssertUpdatePromoOfferParamsDtoConstraints(obj UpdatePromoOfferParamsDto) error {
	if err := AssertUpdatePromoOfferDiscountParamsDtoConstraints(obj.DiscountParams); err != nil {
		return err
	}
	return nil
}
