# GetQuarantineOffersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] 
**CardStatuses** | [**OfferCardStatusType[]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**CategoryIds** | **Int32[]** | Фильтр по категориям на Маркете. | [optional] 
**VendorNames** | **String[]** | Фильтр по брендам. | [optional] 
**Tags** | **String[]** | Фильтр по тегам. | [optional] 

## Examples

- Prepare the resource
```powershell
$GetQuarantineOffersRequest = Initialize-ympa_powershell_clientGetQuarantineOffersRequest  -OfferIds null `
 -CardStatuses null `
 -CategoryIds null `
 -VendorNames null `
 -Tags null
```

- Convert the resource to JSON
```powershell
$GetQuarantineOffersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

