package models

// ApiResponse - Стандартная обертка для ответов сервера.
type ApiResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`
}
