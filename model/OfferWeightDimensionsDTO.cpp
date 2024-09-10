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



#include "OfferWeightDimensionsDTO.h"

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

OfferWeightDimensionsDTO::OfferWeightDimensionsDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OfferWeightDimensionsDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OfferWeightDimensionsDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OfferWeightDimensionsDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OfferWeightDimensionsDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OfferWeightDimensionsDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OfferWeightDimensionsDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OfferWeightDimensionsDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("length", m_Length);
	pt.put("width", m_Width);
	pt.put("height", m_Height);
	pt.put("weight", m_Weight);
	return pt;
}

void OfferWeightDimensionsDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Length = pt.get("length", 0.0);
	m_Width = pt.get("width", 0.0);
	m_Height = pt.get("height", 0.0);
	m_Weight = pt.get("weight", 0.0);
}

double OfferWeightDimensionsDTO::getLength() const
{
    return m_Length;
}

void OfferWeightDimensionsDTO::setLength(double value)
{
	m_Length = value;
}
double OfferWeightDimensionsDTO::getWidth() const
{
    return m_Width;
}

void OfferWeightDimensionsDTO::setWidth(double value)
{
	m_Width = value;
}
double OfferWeightDimensionsDTO::getHeight() const
{
    return m_Height;
}

void OfferWeightDimensionsDTO::setHeight(double value)
{
	m_Height = value;
}
double OfferWeightDimensionsDTO::getWeight() const
{
    return m_Weight;
}

void OfferWeightDimensionsDTO::setWeight(double value)
{
	m_Weight = value;
}

std::vector<OfferWeightDimensionsDTO> createOfferWeightDimensionsDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OfferWeightDimensionsDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OfferWeightDimensionsDTO(child.second));
    }

    return vec;
}

}
}
}
}

