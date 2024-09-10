
# Table `GetQualityRatingRequest`
(mapped from: GetQualityRatingRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Список идентификаторов магазинов. | 
**dateFrom** | dateFrom | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  |  [optional]
**dateTo** | dateTo | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  |  [optional]


# **Table `GetQualityRatingRequestCampaignIds`**
(mapped from: GetQualityRatingRequestCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getQualityRatingRequest | getQualityRatingRequest | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | long | | kotlin.Long | Foreign Key | *many*





