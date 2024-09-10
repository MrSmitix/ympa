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



#include "UpdateOfferMappingsResponse.h"

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

UpdateOfferMappingsResponse::UpdateOfferMappingsResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string UpdateOfferMappingsResponse::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void UpdateOfferMappingsResponse::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree UpdateOfferMappingsResponse::toPropertyTree()
{
    return toPropertyTree_internal();
}

void UpdateOfferMappingsResponse::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string UpdateOfferMappingsResponse::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void UpdateOfferMappingsResponse::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UpdateOfferMappingsResponse::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Results
	if (!m_Results.empty()) {
		for (const auto &childEntry : m_Results) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("results", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void UpdateOfferMappingsResponse::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Results into member vector
	if (pt.get_child_optional("results")) {
		for (const auto &childTree : pt.get_child("results")) {
            std::shared_ptr<UpdateOfferMappingResultDTO> val =
                std::make_shared<UpdateOfferMappingResultDTO>(childTree.second);
            m_Results.emplace_back(std::move(val));
		}
	}
}

std::shared_ptr<ApiResponseStatusType> UpdateOfferMappingsResponse::getStatus() const
{
    return m_Status;
}

void UpdateOfferMappingsResponse::setStatus(std::shared_ptr<ApiResponseStatusType> value)
{
	m_Status = value;
}
std::vector<std::shared_ptr<UpdateOfferMappingResultDTO>> UpdateOfferMappingsResponse::getResults() const
{
    return m_Results;
}

void UpdateOfferMappingsResponse::setResults(std::vector<std::shared_ptr<UpdateOfferMappingResultDTO>> value)
{
	m_Results = value;
}

std::vector<UpdateOfferMappingsResponse> createUpdateOfferMappingsResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<UpdateOfferMappingsResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(UpdateOfferMappingsResponse(child.second));
    }

    return vec;
}

}
}
}
}

