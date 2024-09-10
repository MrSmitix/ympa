# OfferCardsContentStatusDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferCards** | [**OfferCardDTO[]**](OfferCardDTO.md) | Страница списка товаров с информацией о состоянии карточек. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferCardsContentStatusDTO = Initialize-ympa_powershell_clientOfferCardsContentStatusDTO  -OfferCards null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$OfferCardsContentStatusDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

