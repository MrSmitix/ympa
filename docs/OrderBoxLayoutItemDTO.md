# Api.OrderBoxLayoutItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | 
**fullCount** | **Number** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  | [optional] 
**partialCount** | [**OrderBoxLayoutPartialCountDTO**](OrderBoxLayoutPartialCountDTO.md) |  | [optional] 
**instances** | [**[BriefOrderItemInstanceDTO]**](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 


