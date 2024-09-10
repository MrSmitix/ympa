# UpdateOfferMappingEntryRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferMappingEntries** | [**UpdateOfferMappingEntryDTO[]**](UpdateOfferMappingEntryDTO.md) | Информация о товарах в каталоге. | 

## Examples

- Prepare the resource
```powershell
$UpdateOfferMappingEntryRequest = Initialize-ympa_powershell_clientUpdateOfferMappingEntryRequest  -OfferMappingEntries null
```

- Convert the resource to JSON
```powershell
$UpdateOfferMappingEntryRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

