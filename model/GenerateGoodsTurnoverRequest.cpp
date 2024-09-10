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



#include "GenerateGoodsTurnoverRequest.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

GenerateGoodsTurnoverRequest::GenerateGoodsTurnoverRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GenerateGoodsTurnoverRequest::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GenerateGoodsTurnoverRequest::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GenerateGoodsTurnoverRequest::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GenerateGoodsTurnoverRequest::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GenerateGoodsTurnoverRequest::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GenerateGoodsTurnoverRequest::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GenerateGoodsTurnoverRequest::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("campaignId", m_CampaignId);
	pt.put("date", m_date);
	return pt;
}

void GenerateGoodsTurnoverRequest::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_CampaignId = pt.get("campaignId", 0L);
	m_date = pt.get("date", "");
}

int64_t GenerateGoodsTurnoverRequest::getCampaignId() const
{
    return m_CampaignId;
}

void GenerateGoodsTurnoverRequest::setCampaignId(int64_t value)
{
	m_CampaignId = value;
}
std::string GenerateGoodsTurnoverRequest::getDate() const
{
    return m_date;
}

void GenerateGoodsTurnoverRequest::setDate(std::string value)
{
	m_date = value;
}

std::vector<GenerateGoodsTurnoverRequest> createGenerateGoodsTurnoverRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GenerateGoodsTurnoverRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(GenerateGoodsTurnoverRequest(child.second));
    }

    return vec;
}

}
}
}
}

