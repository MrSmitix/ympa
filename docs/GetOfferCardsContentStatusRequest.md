
# Table `GetOfferCardsContentStatusRequest`
(mapped from: GetOfferCardsContentStatusRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.String&gt;** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  |  [optional]
**cardStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.collections.Set&lt;OfferCardStatusType&gt;**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  |  [optional]
**categoryIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Int&gt;** | Фильтр по категориям на Маркете. |  [optional]


# **Table `GetOfferCardsContentStatusRequestOfferIds`**
(mapped from: GetOfferCardsContentStatusRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferCardsContentStatusRequest | getOfferCardsContentStatusRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



# **Table `GetOfferCardsContentStatusRequestOfferCardStatusType`**
(mapped from: GetOfferCardsContentStatusRequestOfferCardStatusType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferCardsContentStatusRequest | getOfferCardsContentStatusRequest | long | | kotlin.Long | Primary Key | *one*
offerCardStatusType | offerCardStatusType | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetOfferCardsContentStatusRequestCategoryIds`**
(mapped from: GetOfferCardsContentStatusRequestCategoryIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferCardsContentStatusRequest | getOfferCardsContentStatusRequest | long | | kotlin.Long | Primary Key | *one*
categoryIds | categoryIds | int | | kotlin.Int | Foreign Key | *many*



