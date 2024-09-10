# OpenapiClient::FullOutletDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Название точки продаж.  |  |
| **type** | [**OutletType**](OutletType.md) |  |  |
| **coords** | **String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] |
| **is_main** | **Boolean** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] |
| **shop_outlet_code** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] |
| **visibility** | [**OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] |
| **address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  |  |
| **phones** | **Array&lt;String&gt;** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  |  |
| **working_schedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  |  |
| **delivery_rules** | [**Array&lt;OutletDeliveryRuleDTO&gt;**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] |
| **storage_period** | **Integer** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] |
| **id** | **Integer** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] |
| **status** | [**OutletStatusType**](OutletStatusType.md) |  | [optional] |
| **region** | [**RegionDTO**](RegionDTO.md) |  | [optional] |
| **shop_outlet_id** | **String** | Идентификатор точки продаж, заданный магазином. | [optional] |
| **working_time** | **String** | Рабочее время. | [optional] |
| **moderation_reason** | **String** | Статус модерации. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FullOutletDTO.new(
  name: null,
  type: null,
  coords: null,
  is_main: null,
  shop_outlet_code: null,
  visibility: null,
  address: null,
  phones: null,
  working_schedule: null,
  delivery_rules: null,
  storage_period: null,
  id: null,
  status: null,
  region: null,
  shop_outlet_id: null,
  working_time: null,
  moderation_reason: null
)
```

