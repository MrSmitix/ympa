package models

import (
	"time"
)

// ShipmentDto - Информация об отгрузке.
type ShipmentDto struct {

	// Идентификатор отгрузки.
	Id int64 `json:"id,omitempty"`

	// Начало планового интервала отгрузки.
	PlanIntervalFrom time.Time `json:"planIntervalFrom,omitempty"`

	// Конец планового интервала отгрузки.
	PlanIntervalTo time.Time `json:"planIntervalTo,omitempty"`

	ShipmentType ShipmentType `json:"shipmentType,omitempty"`

	Warehouse PartnerShipmentWarehouseDto `json:"warehouse,omitempty"`

	WarehouseTo PartnerShipmentWarehouseDto `json:"warehouseTo,omitempty"`

	// Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
	ExternalId string `json:"externalId,omitempty"`

	DeliveryService DeliveryServiceDto `json:"deliveryService,omitempty"`

	PalletsCount PalletsCountDto `json:"palletsCount,omitempty"`

	// Идентификаторы заказов в отгрузке.
	OrderIds []int64 `json:"orderIds"`

	// Количество заказов, которое Маркет запланировал к отгрузке.
	DraftCount int32 `json:"draftCount,omitempty"`

	// Количество заказов, которое Маркет подтвердил к отгрузке.
	PlannedCount int32 `json:"plannedCount,omitempty"`

	// Количество заказов, принятых в сортировочном центре или пункте приема.
	FactCount int32 `json:"factCount,omitempty"`

	CurrentStatus ShipmentStatusChangeDto `json:"currentStatus,omitempty"`

	// Доступные действия над отгрузкой.
	AvailableActions []ShipmentActionType `json:"availableActions"`
}
