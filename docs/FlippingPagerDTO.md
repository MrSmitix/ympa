# OpenapiClient::FlippingPagerDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **total** | **Integer** | Сколько всего найдено элементов. | [optional] |
| **from** | **Integer** | Начальный номер найденного элемента на странице. | [optional] |
| **to** | **Integer** | Конечный номер найденного элемента на странице. | [optional] |
| **current_page** | **Integer** | Текущая страница. | [optional] |
| **pages_count** | **Integer** | Общее количество страниц. | [optional] |
| **page_size** | **Integer** | Размер страницы. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FlippingPagerDTO.new(
  total: null,
  from: null,
  to: null,
  current_page: null,
  pages_count: null,
  page_size: null
)
```

