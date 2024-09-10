// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server


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

// AssertShipmentDtoRequired checks if the required fields are not zero-ed
func AssertShipmentDtoRequired(obj ShipmentDto) error {
	elements := map[string]interface{}{
		"orderIds": obj.OrderIds,
		"availableActions": obj.AvailableActions,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertPartnerShipmentWarehouseDtoRequired(obj.Warehouse); err != nil {
		return err
	}
	if err := AssertPartnerShipmentWarehouseDtoRequired(obj.WarehouseTo); err != nil {
		return err
	}
	if err := AssertDeliveryServiceDtoRequired(obj.DeliveryService); err != nil {
		return err
	}
	if err := AssertPalletsCountDtoRequired(obj.PalletsCount); err != nil {
		return err
	}
	if err := AssertShipmentStatusChangeDtoRequired(obj.CurrentStatus); err != nil {
		return err
	}
	return nil
}

// AssertShipmentDtoConstraints checks if the values respects the defined constraints
func AssertShipmentDtoConstraints(obj ShipmentDto) error {
	if err := AssertPartnerShipmentWarehouseDtoConstraints(obj.Warehouse); err != nil {
		return err
	}
	if err := AssertPartnerShipmentWarehouseDtoConstraints(obj.WarehouseTo); err != nil {
		return err
	}
	if err := AssertDeliveryServiceDtoConstraints(obj.DeliveryService); err != nil {
		return err
	}
	if err := AssertPalletsCountDtoConstraints(obj.PalletsCount); err != nil {
		return err
	}
	if err := AssertShipmentStatusChangeDtoConstraints(obj.CurrentStatus); err != nil {
		return err
	}
	return nil
}
