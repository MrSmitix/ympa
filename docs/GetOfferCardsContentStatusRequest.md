

# GetOfferCardsContentStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offerIds** | **Set&lt;String&gt;** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  |  [optional] |
|**cardStatuses** | **Set&lt;OfferCardStatusType&gt;** | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  |  [optional] |
|**categoryIds** | **Set&lt;Integer&gt;** | Фильтр по категориям на Маркете. |  [optional] |



