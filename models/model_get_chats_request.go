package models

// GetChatsRequest - Фильтры по чатам, которые нужно вернуть. 
type GetChatsRequest struct {

	// Фильтр по идентификаторам заказов на Маркете.
	OrderIds *[]int64 `json:"orderIds,omitempty"`

	// Фильтр по типам чатов.
	Types *[]ChatType `json:"types,omitempty"`

	// Фильтр по статусам чатов.
	Statuses *[]ChatStatusType `json:"statuses,omitempty"`
}
