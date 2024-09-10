
# GetOfferMappingsRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **offerIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}     |  [optional] |
| **cardStatuses** | [**kotlin.collections.List&lt;OfferCardStatusType&gt;**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  |  [optional] |
| **categoryIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Фильтр по категориям на Маркете. |  [optional] |
| **vendorNames** | **kotlin.collections.List&lt;kotlin.String&gt;** | Фильтр по брендам. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Фильтр по тегам. |  [optional] |
| **archived** | **kotlin.Boolean** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.  |  [optional] |



