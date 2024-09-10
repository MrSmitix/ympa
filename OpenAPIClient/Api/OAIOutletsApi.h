#import <Foundation/Foundation.h>
#import "OAIApiClientDataErrorResponse.h"
#import "OAIApiForbiddenErrorResponse.h"
#import "OAIApiLimitErrorResponse.h"
#import "OAIApiNotFoundErrorResponse.h"
#import "OAIApiServerErrorResponse.h"
#import "OAIApiUnauthorizedErrorResponse.h"
#import "OAIChangeOutletRequest.h"
#import "OAICreateOutletResponse.h"
#import "OAIEmptyApiResponse.h"
#import "OAIGetOutletResponse.h"
#import "OAIGetOutletsResponse.h"
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



@interface OAIOutletsApi: NSObject <OAIApi>

extern NSString* kOAIOutletsApiErrorDomain;
extern NSInteger kOAIOutletsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Создание точки продаж
/// Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param changeOutletRequest 
/// 
///  code:200 message:"Информация о созданной точке продаж.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAICreateOutletResponse*
-(NSURLSessionTask*) createOutletWithCampaignId: (NSNumber*) campaignId
    changeOutletRequest: (OAIChangeOutletRequest*) changeOutletRequest
    completionHandler: (void (^)(OAICreateOutletResponse* output, NSError* error)) handler;


/// Удаление точки продаж
/// Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param outletId Идентификатор точки продаж.
/// 
///  code:200 message:"Пустой ответ.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIEmptyApiResponse*
-(NSURLSessionTask*) deleteOutletWithCampaignId: (NSNumber*) campaignId
    outletId: (NSNumber*) outletId
    completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;


/// Информация об одной точке продаж
/// Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param outletId Идентификатор точки продаж.
/// 
///  code:200 message:"Информация о точке продаж.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetOutletResponse*
-(NSURLSessionTask*) getOutletWithCampaignId: (NSNumber*) campaignId
    outletId: (NSNumber*) outletId
    completionHandler: (void (^)(OAIGetOutletResponse* output, NSError* error)) handler;


/// Информация о нескольких точках продаж
/// Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
/// @param regionId Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  (optional)
/// @param shopOutletCode Идентификатор точки продаж, присвоенный магазином. (optional)
/// @param regionId2 {% note warning \&quot;\&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %}  (optional)
/// 
///  code:200 message:"Информация о точках продаж.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetOutletsResponse*
-(NSURLSessionTask*) getOutletsWithCampaignId: (NSNumber*) campaignId
    pageToken: (NSString*) pageToken
    regionId: (NSNumber*) regionId
    shopOutletCode: (NSString*) shopOutletCode
    regionId2: (NSNumber*) regionId2
    completionHandler: (void (^)(OAIGetOutletsResponse* output, NSError* error)) handler;


/// Изменение информации о точке продаж
/// Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param outletId Идентификатор точки продаж.
/// @param changeOutletRequest 
/// 
///  code:200 message:"Пустой ответ.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIEmptyApiResponse*
-(NSURLSessionTask*) updateOutletWithCampaignId: (NSNumber*) campaignId
    outletId: (NSNumber*) outletId
    changeOutletRequest: (OAIChangeOutletRequest*) changeOutletRequest
    completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;



@end
