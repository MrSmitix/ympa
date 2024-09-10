package models

// OfferWeightDimensionsDto - Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
type OfferWeightDimensionsDto struct {

	// Длина упаковки в см. 
	Length float32 `json:"length"`

	// Ширина упаковки в см. 
	Width float32 `json:"width"`

	// Высота упаковки в см. 
	Height float32 `json:"height"`

	// Вес товара в кг с учетом упаковки (брутто). 
	Weight float32 `json:"weight"`
}
