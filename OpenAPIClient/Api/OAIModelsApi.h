#import <Foundation/Foundation.h>
#import "OAIApiClientDataErrorResponse.h"
#import "OAIApiForbiddenErrorResponse.h"
#import "OAIApiLimitErrorResponse.h"
#import "OAIApiNotFoundErrorResponse.h"
#import "OAIApiServerErrorResponse.h"
#import "OAIApiUnauthorizedErrorResponse.h"
#import "OAICurrencyType.h"
#import "OAIGetModelsOffersResponse.h"
#import "OAIGetModelsRequest.h"
#import "OAIGetModelsResponse.h"
#import "OAISearchModelsResponse.h"
#import "OAISortOrderType.h"
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



@interface OAIModelsApi: NSObject <OAIApi>

extern NSString* kOAIModelsApiErrorDomain;
extern NSInteger kOAIModelsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Информация об одной модели
/// Возвращает информацию о модели товара.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
///
/// @param modelId Идентификатор модели товара.
/// @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
/// @param currency Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)
/// 
///  code:200 message:"Информация о модели.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetModelsResponse*
-(NSURLSessionTask*) getModelWithModelId: (NSNumber*) modelId
    regionId: (NSNumber*) regionId
    currency: (OAICurrencyType) currency
    completionHandler: (void (^)(OAIGetModelsResponse* output, NSError* error)) handler;


/// Список предложений для одной модели
/// Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
///
/// @param modelId Идентификатор модели товара.
/// @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
/// @param currency Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)
/// @param orderByPrice Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  (optional)
/// @param count Количество предложений на странице ответа. (optional) (default to @10)
/// @param page Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional) (default to @1)
/// 
///  code:200 message:"Список предложений для модели.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetModelsOffersResponse*
-(NSURLSessionTask*) getModelOffersWithModelId: (NSNumber*) modelId
    regionId: (NSNumber*) regionId
    currency: (OAICurrencyType) currency
    orderByPrice: (OAISortOrderType) orderByPrice
    count: (NSNumber*) count
    page: (NSNumber*) page
    completionHandler: (void (^)(OAIGetModelsOffersResponse* output, NSError* error)) handler;


/// Информация о нескольких моделях
/// Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
///
/// @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
/// @param getModelsRequest 
/// @param currency Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)
/// 
///  code:200 message:"Информация о моделях.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetModelsResponse*
-(NSURLSessionTask*) getModelsWithRegionId: (NSNumber*) regionId
    getModelsRequest: (OAIGetModelsRequest*) getModelsRequest
    currency: (OAICurrencyType) currency
    completionHandler: (void (^)(OAIGetModelsResponse* output, NSError* error)) handler;


/// Список предложений для нескольких моделей
/// Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
///
/// @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
/// @param getModelsRequest 
/// @param currency Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)
/// @param orderByPrice Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  (optional)
/// 
///  code:200 message:"Список предложений для моделей.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetModelsOffersResponse*
-(NSURLSessionTask*) getModelsOffersWithRegionId: (NSNumber*) regionId
    getModelsRequest: (OAIGetModelsRequest*) getModelsRequest
    currency: (OAICurrencyType) currency
    orderByPrice: (OAISortOrderType) orderByPrice
    completionHandler: (void (^)(OAIGetModelsOffersResponse* output, NSError* error)) handler;


/// Поиск модели товара
/// Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
///
/// @param query Поисковый запрос по названию модели товара.
/// @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
/// @param currency Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)
/// @param page Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional) (default to @1)
/// @param pageSize Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional)
/// 
///  code:200 message:"Информация о моделях.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAISearchModelsResponse*
-(NSURLSessionTask*) searchModelsWithQuery: (NSString*) query
    regionId: (NSNumber*) regionId
    currency: (OAICurrencyType) currency
    page: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAISearchModelsResponse* output, NSError* error)) handler;



@end
