package models

// UpdateStocksRequest - Запрос на изменение информации по остаткам товаров.
type UpdateStocksRequest struct {

	// Данные об остатках товаров. 
	Skus []UpdateStockDto `json:"skus"`
}
