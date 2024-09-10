# GetPriceWithVatDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **Decimal** | Цена на товар. | [optional] 
**DiscountBase** | **Decimal** | Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 
**CurrencyId** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**Vat** | **Int32** | Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  | [optional] 
**UpdatedAt** | **System.DateTime** | Время последнего обновления. | 

## Examples

- Prepare the resource
```powershell
$GetPriceWithVatDTO = Initialize-ympa_powershell_clientGetPriceWithVatDTO  -Value null `
 -DiscountBase null `
 -CurrencyId null `
 -Vat null `
 -UpdatedAt null
```

- Convert the resource to JSON
```powershell
$GetPriceWithVatDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

