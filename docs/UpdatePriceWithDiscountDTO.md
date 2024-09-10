
# Table `UpdatePriceWithDiscountDTO`
(mapped from: UpdatePriceWithDiscountDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**value** | value | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Значение. | 
**currencyId** | currencyId | long NOT NULL |  | [**CurrencyType**](CurrencyType.md) |  |  [foreignkey]
**discountBase** | discountBase | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  |  [optional]





