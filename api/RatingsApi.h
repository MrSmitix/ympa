/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * RatingsApi.h
 *
 * 
 */

#ifndef RatingsApi_H_
#define RatingsApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "GetQualityRatingDetailsResponse.h"
#include "GetQualityRatingRequest.h"
#include "GetQualityRatingResponse.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  RatingsApiException: public std::exception
{
public:
    RatingsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace RatingsApiResources {
/// <summary>
/// Заказы, которые повлияли на индекс качества
/// </summary>
/// <remarks>
/// Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
/// </remarks>
class  CampaignsCampaignIdRatingsQualityDetailsResource: public restbed::Resource
{
public:
    CampaignsCampaignIdRatingsQualityDetailsResource(const std::string& context = "");
    virtual ~CampaignsCampaignIdRatingsQualityDetailsResource() = default;

    CampaignsCampaignIdRatingsQualityDetailsResource(
        const CampaignsCampaignIdRatingsQualityDetailsResource& other) = default; // copy constructor
    CampaignsCampaignIdRatingsQualityDetailsResource(CampaignsCampaignIdRatingsQualityDetailsResource&& other) noexcept = default; // move constructor

    CampaignsCampaignIdRatingsQualityDetailsResource& operator=(const CampaignsCampaignIdRatingsQualityDetailsResource& other) = default; // copy assignment
    CampaignsCampaignIdRatingsQualityDetailsResource& operator=(CampaignsCampaignIdRatingsQualityDetailsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, GetQualityRatingDetailsResponse>(
        int64_t & campaignId)> handler_POST_func =
            [](int64_t &) -> std::pair<int, GetQualityRatingDetailsResponse>
                { throw RatingsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, GetQualityRatingDetailsResponse> handler_POST(
        int64_t & campaignId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleRatingsApiException(const RatingsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Индекс качества магазинов
/// </summary>
/// <remarks>
/// Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
/// </remarks>
class  BusinessesBusinessIdRatingsQualityResource: public restbed::Resource
{
public:
    BusinessesBusinessIdRatingsQualityResource(const std::string& context = "");
    virtual ~BusinessesBusinessIdRatingsQualityResource() = default;

    BusinessesBusinessIdRatingsQualityResource(
        const BusinessesBusinessIdRatingsQualityResource& other) = default; // copy constructor
    BusinessesBusinessIdRatingsQualityResource(BusinessesBusinessIdRatingsQualityResource&& other) noexcept = default; // move constructor

    BusinessesBusinessIdRatingsQualityResource& operator=(const BusinessesBusinessIdRatingsQualityResource& other) = default; // copy assignment
    BusinessesBusinessIdRatingsQualityResource& operator=(BusinessesBusinessIdRatingsQualityResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, GetQualityRatingResponse>(
        int64_t & businessId, GetQualityRatingRequest & getQualityRatingRequest)> handler_POST_func =
            [](int64_t &, GetQualityRatingRequest &) -> std::pair<int, GetQualityRatingResponse>
                { throw RatingsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, GetQualityRatingResponse> handler_POST(
        int64_t & businessId, GetQualityRatingRequest & getQualityRatingRequest);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleRatingsApiException(const RatingsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace RatingsApiResources */

using RatingsApiCampaignsCampaignIdRatingsQualityDetailsResource [[deprecated]] = RatingsApiResources::CampaignsCampaignIdRatingsQualityDetailsResource;
using RatingsApiBusinessesBusinessIdRatingsQualityResource [[deprecated]] = RatingsApiResources::BusinessesBusinessIdRatingsQualityResource;

//
// The restbed service to actually implement the REST server
//
class  RatingsApi
{
public:
    explicit RatingsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~RatingsApi();

    std::shared_ptr<RatingsApiResources::CampaignsCampaignIdRatingsQualityDetailsResource> getCampaignsCampaignIdRatingsQualityDetailsResource();
    std::shared_ptr<RatingsApiResources::BusinessesBusinessIdRatingsQualityResource> getBusinessesBusinessIdRatingsQualityResource();

    void setResource(std::shared_ptr<RatingsApiResources::CampaignsCampaignIdRatingsQualityDetailsResource> resource);
    void setResource(std::shared_ptr<RatingsApiResources::BusinessesBusinessIdRatingsQualityResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setRatingsApiCampaignsCampaignIdRatingsQualityDetailsResource(std::shared_ptr<RatingsApiResources::CampaignsCampaignIdRatingsQualityDetailsResource> spRatingsApiCampaignsCampaignIdRatingsQualityDetailsResource);
    [[deprecated("use setResource()")]]
    virtual void setRatingsApiBusinessesBusinessIdRatingsQualityResource(std::shared_ptr<RatingsApiResources::BusinessesBusinessIdRatingsQualityResource> spRatingsApiBusinessesBusinessIdRatingsQualityResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<RatingsApiResources::CampaignsCampaignIdRatingsQualityDetailsResource> m_spCampaignsCampaignIdRatingsQualityDetailsResource;
    std::shared_ptr<RatingsApiResources::BusinessesBusinessIdRatingsQualityResource> m_spBusinessesBusinessIdRatingsQualityResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* RatingsApi_H_ */

