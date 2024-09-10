# OAIOrderBoxLayoutItemDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | 
**fullCount** | **NSNumber*** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  | [optional] 
**partialCount** | [**OAIOrderBoxLayoutPartialCountDTO***](OAIOrderBoxLayoutPartialCountDTO.md) |  | [optional] 
**instances** | [**NSArray&lt;OAIBriefOrderItemInstanceDTO&gt;***](OAIBriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


