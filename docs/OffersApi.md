# OffersApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCampaignOffers**](OffersApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
[**getAllOffers**](OffersApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
[**getCampaignOffers**](OffersApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
[**getOfferRecommendations**](OffersApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
[**getOffers**](OffersApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
[**updateCampaignOffers**](OffersApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине



## deleteCampaignOffers

Удаление товаров из ассортимента магазина

Удаляет заданные товары из заданного магазина.

{% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}

На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.

{% endnote %}

Товар не получится удалить, если он хранится на складах Маркета.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 deleteCampaignOffers campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deleteCampaignOffersRequest** | [**DeleteCampaignOffersRequest**](DeleteCampaignOffersRequest.md) |  |

### Return type

[**DeleteCampaignOffersResponse**](DeleteCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAllOffers

Все предложения магазина

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.

В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.

{% note info %}

Количество предложений считается по данным за последние семь дней (не включая сегодня).

Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25)

### Example

```bash
 getAllOffers campaignId=value  feedId=value  chunk=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [optional] [default to null]
 **chunk** | **integer** | Номер сегмента с результатами.

Значение по умолчанию: '0'.

{% note info %}

Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.

{% endnote %}

{% note alert %}

Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать 'chunk=0' и т. д.

{% endnote %} | [optional] [default to null]

### Return type

[**GetAllOffersResponse**](GetAllOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignOffers

Информация о товарах, которые размещены в заданном магазине

Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 getCampaignOffers campaignId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getCampaignOffersRequest** | [**GetCampaignOffersRequest**](GetCampaignOffersRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetCampaignOffersResponse**](GetCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOfferRecommendations

Рекомендации Маркета, касающиеся цен

Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|

### Example

```bash
 getOfferRecommendations businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getOfferRecommendationsRequest** | [**GetOfferRecommendationsRequest**](GetOfferRecommendationsRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetOfferRecommendationsResponse**](GetOfferRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOffers

Предложения магазина

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.

Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.

В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.

{% note info %}

Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.

В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.

{% endnote %}

{% note info %}

Количество предложений считается по данным за последние семь дней (не включая сегодня).

Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25)

### Example

```bash
 getOffers campaignId=value  query=value  feedId=value  shopCategoryId=value  currency=value  matched=value  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **query** | **string** | Поисковый запрос.

Поддерживается язык запросов.

Значение по умолчанию: все предложения магазина, размещенные на Маркете. | [optional] [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [optional] [default to null]
 **shopCategoryId** | **string** | Идентификатор категории предложения, указанный магазином в прайс-листе.

Параметр выводится только для предложений, у которых указана категория в прайс-листе.

Параметр доступен начиная с версии 2.0 партнерского API. | [optional] [default to null]
 **currency** | [**CurrencyType**](.md) | Валюта, в которой указана цена предложения.

Возможные значения:

* 'BYN' — белорусский рубль.

* 'KZT' — казахстанский тенге.

* 'RUR' — российский рубль.

* 'UAH' — украинская гривна. | [optional] [default to null]
 **matched** | **boolean** | Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* '0 / FALSE / NO' — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* '1 / TRUE / YES' — поиск выполняется среди предложений, соотнесенных с карточками моделей). | [optional] [default to null]
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetOffersResponse**](GetOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateCampaignOffers

Изменение условий продажи товаров в магазине

Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 updateCampaignOffers campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateCampaignOffersRequest** | [**UpdateCampaignOffersRequest**](UpdateCampaignOffersRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

