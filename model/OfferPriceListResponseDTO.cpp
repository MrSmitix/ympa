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



#include "OfferPriceListResponseDTO.h"

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

OfferPriceListResponseDTO::OfferPriceListResponseDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string OfferPriceListResponseDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void OfferPriceListResponseDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OfferPriceListResponseDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Offers
    tmp_node.clear();
	if (!m_Offers.empty()) {
        tmp_node = toPt(m_Offers);
		pt.add_child("offers", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("paging", m_Paging.toPropertyTree());
	pt.put("total", m_Total);
	return pt;
}

void OfferPriceListResponseDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Offers into member
	if (pt.get_child_optional("offers")) {
        m_Offers = fromPt<std::vector<OfferPriceResponseDTO>>(pt.get_child("offers"));
	}
	if (pt.get_child_optional("paging")) {
        m_Paging = fromPt<ScrollingPagerDTO>(pt.get_child("paging"));
	}
	m_Total = pt.get("total", 0);
}

std::vector<OfferPriceResponseDTO> OfferPriceListResponseDTO::getOffers() const
{
    return m_Offers;
}

void OfferPriceListResponseDTO::setOffers(std::vector<OfferPriceResponseDTO> value)
{
    m_Offers = value;
}


ScrollingPagerDTO OfferPriceListResponseDTO::getPaging() const
{
    return m_Paging;
}

void OfferPriceListResponseDTO::setPaging(ScrollingPagerDTO value)
{
    m_Paging = value;
}


int32_t OfferPriceListResponseDTO::getTotal() const
{
    return m_Total;
}

void OfferPriceListResponseDTO::setTotal(int32_t value)
{
    m_Total = value;
}



std::vector<OfferPriceListResponseDTO> createOfferPriceListResponseDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OfferPriceListResponseDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OfferPriceListResponseDTO(child.second));
    }

    return vec;
}

}
}
}
}

