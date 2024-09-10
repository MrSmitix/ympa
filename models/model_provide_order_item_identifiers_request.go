package models

type ProvideOrderItemIdentifiersRequest struct {

	// Список позиций, требующих маркировки. 
	Items []OrderItemInstanceModificationDto `json:"items"`
}
