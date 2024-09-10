# PriceDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **f64** | Цена на товар. | [optional] [default to None]
**discount_base** | **f64** | Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] [default to None]
**currency_id** | [***models::CurrencyType**](CurrencyType.md) |  | [optional] [default to None]
**vat** | **i32** | Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


