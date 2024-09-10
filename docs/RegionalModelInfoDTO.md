
# Table `RegionalModelInfoDTO`
(mapped from: RegionalModelInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**currency** | currency | long |  | [**CurrencyType**](CurrencyType.md) |  |  [optional] [foreignkey]
**regionId** | regionId | long |  | **kotlin.Long** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  |  [optional]




