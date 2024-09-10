package models

// ApiLimitErrorResponse - Превышено ограничение на доступ к ресурсу.
type ApiLimitErrorResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Список ошибок.
	Errors *[]ApiErrorDto `json:"errors,omitempty"`
}
