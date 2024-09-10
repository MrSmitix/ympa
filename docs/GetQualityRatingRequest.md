# ympa_r_client::GetQualityRatingRequest

Запрос информации по индексу качества.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | **character** | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  | [optional] 
**dateTo** | **character** | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  | [optional] 
**campaignIds** | **set[integer]** | Список идентификаторов магазинов. | [Max. items: 50] [Min. items: 1] 


