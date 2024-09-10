# GetBidsInfoRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Skus** | **String[]** | Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры &#x60;page_token&#x60; и &#x60;limit&#x60; игнорируются.  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBidsInfoRequest = Initialize-ympa_powershell_clientGetBidsInfoRequest  -Skus null
```

- Convert the resource to JSON
```powershell
$GetBidsInfoRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

