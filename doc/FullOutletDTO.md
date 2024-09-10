# openapi.model.FullOutletDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Название точки продаж.  | 
**type** | [**OutletType**](OutletType.md) |  | 
**coords** | **String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  | [optional] 
**isMain** | **bool** | Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  | [optional] 
**shopOutletCode** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] 
**visibility** | [**OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] 
**address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  | 
**phones** | **List<String>** | Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  | [default to const []]
**workingSchedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  | 
**deliveryRules** | [**List<OutletDeliveryRuleDTO>**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  | [optional] [default to const []]
**storagePeriod** | **int** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] 
**id** | **int** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] 
**status** | [**OutletStatusType**](OutletStatusType.md) |  | [optional] 
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**shopOutletId** | **String** | Идентификатор точки продаж, заданный магазином. | [optional] 
**workingTime** | **String** | Рабочее время. | [optional] 
**moderationReason** | **String** | Статус модерации. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


