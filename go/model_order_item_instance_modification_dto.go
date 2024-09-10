// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// OrderItemInstanceModificationDto - Позиция в корзине, требующая маркировки.
type OrderItemInstanceModificationDto struct {

	// Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
	Id int64 `json:"id"`

	// Список кодов маркировки единиц товара. 
	Instances []BriefOrderItemInstanceDto `json:"instances"`
}

// AssertOrderItemInstanceModificationDtoRequired checks if the required fields are not zero-ed
func AssertOrderItemInstanceModificationDtoRequired(obj OrderItemInstanceModificationDto) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"instances": obj.Instances,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Instances {
		if err := AssertBriefOrderItemInstanceDtoRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertOrderItemInstanceModificationDtoConstraints checks if the values respects the defined constraints
func AssertOrderItemInstanceModificationDtoConstraints(obj OrderItemInstanceModificationDto) error {
	for _, el := range obj.Instances {
		if err := AssertBriefOrderItemInstanceDtoConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
