# DeleteOffersDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NotDeletedOfferIds** | **String[]** | Список SKU товаров, которые не удалось удалить. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteOffersDTO = Initialize-ympa_powershell_clientDeleteOffersDTO  -NotDeletedOfferIds null
```

- Convert the resource to JSON
```powershell
$DeleteOffersDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

