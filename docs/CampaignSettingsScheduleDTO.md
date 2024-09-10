
# CampaignSettingsScheduleDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **customHolidays** | **kotlin.collections.List&lt;kotlin.String&gt;** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. |  |
| **customWorkingDays** | **kotlin.collections.List&lt;kotlin.String&gt;** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. |  |
| **totalHolidays** | **kotlin.collections.List&lt;kotlin.String&gt;** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. |  |
| **weeklyHolidays** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Список выходных дней недели и государственных праздников. |  |
| **availableOnHolidays** | **kotlin.Boolean** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  |  [optional] |
| **period** | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  |  [optional] |



