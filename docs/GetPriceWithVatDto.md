# GetPriceWithVatDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | Option<**f64**> | Цена на товар. | [optional]
**discount_base** | Option<**f64**> | Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional]
**currency_id** | Option<[**models::CurrencyType**](CurrencyType.md)> |  | [optional]
**vat** | Option<**i32**> | Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  | [optional]
**updated_at** | **String** | Время последнего обновления. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


