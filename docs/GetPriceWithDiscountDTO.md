# ympa_csharp_client.Model.GetPriceWithDiscountDTO
Цена с указанием скидки и времени последнего обновления.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **decimal** | Значение. | 
**CurrencyId** | **CurrencyType** |  | 
**DiscountBase** | **decimal** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 
**UpdatedAt** | **DateTime** | Время последнего обновления. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

