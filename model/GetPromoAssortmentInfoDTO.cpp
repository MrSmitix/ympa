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



#include "GetPromoAssortmentInfoDTO.h"

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

GetPromoAssortmentInfoDTO::GetPromoAssortmentInfoDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetPromoAssortmentInfoDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetPromoAssortmentInfoDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetPromoAssortmentInfoDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetPromoAssortmentInfoDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetPromoAssortmentInfoDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetPromoAssortmentInfoDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetPromoAssortmentInfoDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("activeOffers", m_ActiveOffers);
	pt.put("potentialOffers", m_PotentialOffers);
	pt.put("processing", m_Processing);
	return pt;
}

void GetPromoAssortmentInfoDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_ActiveOffers = pt.get("activeOffers", 0);
	m_PotentialOffers = pt.get("potentialOffers", 0);
	m_Processing = pt.get("processing", false);
}

int32_t GetPromoAssortmentInfoDTO::getActiveOffers() const
{
    return m_ActiveOffers;
}

void GetPromoAssortmentInfoDTO::setActiveOffers(int32_t value)
{
	m_ActiveOffers = value;
}
int32_t GetPromoAssortmentInfoDTO::getPotentialOffers() const
{
    return m_PotentialOffers;
}

void GetPromoAssortmentInfoDTO::setPotentialOffers(int32_t value)
{
	m_PotentialOffers = value;
}
bool GetPromoAssortmentInfoDTO::isProcessing() const
{
    return m_Processing;
}

void GetPromoAssortmentInfoDTO::setProcessing(bool value)
{
	m_Processing = value;
}

std::vector<GetPromoAssortmentInfoDTO> createGetPromoAssortmentInfoDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetPromoAssortmentInfoDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(GetPromoAssortmentInfoDTO(child.second));
    }

    return vec;
}

}
}
}
}

