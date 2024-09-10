package models

// OrdersStatsCommissionDto - Информация о стоимости услуг.
type OrdersStatsCommissionDto struct {

	Type OrdersStatsCommissionType `json:"type,omitempty"`

	// Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
	Actual float32 `json:"actual,omitempty"`
}
