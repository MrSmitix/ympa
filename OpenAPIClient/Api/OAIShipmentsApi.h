#import <Foundation/Foundation.h>
#import "OAIApiClientDataErrorResponse.h"
#import "OAIApiForbiddenErrorResponse.h"
#import "OAIApiLimitErrorResponse.h"
#import "OAIApiNotFoundErrorResponse.h"
#import "OAIApiServerErrorResponse.h"
#import "OAIApiUnauthorizedErrorResponse.h"
#import "OAIConfirmShipmentRequest.h"
#import "OAIEmptyApiResponse.h"
#import "OAIGetShipmentOrdersInfoResponse.h"
#import "OAIGetShipmentResponse.h"
#import "OAISearchShipmentsRequest.h"
#import "OAISearchShipmentsResponse.h"
#import "OAISetShipmentPalletsCountRequest.h"
#import "OAIShipmentPalletLabelPageFormatType.h"
#import "OAITransferOrdersFromShipmentRequest.h"
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



@interface OAIShipmentsApi: NSObject <OAIApi>

extern NSString* kOAIShipmentsApiErrorDomain;
extern NSInteger kOAIShipmentsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Подтверждение отгрузки
/// Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// @param confirmShipmentRequest  (optional)
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
-(NSURLSessionTask*) confirmShipmentWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    confirmShipmentRequest: (OAIConfirmShipmentRequest*) confirmShipmentRequest
    completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;


/// Получение акта приема-передачи
/// {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// 
///  code:200 message:"Акт приема-передачи для отгрузки в формате PDF.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return NSURL*
-(NSURLSessionTask*) downloadShipmentActWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// Получение акта расхождений
/// Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// 
///  code:200 message:"Акт расхождений в формате XLSX.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return NSURL*
-(NSURLSessionTask*) downloadShipmentDiscrepancyActWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// Получение фактического акта приема-передачи
/// Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// 
///  code:200 message:"Акт в формате PDF.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return NSURL*
-(NSURLSessionTask*) downloadShipmentInboundActWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// Ярлыки для доверительной приемки (FBS)
/// PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// @param format Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице.  (optional)
/// 
///  code:200 message:"PDF‑файл с ярлыками на все упаковки в отгрузке.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return NSURL*
-(NSURLSessionTask*) downloadShipmentPalletLabelsWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    format: (OAIShipmentPalletLabelPageFormatType) format
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
/// Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param warehouseId Идентификатор склада. (optional)
/// 
///  code:200 message:"Акт приема-передачи в формате PDF.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return NSURL*
-(NSURLSessionTask*) downloadShipmentReceptionTransferActWithCampaignId: (NSNumber*) campaignId
    warehouseId: (NSNumber*) warehouseId
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// Получение транспортной накладной
/// Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// 
///  code:200 message:"Транспортная накладная в формате XLSX.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return NSURL*
-(NSURLSessionTask*) downloadShipmentTransportationWaybillWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// Получение информации об одной отгрузке
/// Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// @param cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  (optional) (default to @(YES))
/// 
///  code:200 message:"Найденная отгрузка.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetShipmentResponse*
-(NSURLSessionTask*) getShipmentWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    cancelledOrders: (NSNumber*) cancelledOrders
    completionHandler: (void (^)(OAIGetShipmentResponse* output, NSError* error)) handler;


/// Получение информации о возможности печати ярлыков (FBS)
/// Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// 
///  code:200 message:"Информация по годным/негодным для печати ярлыков заказам в отгрузке.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIGetShipmentOrdersInfoResponse*
-(NSURLSessionTask*) getShipmentOrdersInfoWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    completionHandler: (void (^)(OAIGetShipmentOrdersInfoResponse* output, NSError* error)) handler;


/// Получение информации о нескольких отгрузках
/// Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param searchShipmentsRequest 
/// @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
/// @param limit Количество значений на одной странице.  (optional)
/// 
///  code:200 message:"Найденные отгрузки.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAISearchShipmentsResponse*
-(NSURLSessionTask*) searchShipmentsWithCampaignId: (NSNumber*) campaignId
    searchShipmentsRequest: (OAISearchShipmentsRequest*) searchShipmentsRequest
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAISearchShipmentsResponse* output, NSError* error)) handler;


/// Передача количества упаковок в отгрузке
/// Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// @param setShipmentPalletsCountRequest 
/// 
///  code:200 message:"Имеет значение только тип ответа. Если ответ `ОК`, количество упаковок записано.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIEmptyApiResponse*
-(NSURLSessionTask*) setShipmentPalletsCountWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    setShipmentPalletsCountRequest: (OAISetShipmentPalletsCountRequest*) setShipmentPalletsCountRequest
    completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;


/// Перенос заказов в следующую отгрузку
/// Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \"Такие переносы снижают индекс качества магазина\" %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
///
/// @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
/// @param shipmentId Идентификатор отгрузки.
/// @param transferOrdersFromShipmentRequest 
/// 
///  code:200 message:"Запрос на перенос заказов проверен и принят, и они будут перенесены спустя несколько минут.",
///  code:400 message:"Запрос содержит неправильные данные.",
///  code:401 message:"В запросе не указаны данные для авторизации.",
///  code:403 message:"Данные для авторизации неверны или доступ к ресурсу запрещен.",
///  code:404 message:"Запрашиваемый ресурс не найден.",
///  code:420 message:"Превышено ограничение на доступ к ресурсу.",
///  code:500 message:"Внутренняя ошибка сервера."
///
/// @return OAIEmptyApiResponse*
-(NSURLSessionTask*) transferOrdersFromShipmentWithCampaignId: (NSNumber*) campaignId
    shipmentId: (NSNumber*) shipmentId
    transferOrdersFromShipmentRequest: (OAITransferOrdersFromShipmentRequest*) transferOrdersFromShipmentRequest
    completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;



@end
