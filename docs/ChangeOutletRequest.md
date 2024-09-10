# ChangeOutletRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Название точки продаж.  | [default to nothing]
**type** | [***OutletType**](OutletType.md) |  | [default to nothing]
**coords** | **String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] [default to nothing]
**isMain** | **Bool** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] [default to nothing]
**shopOutletCode** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] [default to nothing]
**visibility** | [***OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] [default to nothing]
**address** | [***OutletAddressDTO**](OutletAddressDTO.md) |  | [default to nothing]
**phones** | **Vector{String}** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | [default to nothing]
**workingSchedule** | [***OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  | [default to nothing]
**deliveryRules** | [**Vector{OutletDeliveryRuleDTO}**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] [default to nothing]
**storagePeriod** | **Int64** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


