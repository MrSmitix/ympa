# GetQualityRatingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | Option<[**String**](string.md)> | Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты.  | [optional]
**date_to** | Option<[**String**](string.md)> | Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты.  | [optional]
**campaign_ids** | **Vec<i64>** | Список идентификаторов магазинов. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


