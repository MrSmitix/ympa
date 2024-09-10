# ParcelBoxLabelDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **String** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**SupplierName** | **String** | Юридическое название магазина. | 
**DeliveryServiceName** | **String** | Юридическое название службы доставки. | 
**OrderId** | **Int64** | Идентификатор заказа в системе Маркета. | 
**OrderNum** | **String** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | 
**RecipientName** | **String** | Фамилия и инициалы получателя заказа. | 
**BoxId** | **Int64** | Идентификатор коробки. | 
**FulfilmentId** | **String** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | 
**Place** | **String** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | 
**Weight** | **String** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | 
**DeliveryServiceId** | **String** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**DeliveryAddress** | **String** | Адрес получателя. | [optional] 
**ShipmentDate** | **String** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] 

## Examples

- Prepare the resource
```powershell
$ParcelBoxLabelDTO = Initialize-ympa_powershell_clientParcelBoxLabelDTO  -Url null `
 -SupplierName null `
 -DeliveryServiceName null `
 -OrderId null `
 -OrderNum null `
 -RecipientName null `
 -BoxId null `
 -FulfilmentId null `
 -Place null `
 -Weight null `
 -DeliveryServiceId null `
 -DeliveryAddress null `
 -ShipmentDate null
```

- Convert the resource to JSON
```powershell
$ParcelBoxLabelDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

