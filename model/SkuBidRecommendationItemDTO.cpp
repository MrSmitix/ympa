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



#include "SkuBidRecommendationItemDTO.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

SkuBidRecommendationItemDTO::SkuBidRecommendationItemDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string SkuBidRecommendationItemDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void SkuBidRecommendationItemDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SkuBidRecommendationItemDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("sku", m_Sku);
	pt.put("bid", m_Bid);
	// generate tree for BidRecommendations
    tmp_node.clear();
	if (!m_BidRecommendations.empty()) {
        tmp_node = toPt(m_BidRecommendations);
		pt.add_child("bidRecommendations", tmp_node);
		tmp_node.clear();
	}
	// generate tree for PriceRecommendations
    tmp_node.clear();
	if (!m_PriceRecommendations.empty()) {
        tmp_node = toPt(m_PriceRecommendations);
		pt.add_child("priceRecommendations", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void SkuBidRecommendationItemDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Sku = pt.get("sku", "");
	m_Bid = pt.get("bid", 0);
	// push all items of BidRecommendations into member
	if (pt.get_child_optional("bidRecommendations")) {
        m_BidRecommendations = fromPt<std::vector<BidRecommendationItemDTO>>(pt.get_child("bidRecommendations"));
	}
	// push all items of PriceRecommendations into member
	if (pt.get_child_optional("priceRecommendations")) {
        m_PriceRecommendations = fromPt<std::vector<PriceRecommendationItemDTO>>(pt.get_child("priceRecommendations"));
	}
}

std::string SkuBidRecommendationItemDTO::getSku() const
{
    return m_Sku;
}

void SkuBidRecommendationItemDTO::setSku(std::string value)
{
    m_Sku = value;
}


int32_t SkuBidRecommendationItemDTO::getBid() const
{
    return m_Bid;
}

void SkuBidRecommendationItemDTO::setBid(int32_t value)
{
    m_Bid = value;
}


std::vector<BidRecommendationItemDTO> SkuBidRecommendationItemDTO::getBidRecommendations() const
{
    return m_BidRecommendations;
}

void SkuBidRecommendationItemDTO::setBidRecommendations(std::vector<BidRecommendationItemDTO> value)
{
    m_BidRecommendations = value;
}


std::vector<PriceRecommendationItemDTO> SkuBidRecommendationItemDTO::getPriceRecommendations() const
{
    return m_PriceRecommendations;
}

void SkuBidRecommendationItemDTO::setPriceRecommendations(std::vector<PriceRecommendationItemDTO> value)
{
    m_PriceRecommendations = value;
}



std::vector<SkuBidRecommendationItemDTO> createSkuBidRecommendationItemDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SkuBidRecommendationItemDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(SkuBidRecommendationItemDTO(child.second));
    }

    return vec;
}

}
}
}
}

