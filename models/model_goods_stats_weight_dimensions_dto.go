package models

// GoodsStatsWeightDimensionsDto - Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
type GoodsStatsWeightDimensionsDto struct {

	// Длина товара в сантиметрах.
	Length float32 `json:"length,omitempty"`

	// Ширина товара в сантиметрах.
	Width float32 `json:"width,omitempty"`

	// Высота товара в сантиметрах.
	Height float32 `json:"height,omitempty"`

	// Вес товара в килограммах.
	Weight float32 `json:"weight,omitempty"`
}
