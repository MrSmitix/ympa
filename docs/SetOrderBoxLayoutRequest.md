# SetOrderBoxLayoutRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Boxes** | [**OrderBoxLayoutDTO[]**](OrderBoxLayoutDTO.md) | Список коробок. | 
**AllowRemove** | **Boolean** | Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа. | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$SetOrderBoxLayoutRequest = Initialize-ympa_powershell_clientSetOrderBoxLayoutRequest  -Boxes null `
 -AllowRemove null
```

- Convert the resource to JSON
```powershell
$SetOrderBoxLayoutRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

