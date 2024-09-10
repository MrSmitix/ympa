package models

type SetOrderBoxLayoutRequest struct {

	// Список коробок.
	Boxes []OrderBoxLayoutDto `json:"boxes"`

	// Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
	AllowRemove bool `json:"allowRemove,omitempty"`
}
