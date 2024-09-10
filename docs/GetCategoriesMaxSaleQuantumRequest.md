# GetCategoriesMaxSaleQuantumRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketCategoryIds** | **Int64[]** | Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. | 

## Examples

- Prepare the resource
```powershell
$GetCategoriesMaxSaleQuantumRequest = Initialize-ympa_powershell_clientGetCategoriesMaxSaleQuantumRequest  -MarketCategoryIds null
```

- Convert the resource to JSON
```powershell
$GetCategoriesMaxSaleQuantumRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

