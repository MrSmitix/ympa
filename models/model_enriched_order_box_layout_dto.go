package models

// EnrichedOrderBoxLayoutDto - Информация о коробке.
type EnrichedOrderBoxLayoutDto struct {

	// Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
	Items []OrderBoxLayoutItemDto `json:"items"`

	// Идентификатор коробки.
	BoxId int64 `json:"boxId,omitempty"`
}
