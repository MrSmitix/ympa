# FullOutletDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **name** | **String** | Название точки продаж.  | [default to null] |
| **type** | [**OutletType**](OutletType.md) |  | [default to null] |
| **coords** | **String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] [default to null] |
| **isMain** | **Boolean** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] [default to null] |
| **shopOutletCode** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] [default to null] |
| **visibility** | [**OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] [default to null] |
| **address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  | [default to null] |
| **phones** | **List** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | [default to null] |
| **workingSchedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  | [default to null] |
| **deliveryRules** | [**List**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] [default to null] |
| **storagePeriod** | **Long** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] [default to null] |
| **id** | **Long** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] [default to null] |
| **status** | [**OutletStatusType**](OutletStatusType.md) |  | [optional] [default to null] |
| **region** | [**RegionDTO**](RegionDTO.md) |  | [optional] [default to null] |
| **shopOutletId** | **String** | Идентификатор точки продаж, заданный магазином. | [optional] [default to null] |
| **workingTime** | **String** | Рабочее время. | [optional] [default to null] |
| **moderationReason** | **String** | Статус модерации. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

