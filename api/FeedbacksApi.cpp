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

#include "FeedbacksApi.h"

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

FeedbacksApiException::FeedbacksApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int FeedbacksApiException::getStatus() const
{
    return m_status;
}
const char* FeedbacksApiException::what() const noexcept
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

namespace FeedbacksApiResources {
CampaignsCampaignIdFeedbackUpdatesResource::CampaignsCampaignIdFeedbackUpdatesResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/campaigns/{campaignId: .*}/feedback/updates");
	this->set_method_handler("GET",
		std::bind(&CampaignsCampaignIdFeedbackUpdatesResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> CampaignsCampaignIdFeedbackUpdatesResource::handleFeedbacksApiException(const FeedbacksApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> CampaignsCampaignIdFeedbackUpdatesResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> CampaignsCampaignIdFeedbackUpdatesResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void CampaignsCampaignIdFeedbackUpdatesResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void CampaignsCampaignIdFeedbackUpdatesResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void CampaignsCampaignIdFeedbackUpdatesResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void CampaignsCampaignIdFeedbackUpdatesResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // Getting the path params
    int64_t campaignId = request->get_path_parameter("campaignId", 0L);
    // Getting the query params
    std::string pageToken = request->get_query_parameter("pageToken", "");
    int32_t limit = request->get_query_parameter("limit", 0);
    std::string fromDate = request->get_query_parameter("fromDate", "");
    
    int status_code = 500;
    GetFeedbackListResponse resultObject = GetFeedbackListResponse{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_GET(campaignId, pageToken, limit, fromDate);
    }
    catch(const FeedbacksApiException& e) {
        std::tie(status_code, result) = handleFeedbacksApiException(e);
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


std::pair<int, GetFeedbackListResponse> CampaignsCampaignIdFeedbackUpdatesResource::handler_GET(
        int64_t & campaignId, std::string & pageToken, int32_t & limit, std::string & fromDate)
{
    return handler_GET_func(campaignId, pageToken, limit, fromDate);
}


std::string CampaignsCampaignIdFeedbackUpdatesResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

std::string CampaignsCampaignIdFeedbackUpdatesResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}

} /* namespace FeedbacksApiResources */

FeedbacksApi::FeedbacksApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

FeedbacksApi::~FeedbacksApi() {}

std::shared_ptr<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource> FeedbacksApi::getCampaignsCampaignIdFeedbackUpdatesResource() {
    if (!m_spCampaignsCampaignIdFeedbackUpdatesResource) {
        setResource(std::make_shared<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource>());
    }
    return m_spCampaignsCampaignIdFeedbackUpdatesResource;
}
void FeedbacksApi::setResource(std::shared_ptr<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource> resource) {
    m_spCampaignsCampaignIdFeedbackUpdatesResource = resource;
    m_service->publish(m_spCampaignsCampaignIdFeedbackUpdatesResource);
}
void FeedbacksApi::setFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource(std::shared_ptr<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource> spCampaignsCampaignIdFeedbackUpdatesResource) {
    m_spCampaignsCampaignIdFeedbackUpdatesResource = spCampaignsCampaignIdFeedbackUpdatesResource;
    m_service->publish(m_spCampaignsCampaignIdFeedbackUpdatesResource);
}


void FeedbacksApi::publishDefaultResources() {
    if (!m_spCampaignsCampaignIdFeedbackUpdatesResource) {
        setResource(std::make_shared<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource>());
    }
}

std::shared_ptr<restbed::Service> FeedbacksApi::service() {
    return m_service;
}


}
}
}
}

