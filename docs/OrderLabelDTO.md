# OrderLabelDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderId** | **Int64** | Идентификатор заказа. | 
**PlacesNumber** | **Int32** | Количество коробок в заказе. | 
**Url** | **String** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**ParcelBoxLabels** | [**ParcelBoxLabelDTO[]**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 

## Examples

- Prepare the resource
```powershell
$OrderLabelDTO = Initialize-ympa_powershell_clientOrderLabelDTO  -OrderId null `
 -PlacesNumber null `
 -Url null `
 -ParcelBoxLabels null
```

- Convert the resource to JSON
```powershell
$OrderLabelDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

