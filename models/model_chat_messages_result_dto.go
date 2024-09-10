package models

// ChatMessagesResultDto - Информация о сообщениях.
type ChatMessagesResultDto struct {

	// Идентификатор заказа.
	OrderId int64 `json:"orderId"`

	// Информация о сообщениях.
	Messages []ChatMessageDto `json:"messages"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}
