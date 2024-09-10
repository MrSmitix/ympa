

# OrderBoxLayoutItemDTO

Информация о товаре в коробке.

The class is defined in **[OrderBoxLayoutItemDTO.java](../../src/main/java/org/openapitools/model/OrderBoxLayoutItemDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | 
**fullCount** | `Integer` | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  |  [optional property]
**partialCount** | [`OrderBoxLayoutPartialCountDTO`](OrderBoxLayoutPartialCountDTO.md) |  |  [optional property]
**instances** | [`List&lt;BriefOrderItemInstanceDTO&gt;`](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. |  [optional property]






