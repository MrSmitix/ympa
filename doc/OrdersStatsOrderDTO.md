# openapi.model.OrdersStatsOrderDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**creationDate** | [**DateTime**](DateTime.md) | Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional] 
**statusUpdateDate** | [**DateTime**](DateTime.md) | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  | [optional] 
**status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] 
**partnerOrderId** | **String** | Идентификатор заказа в информационной системе магазина. | [optional] 
**paymentType** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] 
**fake** | **bool** | Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**deliveryRegion** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] 
**items** | [**List<OrdersStatsItemDTO>**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | [default to const []]
**initialItems** | [**List<OrdersStatsItemDTO>**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] [default to const []]
**payments** | [**List<OrdersStatsPaymentDTO>**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | [default to const []]
**commissions** | [**List<OrdersStatsCommissionDTO>**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


