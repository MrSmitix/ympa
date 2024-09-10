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



#include "PriceCompetitivenessThresholdsDTO.h"

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

PriceCompetitivenessThresholdsDTO::PriceCompetitivenessThresholdsDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string PriceCompetitivenessThresholdsDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void PriceCompetitivenessThresholdsDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree PriceCompetitivenessThresholdsDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void PriceCompetitivenessThresholdsDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string PriceCompetitivenessThresholdsDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void PriceCompetitivenessThresholdsDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree PriceCompetitivenessThresholdsDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_OptimalPrice != nullptr) {
		pt.add_child("optimalPrice", m_OptimalPrice->toPropertyTree());
	}
	if (m_AveragePrice != nullptr) {
		pt.add_child("averagePrice", m_AveragePrice->toPropertyTree());
	}
	return pt;
}

void PriceCompetitivenessThresholdsDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("optimalPrice")) {
		m_OptimalPrice = std::make_shared<BasePriceDTO>();
		m_OptimalPrice->fromPropertyTree(pt.get_child("optimalPrice"));
	}
	if (pt.get_child_optional("averagePrice")) {
		m_AveragePrice = std::make_shared<BasePriceDTO>();
		m_AveragePrice->fromPropertyTree(pt.get_child("averagePrice"));
	}
}

std::shared_ptr<BasePriceDTO> PriceCompetitivenessThresholdsDTO::getOptimalPrice() const
{
    return m_OptimalPrice;
}

void PriceCompetitivenessThresholdsDTO::setOptimalPrice(std::shared_ptr<BasePriceDTO> value)
{
	m_OptimalPrice = value;
}
std::shared_ptr<BasePriceDTO> PriceCompetitivenessThresholdsDTO::getAveragePrice() const
{
    return m_AveragePrice;
}

void PriceCompetitivenessThresholdsDTO::setAveragePrice(std::shared_ptr<BasePriceDTO> value)
{
	m_AveragePrice = value;
}

std::vector<PriceCompetitivenessThresholdsDTO> createPriceCompetitivenessThresholdsDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<PriceCompetitivenessThresholdsDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(PriceCompetitivenessThresholdsDTO(child.second));
    }

    return vec;
}

}
}
}
}

