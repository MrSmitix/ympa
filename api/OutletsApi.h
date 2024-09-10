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
 * OutletsApi.h
 *
 * 
 */

#ifndef OutletsApi_H_
#define OutletsApi_H_


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
#include "ChangeOutletRequest.h"
#include "CreateOutletResponse.h"
#include "EmptyApiResponse.h"
#include "GetOutletResponse.h"
#include "GetOutletsResponse.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  OutletsApiException: public std::exception
{
public:
    OutletsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace OutletsApiResources {
/// <summary>
/// Создание точки продаж
/// </summary>
/// <remarks>
/// Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
/// </remarks>
class  CampaignsCampaignIdOutletsResource: public restbed::Resource
{
public:
    CampaignsCampaignIdOutletsResource(const std::string& context = "");
    virtual ~CampaignsCampaignIdOutletsResource() = default;

    CampaignsCampaignIdOutletsResource(
        const CampaignsCampaignIdOutletsResource& other) = default; // copy constructor
    CampaignsCampaignIdOutletsResource(CampaignsCampaignIdOutletsResource&& other) noexcept = default; // move constructor

    CampaignsCampaignIdOutletsResource& operator=(const CampaignsCampaignIdOutletsResource& other) = default; // copy assignment
    CampaignsCampaignIdOutletsResource& operator=(CampaignsCampaignIdOutletsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, CreateOutletResponse>(
        int64_t & campaignId, ChangeOutletRequest & changeOutletRequest)> handler_POST_func =
            [](int64_t &, ChangeOutletRequest &) -> std::pair<int, CreateOutletResponse>
                { throw OutletsApiException(501, "Not implemented"); };

    std::function<std::pair<int, GetOutletsResponse>(
        int64_t & campaignId, std::string & pageToken, int64_t & regionId, std::string & shopOutletCode, int64_t & regionId2)> handler_GET_func =
            [](int64_t &, std::string &, int64_t &, std::string &, int64_t &) -> std::pair<int, GetOutletsResponse>
                { throw OutletsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, CreateOutletResponse> handler_POST(
        int64_t & campaignId, ChangeOutletRequest & changeOutletRequest);

    virtual std::pair<int, GetOutletsResponse> handler_GET(
        int64_t & campaignId, std::string & pageToken, int64_t & regionId, std::string & shopOutletCode, int64_t & regionId2);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleOutletsApiException(const OutletsApiException& e);
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
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Удаление точки продаж
/// </summary>
/// <remarks>
/// Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
/// </remarks>
class  CampaignsCampaignIdOutletsOutletIdResource: public restbed::Resource
{
public:
    CampaignsCampaignIdOutletsOutletIdResource(const std::string& context = "");
    virtual ~CampaignsCampaignIdOutletsOutletIdResource() = default;

    CampaignsCampaignIdOutletsOutletIdResource(
        const CampaignsCampaignIdOutletsOutletIdResource& other) = default; // copy constructor
    CampaignsCampaignIdOutletsOutletIdResource(CampaignsCampaignIdOutletsOutletIdResource&& other) noexcept = default; // move constructor

    CampaignsCampaignIdOutletsOutletIdResource& operator=(const CampaignsCampaignIdOutletsOutletIdResource& other) = default; // copy assignment
    CampaignsCampaignIdOutletsOutletIdResource& operator=(CampaignsCampaignIdOutletsOutletIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, EmptyApiResponse>(
        int64_t & campaignId, int64_t & outletId)> handler_DELETE_func =
            [](int64_t &, int64_t &) -> std::pair<int, EmptyApiResponse>
                { throw OutletsApiException(501, "Not implemented"); };

    std::function<std::pair<int, GetOutletResponse>(
        int64_t & campaignId, int64_t & outletId)> handler_GET_func =
            [](int64_t &, int64_t &) -> std::pair<int, GetOutletResponse>
                { throw OutletsApiException(501, "Not implemented"); };

    std::function<std::pair<int, EmptyApiResponse>(
        int64_t & campaignId, int64_t & outletId, ChangeOutletRequest & changeOutletRequest)> handler_PUT_func =
            [](int64_t &, int64_t &, ChangeOutletRequest &) -> std::pair<int, EmptyApiResponse>
                { throw OutletsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, EmptyApiResponse> handler_DELETE(
        int64_t & campaignId, int64_t & outletId);

    virtual std::pair<int, GetOutletResponse> handler_GET(
        int64_t & campaignId, int64_t & outletId);
    virtual std::pair<int, EmptyApiResponse> handler_PUT(
        int64_t & campaignId, int64_t & outletId, ChangeOutletRequest & changeOutletRequest);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleOutletsApiException(const OutletsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_DELETE_internal(const std::shared_ptr<restbed::Session> session);
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
    void handler_PUT_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace OutletsApiResources */

using OutletsApiCampaignsCampaignIdOutletsResource [[deprecated]] = OutletsApiResources::CampaignsCampaignIdOutletsResource;
using OutletsApiCampaignsCampaignIdOutletsOutletIdResource [[deprecated]] = OutletsApiResources::CampaignsCampaignIdOutletsOutletIdResource;

//
// The restbed service to actually implement the REST server
//
class  OutletsApi
{
public:
    explicit OutletsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~OutletsApi();

    std::shared_ptr<OutletsApiResources::CampaignsCampaignIdOutletsResource> getCampaignsCampaignIdOutletsResource();
    std::shared_ptr<OutletsApiResources::CampaignsCampaignIdOutletsOutletIdResource> getCampaignsCampaignIdOutletsOutletIdResource();

    void setResource(std::shared_ptr<OutletsApiResources::CampaignsCampaignIdOutletsResource> resource);
    void setResource(std::shared_ptr<OutletsApiResources::CampaignsCampaignIdOutletsOutletIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setOutletsApiCampaignsCampaignIdOutletsResource(std::shared_ptr<OutletsApiResources::CampaignsCampaignIdOutletsResource> spOutletsApiCampaignsCampaignIdOutletsResource);
    [[deprecated("use setResource()")]]
    virtual void setOutletsApiCampaignsCampaignIdOutletsOutletIdResource(std::shared_ptr<OutletsApiResources::CampaignsCampaignIdOutletsOutletIdResource> spOutletsApiCampaignsCampaignIdOutletsOutletIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<OutletsApiResources::CampaignsCampaignIdOutletsResource> m_spCampaignsCampaignIdOutletsResource;
    std::shared_ptr<OutletsApiResources::CampaignsCampaignIdOutletsOutletIdResource> m_spCampaignsCampaignIdOutletsOutletIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* OutletsApi_H_ */

