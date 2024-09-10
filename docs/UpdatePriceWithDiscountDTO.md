# ympa_r_client::UpdatePriceWithDiscountDTO

Цена с указанием скидки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **numeric** | Значение. | [Min: 0] 
**currencyId** | [**CurrencyType**](CurrencyType.md) |  | [Enum: ] 
**discountBase** | **numeric** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] [Min: 0] 


