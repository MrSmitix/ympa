# OpenapiClient::RegionDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор региона. | [optional] |
| **name** | **String** | Название региона. |  |
| **type** | [**RegionType**](RegionType.md) |  |  |
| **parent** | [**RegionDTO**](RegionDTO.md) |  | [optional] |
| **children** | [**Array&lt;RegionDTO&gt;**](RegionDTO.md) | Дочерние регионы. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RegionDTO.new(
  id: null,
  name: null,
  type: null,
  parent: null,
  children: null
)
```

