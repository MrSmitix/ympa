# ProvideOrderDigitalCodesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**OrderDigitalItemDTO[]**](OrderDigitalItemDTO.md) | Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же.  | 

## Examples

- Prepare the resource
```powershell
$ProvideOrderDigitalCodesRequest = Initialize-ympa_powershell_clientProvideOrderDigitalCodesRequest  -Items null
```

- Convert the resource to JSON
```powershell
$ProvideOrderDigitalCodesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

