# OpenapiClient::DocumentDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**OrderDocumentStatusType**](OrderDocumentStatusType.md) |  | [optional] |
| **number** | **String** | Номер документа. | [optional] |
| **date** | **Date** | Дата создания документа. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::DocumentDTO.new(
  status: null,
  number: null,
  date: null
)
```

