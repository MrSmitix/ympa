package models

// ReturnInstanceDto - Логистическая информация по возврату.
type ReturnInstanceDto struct {

	StockType ReturnInstanceStockType `json:"stockType,omitempty"`

	Status ReturnInstanceStatusType `json:"status,omitempty"`

	// Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	Cis string `json:"cis,omitempty"`

	// Международный идентификатор мобильного оборудования.
	Imei string `json:"imei,omitempty"`
}
