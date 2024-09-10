# OUTLET_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**STRING_32**](STRING_32.md) | Название точки продаж.  | [default to null]
**type** | [**OUTLET_TYPE**](OutletType.md) |  | [default to null]
**coords** | [**STRING_32**](STRING_32.md) | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] [default to null]
**is_main** | **BOOLEAN** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] [default to null]
**shop_outlet_code** | [**STRING_32**](STRING_32.md) | Идентификатор точки продаж, присвоенный магазином. | [optional] [default to null]
**visibility** | [**OUTLET_VISIBILITY_TYPE**](OutletVisibilityType.md) |  | [optional] [default to null]
**address** | [**OUTLET_ADDRESS_DTO**](OutletAddressDTO.md) |  | [default to null]
**phones** | [**LIST [STRING_32]**](STRING_32.md) | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | [default to null]
**working_schedule** | [**OUTLET_WORKING_SCHEDULE_DTO**](OutletWorkingScheduleDTO.md) |  | [default to null]
**delivery_rules** | [**LIST [OUTLET_DELIVERY_RULE_DTO]**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] [default to null]
**storage_period** | **INTEGER_64** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


