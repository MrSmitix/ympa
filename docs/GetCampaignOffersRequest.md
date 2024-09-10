# GetCampaignOffersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Идентификаторы товаров, информация о которых нужна.  {% note warning &quot;&quot;Такой список возвращается только целиком&quot;&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 
**Statuses** | [**OfferCampaignStatusType[]**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] 
**CategoryIds** | **Int32[]** | Фильтр по категориям на Маркете. | [optional] 
**VendorNames** | **String[]** | Фильтр по брендам. | [optional] 
**Tags** | **String[]** | Фильтр по тегам. | [optional] 

## Examples

- Prepare the resource
```powershell
$GetCampaignOffersRequest = Initialize-ympa_powershell_clientGetCampaignOffersRequest  -OfferIds null `
 -Statuses null `
 -CategoryIds null `
 -VendorNames null `
 -Tags null
```

- Convert the resource to JSON
```powershell
$GetCampaignOffersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

