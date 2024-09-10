// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// GetPromoOfferDto - Товар, который участвует или может участвовать в акции.
type GetPromoOfferDto struct {

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	Status PromoOfferParticipationStatusType `json:"status"`

	Params PromoOfferParamsDto `json:"params"`

	AutoParticipatingDetails PromoOfferAutoParticipatingDetailsDto `json:"autoParticipatingDetails,omitempty"`
}

// AssertGetPromoOfferDtoRequired checks if the required fields are not zero-ed
func AssertGetPromoOfferDtoRequired(obj GetPromoOfferDto) error {
	elements := map[string]interface{}{
		"offerId": obj.OfferId,
		"status": obj.Status,
		"params": obj.Params,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPromoOfferParamsDtoRequired(obj.Params); err != nil {
		return err
	}
	if err := AssertPromoOfferAutoParticipatingDetailsDtoRequired(obj.AutoParticipatingDetails); err != nil {
		return err
	}
	return nil
}

// AssertGetPromoOfferDtoConstraints checks if the values respects the defined constraints
func AssertGetPromoOfferDtoConstraints(obj GetPromoOfferDto) error {
	if err := AssertPromoOfferParamsDtoConstraints(obj.Params); err != nil {
		return err
	}
	if err := AssertPromoOfferAutoParticipatingDetailsDtoConstraints(obj.AutoParticipatingDetails); err != nil {
		return err
	}
	return nil
}
