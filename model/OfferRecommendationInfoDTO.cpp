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



#include "OfferRecommendationInfoDTO.h"

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

OfferRecommendationInfoDTO::OfferRecommendationInfoDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string OfferRecommendationInfoDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void OfferRecommendationInfoDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OfferRecommendationInfoDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("offerId", m_OfferId);
	pt.add_child("recommendedCofinancePrice", m_RecommendedCofinancePrice.toPropertyTree());
	pt.add_child("competitivenessThresholds", m_CompetitivenessThresholds.toPropertyTree());
	return pt;
}

void OfferRecommendationInfoDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_OfferId = pt.get("offerId", "");
	if (pt.get_child_optional("recommendedCofinancePrice")) {
        m_RecommendedCofinancePrice = fromPt<BasePriceDTO>(pt.get_child("recommendedCofinancePrice"));
	}
	if (pt.get_child_optional("competitivenessThresholds")) {
        m_CompetitivenessThresholds = fromPt<PriceCompetitivenessThresholdsDTO>(pt.get_child("competitivenessThresholds"));
	}
}

std::string OfferRecommendationInfoDTO::getOfferId() const
{
    return m_OfferId;
}

void OfferRecommendationInfoDTO::setOfferId(std::string value)
{
    m_OfferId = value;
}


BasePriceDTO OfferRecommendationInfoDTO::getRecommendedCofinancePrice() const
{
    return m_RecommendedCofinancePrice;
}

void OfferRecommendationInfoDTO::setRecommendedCofinancePrice(BasePriceDTO value)
{
    m_RecommendedCofinancePrice = value;
}


PriceCompetitivenessThresholdsDTO OfferRecommendationInfoDTO::getCompetitivenessThresholds() const
{
    return m_CompetitivenessThresholds;
}

void OfferRecommendationInfoDTO::setCompetitivenessThresholds(PriceCompetitivenessThresholdsDTO value)
{
    m_CompetitivenessThresholds = value;
}



std::vector<OfferRecommendationInfoDTO> createOfferRecommendationInfoDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OfferRecommendationInfoDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OfferRecommendationInfoDTO(child.second));
    }

    return vec;
}

}
}
}
}

