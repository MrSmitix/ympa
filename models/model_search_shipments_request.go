package models

// SearchShipmentsRequest - Запрос информации об отгрузках.
type SearchShipmentsRequest struct {

	// Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
	DateFrom string `json:"dateFrom"`

	// Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
	DateTo string `json:"dateTo"`

	// Список статусов отгрузок.
	Statuses *[]ShipmentStatusType `json:"statuses,omitempty"`

	// Список идентификаторов заказов из отгрузок.
	OrderIds *[]int64 `json:"orderIds,omitempty"`

	// Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
	CancelledOrders bool `json:"cancelledOrders,omitempty"`
}
