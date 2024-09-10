# OpenapiClient::UpdateOfferMappingsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_mappings** | [**Array&lt;UpdateOfferMappingDTO&gt;**](UpdateOfferMappingDTO.md) | Перечень товаров, которые нужно добавить или обновить. |  |
| **only_partner_media_content** | **Boolean** | Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateOfferMappingsRequest.new(
  offer_mappings: null,
  only_partner_media_content: null
)
```

