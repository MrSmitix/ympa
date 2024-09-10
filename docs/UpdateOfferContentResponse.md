
# Table `UpdateOfferContentResponse`
(mapped from: UpdateOfferContentResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  |  [optional] [foreignkey]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateOfferContentResultDTO&gt;**](UpdateOfferContentResultDTO.md) | Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  |  [optional]



# **Table `UpdateOfferContentResponseUpdateOfferContentResultDTO`**
(mapped from: UpdateOfferContentResponseUpdateOfferContentResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOfferContentResponse | updateOfferContentResponse | long | | kotlin.Long | Primary Key | *one*
updateOfferContentResultDTO | updateOfferContentResultDTO | long | | kotlin.Long | Foreign Key | *many*



