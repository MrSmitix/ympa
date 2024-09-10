
# Table `GetBidsInfoRequest`
(mapped from: GetBidsInfoRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**skus** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры &#x60;page_token&#x60; и &#x60;limit&#x60; игнорируются.  |  [optional]


# **Table `GetBidsInfoRequestSkus`**
(mapped from: GetBidsInfoRequestSkus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getBidsInfoRequest | getBidsInfoRequest | long | | kotlin.Long | Primary Key | *one*
skus | skus | text | | kotlin.String | Foreign Key | *many*



