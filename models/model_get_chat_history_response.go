package models

type GetChatHistoryResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result ChatMessagesResultDto `json:"result,omitempty"`
}
