
# Table `GetQuarantineOffersRequest`
(mapped from: GetQuarantineOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  |  [optional]
**cardStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferCardStatusType&gt;**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  |  [optional]
**categoryIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Фильтр по категориям на Маркете. |  [optional]
**vendorNames** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Фильтр по брендам. |  [optional]
**tags** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Фильтр по тегам. |  [optional]


# **Table `GetQuarantineOffersRequestOfferIds`**
(mapped from: GetQuarantineOffersRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getQuarantineOffersRequest | getQuarantineOffersRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



# **Table `GetQuarantineOffersRequestOfferCardStatusType`**
(mapped from: GetQuarantineOffersRequestOfferCardStatusType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getQuarantineOffersRequest | getQuarantineOffersRequest | long | | kotlin.Long | Primary Key | *one*
offerCardStatusType | offerCardStatusType | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetQuarantineOffersRequestCategoryIds`**
(mapped from: GetQuarantineOffersRequestCategoryIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getQuarantineOffersRequest | getQuarantineOffersRequest | long | | kotlin.Long | Primary Key | *one*
categoryIds | categoryIds | int | | kotlin.Int | Foreign Key | *many*



# **Table `GetQuarantineOffersRequestVendorNames`**
(mapped from: GetQuarantineOffersRequestVendorNames)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getQuarantineOffersRequest | getQuarantineOffersRequest | long | | kotlin.Long | Primary Key | *one*
vendorNames | vendorNames | text | | kotlin.String | Foreign Key | *many*



# **Table `GetQuarantineOffersRequestTags`**
(mapped from: GetQuarantineOffersRequestTags)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getQuarantineOffersRequest | getQuarantineOffersRequest | long | | kotlin.Long | Primary Key | *one*
tags | tags | text | | kotlin.String | Foreign Key | *many*



