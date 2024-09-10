# GetOfferMappingsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **Vec<models::ShopSku>** | Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}     | [optional] [default to None]
**card_statuses** | [**Vec<models::OfferCardStatusType>**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] [default to None]
**category_ids** | **Vec<i32>** | Фильтр по категориям на Маркете. | [optional] [default to None]
**vendor_names** | **Vec<String>** | Фильтр по брендам. | [optional] [default to None]
**tags** | **Vec<String>** | Фильтр по тегам. | [optional] [default to None]
**archived** | **bool** | Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


