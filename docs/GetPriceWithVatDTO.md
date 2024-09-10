

# GetPriceWithVatDTO

Цена с указанием ставки НДС и времени последнего обновления.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **BigDecimal** | Цена на товар. |  [optional] |
|**discountBase** | **BigDecimal** | Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  |  [optional] |
|**currencyId** | **CurrencyType** |  |  [optional] |
|**vat** | **Integer** | Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  |  [optional] |
|**updatedAt** | **OffsetDateTime** | Время последнего обновления. |  |


