# GetQualityRatingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | [***chrono::naive::NaiveDate**](date.md) | Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты.  | [optional] [default to None]
**date_to** | [***chrono::naive::NaiveDate**](date.md) | Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты.  | [optional] [default to None]
**campaign_ids** | **Vec<i64>** | Список идентификаторов магазинов. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


