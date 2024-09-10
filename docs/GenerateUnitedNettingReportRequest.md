
# Table `GenerateUnitedNettingReportRequest`
(mapped from: GenerateUnitedNettingReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**businessId** | businessId | long NOT NULL |  | **kotlin.Long** | Идентификатор бизнеса. | 
**dateTimeFrom** | dateTimeFrom | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  |  [optional]
**dateTimeTo** | dateTimeTo | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  |  [optional]
**dateFrom** | dateFrom | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. |  [optional]
**dateTo** | dateTo | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. Максимальный период — 1 год. |  [optional]
**bankOrderId** | bankOrderId | long |  | **kotlin.Long** | Номер платежного поручения. |  [optional]
**bankOrderDateTime** | bankOrderDateTime | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата платежного поручения. |  [optional]
**placementPrograms** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PlacementType&gt;**](PlacementType.md) | Список моделей, которые нужны в отчете.  |  [optional]
**inns** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список ИНН, которые нужны в отчете. |  [optional]
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional]









# **Table `GenerateUnitedNettingReportRequestPlacementType`**
(mapped from: GenerateUnitedNettingReportRequestPlacementType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateUnitedNettingReportRequest | generateUnitedNettingReportRequest | long | | kotlin.Long | Primary Key | *one*
placementType | placementType | long | | kotlin.Long | Foreign Key | *many*



# **Table `GenerateUnitedNettingReportRequestInns`**
(mapped from: GenerateUnitedNettingReportRequestInns)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateUnitedNettingReportRequest | generateUnitedNettingReportRequest | long | | kotlin.Long | Primary Key | *one*
inns | inns | text | | kotlin.String | Foreign Key | *many*



# **Table `GenerateUnitedNettingReportRequestCampaignIds`**
(mapped from: GenerateUnitedNettingReportRequestCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateUnitedNettingReportRequest | generateUnitedNettingReportRequest | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | long | | kotlin.Long | Foreign Key | *many*



