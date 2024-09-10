#ifndef TINY_CPP_CLIENT_OutletsApi_H_
#define TINY_CPP_CLIENT_OutletsApi_H_


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
#include "ChangeOutletRequest.h"
#include "CreateOutletResponse.h"
#include "EmptyApiResponse.h"
#include "GetOutletResponse.h"
#include "GetOutletsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class OutletsApi : public Service {
public:
    OutletsApi() = default;

    virtual ~OutletsApi() = default;

    /**
    * Создание точки продаж.
    *
    * Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param changeOutletRequest  *Required*
    */
    Response<
                CreateOutletResponse
        >
    createOutlet(
            
            long campaignId
            , 
            
            ChangeOutletRequest changeOutletRequest
            
    );
    /**
    * Удаление точки продаж.
    *
    * Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param outletId Идентификатор точки продаж. *Required*
    */
    Response<
                EmptyApiResponse
        >
    deleteOutlet(
            
            long campaignId
            , 
            
            long outletId
            
    );
    /**
    * Информация об одной точке продаж.
    *
    * Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param outletId Идентификатор точки продаж. *Required*
    */
    Response<
                GetOutletResponse
        >
    getOutlet(
            
            long campaignId
            , 
            
            long outletId
            
    );
    /**
    * Информация о нескольких точках продаж.
    *
    * Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    * \param regionId Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). 
    * \param shopOutletCode Идентификатор точки продаж, присвоенный магазином.
    * \param regionId2 {% note warning \"\" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %} 
    */
    Response<
                GetOutletsResponse
        >
    getOutlets(
            
            long campaignId
            , 
            
            std::string pageToken
            , 
            
            long regionId
            , 
            
            std::string shopOutletCode
            , 
            
            long regionId2
            
    );
    /**
    * Изменение информации о точке продаж.
    *
    * Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param outletId Идентификатор точки продаж. *Required*
    * \param changeOutletRequest  *Required*
    */
    Response<
                EmptyApiResponse
        >
    updateOutlet(
            
            long campaignId
            , 
            
            long outletId
            , 
            
            ChangeOutletRequest changeOutletRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_OutletsApi_H_ */