
# Table `OfferMappingErrorDTO`
(mapped from: OfferMappingErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | long NOT NULL |  | [**OfferMappingErrorType**](OfferMappingErrorType.md) |  |  [foreignkey]
**message** | message | text NOT NULL |  | **kotlin.String** | Текст ошибки. | 
**parameterId** | parameterId | long |  | **kotlin.Long** | Идентификатор характеристики, с которой связана ошибка. |  [optional]





