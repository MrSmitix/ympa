
# Table `GetCampaignOffersRequest`
(mapped from: GetCampaignOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     |  [optional]
**statuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferCampaignStatusType&gt;**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  |  [optional]
**categoryIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Фильтр по категориям на Маркете. |  [optional]
**vendorNames** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Фильтр по брендам. |  [optional]
**tags** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Фильтр по тегам. |  [optional]


# **Table `GetCampaignOffersRequestOfferIds`**
(mapped from: GetCampaignOffersRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignOffersRequest | getCampaignOffersRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



# **Table `GetCampaignOffersRequestOfferCampaignStatusType`**
(mapped from: GetCampaignOffersRequestOfferCampaignStatusType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignOffersRequest | getCampaignOffersRequest | long | | kotlin.Long | Primary Key | *one*
offerCampaignStatusType | offerCampaignStatusType | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetCampaignOffersRequestCategoryIds`**
(mapped from: GetCampaignOffersRequestCategoryIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignOffersRequest | getCampaignOffersRequest | long | | kotlin.Long | Primary Key | *one*
categoryIds | categoryIds | int | | kotlin.Int | Foreign Key | *many*



# **Table `GetCampaignOffersRequestVendorNames`**
(mapped from: GetCampaignOffersRequestVendorNames)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignOffersRequest | getCampaignOffersRequest | long | | kotlin.Long | Primary Key | *one*
vendorNames | vendorNames | text | | kotlin.String | Foreign Key | *many*



# **Table `GetCampaignOffersRequestTags`**
(mapped from: GetCampaignOffersRequestTags)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignOffersRequest | getCampaignOffersRequest | long | | kotlin.Long | Primary Key | *one*
tags | tags | text | | kotlin.String | Foreign Key | *many*



