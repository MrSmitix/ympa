/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
	"fmt"
)

// WarehouseStockType Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован. 
type WarehouseStockType string

// List of WarehouseStockType
const (
	FIT WarehouseStockType = "FIT"
	FREEZE WarehouseStockType = "FREEZE"
	AVAILABLE WarehouseStockType = "AVAILABLE"
	QUARANTINE WarehouseStockType = "QUARANTINE"
	UTILIZATION WarehouseStockType = "UTILIZATION"
	DEFECT WarehouseStockType = "DEFECT"
	EXPIRED WarehouseStockType = "EXPIRED"
)

// All allowed values of WarehouseStockType enum
var AllowedWarehouseStockTypeEnumValues = []WarehouseStockType{
	"FIT",
	"FREEZE",
	"AVAILABLE",
	"QUARANTINE",
	"UTILIZATION",
	"DEFECT",
	"EXPIRED",
}

func (v *WarehouseStockType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := WarehouseStockType(value)
	for _, existing := range AllowedWarehouseStockTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid WarehouseStockType", value)
}

// NewWarehouseStockTypeFromValue returns a pointer to a valid WarehouseStockType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewWarehouseStockTypeFromValue(v string) (*WarehouseStockType, error) {
	ev := WarehouseStockType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for WarehouseStockType: valid values are %v", v, AllowedWarehouseStockTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v WarehouseStockType) IsValid() bool {
	for _, existing := range AllowedWarehouseStockTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to WarehouseStockType value
func (v WarehouseStockType) Ptr() *WarehouseStockType {
	return &v
}

type NullableWarehouseStockType struct {
	value *WarehouseStockType
	isSet bool
}

func (v NullableWarehouseStockType) Get() *WarehouseStockType {
	return v.value
}

func (v *NullableWarehouseStockType) Set(val *WarehouseStockType) {
	v.value = val
	v.isSet = true
}

func (v NullableWarehouseStockType) IsSet() bool {
	return v.isSet
}

func (v *NullableWarehouseStockType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableWarehouseStockType(val *WarehouseStockType) *NullableWarehouseStockType {
	return &NullableWarehouseStockType{value: val, isSet: true}
}

func (v NullableWarehouseStockType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableWarehouseStockType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

