
# Table `GetOfferMappingsRequest`
(mapped from: GetOfferMappingsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}     |  [optional]
**cardStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferCardStatusType&gt;**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  |  [optional]
**categoryIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Фильтр по категориям на Маркете. |  [optional]
**vendorNames** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Фильтр по брендам. |  [optional]
**tags** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Фильтр по тегам. |  [optional]
**archived** | archived | boolean |  | **kotlin.Boolean** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.  |  [optional]


# **Table `GetOfferMappingsRequestOfferIds`**
(mapped from: GetOfferMappingsRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferMappingsRequest | getOfferMappingsRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



# **Table `GetOfferMappingsRequestOfferCardStatusType`**
(mapped from: GetOfferMappingsRequestOfferCardStatusType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferMappingsRequest | getOfferMappingsRequest | long | | kotlin.Long | Primary Key | *one*
offerCardStatusType | offerCardStatusType | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetOfferMappingsRequestCategoryIds`**
(mapped from: GetOfferMappingsRequestCategoryIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferMappingsRequest | getOfferMappingsRequest | long | | kotlin.Long | Primary Key | *one*
categoryIds | categoryIds | int | | kotlin.Int | Foreign Key | *many*



# **Table `GetOfferMappingsRequestVendorNames`**
(mapped from: GetOfferMappingsRequestVendorNames)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferMappingsRequest | getOfferMappingsRequest | long | | kotlin.Long | Primary Key | *one*
vendorNames | vendorNames | text | | kotlin.String | Foreign Key | *many*



# **Table `GetOfferMappingsRequestTags`**
(mapped from: GetOfferMappingsRequestTags)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferMappingsRequest | getOfferMappingsRequest | long | | kotlin.Long | Primary Key | *one*
tags | tags | text | | kotlin.String | Foreign Key | *many*




