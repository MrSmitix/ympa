// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// UpdateStockDto - Информация об остатках одного товара на одном из складов.
type UpdateStockDto struct {

	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	Sku string `json:"sku" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`

	// Информация об остатках товара. 
	Items []UpdateStockItemDto `json:"items"`
}

// AssertUpdateStockDtoRequired checks if the required fields are not zero-ed
func AssertUpdateStockDtoRequired(obj UpdateStockDto) error {
	elements := map[string]interface{}{
		"sku": obj.Sku,
		"items": obj.Items,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Items {
		if err := AssertUpdateStockItemDtoRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertUpdateStockDtoConstraints checks if the values respects the defined constraints
func AssertUpdateStockDtoConstraints(obj UpdateStockDto) error {
	for _, el := range obj.Items {
		if err := AssertUpdateStockItemDtoConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
