
# Table `OfferPriceResponseDTO`
(mapped from: OfferPriceResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Идентификатор предложения из прайс-листа. |  [optional]
**price** | price | long |  | [**PriceDTO**](PriceDTO.md) |  |  [optional] [foreignkey]
**marketSku** | marketSku | long |  | **kotlin.Long** | SKU на Маркете. |  [optional]
**updatedAt** | updatedAt | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время последнего обновления цены на товар. |  [optional]






