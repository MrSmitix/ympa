# GetQuarantineOffersResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Offers** | [**QuarantineOfferDTO[]**](QuarantineOfferDTO.md) | Страница списка товаров в карантине. | 

## Examples

- Prepare the resource
```powershell
$GetQuarantineOffersResultDTO = Initialize-ympa_powershell_clientGetQuarantineOffersResultDTO  -Paging null `
 -Offers null
```

- Convert the resource to JSON
```powershell
$GetQuarantineOffersResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

