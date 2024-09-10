package models

// PutSkuBidsRequest - description.
type PutSkuBidsRequest struct {

	// Список товаров и ставки для продвижения, которые на них нужно установить.
	Bids []SkuBidItemDto `json:"bids"`
}
