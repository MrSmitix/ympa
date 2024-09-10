# OpenapiClient::GetQualityRatingRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date_from** | **Date** | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  | [optional] |
| **date_to** | **Date** | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  | [optional] |
| **campaign_ids** | **Array&lt;Integer&gt;** | Список идентификаторов магазинов. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetQualityRatingRequest.new(
  date_from: null,
  date_to: null,
  campaign_ids: null
)
```

