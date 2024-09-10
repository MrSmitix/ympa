package models

// GetChatHistoryRequest - Историю какого чата нужно получить — и начиная с какого сообщения. 
type GetChatHistoryRequest struct {

	// Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
	MessageIdFrom int64 `json:"messageIdFrom,omitempty"`
}
