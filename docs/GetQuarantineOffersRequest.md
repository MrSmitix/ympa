# ympa_r_client::GetQuarantineOffersRequest

Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **array[character]** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] [Max. items: 500] [Min. items: 1] 
**cardStatuses** | [**array[OfferCardStatusType]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] [Min. items: 1] 
**categoryIds** | **array[integer]** | Фильтр по категориям на Маркете. | [optional] [Min. items: 1] 
**vendorNames** | **array[character]** | Фильтр по брендам. | [optional] [Min. items: 1] 
**tags** | **array[character]** | Фильтр по тегам. | [optional] [Min. items: 1] 


