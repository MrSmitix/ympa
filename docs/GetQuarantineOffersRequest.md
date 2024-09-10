

# GetQuarantineOffersRequest

Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **Seq&lt;String&gt;** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  |  [optional]
**cardStatuses** | **Seq&lt;OfferCardStatusType&gt;** | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  |  [optional]
**categoryIds** | **Seq&lt;Int&gt;** | Фильтр по категориям на Маркете. |  [optional]
**vendorNames** | **Seq&lt;String&gt;** | Фильтр по брендам. |  [optional]
**tags** | **Seq&lt;String&gt;** | Фильтр по тегам. |  [optional]



