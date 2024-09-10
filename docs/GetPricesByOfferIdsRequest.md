# GetPricesByOfferIdsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Список SKU.  {% note warning &quot;&quot;Такой список возвращается только целиком&quot;&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPricesByOfferIdsRequest = Initialize-ympa_powershell_clientGetPricesByOfferIdsRequest  -OfferIds null
```

- Convert the resource to JSON
```powershell
$GetPricesByOfferIdsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

