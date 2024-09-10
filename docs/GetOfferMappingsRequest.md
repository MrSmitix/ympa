# GetOfferMappingsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Идентификаторы товаров, информация о которых нужна.  {% note warning &quot;&quot;Такой список возвращается только целиком&quot;&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}     | [optional] 
**CardStatuses** | [**OfferCardStatusType[]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**CategoryIds** | **Int32[]** | Фильтр по категориям на Маркете. | [optional] 
**VendorNames** | **String[]** | Фильтр по брендам. | [optional] 
**Tags** | **String[]** | Фильтр по тегам. | [optional] 
**Archived** | **Boolean** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOfferMappingsRequest = Initialize-ympa_powershell_clientGetOfferMappingsRequest  -OfferIds null `
 -CardStatuses null `
 -CategoryIds null `
 -VendorNames null `
 -Tags null `
 -Archived null
```

- Convert the resource to JSON
```powershell
$GetOfferMappingsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

