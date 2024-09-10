
# Table `FeedContentDTO`
(mapped from: FeedContentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rejectedOffersCount** | rejectedOffersCount | long |  | **kotlin.Long** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  |  [optional]
**status** | status | long |  | [**FeedStatusType**](FeedStatusType.md) |  |  [optional] [foreignkey]
**totalOffersCount** | totalOffersCount | long |  | **kotlin.Long** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  |  [optional]
**error** | error | long |  | [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  |  [optional] [foreignkey]






