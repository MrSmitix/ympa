

# OutletDTO

Информация о точке продаж.

The class is defined in **[OutletDTO.java](../../src/main/java/org/openapitools/model/OutletDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | `String` | Название точки продаж.  | 
**type** | `OutletType` |  | 
**coords** | `String` | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  |  [optional property]
**isMain** | `Boolean` | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  |  [optional property]
**shopOutletCode** | `String` | Идентификатор точки продаж, присвоенный магазином. |  [optional property]
**visibility** | `OutletVisibilityType` |  |  [optional property]
**address** | [`OutletAddressDTO`](OutletAddressDTO.md) |  | 
**phones** | `List&lt;String&gt;` | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**workingSchedule** | [`OutletWorkingScheduleDTO`](OutletWorkingScheduleDTO.md) |  | 
**deliveryRules** | [`List&lt;OutletDeliveryRuleDTO&gt;`](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  |  [optional property]
**storagePeriod** | `Long` | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. |  [optional property]













