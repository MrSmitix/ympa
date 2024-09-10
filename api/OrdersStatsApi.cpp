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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/uri.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include <boost/lexical_cast.hpp>
#include <boost/algorithm/string.hpp>

#include "OrdersStatsApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

namespace {
[[maybe_unused]]
std::string selectPreferredContentType(const std::vector<std::string>& contentTypes) {
    if (contentTypes.size() == 0) {
        return "application/json";
    }

    if (contentTypes.size() == 1) {
        return contentTypes.at(0);
    }

    static const std::array<std::string, 2> preferredTypes = {"json", "xml"};
    for (const auto& preferredType: preferredTypes) {
        const auto ret = std::find_if(contentTypes.cbegin(),
        contentTypes.cend(),
        [preferredType](const std::string& str) {
            return str.find(preferredType) != std::string::npos;});
        if (ret != contentTypes.cend()) {
            return *ret;
        }
    }

    return contentTypes.at(0);
}
}

OrdersStatsApiException::OrdersStatsApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int OrdersStatsApiException::getStatus() const
{
    return m_status;
}
const char* OrdersStatsApiException::what() const noexcept
{
    return m_what.c_str();
}


template<class MODEL_T>
MODEL_T extractJsonModelBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto model = MODEL_T(pt);
    return model;
}

template<class MODEL_T>
std::vector<MODEL_T> extractJsonArrayBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto arrayRet = std::vector<MODEL_T>();
    for (const auto& child: pt) {
        arrayRet.emplace_back(MODEL_T(child.second));
    }
    return arrayRet;
}

template <class KEY_T, class VAL_T>
std::string convertMapResponse(const std::map<KEY_T, VAL_T>& map)
{
    boost::property_tree::ptree pt;
    for(const auto &kv: map) {
    pt.push_back(boost::property_tree::ptree::value_type(
        boost::lexical_cast<std::string>(kv.first),
        boost::property_tree::ptree(
        boost::lexical_cast<std::string>(kv.second))));
    }
    std::stringstream sstream;
    write_json(sstream, pt);
    std::string result = sstream.str();
    return result;
}

