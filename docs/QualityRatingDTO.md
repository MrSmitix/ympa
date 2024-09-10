# OpenapiClient::QualityRatingDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rating** | **Integer** | Значение индекса качества. |  |
| **calculation_date** | **Date** | Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  |  |
| **components** | [**Array&lt;QualityRatingComponentDTO&gt;**](QualityRatingComponentDTO.md) | Составляющие индекса качества. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::QualityRatingDTO.new(
  rating: null,
  calculation_date: null,
  components: null
)
```

