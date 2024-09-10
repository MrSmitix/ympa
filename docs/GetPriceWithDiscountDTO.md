

# GetPriceWithDiscountDTO

Цена с указанием скидки и времени последнего обновления.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **BigDecimal** | Значение. | 
**currencyId** | **CurrencyType** |  | 
**discountBase** | **BigDecimal** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  |  [optional]
**updatedAt** | **OffsetDateTime** | Время последнего обновления. | 



