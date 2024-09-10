# OpenapiClient::FeedParameterDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **deleted** | **Boolean** | Удалить ли значение параметра.  Возможное значение: * &#x60;true&#x60; — удалить значение параметра.  Используется вместе с параметром &#x60;name&#x60;.  | [optional] |
| **name** | **String** | Название параметра.  Возможное значение: - &#x60;reparseIntervalMinutes&#x60; — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре &#x60;value&#x60;. Например, при &#x60;value&#x3D;1440&#x60;, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  |  |
| **values** | **Array&lt;Integer&gt;** | Значения параметра.  Используется вместе с параметром &#x60;name&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedParameterDTO.new(
  deleted: null,
  name: null,
  values: null
)
```

