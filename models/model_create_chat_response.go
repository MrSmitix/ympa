package models

// CreateChatResponse - Результат создания чата.
type CreateChatResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result CreateChatResultDto `json:"result,omitempty"`
}
