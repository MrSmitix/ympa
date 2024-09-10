// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// GetCategoriesMaxSaleQuantumRequest - Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
type GetCategoriesMaxSaleQuantumRequest struct {

	// Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
	MarketCategoryIds []int64 `json:"marketCategoryIds"`
}

// AssertGetCategoriesMaxSaleQuantumRequestRequired checks if the required fields are not zero-ed
func AssertGetCategoriesMaxSaleQuantumRequestRequired(obj GetCategoriesMaxSaleQuantumRequest) error {
	elements := map[string]interface{}{
		"marketCategoryIds": obj.MarketCategoryIds,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertGetCategoriesMaxSaleQuantumRequestConstraints checks if the values respects the defined constraints
func AssertGetCategoriesMaxSaleQuantumRequestConstraints(obj GetCategoriesMaxSaleQuantumRequest) error {
	return nil
}
