# OpenapiClient::UpdateOutletLicenseRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **licenses** | [**Array&lt;OutletLicenseDTO&gt;**](OutletLicenseDTO.md) | Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateOutletLicenseRequest.new(
  licenses: null
)
```

