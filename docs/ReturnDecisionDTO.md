
# Table `ReturnDecisionDTO`
(mapped from: ReturnDecisionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**returnItemId** | returnItemId | long |  | **kotlin.Long** | Идентификатор товара в возврате. |  [optional]
**count** | count | int |  | **kotlin.Int** | Количество единиц товара. |  [optional]
**comment** | comment | text |  | **kotlin.String** | Комментарий. |  [optional]
**reasonType** | reasonType | long |  | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  |  [optional] [foreignkey]
**subreasonType** | subreasonType | long |  | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  |  [optional] [foreignkey]
**decisionType** | decisionType | long |  | [**ReturnDecisionType**](ReturnDecisionType.md) |  |  [optional] [foreignkey]
**refundAmount** | refundAmount | long |  | **kotlin.Long** | Сумма возврата. |  [optional]
**partnerCompensation** | partnerCompensation | long |  | **kotlin.Long** | Компенсация за обратную доставку. |  [optional]
**images** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список хеш-кодов фотографий товара от покупателя. |  [optional]










# **Table `ReturnDecisionDTOImages`**
(mapped from: ReturnDecisionDTOImages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
returnDecisionDTO | returnDecisionDTO | long | | kotlin.Long | Primary Key | *one*
images | images | text | | kotlin.String | Foreign Key | *many*



