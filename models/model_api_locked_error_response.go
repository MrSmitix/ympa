package models

// ApiLockedErrorResponse - Ресурс из запроса заблокирован от применения к нему указанного метода.
type ApiLockedErrorResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Список ошибок.
	Errors *[]ApiErrorDto `json:"errors,omitempty"`
}
