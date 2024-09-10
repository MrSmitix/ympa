# OrderBoxLayoutItemDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}    | 
**full_count** | Option<**i32**> | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.  | [optional]
**partial_count** | Option<[**models::OrderBoxLayoutPartialCountDto**](OrderBoxLayoutPartialCountDTO.md)> |  | [optional]
**instances** | Option<[**Vec<models::BriefOrderItemInstanceDto>**](BriefOrderItemInstanceDTO.md)> | Переданные вами коды маркировки. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


