# openapi.model.OrderDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**creationDate** | **String** |  | [optional] 
**updatedAt** | **String** |  | [optional] 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**itemsTotal** | **num** | Платеж покупателя.  | [optional] 
**deliveryTotal** | **num** | Стоимость доставки.  | [optional] 
**buyerItemsTotal** | **num** | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**buyerTotal** | **num** | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**buyerItemsTotalBeforeDiscount** | **num** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**buyerTotalBeforeDiscount** | **num** | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  | [optional] 
**paymentType** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] 
**paymentMethod** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] 
**fake** | **bool** | Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**items** | [**List<OrderItemDTO>**](OrderItemDTO.md) | Список товаров в заказе. | [default to const []]
**subsidies** | [**List<OrderSubsidyDTO>**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] [default to const []]
**delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**notes** | **String** | Комментарий к заказу. | [optional] 
**taxSystem** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] 
**cancelRequested** | **bool** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**expiryDate** | **String** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


