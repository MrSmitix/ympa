
# Table `FeedIndexLogsResultDTO`
(mapped from: FeedIndexLogsResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**indexLogRecords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FeedIndexLogsRecordDTO&gt;**](FeedIndexLogsRecordDTO.md) | Список отчетов по индексации прайс-листа. | 
**feed** | feed | long |  | [**FeedIndexLogsFeedDTO**](FeedIndexLogsFeedDTO.md) |  |  [optional] [foreignkey]
**total** | total | long |  | **kotlin.Long** | Количество отчетов на всех страницах выходных данных. |  [optional]


# **Table `FeedIndexLogsResultDTOFeedIndexLogsRecordDTO`**
(mapped from: FeedIndexLogsResultDTOFeedIndexLogsRecordDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
feedIndexLogsResultDTO | feedIndexLogsResultDTO | long | | kotlin.Long | Primary Key | *one*
feedIndexLogsRecordDTO | feedIndexLogsRecordDTO | long | | kotlin.Long | Foreign Key | *many*





