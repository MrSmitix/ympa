
# ChangeOutletRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Название точки продаж.  |  |
| **type** | [**OutletType**](OutletType.md) |  |  |
| **address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  |  |
| **phones** | **kotlin.collections.List&lt;kotlin.String&gt;** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  |  |
| **workingSchedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  |  |
| **coords** | **kotlin.String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  |  [optional] |
| **isMain** | **kotlin.Boolean** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  |  [optional] |
| **shopOutletCode** | **kotlin.String** | Идентификатор точки продаж, присвоенный магазином. |  [optional] |
| **visibility** | [**OutletVisibilityType**](OutletVisibilityType.md) |  |  [optional] |
| **deliveryRules** | [**kotlin.collections.List&lt;OutletDeliveryRuleDTO&gt;**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  |  [optional] |
| **storagePeriod** | **kotlin.Long** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. |  [optional] |



