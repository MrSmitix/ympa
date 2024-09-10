// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// PromoOfferParamsDto - Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
type PromoOfferParamsDto struct {

	DiscountParams PromoOfferDiscountParamsDto `json:"discountParams,omitempty"`

	PromocodeParams PromoOfferPromocodeParamsDto `json:"promocodeParams,omitempty"`
}

// AssertPromoOfferParamsDtoRequired checks if the required fields are not zero-ed
func AssertPromoOfferParamsDtoRequired(obj PromoOfferParamsDto) error {
	if err := AssertPromoOfferDiscountParamsDtoRequired(obj.DiscountParams); err != nil {
		return err
	}
	if err := AssertPromoOfferPromocodeParamsDtoRequired(obj.PromocodeParams); err != nil {
		return err
	}
	return nil
}

// AssertPromoOfferParamsDtoConstraints checks if the values respects the defined constraints
func AssertPromoOfferParamsDtoConstraints(obj PromoOfferParamsDto) error {
	if err := AssertPromoOfferDiscountParamsDtoConstraints(obj.DiscountParams); err != nil {
		return err
	}
	if err := AssertPromoOfferPromocodeParamsDtoConstraints(obj.PromocodeParams); err != nil {
		return err
	}
	return nil
}
