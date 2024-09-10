
# Table `UpdateOfferMappingsRequest`
(mapped from: UpdateOfferMappingsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerMappings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateOfferMappingDTO&gt;**](UpdateOfferMappingDTO.md) | Перечень товаров, которые нужно добавить или обновить. | 
**onlyPartnerMediaContent** | onlyPartnerMediaContent | boolean |  | **kotlin.Boolean** | Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;.  |  [optional]


# **Table `UpdateOfferMappingsRequestUpdateOfferMappingDTO`**
(mapped from: UpdateOfferMappingsRequestUpdateOfferMappingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOfferMappingsRequest | updateOfferMappingsRequest | long | | kotlin.Long | Primary Key | *one*
updateOfferMappingDTO | updateOfferMappingDTO | long | | kotlin.Long | Foreign Key | *many*




