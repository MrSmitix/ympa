/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * BusinessesApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_BusinessesApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_BusinessesApi_H_



#include "ympa_cpp_restsdk_client/ApiClient.h"

#include "ympa_cpp_restsdk_client/model/ApiClientDataErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiForbiddenErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiLimitErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiNotFoundErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiServerErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiUnauthorizedErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/GetBusinessSettingsResponse.h"
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  BusinessesApi 
{
public:

    explicit BusinessesApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~BusinessesApi();

    /// <summary>
    /// Настройки кабинета
    /// </summary>
    /// <remarks>
    /// Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    /// </remarks>
    /// <param name="businessId">Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    pplx::task<std::shared_ptr<GetBusinessSettingsResponse>> getBusinessSettings(
        int64_t businessId
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_BusinessesApi_H_ */

