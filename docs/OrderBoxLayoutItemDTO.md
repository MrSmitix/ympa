# OrderBoxLayoutItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор товара в заказе.  {% cut &quot;&quot;Где его взять&quot;&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | 
**FullCount** | **Int32** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  | [optional] 
**PartialCount** | [**OrderBoxLayoutPartialCountDTO**](OrderBoxLayoutPartialCountDTO.md) |  | [optional] 
**Instances** | [**BriefOrderItemInstanceDTO[]**](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderBoxLayoutItemDTO = Initialize-ympa_powershell_clientOrderBoxLayoutItemDTO  -Id null `
 -FullCount null `
 -PartialCount null `
 -Instances null
```

- Convert the resource to JSON
```powershell
$OrderBoxLayoutItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

