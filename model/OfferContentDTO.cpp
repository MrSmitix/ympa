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



#include "OfferContentDTO.h"

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

OfferContentDTO::OfferContentDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OfferContentDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OfferContentDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OfferContentDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OfferContentDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OfferContentDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OfferContentDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OfferContentDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("offerId", m_OfferId);
	pt.put("categoryId", m_CategoryId);
	// generate tree for ParameterValues
	if (!m_ParameterValues.empty()) {
		for (const auto &childEntry : m_ParameterValues) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("parameterValues", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void OfferContentDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_OfferId = pt.get("offerId", "");
	m_CategoryId = pt.get("categoryId", 0);
	// push all items of ParameterValues into member vector
	if (pt.get_child_optional("parameterValues")) {
		for (const auto &childTree : pt.get_child("parameterValues")) {
            std::shared_ptr<ParameterValueDTO> val =
                std::make_shared<ParameterValueDTO>(childTree.second);
            m_ParameterValues.emplace_back(std::move(val));
		}
	}
}

std::string OfferContentDTO::getOfferId() const
{
    return m_OfferId;
}

void OfferContentDTO::setOfferId(std::string value)
{
	m_OfferId = value;
}
int32_t OfferContentDTO::getCategoryId() const
{
    return m_CategoryId;
}

void OfferContentDTO::setCategoryId(int32_t value)
{
	m_CategoryId = value;
}
std::vector<std::shared_ptr<ParameterValueDTO>> OfferContentDTO::getParameterValues() const
{
    return m_ParameterValues;
}

void OfferContentDTO::setParameterValues(std::vector<std::shared_ptr<ParameterValueDTO>> value)
{
	m_ParameterValues = value;
}

std::vector<OfferContentDTO> createOfferContentDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OfferContentDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OfferContentDTO(child.second));
    }

    return vec;
}

}
}
}
}

