// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// UpdateStocksRequest - Запрос на изменение информации по остаткам товаров.
type UpdateStocksRequest struct {

	// Данные об остатках товаров. 
	Skus []UpdateStockDto `json:"skus"`
}

// AssertUpdateStocksRequestRequired checks if the required fields are not zero-ed
func AssertUpdateStocksRequestRequired(obj UpdateStocksRequest) error {
	elements := map[string]interface{}{
		"skus": obj.Skus,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Skus {
		if err := AssertUpdateStockDtoRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertUpdateStocksRequestConstraints checks if the values respects the defined constraints
func AssertUpdateStocksRequestConstraints(obj UpdateStocksRequest) error {
	for _, el := range obj.Skus {
		if err := AssertUpdateStockDtoConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
