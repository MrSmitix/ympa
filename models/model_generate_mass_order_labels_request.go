package models

// GenerateMassOrderLabelsRequest - Данные, необходимые для генерации файла. 
type GenerateMassOrderLabelsRequest struct {

	// Идентификатор кабинета.
	BusinessId int64 `json:"businessId"`

	// Список идентификаторов заказов.
	OrderIds []int64 `json:"orderIds"`
}
