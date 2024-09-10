
# Table `CampaignSettingsScheduleDTO`
(mapped from: CampaignSettingsScheduleDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**customHolidays** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**customWorkingDays** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**totalHolidays** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**weeklyHolidays** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Список выходных дней недели и государственных праздников. | 
**availableOnHolidays** | availableOnHolidays | boolean |  | **kotlin.Boolean** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  |  [optional]
**period** | period | long |  | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  |  [optional] [foreignkey]


# **Table `CampaignSettingsScheduleDTOCustomHolidays`**
(mapped from: CampaignSettingsScheduleDTOCustomHolidays)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignSettingsScheduleDTO | campaignSettingsScheduleDTO | long | | kotlin.Long | Primary Key | *one*
customHolidays | customHolidays | text | | kotlin.String | Foreign Key | *many*



# **Table `CampaignSettingsScheduleDTOCustomWorkingDays`**
(mapped from: CampaignSettingsScheduleDTOCustomWorkingDays)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignSettingsScheduleDTO | campaignSettingsScheduleDTO | long | | kotlin.Long | Primary Key | *one*
customWorkingDays | customWorkingDays | text | | kotlin.String | Foreign Key | *many*



# **Table `CampaignSettingsScheduleDTOTotalHolidays`**
(mapped from: CampaignSettingsScheduleDTOTotalHolidays)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignSettingsScheduleDTO | campaignSettingsScheduleDTO | long | | kotlin.Long | Primary Key | *one*
totalHolidays | totalHolidays | text | | kotlin.String | Foreign Key | *many*



# **Table `CampaignSettingsScheduleDTOWeeklyHolidays`**
(mapped from: CampaignSettingsScheduleDTOWeeklyHolidays)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignSettingsScheduleDTO | campaignSettingsScheduleDTO | long | | kotlin.Long | Primary Key | *one*
weeklyHolidays | weeklyHolidays | int | | kotlin.Int | Foreign Key | *many*





