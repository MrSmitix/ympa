# ORDER_BOX_LAYOUT_ITEM_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | [default to null]
**full_count** | **INTEGER_32** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  | [optional] [default to null]
**partial_count** | [**ORDER_BOX_LAYOUT_PARTIAL_COUNT_DTO**](OrderBoxLayoutPartialCountDTO.md) |  | [optional] [default to null]
**instances** | [**LIST [BRIEF_ORDER_ITEM_INSTANCE_DTO]**](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


