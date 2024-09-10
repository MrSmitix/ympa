# WWW::OpenAPIClient::Object::GetQualityRatingRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetQualityRatingRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **DATE** | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  | [optional] 
**date_to** | **DATE** | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  | [optional] 
**campaign_ids** | **ARRAY[int]** | Список идентификаторов магазинов. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


