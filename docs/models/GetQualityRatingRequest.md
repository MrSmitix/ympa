

# GetQualityRatingRequest

Запрос информации по индексу качества.

The class is defined in **[GetQualityRatingRequest.java](../../src/main/java/org/openapitools/model/GetQualityRatingRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | `LocalDate` | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  |  [optional property]
**dateTo** | `LocalDate` | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  |  [optional property]
**campaignIds** | `Set&lt;Long&gt;` | Список идентификаторов магазинов. | 





