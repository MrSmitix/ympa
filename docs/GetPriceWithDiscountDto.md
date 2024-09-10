# GetPriceWithDiscountDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **f64** | Значение. | 
**currency_id** | [**models::CurrencyType**](CurrencyType.md) |  | 
**discount_base** | Option<**f64**> | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional]
**updated_at** | **String** | Время последнего обновления. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


