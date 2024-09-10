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



#include "GetSuggestedOfferMappingsResponse.h"

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

GetSuggestedOfferMappingsResponse::GetSuggestedOfferMappingsResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetSuggestedOfferMappingsResponse::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetSuggestedOfferMappingsResponse::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetSuggestedOfferMappingsResponse::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetSuggestedOfferMappingsResponse::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetSuggestedOfferMappingsResponse::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetSuggestedOfferMappingsResponse::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetSuggestedOfferMappingsResponse::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_Result != nullptr) {
		pt.add_child("result", m_Result->toPropertyTree());
	}
	return pt;
}

void GetSuggestedOfferMappingsResponse::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("result")) {
		m_Result = std::make_shared<GetSuggestedOfferMappingsResultDTO>();
		m_Result->fromPropertyTree(pt.get_child("result"));
	}
}

std::shared_ptr<ApiResponseStatusType> GetSuggestedOfferMappingsResponse::getStatus() const
{
    return m_Status;
}

void GetSuggestedOfferMappingsResponse::setStatus(std::shared_ptr<ApiResponseStatusType> value)
{
	m_Status = value;
}
std::shared_ptr<GetSuggestedOfferMappingsResultDTO> GetSuggestedOfferMappingsResponse::getResult() const
{
    return m_Result;
}

void GetSuggestedOfferMappingsResponse::setResult(std::shared_ptr<GetSuggestedOfferMappingsResultDTO> value)
{
	m_Result = value;
}

std::vector<GetSuggestedOfferMappingsResponse> createGetSuggestedOfferMappingsResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetSuggestedOfferMappingsResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(GetSuggestedOfferMappingsResponse(child.second));
    }

    return vec;
}

}
}
}
}

