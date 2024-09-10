// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// FulfillmentWarehouseDto - Склад Маркета (FBY).
type FulfillmentWarehouseDto struct {

	// Идентификатор склада.
	Id int64 `json:"id"`

	// Название склада.
	Name string `json:"name"`

	Address WarehouseAddressDto `json:"address,omitempty"`
}

// AssertFulfillmentWarehouseDtoRequired checks if the required fields are not zero-ed
func AssertFulfillmentWarehouseDtoRequired(obj FulfillmentWarehouseDto) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertWarehouseAddressDtoRequired(obj.Address); err != nil {
		return err
	}
	return nil
}

// AssertFulfillmentWarehouseDtoConstraints checks if the values respects the defined constraints
func AssertFulfillmentWarehouseDtoConstraints(obj FulfillmentWarehouseDto) error {
	if err := AssertWarehouseAddressDtoConstraints(obj.Address); err != nil {
		return err
	}
	return nil
}
