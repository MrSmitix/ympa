package models

type SetOrderShipmentBoxesRequest struct {

	// Список грузовых мест. Маркет определяет количество мест по длине этого списка.
	Boxes []ParcelBoxDto `json:"boxes"`
}
