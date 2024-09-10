# OrderDigitalItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**Code** | **String** | Сам ключ. | 
**Slip** | **String** | Инструкция по активации. | 
**ActivateTill** | **System.DateTime** | Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Examples

- Prepare the resource
```powershell
$OrderDigitalItemDTO = Initialize-ympa_powershell_clientOrderDigitalItemDTO  -Id null `
 -Code null `
 -Slip null `
 -ActivateTill null
```

- Convert the resource to JSON
```powershell
$OrderDigitalItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

