# GET_QUALITY_RATING_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | [**DATE**](DATE.md) | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  | [optional] [default to null]
**date_to** | [**DATE**](DATE.md) | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  | [optional] [default to null]
**campaign_ids** | **LIST [INTEGER_64]** | Список идентификаторов магазинов. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


