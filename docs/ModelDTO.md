
# Table `ModelDTO`
(mapped from: ModelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор модели товара. |  [optional]
**name** | name | text |  | **kotlin.String** | Название модели товара. |  [optional]
**prices** | prices | long |  | [**ModelPriceDTO**](ModelPriceDTO.md) |  |  [optional] [foreignkey]





