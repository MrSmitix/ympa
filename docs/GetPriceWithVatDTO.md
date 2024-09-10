
# GetPriceWithVatDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Время последнего обновления. |  |
| **&#x60;value&#x60;** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар. |  [optional] |
| **discountBase** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  |  [optional] |
| **currencyId** | [**CurrencyType**](CurrencyType.md) |  |  [optional] |
| **vat** | **kotlin.Int** | Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  |  [optional] |



