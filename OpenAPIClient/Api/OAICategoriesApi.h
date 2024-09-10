#import <Foundation/Foundation.h>
#import "OAIApiClientDataErrorResponse.h"
#import "OAIApiForbiddenErrorResponse.h"
#import "OAIApiLimitErrorResponse.h"
#import "OAIApiNotFoundErrorResponse.h"
#import "OAIApiServerErrorResponse.h"
#import "OAIApiUnauthorizedErrorResponse.h"
#import "OAIGetCategoriesMaxSaleQuantumRequest.h"
#import "OAIGetCategoriesMaxSaleQuantumResponse.h"
#import "OAIGetCategoriesRequest.h"
#import "OAIGetCategoriesResponse.h"
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



@interface OAICategoriesApi: NSObject <OAIApi>

extern NSString* kOAICategoriesApiErrorDomain;
extern NSInteger kOAICategoriesApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Лимит на установку кванта продажи и минимального количества товаров в заказе
/// Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
///
/// @param getCategoriesMaxSaleQuantumRequest 
/// 
///  code:200 message:"Лимит на установку кванта и минимального количества товаров.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetCategoriesMaxSaleQuantumResponse*
-(NSURLSessionTask*) getCategoriesMaxSaleQuantumWithGetCategoriesMaxSaleQuantumRequest: (OAIGetCategoriesMaxSaleQuantumRequest*) getCategoriesMaxSaleQuantumRequest
    completionHandler: (void (^)(OAIGetCategoriesMaxSaleQuantumResponse* output, NSError* error)) handler;


/// Дерево категорий
/// Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
///
/// @param getCategoriesRequest  (optional)
/// 
///  code:200 message:"Категории Маркета.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetCategoriesResponse*
-(NSURLSessionTask*) getCategoriesTreeWithGetCategoriesRequest: (OAIGetCategoriesRequest*) getCategoriesRequest
    completionHandler: (void (^)(OAIGetCategoriesResponse* output, NSError* error)) handler;



@end
