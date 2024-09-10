# OpenapiClient::ScrollingPagerDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **next_page_token** | **String** | Идентификатор следующей страницы результатов. | [optional] |
| **prev_page_token** | **String** | Идентификатор предыдущей страницы результатов. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ScrollingPagerDTO.new(
  next_page_token: null,
  prev_page_token: null
)
```

