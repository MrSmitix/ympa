
# Table `BusinessSettingsDTO`
(mapped from: BusinessSettingsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**onlyDefaultPrice** | onlyDefaultPrice | boolean |  | **kotlin.Boolean** | Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену.  |  [optional]
**currency** | currency | long |  | [**CurrencyType**](CurrencyType.md) |  |  [optional] [foreignkey]




