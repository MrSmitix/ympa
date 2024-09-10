# ympa_r_client::GetOfferCardsContentStatusRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **set[character]** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] [Max. items: 200] 
**cardStatuses** | [**set[OfferCardStatusType]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**categoryIds** | **set[integer]** | Фильтр по категориям на Маркете. | [optional] [Max. items: 200] 


