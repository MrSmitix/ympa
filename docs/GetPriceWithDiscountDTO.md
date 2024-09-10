# ympa_r_client::GetPriceWithDiscountDTO

Цена с указанием скидки и времени последнего обновления.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **numeric** | Значение. | [Min: 0] 
**currencyId** | [**CurrencyType**](CurrencyType.md) |  | [Enum: ] 
**discountBase** | **numeric** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] [Min: 0] 
**updatedAt** | **character** | Время последнего обновления. | 


