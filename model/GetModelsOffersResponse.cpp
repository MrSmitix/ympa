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



#include "GetModelsOffersResponse.h"

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

GetModelsOffersResponse::GetModelsOffersResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetModelsOffersResponse::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetModelsOffersResponse::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetModelsOffersResponse::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetModelsOffersResponse::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetModelsOffersResponse::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetModelsOffersResponse::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetModelsOffersResponse::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Models
	if (!m_Models.empty()) {
		for (const auto &childEntry : m_Models) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("models", tmp_node);
		tmp_node.clear();
	}
	pt.put("regionId", m_RegionId);
	return pt;
}

void GetModelsOffersResponse::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Models into member vector
	if (pt.get_child_optional("models")) {
		for (const auto &childTree : pt.get_child("models")) {
            std::shared_ptr<EnrichedModelDTO> val =
                std::make_shared<EnrichedModelDTO>(childTree.second);
            m_Models.emplace_back(std::move(val));
		}
	}
	m_RegionId = pt.get("regionId", 0L);
}

std::vector<std::shared_ptr<EnrichedModelDTO>> GetModelsOffersResponse::getModels() const
{
    return m_Models;
}

void GetModelsOffersResponse::setModels(std::vector<std::shared_ptr<EnrichedModelDTO>> value)
{
	m_Models = value;
}
std::shared_ptr<CurrencyType> GetModelsOffersResponse::getCurrency() const
{
    return m_Currency;
}

void GetModelsOffersResponse::setCurrency(std::shared_ptr<CurrencyType> value)
{
	m_Currency = value;
}
int64_t GetModelsOffersResponse::getRegionId() const
{
    return m_RegionId;
}

void GetModelsOffersResponse::setRegionId(int64_t value)
{
	m_RegionId = value;
}

std::vector<GetModelsOffersResponse> createGetModelsOffersResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetModelsOffersResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(GetModelsOffersResponse(child.second));
    }

    return vec;
}

}
}
}
}

