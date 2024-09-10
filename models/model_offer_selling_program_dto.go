package models

// OfferSellingProgramDto - Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
type OfferSellingProgramDto struct {

	SellingProgram SellingProgramType `json:"sellingProgram"`

	Status OfferSellingProgramStatusType `json:"status"`
}
