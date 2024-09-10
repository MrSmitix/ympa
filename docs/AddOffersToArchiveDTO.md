# AddOffersToArchiveDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NotArchivedOffers** | [**AddOffersToArchiveErrorDTO[]**](AddOffersToArchiveErrorDTO.md) | Список товаров, которые не удалось поместить в архив. | [optional] 

## Examples

- Prepare the resource
```powershell
$AddOffersToArchiveDTO = Initialize-ympa_powershell_clientAddOffersToArchiveDTO  -NotArchivedOffers null
```

- Convert the resource to JSON
```powershell
$AddOffersToArchiveDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

