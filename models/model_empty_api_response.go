package models

// EmptyApiResponse - Пустой ответ сервера.
type EmptyApiResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`
}
