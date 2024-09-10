// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// OfferContentDto - Товар с указанными характеристиками.
type OfferContentDto struct {

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
	CategoryId int32 `json:"categoryId"`

	// Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
	ParameterValues []ParameterValueDto `json:"parameterValues"`
}

// AssertOfferContentDtoRequired checks if the required fields are not zero-ed
func AssertOfferContentDtoRequired(obj OfferContentDto) error {
	elements := map[string]interface{}{
		"offerId": obj.OfferId,
		"categoryId": obj.CategoryId,
		"parameterValues": obj.ParameterValues,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.ParameterValues {
		if err := AssertParameterValueDtoRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertOfferContentDtoConstraints checks if the values respects the defined constraints
func AssertOfferContentDtoConstraints(obj OfferContentDto) error {
	for _, el := range obj.ParameterValues {
		if err := AssertParameterValueDtoConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
