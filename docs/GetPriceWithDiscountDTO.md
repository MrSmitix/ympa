
# GetPriceWithDiscountDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;value&#x60;** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Значение. |  |
| **currencyId** | [**CurrencyType**](CurrencyType.md) |  |  |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Время последнего обновления. |  |
| **discountBase** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  |  [optional] |



