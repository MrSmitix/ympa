

# GetQuarantineOffersRequest

Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

The class is defined in **[GetQuarantineOffersRequest.java](../../src/main/java/org/openapitools/model/GetQuarantineOffersRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | `List&lt;String&gt;` | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  |  [optional property]
**cardStatuses** | `List&lt;OfferCardStatusType&gt;` | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  |  [optional property]
**categoryIds** | `List&lt;Integer&gt;` | Фильтр по категориям на Маркете. |  [optional property]
**vendorNames** | `List&lt;String&gt;` | Фильтр по брендам. |  [optional property]
**tags** | `List&lt;String&gt;` | Фильтр по тегам. |  [optional property]







