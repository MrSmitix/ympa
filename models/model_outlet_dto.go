package models

// OutletDto - Информация о точке продаж.
type OutletDto struct {

	// Название точки продаж. 
	Name string `json:"name"`

	Type OutletType `json:"type"`

	// Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
	Coords string `json:"coords,omitempty"`

	// Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
	IsMain bool `json:"isMain,omitempty"`

	// Идентификатор точки продаж, присвоенный магазином.
	ShopOutletCode string `json:"shopOutletCode,omitempty"`

	Visibility OutletVisibilityType `json:"visibility,omitempty"`

	Address OutletAddressDto `json:"address"`

	// Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
	Phones []string `json:"phones"`

	WorkingSchedule OutletWorkingScheduleDto `json:"workingSchedule"`

	// Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
	DeliveryRules *[]OutletDeliveryRuleDto `json:"deliveryRules,omitempty"`

	// Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
	StoragePeriod int64 `json:"storagePeriod,omitempty"`
}
