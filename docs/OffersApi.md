# OffersApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCampaignOffers**](OffersApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
| [**getAllOffers**](OffersApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
| [**getCampaignOffers**](OffersApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
| [**getOfferRecommendations**](OffersApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
| [**getOffers**](OffersApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
| [**updateCampaignOffers**](OffersApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |



## deleteCampaignOffers

> DeleteCampaignOffersResponse deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)

Удаление товаров из ассортимента магазина

Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **deleteCampaignOffersRequest** | [**DeleteCampaignOffersRequest**](DeleteCampaignOffersRequest.md)|  | |

### Return type

[**DeleteCampaignOffersResponse**](DeleteCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **423** | К ресурсу нельзя применить указанный метод. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |


## getAllOffers

> GetAllOffersResponse getAllOffers(campaignId, feedId, chunk)

Все предложения магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | **Long**| Идентификатор прайс-листа. | [optional] |
| **chunk** | **Integer**| Номер сегмента с результатами.  Значение по умолчанию: &#x60;0&#x60;.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#x60;chunk&#x3D;0&#x60; и т. д.  {% endnote %}  | [optional] |

### Return type

[**GetAllOffersResponse**](GetAllOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Предложения магазина. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |


## getCampaignOffers

> GetCampaignOffersResponse getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)

Информация о товарах, которые размещены в заданном магазине

Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getCampaignOffersRequest** | [**GetCampaignOffersRequest**](GetCampaignOffersRequest.md)|  | |
| **pageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetCampaignOffersResponse**](GetCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список товаров, размещенных в заданном магазине. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |


## getOfferRecommendations

> GetOfferRecommendationsResponse getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)

Рекомендации Маркета, касающиеся цен

Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getOfferRecommendationsRequest** | [**GetOfferRecommendationsRequest**](GetOfferRecommendationsRequest.md)|  | |
| **pageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetOfferRecommendationsResponse**](GetOfferRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список товаров с рекомендациями. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |


## getOffers

> GetOffersResponse getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)

Предложения магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **query** | **String**| Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете.  | [optional] |
| **feedId** | **Long**| Идентификатор прайс-листа. | [optional] |
| **shopCategoryId** | **String**| Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] |
| **currency** | [**CurrencyType**](.md)| Валюта, в которой указана цена предложения.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  | [optional] [enum: RUR, USD, EUR, UAH, AUD, GBP, BYR, BYN, DKK, ISK, KZT, CAD, CNY, NOK, XDR, SGD, TRY, SEK, CHF, JPY, AZN, ALL, DZD, AOA, ARS, AMD, AFN, BHD, BGN, BOB, BWP, BND, BRL, BIF, HUF, VEF, KPW, VND, GMD, GHS, GNF, HKD, GEL, AED, EGP, ZMK, ILS, INR, IDR, JOD, IQD, IRR, YER, QAR, KES, KGS, COP, CDF, CRC, KWD, CUP, LAK, LVL, SLL, LBP, LYD, SZL, LTL, MUR, MRO, MKD, MWK, MGA, MYR, MAD, MXN, MZN, MDL, MNT, NPR, NGN, NIO, NZD, OMR, PKR, PYG, PEN, PLN, KHR, SAR, RON, SCR, SYP, SKK, SOS, SDG, SRD, TJS, THB, TWD, BDT, TZS, TND, TMM, UGX, UZS, UYU, PHP, DJF, XAF, XOF, HRK, CZK, CLP, LKR, EEK, ETB, RSD, ZAR, KRW, NAD, TL, UE] |
| **matched** | **Boolean**| Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * &#x60;0 / FALSE / NO&#x60; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * &#x60;1 / TRUE / YES&#x60; — поиск выполняется среди предложений, соотнесенных с карточками моделей).  | [optional] |
| **page** | **Integer**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| **pageSize** | **Integer**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetOffersResponse**](GetOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Предложения магазина. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |


## updateCampaignOffers

> EmptyApiResponse updateCampaignOffers(campaignId, updateCampaignOffersRequest)

Изменение условий продажи товаров в магазине

Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateCampaignOffersRequest** | [**UpdateCampaignOffersRequest**](UpdateCampaignOffersRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **423** | К ресурсу нельзя применить указанный метод. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |
