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



#include "GetPriceWithDiscountDTO.h"

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

GetPriceWithDiscountDTO::GetPriceWithDiscountDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetPriceWithDiscountDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetPriceWithDiscountDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetPriceWithDiscountDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetPriceWithDiscountDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetPriceWithDiscountDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetPriceWithDiscountDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetPriceWithDiscountDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("value", m_Value);
	pt.put("discountBase", m_DiscountBase);
	pt.put("updatedAt", m_UpdatedAt);
	return pt;
}

void GetPriceWithDiscountDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Value = pt.get("value", 0.0);
	m_DiscountBase = pt.get("discountBase", 0.0);
	m_UpdatedAt = pt.get("updatedAt", "");
}

double GetPriceWithDiscountDTO::getValue() const
{
    return m_Value;
}

void GetPriceWithDiscountDTO::setValue(double value)
{
	m_Value = value;
}
std::shared_ptr<CurrencyType> GetPriceWithDiscountDTO::getCurrencyId() const
{
    return m_CurrencyId;
}

void GetPriceWithDiscountDTO::setCurrencyId(std::shared_ptr<CurrencyType> value)
{
	m_CurrencyId = value;
}
double GetPriceWithDiscountDTO::getDiscountBase() const
{
    return m_DiscountBase;
}

void GetPriceWithDiscountDTO::setDiscountBase(double value)
{
	m_DiscountBase = value;
}
std::string GetPriceWithDiscountDTO::getUpdatedAt() const
{
    return m_UpdatedAt;
}

void GetPriceWithDiscountDTO::setUpdatedAt(std::string value)
{
	m_UpdatedAt = value;
}

std::vector<GetPriceWithDiscountDTO> createGetPriceWithDiscountDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetPriceWithDiscountDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(GetPriceWithDiscountDTO(child.second));
    }

    return vec;
}

}
}
}
}

