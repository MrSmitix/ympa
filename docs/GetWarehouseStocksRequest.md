# GetWarehouseStocksRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WithTurnover** | **Boolean** | **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — &#x60;false&#x60;. Если информация нужна, передайте значение &#x60;true&#x60;.  | [optional] [default to $false]
**Archived** | **Boolean** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращается информация о товарах, которые не находятся в архиве.  | [optional] 
**OfferIds** | **String[]** | Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning &quot;&quot;Такой список возвращается только целиком&quot;&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60; * &#x60;archived&#x60;  {% endnote %}     | [optional] 

## Examples

- Prepare the resource
```powershell
$GetWarehouseStocksRequest = Initialize-ympa_powershell_clientGetWarehouseStocksRequest  -WithTurnover null `
 -Archived null `
 -OfferIds null
```

- Convert the resource to JSON
```powershell
$GetWarehouseStocksRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

