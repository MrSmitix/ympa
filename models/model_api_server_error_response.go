package models

// ApiServerErrorResponse - Внутренняя ошибка сервера.
type ApiServerErrorResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Список ошибок.
	Errors *[]ApiErrorDto `json:"errors,omitempty"`
}
