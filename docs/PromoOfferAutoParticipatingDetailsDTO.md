# PromoOfferAutoParticipatingDetailsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignIds** | **Int64[]** | Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$PromoOfferAutoParticipatingDetailsDTO = Initialize-ympa_powershell_clientPromoOfferAutoParticipatingDetailsDTO  -CampaignIds null
```

- Convert the resource to JSON
```powershell
$PromoOfferAutoParticipatingDetailsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

