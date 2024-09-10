// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server


import (
	"time"
)



// GenerateUnitedNettingReportRequest - Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
type GenerateUnitedNettingReportRequest struct {

	// Идентификатор бизнеса.
	BusinessId int64 `json:"businessId"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
	DateTimeFrom time.Time `json:"dateTimeFrom,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
	DateTimeTo time.Time `json:"dateTimeTo,omitempty"`

	// Начало периода, включительно.
	DateFrom string `json:"dateFrom,omitempty"`

	// Конец периода, включительно. Максимальный период — 1 год.
	DateTo string `json:"dateTo,omitempty"`

	// Номер платежного поручения.
	BankOrderId int64 `json:"bankOrderId,omitempty"`

	// Дата платежного поручения.
	BankOrderDateTime time.Time `json:"bankOrderDateTime,omitempty"`

	// Список моделей, которые нужны в отчете. 
	PlacementPrograms *[]PlacementType `json:"placementPrograms,omitempty"`

	// Список ИНН, которые нужны в отчете.
	Inns *[]string `json:"inns,omitempty"`

	// Список магазинов, которые нужны в отчете.
	CampaignIds *[]int64 `json:"campaignIds,omitempty"`
}

// AssertGenerateUnitedNettingReportRequestRequired checks if the required fields are not zero-ed
func AssertGenerateUnitedNettingReportRequestRequired(obj GenerateUnitedNettingReportRequest) error {
	elements := map[string]interface{}{
		"businessId": obj.BusinessId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertGenerateUnitedNettingReportRequestConstraints checks if the values respects the defined constraints
func AssertGenerateUnitedNettingReportRequestConstraints(obj GenerateUnitedNettingReportRequest) error {
	return nil
}
