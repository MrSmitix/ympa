package models

// ParcelDto - Информация о грузовых местах в заказе.
type ParcelDto struct {

	// Список грузовых мест. Маркет определяет количество мест по длине этого списка.
	Boxes []ParcelBoxDto `json:"boxes"`
}
