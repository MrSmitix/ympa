
# Table `PriceQuarantineVerdictDTO`
(mapped from: PriceQuarantineVerdictDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**params** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PriceQuarantineVerdictParameterDTO&gt;**](PriceQuarantineVerdictParameterDTO.md) | Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. | 
**type** | type | long |  | [**PriceQuarantineVerdictType**](PriceQuarantineVerdictType.md) |  |  [optional] [foreignkey]


# **Table `PriceQuarantineVerdictDTOPriceQuarantineVerdictParameterDTO`**
(mapped from: PriceQuarantineVerdictDTOPriceQuarantineVerdictParameterDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
priceQuarantineVerdictDTO | priceQuarantineVerdictDTO | long | | kotlin.Long | Primary Key | *one*
priceQuarantineVerdictParameterDTO | priceQuarantineVerdictParameterDTO | long | | kotlin.Long | Foreign Key | *many*




