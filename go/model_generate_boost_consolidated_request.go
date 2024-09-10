// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// GenerateBoostConsolidatedRequest - Данные, необходимые для генерации отчета. 
type GenerateBoostConsolidatedRequest struct {

	// Идентификатор бизнеса.
	BusinessId int64 `json:"businessId"`

	// Начало периода, включительно.
	DateFrom string `json:"dateFrom"`

	// Конец периода, включительно.
	DateTo string `json:"dateTo"`
}

// AssertGenerateBoostConsolidatedRequestRequired checks if the required fields are not zero-ed
func AssertGenerateBoostConsolidatedRequestRequired(obj GenerateBoostConsolidatedRequest) error {
	elements := map[string]interface{}{
		"businessId": obj.BusinessId,
		"dateFrom": obj.DateFrom,
		"dateTo": obj.DateTo,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertGenerateBoostConsolidatedRequestConstraints checks if the values respects the defined constraints
func AssertGenerateBoostConsolidatedRequestConstraints(obj GenerateBoostConsolidatedRequest) error {
	return nil
}
