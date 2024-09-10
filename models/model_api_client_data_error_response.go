package models

// ApiClientDataErrorResponse - Ошибка в данных переданных от клиента.
type ApiClientDataErrorResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Список ошибок.
	Errors *[]ApiErrorDto `json:"errors,omitempty"`
}
