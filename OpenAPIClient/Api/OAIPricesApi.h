#import <Foundation/Foundation.h>
#import "OAIApiClientDataErrorResponse.h"
#import "OAIApiForbiddenErrorResponse.h"
#import "OAIApiLimitErrorResponse.h"
#import "OAIApiLockedErrorResponse.h"
#import "OAIApiNotFoundErrorResponse.h"
#import "OAIApiServerErrorResponse.h"
#import "OAIApiUnauthorizedErrorResponse.h"
#import "OAIEmptyApiResponse.h"
#import "OAIGetPricesByOfferIdsRequest.h"
#import "OAIGetPricesByOfferIdsResponse.h"
#import "OAIGetPricesResponse.h"
#import "OAISuggestPricesRequest.h"
#import "OAISuggestPricesResponse.h"
#import "OAIUpdateBusinessPricesRequest.h"
#import "OAIUpdatePricesRequest.h"
#import "OAIApi.h"

/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIPricesApi: NSObject <OAIApi>

extern NSString* kOAIPricesApiErrorDomain;
extern NSInteger kOAIPricesApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Список цен
/// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
/// @param limit Количество значений на одной странице.  (optional)
/// @param archived Фильтр по нахождению в архиве. (optional) (default to @(NO))
/// 
///  code:200 message:"Список всех товаров с установленными ценами.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetPricesResponse*
-(NSURLSessionTask*) getPricesWithCampaignId: (NSNumber*) campaignId
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
    archived: (NSNumber*) archived
    completionHandler: (void (^)(OAIGetPricesResponse* output, NSError* error)) handler;


/// Просмотр цен на указанные товары в магазине
/// Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
/// @param limit Количество значений на одной странице.  (optional)
/// @param getPricesByOfferIdsRequest  (optional)
/// 
///  code:200 message:"Список товаров с установленными для заданного магазина ценами.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetPricesByOfferIdsResponse*
-(NSURLSessionTask*) getPricesByOfferIdsWithCampaignId: (NSNumber*) campaignId
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
    getPricesByOfferIdsRequest: (OAIGetPricesByOfferIdsRequest*) getPricesByOfferIdsRequest
    completionHandler: (void (^)(OAIGetPricesByOfferIdsResponse* output, NSError* error)) handler;


/// Цены для продвижения товаров
/// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param suggestPricesRequest 
/// 
///  code:200 message:"Список цен для продвижения на Маркете.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAISuggestPricesResponse*
-(NSURLSessionTask*) getSuggestedPricesWithCampaignId: (NSNumber*) campaignId
    suggestPricesRequest: (OAISuggestPricesRequest*) suggestPricesRequest
    completionHandler: (void (^)(OAISuggestPricesResponse* output, NSError* error)) handler;


/// Установка цен на товары во всех магазинах
/// Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
///
/// @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param updateBusinessPricesRequest 
/// 
///  code:200 message:"Маркет принял информацию о новых ценах.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:423 message:"К ресурсу нельзя применить указанный метод.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIEmptyApiResponse*
-(NSURLSessionTask*) updateBusinessPricesWithBusinessId: (NSNumber*) businessId
    updateBusinessPricesRequest: (OAIUpdateBusinessPricesRequest*) updateBusinessPricesRequest
    completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;


/// Установка цен на товары в конкретном магазине
/// Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param updatePricesRequest 
/// 
///  code:200 message:"Маркет принял информацию о новых ценах.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:423 message:"К ресурсу нельзя применить указанный метод.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIEmptyApiResponse*
-(NSURLSessionTask*) updatePricesWithCampaignId: (NSNumber*) campaignId
    updatePricesRequest: (OAIUpdatePricesRequest*) updatePricesRequest
    completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;



@end