namespace OrdersStatsApiResources {
CampaignsCampaignIdStatsOrdersResource::CampaignsCampaignIdStatsOrdersResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/campaigns/{campaignId: .*}/stats/orders");
	this->set_method_handler("POST",
		std::bind(&CampaignsCampaignIdStatsOrdersResource::handler_POST_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> CampaignsCampaignIdStatsOrdersResource::handleOrdersStatsApiException(const OrdersStatsApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> CampaignsCampaignIdStatsOrdersResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> CampaignsCampaignIdStatsOrdersResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void CampaignsCampaignIdStatsOrdersResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void CampaignsCampaignIdStatsOrdersResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void CampaignsCampaignIdStatsOrdersResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void CampaignsCampaignIdStatsOrdersResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // body params or form params here from the body content string
    std::string bodyContent = extractBodyContent(session);
    auto getOrdersStatsRequest = extractJsonModelBodyParam<GetOrdersStatsRequest>(bodyContent);
    // Getting the path params
    int64_t campaignId = request->get_path_parameter("campaignId", 0L);
    // Getting the query params
    std::string pageToken = request->get_query_parameter("pageToken", "");
    int32_t limit = request->get_query_parameter("limit", 0);
    
    int status_code = 500;
    GetOrdersStatsResponse resultObject = GetOrdersStatsResponse{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_POST(campaignId, pageToken, limit, getOrdersStatsRequest);
    }
    catch(const OrdersStatsApiException& e) {
        std::tie(status_code, result) = handleOrdersStatsApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "application/json",
    };
    static const std::string acceptTypes{
        "application/json, "
    };
    
    if (status_code == 200) {
        responseHeaders.insert(std::make_pair("Content-Type", selectPreferredContentType(contentTypes)));
        if (!acceptTypes.empty()) {
            responseHeaders.insert(std::make_pair("Accept", acceptTypes));
        }
    
        result = resultObject.toJsonString();
        returnResponse(session, 200, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    if (status_code == 400) {
        responseHeaders.insert(std::make_pair("Content-Type", "text/plain"));
        result = "Запрос содержит неправильные данные.";
    
        result = resultObject.toJsonString();
        returnResponse(session, 400, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    if (status_code == 401) {
        responseHeaders.insert(std::make_pair("Content-Type", "text/plain"));
        result = "В запросе не указаны данные для авторизации.";
    
        result = resultObject.toJsonString();
        returnResponse(session, 401, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    if (status_code == 403) {
        responseHeaders.insert(std::make_pair("Content-Type", "text/plain"));
        result = "Данные для авторизации неверны или доступ к ресурсу запрещен.";
    
        result = resultObject.toJsonString();
        returnResponse(session, 403, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    if (status_code == 404) {
        responseHeaders.insert(std::make_pair("Content-Type", "text/plain"));
        result = "Запрашиваемый ресурс не найден.";
    
        result = resultObject.toJsonString();
        returnResponse(session, 404, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    if (status_code == 420) {
        responseHeaders.insert(std::make_pair("Content-Type", "text/plain"));
        result = "Превышено ограничение на доступ к ресурсу.";
    
        result = resultObject.toJsonString();
        returnResponse(session, 420, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    if (status_code == 500) {
        responseHeaders.insert(std::make_pair("Content-Type", "text/plain"));
        result = "Внутренняя ошибка сервера.";
    
        result = resultObject.toJsonString();
        returnResponse(session, 500, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
    
    
}


std::pair<int, GetOrdersStatsResponse> CampaignsCampaignIdStatsOrdersResource::handler_POST(
        int64_t & campaignId, std::string & pageToken, int32_t & limit, GetOrdersStatsRequest & getOrdersStatsRequest)
{
    return handler_POST_func(campaignId, pageToken, limit, getOrdersStatsRequest);
}


std::string CampaignsCampaignIdStatsOrdersResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

std::string CampaignsCampaignIdStatsOrdersResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}

} /* namespace OrdersStatsApiResources */

OrdersStatsApi::OrdersStatsApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

OrdersStatsApi::~OrdersStatsApi() {}

std::shared_ptr<OrdersStatsApiResources::CampaignsCampaignIdStatsOrdersResource> OrdersStatsApi::getCampaignsCampaignIdStatsOrdersResource() {
    if (!m_spCampaignsCampaignIdStatsOrdersResource) {
        setResource(std::make_shared<OrdersStatsApiResources::CampaignsCampaignIdStatsOrdersResource>());
    }
    return m_spCampaignsCampaignIdStatsOrdersResource;
}
void OrdersStatsApi::setResource(std::shared_ptr<OrdersStatsApiResources::CampaignsCampaignIdStatsOrdersResource> resource) {
    m_spCampaignsCampaignIdStatsOrdersResource = resource;
    m_service->publish(m_spCampaignsCampaignIdStatsOrdersResource);
}
void OrdersStatsApi::setOrdersStatsApiCampaignsCampaignIdStatsOrdersResource(std::shared_ptr<OrdersStatsApiResources::CampaignsCampaignIdStatsOrdersResource> spCampaignsCampaignIdStatsOrdersResource) {
    m_spCampaignsCampaignIdStatsOrdersResource = spCampaignsCampaignIdStatsOrdersResource;
    m_service->publish(m_spCampaignsCampaignIdStatsOrdersResource);
}


void OrdersStatsApi::publishDefaultResources() {
    if (!m_spCampaignsCampaignIdStatsOrdersResource) {
        setResource(std::make_shared<OrdersStatsApiResources::CampaignsCampaignIdStatsOrdersResource>());
    }
}

std::shared_ptr<restbed::Service> OrdersStatsApi::service() {
    return m_service;
}


}
}
}
}

