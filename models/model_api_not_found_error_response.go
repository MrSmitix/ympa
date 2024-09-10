package models

// ApiNotFoundErrorResponse - Запрашиваемый ресурс не найден.
type ApiNotFoundErrorResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Список ошибок.
	Errors *[]ApiErrorDto `json:"errors,omitempty"`
}
