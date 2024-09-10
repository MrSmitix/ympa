package models

// GetBidsInfoRequest - description.
type GetBidsInfoRequest struct {

	// Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
	Skus *[]string `json:"skus,omitempty"`
}
