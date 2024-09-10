# openapi.model.ParcelBoxLabelDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**supplierName** | **String** | Юридическое название магазина. | 
**deliveryServiceName** | **String** | Юридическое название службы доставки. | 
**orderId** | **int** | Идентификатор заказа в системе Маркета. | 
**orderNum** | **String** | Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.  | 
**recipientName** | **String** | Фамилия и инициалы получателя заказа. | 
**boxId** | **int** | Идентификатор коробки. | 
**fulfilmentId** | **String** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.  | 
**place** | **String** | Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.  | 
**weight** | **String** | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.  | 
**deliveryServiceId** | **String** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**deliveryAddress** | **String** | Адрес получателя. | [optional] 
**shipmentDate** | **String** | Дата отгрузки в формате `dd.MM.yyyy`. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


