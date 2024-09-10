package models

// GetPromoConstraintsDto - Ограничения в акции.
type GetPromoConstraintsDto struct {

	// Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
	WarehouseIds *[]int64 `json:"warehouseIds,omitempty"`
}
