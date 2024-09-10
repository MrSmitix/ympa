# OrderBoxLayoutItemDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | [default to nothing]
**fullCount** | **Int64** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  | [optional] [default to nothing]
**partialCount** | [***OrderBoxLayoutPartialCountDTO**](OrderBoxLayoutPartialCountDTO.md) |  | [optional] [default to nothing]
**instances** | [**Vector{BriefOrderItemInstanceDTO}**](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


