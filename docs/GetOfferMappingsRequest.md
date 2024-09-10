# ympa_r_client::GetOfferMappingsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **array[character]** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}     | [optional] [Max. items: 200] [Min. items: 1] 
**cardStatuses** | [**array[OfferCardStatusType]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] [Min. items: 1] 
**categoryIds** | **array[integer]** | Фильтр по категориям на Маркете. | [optional] [Min. items: 1] 
**vendorNames** | **array[character]** | Фильтр по брендам. | [optional] [Min. items: 1] 
**tags** | **array[character]** | Фильтр по тегам. | [optional] [Min. items: 1] 
**archived** | **character** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.  | [optional] 


