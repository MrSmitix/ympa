# OfferMappingsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOfferMappingEntries**](OfferMappingsApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
[**getSuggestedOfferMappingEntries**](OfferMappingsApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
[**updateOfferMappingEntries**](OfferMappingsApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге



## getOfferMappingEntries

Список товаров в каталоге

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).

{% endnote %}

Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:

* Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки.
* Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.

Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.

{% note info %}

Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25)

### Example

```bash
 getOfferMappingEntries campaignId=value  Specify as:  offer_id="value1,value2,..."  Specify as:  shop_sku="value1,value2,..."  mapping_kind=value  Specify as:  status="value1,value2,..."  Specify as:  availability="value1,value2,..."  Specify as:  category_id="value1,value2,..."  Specify as:  vendor="value1,value2,..."  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **offerId** | [**array[string]**](string.md) | Идентификатор товара в каталоге. | [optional] [default to null]
 **shopSku** | [**array[string]**](string.md) | Ваш SKU товара.

Параметр может быть указан несколько раз, например:

'''
...shop_sku=123&shop_sku=129&shop_sku=141...
'''

В запросе можно указать либо параметр 'shopSku', либо любые параметры для фильтрации товаров. Совместное использование параметра 'shopSku' и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **mappingKind** | [**OfferMappingKindType**](.md) | Тип маппинга. | [optional] [default to null]
 **status** | [**array[OfferProcessingStatusType]**](OfferProcessingStatusType.md) | Фильтрация по статусу публикации товара:

* 'READY' — товар прошел модерацию.
* 'IN_WORK' — товар проходит модерацию.
* 'NEED_CONTENT' — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее.
* 'NEED_INFO' — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара.
* 'REJECTED' — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары.
* 'SUSPENDED' — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.
* 'OTHER' — товар не прошел модерацию по другой причине.

Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

'''
...status=READY,IN_WORK...
...status=READY&status=IN_WORK...
'''

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **availability** | [**array[OfferAvailabilityStatusType]**](OfferAvailabilityStatusType.md) | Фильтрация по планам поставок товара:

* 'ACTIVE' — поставки будут.
* 'INACTIVE' — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять.
* 'DELISTED' — архив: товар закончился на складе, и его поставок больше не будет.

Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

'''
...availability=INACTIVE,DELISTED...
...availability=INACTIVE&availability=DELISTED...
'''

В запросе можно указать либо параметр 'shopSku', либо любые параметры для фильтрации товаров. Совместное использование параметра 'shopSku' и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **categoryId** | [**array[integer]**](integer.md) | Фильтрация по идентификатору категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).

Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

'''
...category_id=14727164,14382343...
...category_id=14727164&category_id=14382343...
'''

В запросе можно указать либо параметр 'shopSku', либо любые параметры для фильтрации товаров. Совместное использование параметра 'shopSku' и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **vendor** | [**array[string]**](string.md) | Фильтрация по бренду товара.

Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

'''
...vendor=Aqua%20Minerale,Borjomi...
...vendor=Aqua%20Minerale&vendor=Borjomi...
'''

Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.

Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «'» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetOfferMappingEntriesResponse**](GetOfferMappingEntriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSuggestedOfferMappingEntries

Рекомендованные карточки для товаров

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).

{% endnote %}

Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.

Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:

##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##

Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.

Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).

В одном запросе можно получить не более 500 рекомендаций.

|**⚙️ Лимит:** 100 000 рекомендаций в час|
|-|

### Example

```bash
 getSuggestedOfferMappingEntries campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getSuggestedOfferMappingEntriesRequest** | [**GetSuggestedOfferMappingEntriesRequest**](GetSuggestedOfferMappingEntriesRequest.md) |  |

### Return type

[**GetSuggestedOfferMappingEntriesResponse**](GetSuggestedOfferMappingEntriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOfferMappingEntries

Добавление и редактирование товаров в каталоге

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.

Информацию о товарах нужно передать в теле POST-запроса.

У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:

* Чтобы добавить в каталог новый товар, укажите в параметре 'shopSku' ваш SKU, которого еще нет в каталоге.
* Чтобы отредактировать товар из каталога, укажите в параметре 'shopSku' ваш SKU этого товара в каталоге.

В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.

Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус 'NEED_CONTENT' (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).

Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус 'NEED_INFO' (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).

В одном запросе можно добавить не более 500 товаров.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5 000 товаров в минуту|
|-|

### Example

```bash
 updateOfferMappingEntries campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateOfferMappingEntryRequest** | [**UpdateOfferMappingEntryRequest**](UpdateOfferMappingEntryRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

