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



#include "ParameterValueConstraintsDTO.h"

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

ParameterValueConstraintsDTO::ParameterValueConstraintsDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string ParameterValueConstraintsDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void ParameterValueConstraintsDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree ParameterValueConstraintsDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void ParameterValueConstraintsDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string ParameterValueConstraintsDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void ParameterValueConstraintsDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ParameterValueConstraintsDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("minValue", m_MinValue);
	pt.put("maxValue", m_MaxValue);
	pt.put("maxLength", m_MaxLength);
	return pt;
}

void ParameterValueConstraintsDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_MinValue = pt.get("minValue", 0.0);
	m_MaxValue = pt.get("maxValue", 0.0);
	m_MaxLength = pt.get("maxLength", 0);
}

double ParameterValueConstraintsDTO::getMinValue() const
{
    return m_MinValue;
}

void ParameterValueConstraintsDTO::setMinValue(double value)
{
	m_MinValue = value;
}
double ParameterValueConstraintsDTO::getMaxValue() const
{
    return m_MaxValue;
}

void ParameterValueConstraintsDTO::setMaxValue(double value)
{
	m_MaxValue = value;
}
int32_t ParameterValueConstraintsDTO::getMaxLength() const
{
    return m_MaxLength;
}

void ParameterValueConstraintsDTO::setMaxLength(int32_t value)
{
	m_MaxLength = value;
}

std::vector<ParameterValueConstraintsDTO> createParameterValueConstraintsDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ParameterValueConstraintsDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(ParameterValueConstraintsDTO(child.second));
    }

    return vec;
}

}
}
}
}

