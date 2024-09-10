package models

// GetMappingDto - Информация о товарах в каталоге. 
type GetMappingDto struct {

	// SKU на Маркете.
	MarketSku int64 `json:"marketSku,omitempty"`

	// Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	MarketSkuName string `json:"marketSkuName,omitempty"`

	// Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	MarketModelId int64 `json:"marketModelId,omitempty"`

	// Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
	MarketModelName string `json:"marketModelName,omitempty"`

	// Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	MarketCategoryId int64 `json:"marketCategoryId,omitempty"`

	// Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
	MarketCategoryName string `json:"marketCategoryName,omitempty"`
}
