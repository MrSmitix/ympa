# GetPriceWithVatDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **Float64** | Цена на товар. | [optional] [default to nothing]
**discountBase** | **Float64** | Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] [default to nothing]
**currencyId** | [***CurrencyType**](CurrencyType.md) |  | [optional] [default to nothing]
**vat** | **Int64** | Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  | [optional] [default to nothing]
**updatedAt** | **ZonedDateTime** | Время последнего обновления. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


