# OrderBoxLayoutDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**OrderBoxLayoutItemDTO[]**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  | 

## Examples

- Prepare the resource
```powershell
$OrderBoxLayoutDTO = Initialize-ympa_powershell_clientOrderBoxLayoutDTO  -Items null
```

- Convert the resource to JSON
```powershell
$OrderBoxLayoutDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

