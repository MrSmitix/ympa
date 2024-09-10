
# Table `OutletDTO`
(mapped from: OutletDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Название точки продаж.  | 
**type** | type | long NOT NULL |  | [**OutletType**](OutletType.md) |  |  [foreignkey]
**address** | address | long NOT NULL |  | [**OutletAddressDTO**](OutletAddressDTO.md) |  |  [foreignkey]
**phones** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**workingSchedule** | workingSchedule | long NOT NULL |  | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  |  [foreignkey]
**coords** | coords | text |  | **kotlin.String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  |  [optional]
**isMain** | isMain | boolean |  | **kotlin.Boolean** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  |  [optional]
**shopOutletCode** | shopOutletCode | text |  | **kotlin.String** | Идентификатор точки продаж, присвоенный магазином. |  [optional]
**visibility** | visibility | long |  | [**OutletVisibilityType**](OutletVisibilityType.md) |  |  [optional] [foreignkey]
**deliveryRules** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OutletDeliveryRuleDTO&gt;**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  |  [optional]
**storagePeriod** | storagePeriod | long |  | **kotlin.Long** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. |  [optional]





# **Table `OutletDTOPhones`**
(mapped from: OutletDTOPhones)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
outletDTO | outletDTO | long | | kotlin.Long | Primary Key | *one*
phones | phones | text | | kotlin.String | Foreign Key | *many*








# **Table `OutletDTOOutletDeliveryRuleDTO`**
(mapped from: OutletDTOOutletDeliveryRuleDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
outletDTO | outletDTO | long | | kotlin.Long | Primary Key | *one*
outletDeliveryRuleDTO | outletDeliveryRuleDTO | long | | kotlin.Long | Foreign Key | *many*




