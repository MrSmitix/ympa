#ifndef TINY_CPP_CLIENT_CampaignsApi_H_
#define TINY_CPP_CLIENT_CampaignsApi_H_


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
#include "GetCampaignLoginsResponse.h"
#include "GetCampaignRegionResponse.h"
#include "GetCampaignResponse.h"
#include "GetCampaignSettingsResponse.h"
#include "GetCampaignsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CampaignsApi : public Service {
public:
    CampaignsApi() = default;

    virtual ~CampaignsApi() = default;

    /**
    * Информация о магазине.
    *
    * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    */
    Response<
                GetCampaignResponse
        >
    getCampaign(
            
            long campaignId
            
    );
    /**
    * Логины, связанные с магазином.
    *
    * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    */
    Response<
                GetCampaignLoginsResponse
        >
    getCampaignLogins(
            
            long campaignId
            
    );
    /**
    * Регион магазина.
    *
    * {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    */
    Response<
                GetCampaignRegionResponse
        >
    getCampaignRegion(
            
            long campaignId
            
    );
    /**
    * Настройки магазина.
    *
    * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    */
    Response<
                GetCampaignSettingsResponse
        >
    getCampaignSettings(
            
            long campaignId
            
    );
    /**
    * Список магазинов пользователя.
    *
    * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param page Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
    * \param pageSize Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
    */
    Response<
                GetCampaignsResponse
        >
    getCampaigns(
            
            int page
            , 
            
            int pageSize
            
    );
    /**
    * Магазины, доступные логину.
    *
    * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param login Логин пользователя. *Required*
    * \param page Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
    * \param pageSize Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
    */
    Response<
                GetCampaignsResponse
        >
    getCampaignsByLogin(
            
            std::string login
            , 
            
            int page
            , 
            
            int pageSize
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CampaignsApi_H_ */