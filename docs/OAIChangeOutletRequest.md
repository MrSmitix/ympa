# OAIChangeOutletRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **NSString*** | Название точки продаж.  | 
**type** | [**OAIOutletType***](OAIOutletType.md) |  | 
**coords** | **NSString*** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] 
**isMain** | **NSNumber*** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] 
**shopOutletCode** | **NSString*** | Идентификатор точки продаж, присвоенный магазином. | [optional] 
**visibility** | [**OAIOutletVisibilityType***](OAIOutletVisibilityType.md) |  | [optional] 
**address** | [**OAIOutletAddressDTO***](OAIOutletAddressDTO.md) |  | 
**phones** | **NSArray&lt;NSString*&gt;*** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**workingSchedule** | [**OAIOutletWorkingScheduleDTO***](OAIOutletWorkingScheduleDTO.md) |  | 
**deliveryRules** | [**NSArray&lt;OAIOutletDeliveryRuleDTO&gt;***](OAIOutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] 
**storagePeriod** | **NSNumber*** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


