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



#include "PalletsCountDTO.h"

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

PalletsCountDTO::PalletsCountDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string PalletsCountDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void PalletsCountDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree PalletsCountDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void PalletsCountDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string PalletsCountDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void PalletsCountDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree PalletsCountDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("planned", m_Planned);
	pt.put("fact", m_Fact);
	return pt;
}

void PalletsCountDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Planned = pt.get("planned", 0);
	m_Fact = pt.get("fact", 0);
}

int32_t PalletsCountDTO::getPlanned() const
{
    return m_Planned;
}

void PalletsCountDTO::setPlanned(int32_t value)
{
	m_Planned = value;
}
int32_t PalletsCountDTO::getFact() const
{
    return m_Fact;
}

void PalletsCountDTO::setFact(int32_t value)
{
	m_Fact = value;
}

std::vector<PalletsCountDTO> createPalletsCountDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<PalletsCountDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(PalletsCountDTO(child.second));
    }

    return vec;
}

}
}
}
}

