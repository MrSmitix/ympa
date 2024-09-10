package models

// GetChatsInfoDto - Список чатов.
type GetChatsInfoDto struct {

	// Информация о чатах.
	Chats []GetChatInfoDto `json:"chats"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}
