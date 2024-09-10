
# Table `ReturnInstanceDTO`
(mapped from: ReturnInstanceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**stockType** | stockType | long |  | [**ReturnInstanceStockType**](ReturnInstanceStockType.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**ReturnInstanceStatusType**](ReturnInstanceStatusType.md) |  |  [optional] [foreignkey]
**cis** | cis | text |  | **kotlin.String** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). |  [optional]
**imei** | imei | text |  | **kotlin.String** | Международный идентификатор мобильного оборудования. |  [optional]






