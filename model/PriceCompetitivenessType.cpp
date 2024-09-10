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



#include "PriceCompetitivenessType.h"

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

PriceCompetitivenessType::PriceCompetitivenessType(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string PriceCompetitivenessType::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void PriceCompetitivenessType::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree PriceCompetitivenessType::toPropertyTree()
{
    return toPropertyTree_internal();
}

void PriceCompetitivenessType::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string PriceCompetitivenessType::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void PriceCompetitivenessType::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree PriceCompetitivenessType::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void PriceCompetitivenessType::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
}


std::vector<PriceCompetitivenessType> createPriceCompetitivenessTypeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<PriceCompetitivenessType>();
    for (const auto& child: pt) {
        vec.emplace_back(PriceCompetitivenessType(child.second));
    }

    return vec;
}

}
}
}
}

