# ChangeOutletRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Название точки продаж.  | 
**r#type** | [**models::OutletType**](OutletType.md) |  | 
**coords** | Option<**String**> | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  | [optional]
**is_main** | Option<**bool**> | Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  | [optional]
**shop_outlet_code** | Option<**String**> | Идентификатор точки продаж, присвоенный магазином. | [optional]
**visibility** | Option<[**models::OutletVisibilityType**](OutletVisibilityType.md)> |  | [optional]
**address** | [**models::OutletAddressDto**](OutletAddressDTO.md) |  | 
**phones** | **Vec<String>** | Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  | 
**working_schedule** | [**models::OutletWorkingScheduleDto**](OutletWorkingScheduleDTO.md) |  | 
**delivery_rules** | Option<[**Vec<models::OutletDeliveryRuleDto>**](OutletDeliveryRuleDTO.md)> | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  | [optional]
**storage_period** | Option<**i64**> | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


