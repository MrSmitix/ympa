# ChangeOutletRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Название точки продаж.  | 
**r#type** | [***models::OutletType**](OutletType.md) |  | 
**coords** | **String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  | [optional] [default to None]
**is_main** | **bool** | Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  | [optional] [default to None]
**shop_outlet_code** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] [default to None]
**visibility** | [***models::OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] [default to None]
**address** | [***models::OutletAddressDto**](OutletAddressDTO.md) |  | 
**phones** | **Vec<String>** | Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  | 
**working_schedule** | [***models::OutletWorkingScheduleDto**](OutletWorkingScheduleDTO.md) |  | 
**delivery_rules** | [**Vec<models::OutletDeliveryRuleDto>**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  | [optional] [default to None]
**storage_period** | **i64** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


