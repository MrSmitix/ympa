package models

// SendMessageToChatRequest - В какой чат нужно отправить сообщение и текст сообщения.
type SendMessageToChatRequest struct {

	// Текст сообщения. Максимальная длина — 4096 символа.
	Message string `json:"message"`
}
