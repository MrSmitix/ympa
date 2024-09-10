#ifndef TINY_CPP_CLIENT_OrderLabelsApi_H_
#define TINY_CPP_CLIENT_OrderLabelsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "GetOrderLabelsDataResponse.h"
#include "PageFormatType.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class OrderLabelsApi : public Service {
public:
    OrderLabelsApi() = default;

    virtual ~OrderLabelsApi() = default;

    /**
    * Готовый ярлык‑наклейка для коробки в заказе.
    *
    * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param orderId Идентификатор заказа. *Required*
    * \param shipmentId Идентификатор грузоместа. *Required*
    * \param boxId Идентификатор коробки. *Required*
    * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    */
    Response<
                std::string
        >
    generateOrderLabel(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            long shipmentId
            , 
            
            long boxId
            , 
            
            PageFormatType format
            
    );
    /**
    * Готовые ярлыки‑наклейки на все коробки в одном заказе.
    *
    * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param orderId Идентификатор заказа. *Required*
    * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    */
    Response<
                std::string
        >
    generateOrderLabels(
            
            long campaignId
            , 
            
            long orderId
            , 
            
            PageFormatType format
            
    );
    /**
    * Данные для самостоятельного изготовления ярлыков.
    *
    * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param orderId Идентификатор заказа. *Required*
    */
    Response<
                GetOrderLabelsDataResponse
        >
    getOrderLabelsData(
            
            long campaignId
            , 
            
            long orderId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_OrderLabelsApi_H_ */