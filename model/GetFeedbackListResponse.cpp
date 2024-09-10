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



#include "GetFeedbackListResponse.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

GetFeedbackListResponse::GetFeedbackListResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetFeedbackListResponse::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetFeedbackListResponse::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetFeedbackListResponse::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetFeedbackListResponse::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetFeedbackListResponse::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetFeedbackListResponse::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetFeedbackListResponse::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_Result != nullptr) {
		pt.add_child("result", m_Result->toPropertyTree());
	}
	return pt;
}

void GetFeedbackListResponse::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("result")) {
		m_Result = std::make_shared<FeedbackListDTO>();
		m_Result->fromPropertyTree(pt.get_child("result"));
	}
}

std::shared_ptr<ApiResponseStatusType> GetFeedbackListResponse::getStatus() const
{
    return m_Status;
}

void GetFeedbackListResponse::setStatus(std::shared_ptr<ApiResponseStatusType> value)
{
	m_Status = value;
}
std::shared_ptr<FeedbackListDTO> GetFeedbackListResponse::getResult() const
{
    return m_Result;
}

void GetFeedbackListResponse::setResult(std::shared_ptr<FeedbackListDTO> value)
{
	m_Result = value;
}

std::vector<GetFeedbackListResponse> createGetFeedbackListResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetFeedbackListResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(GetFeedbackListResponse(child.second));
    }

    return vec;
}

}
}
}
}

