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
std::shared_ptr<MODEL_T> extractJsonModelBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto model = std::make_shared<MODEL_T>(pt);
    return model;
}

template<class MODEL_T>
std::vector<std::shared_ptr<MODEL_T>> extractJsonArrayBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto arrayRet = std::vector<std::shared_ptr<MODEL_T>>();
    for (const auto& child: pt) {
        arrayRet.emplace_back(std::make_shared<MODEL_T>(child.second));
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

FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/campaigns/{campaignId: .*}/feedback/updates/");
	this->set_method_handler("GET",
		std::bind(&FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::handler_GET_internal, this,
			std::placeholders::_1));
}

FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::~FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource()
{
}

std::pair<int, std::string> FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::handleFeedbacksApiException(const FeedbacksApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();

    // Getting the path params
    const int64_t campaignId = getPathParam_campaignId(request);

    // Getting the query params
    const std::string pageToken = getQueryParam_pageToken(request);
    const int32_t limit = getQueryParam_limit(request);
    const std::string fromDate = getQueryParam_fromDate(request);


    int status_code = 500;
    std::shared_ptr<GetFeedbackListResponse> resultObject = std::make_shared<GetFeedbackListResponse>();
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

    if (status_code == 200) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 200, result.empty() ? "Список отзывов для магазина." : result, contentType);
        return;
    }
    if (status_code == 400) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 400, result.empty() ? "Запрос содержит неправильные данные." : result, contentType);
        return;
    }
    if (status_code == 401) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 401, result.empty() ? "В запросе не указаны данные для авторизации." : result, contentType);
        return;
    }
    if (status_code == 403) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 403, result.empty() ? "Данные для авторизации неверны или доступ к ресурсу запрещен." : result, contentType);
        return;
    }
    if (status_code == 404) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 404, result.empty() ? "Запрашиваемый ресурс не найден." : result, contentType);
        return;
    }
    if (status_code == 420) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 420, result.empty() ? "Превышено ограничение на доступ к ресурсу." : result, contentType);
        return;
    }
    if (status_code == 500) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 500, result.empty() ? "Внутренняя ошибка сервера." : result, contentType);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::shared_ptr<GetFeedbackListResponse>> FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::handler_GET(
        int64_t const & campaignId, std::string const & pageToken, int32_t const & limit, std::string const & fromDate)
{
    throw FeedbacksApiException(501, "Not implemented");
}


std::string FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

FeedbacksApi::FeedbacksApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

FeedbacksApi::~FeedbacksApi() {}

void FeedbacksApi::setFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource(std::shared_ptr<FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource> spFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource) {
    m_spFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource = spFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource;
    m_service->publish(m_spFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource);
}


void FeedbacksApi::publishDefaultResources() {
    if (!m_spFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource) {
        setFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource(std::make_shared<FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource>());
    }
}

std::shared_ptr<restbed::Service> FeedbacksApi::service() {
    return m_service;
}


}
}
}
}

