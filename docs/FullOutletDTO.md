# FullOutletDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Название точки продаж.  | 
**type** | [**OutletType**](OutletType.md) |  | 
**coords** | **String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] 
**isMain** | **Bool** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] 
**shopOutletCode** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] 
**visibility** | [**OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] 
**address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  | 
**phones** | **[String]** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**workingSchedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  | 
**deliveryRules** | [OutletDeliveryRuleDTO] | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] 
**storagePeriod** | **Int64** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] 
**id** | **Int64** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] 
**status** | [**OutletStatusType**](OutletStatusType.md) |  | [optional] 
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**shopOutletId** | **String** | Идентификатор точки продаж, заданный магазином. | [optional] 
**workingTime** | **String** | Рабочее время. | [optional] 
**moderationReason** | **String** | Статус модерации. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


