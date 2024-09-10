# DeleteOffersFromArchiveDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NotUnarchivedOfferIds** | **String[]** | Список товаров, которые не удалось восстановить из архива. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteOffersFromArchiveDTO = Initialize-ympa_powershell_clientDeleteOffersFromArchiveDTO  -NotUnarchivedOfferIds null
```

- Convert the resource to JSON
```powershell
$DeleteOffersFromArchiveDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

