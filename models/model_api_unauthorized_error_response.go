package models

// ApiUnauthorizedErrorResponse - В запросе не указаны авторизационные данные.
type ApiUnauthorizedErrorResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Список ошибок.
	Errors *[]ApiErrorDto `json:"errors,omitempty"`
}
