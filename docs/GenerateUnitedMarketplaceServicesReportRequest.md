
# Table `GenerateUnitedMarketplaceServicesReportRequest`
(mapped from: GenerateUnitedMarketplaceServicesReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**businessId** | businessId | long NOT NULL |  | **kotlin.Long** | Идентификатор бизнеса. | 
**dateTimeFrom** | dateTimeFrom | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  |  [optional]
**dateTimeTo** | dateTimeTo | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  |  [optional]
**dateFrom** | dateFrom | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. |  [optional]
**dateTo** | dateTo | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. Максимальный период — 1 год. |  [optional]
**yearFrom** | yearFrom | int |  | **kotlin.Int** | Начальный год формирования акта. |  [optional]
**monthFrom** | monthFrom | int UNSIGNED |  | **kotlin.Int** | Начальный номер месяца формирования акта. |  [optional]
**yearTo** | yearTo | int |  | **kotlin.Int** | Конечный год формирования акта. |  [optional]
**monthTo** | monthTo | int UNSIGNED |  | **kotlin.Int** | Конечный номер месяца формирования акта. |  [optional]
**placementPrograms** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PlacementType&gt;**](PlacementType.md) | Список моделей, которые нужны в отчете.  |  [optional]
**inns** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список ИНН, которые нужны в отчете. |  [optional]
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional]











# **Table `GenerateUnitedMarketplaceServicesReportRequestPlacementType`**
(mapped from: GenerateUnitedMarketplaceServicesReportRequestPlacementType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateUnitedMarketplaceServicesReportRequest | generateUnitedMarketplaceServicesReportRequest | long | | kotlin.Long | Primary Key | *one*
placementType | placementType | long | | kotlin.Long | Foreign Key | *many*



# **Table `GenerateUnitedMarketplaceServicesReportRequestInns`**
(mapped from: GenerateUnitedMarketplaceServicesReportRequestInns)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateUnitedMarketplaceServicesReportRequest | generateUnitedMarketplaceServicesReportRequest | long | | kotlin.Long | Primary Key | *one*
inns | inns | text | | kotlin.String | Foreign Key | *many*



# **Table `GenerateUnitedMarketplaceServicesReportRequestCampaignIds`**
(mapped from: GenerateUnitedMarketplaceServicesReportRequestCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateUnitedMarketplaceServicesReportRequest | generateUnitedMarketplaceServicesReportRequest | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | long | | kotlin.Long | Foreign Key | *many*



