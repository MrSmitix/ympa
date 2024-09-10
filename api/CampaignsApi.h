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
 * CampaignsApi.h
 *
 * 
 */

#ifndef CampaignsApi_H_
#define CampaignsApi_H_


#include <memory>
#include <utility>
#include <exception>

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
#include "GetCampaignLoginsResponse.h"
#include "GetCampaignRegionResponse.h"
#include "GetCampaignResponse.h"
#include "GetCampaignSettingsResponse.h"
#include "GetCampaignsResponse.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  CampaignsApiException: public std::exception
{
public:
    CampaignsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

/// <summary>
/// Информация о магазине
/// </summary>
/// <remarks>
/// Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
/// </remarks>
class  CampaignsApiCampaignsCampaignIdResource: public restbed::Resource
{
public:
    CampaignsApiCampaignsCampaignIdResource(const std::string& context = "");
    virtual ~CampaignsApiCampaignsCampaignIdResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetCampaignResponse>> handler_GET(
        int64_t const & campaignId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }



    virtual std::pair<int, std::string> handleCampaignsApiException(const CampaignsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Логины, связанные с магазином
/// </summary>
/// <remarks>
/// Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
/// </remarks>
class  CampaignsApiCampaignsCampaignIdLoginsResource: public restbed::Resource
{
public:
    CampaignsApiCampaignsCampaignIdLoginsResource(const std::string& context = "");
    virtual ~CampaignsApiCampaignsCampaignIdLoginsResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetCampaignLoginsResponse>> handler_GET(
        int64_t const & campaignId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }



    virtual std::pair<int, std::string> handleCampaignsApiException(const CampaignsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Регион магазина
/// </summary>
/// <remarks>
/// {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
/// </remarks>
class  CampaignsApiCampaignsCampaignIdRegionResource: public restbed::Resource
{
public:
    CampaignsApiCampaignsCampaignIdRegionResource(const std::string& context = "");
    virtual ~CampaignsApiCampaignsCampaignIdRegionResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetCampaignRegionResponse>> handler_GET(
        int64_t const & campaignId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }



    virtual std::pair<int, std::string> handleCampaignsApiException(const CampaignsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Настройки магазина
/// </summary>
/// <remarks>
/// Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
/// </remarks>
class  CampaignsApiCampaignsCampaignIdSettingsResource: public restbed::Resource
{
public:
    CampaignsApiCampaignsCampaignIdSettingsResource(const std::string& context = "");
    virtual ~CampaignsApiCampaignsCampaignIdSettingsResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetCampaignSettingsResponse>> handler_GET(
        int64_t const & campaignId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }



    virtual std::pair<int, std::string> handleCampaignsApiException(const CampaignsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Список магазинов пользователя
/// </summary>
/// <remarks>
/// Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
/// </remarks>
class  CampaignsApiCampaignsResource: public restbed::Resource
{
public:
    CampaignsApiCampaignsResource(const std::string& context = "");
    virtual ~CampaignsApiCampaignsResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetCampaignsResponse>> handler_GET(
        int32_t const & page, int32_t const & pageSize);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int32_t getQueryParam_page(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("page", 1);
    }

    virtual int32_t getQueryParam_pageSize(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("pageSize", 0);
    }



    virtual std::pair<int, std::string> handleCampaignsApiException(const CampaignsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Магазины, доступные логину
/// </summary>
/// <remarks>
/// Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
/// </remarks>
class  CampaignsApiCampaignsBy_loginLoginResource: public restbed::Resource
{
public:
    CampaignsApiCampaignsBy_loginLoginResource(const std::string& context = "");
    virtual ~CampaignsApiCampaignsBy_loginLoginResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetCampaignsResponse>> handler_GET(
        std::string const & login, int32_t const & page, int32_t const & pageSize);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual std::string getPathParam_login(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("login", "");
    }

    virtual int32_t getQueryParam_page(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("page", 1);
    }

    virtual int32_t getQueryParam_pageSize(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("pageSize", 0);
    }



    virtual std::pair<int, std::string> handleCampaignsApiException(const CampaignsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};



//
// The restbed service to actually implement the REST server
//
class  CampaignsApi
{
public:
    explicit CampaignsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~CampaignsApi();

    virtual void setCampaignsApiCampaignsCampaignIdResource(std::shared_ptr<CampaignsApiCampaignsCampaignIdResource> spCampaignsApiCampaignsCampaignIdResource);
    virtual void setCampaignsApiCampaignsCampaignIdLoginsResource(std::shared_ptr<CampaignsApiCampaignsCampaignIdLoginsResource> spCampaignsApiCampaignsCampaignIdLoginsResource);
    virtual void setCampaignsApiCampaignsCampaignIdRegionResource(std::shared_ptr<CampaignsApiCampaignsCampaignIdRegionResource> spCampaignsApiCampaignsCampaignIdRegionResource);
    virtual void setCampaignsApiCampaignsCampaignIdSettingsResource(std::shared_ptr<CampaignsApiCampaignsCampaignIdSettingsResource> spCampaignsApiCampaignsCampaignIdSettingsResource);
    virtual void setCampaignsApiCampaignsResource(std::shared_ptr<CampaignsApiCampaignsResource> spCampaignsApiCampaignsResource);
    virtual void setCampaignsApiCampaignsBy_loginLoginResource(std::shared_ptr<CampaignsApiCampaignsBy_loginLoginResource> spCampaignsApiCampaignsBy_loginLoginResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<CampaignsApiCampaignsCampaignIdResource> m_spCampaignsApiCampaignsCampaignIdResource;
    std::shared_ptr<CampaignsApiCampaignsCampaignIdLoginsResource> m_spCampaignsApiCampaignsCampaignIdLoginsResource;
    std::shared_ptr<CampaignsApiCampaignsCampaignIdRegionResource> m_spCampaignsApiCampaignsCampaignIdRegionResource;
    std::shared_ptr<CampaignsApiCampaignsCampaignIdSettingsResource> m_spCampaignsApiCampaignsCampaignIdSettingsResource;
    std::shared_ptr<CampaignsApiCampaignsResource> m_spCampaignsApiCampaignsResource;
    std::shared_ptr<CampaignsApiCampaignsBy_loginLoginResource> m_spCampaignsApiCampaignsBy_loginLoginResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* CampaignsApi_H_ */

