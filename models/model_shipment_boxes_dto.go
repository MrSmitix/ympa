package models

// ShipmentBoxesDto - В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
type ShipmentBoxesDto struct {

	// Список грузовых мест. Маркет определил количество мест по длине этого списка. 
	Boxes []ParcelBoxDto `json:"boxes"`
}
