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



#include "OfferCampaignStatusDTO.h"

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

OfferCampaignStatusDTO::OfferCampaignStatusDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OfferCampaignStatusDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OfferCampaignStatusDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OfferCampaignStatusDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OfferCampaignStatusDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OfferCampaignStatusDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OfferCampaignStatusDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OfferCampaignStatusDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("campaignId", m_CampaignId);
	return pt;
}

void OfferCampaignStatusDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_CampaignId = pt.get("campaignId", 0L);
}

int64_t OfferCampaignStatusDTO::getCampaignId() const
{
    return m_CampaignId;
}

void OfferCampaignStatusDTO::setCampaignId(int64_t value)
{
	m_CampaignId = value;
}
std::shared_ptr<OfferCampaignStatusType> OfferCampaignStatusDTO::getStatus() const
{
    return m_Status;
}

void OfferCampaignStatusDTO::setStatus(std::shared_ptr<OfferCampaignStatusType> value)
{
	m_Status = value;
}

std::vector<OfferCampaignStatusDTO> createOfferCampaignStatusDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OfferCampaignStatusDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OfferCampaignStatusDTO(child.second));
    }

    return vec;
}

}
}
}
}

