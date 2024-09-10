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



#include "ProvideOrderDigitalCodesRequest.h"

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

ProvideOrderDigitalCodesRequest::ProvideOrderDigitalCodesRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string ProvideOrderDigitalCodesRequest::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void ProvideOrderDigitalCodesRequest::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree ProvideOrderDigitalCodesRequest::toPropertyTree()
{
    return toPropertyTree_internal();
}

void ProvideOrderDigitalCodesRequest::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string ProvideOrderDigitalCodesRequest::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void ProvideOrderDigitalCodesRequest::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ProvideOrderDigitalCodesRequest::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Items
	if (!m_Items.empty()) {
		for (const auto &childEntry : m_Items) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("items", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ProvideOrderDigitalCodesRequest::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Items into member vector
	if (pt.get_child_optional("items")) {
		for (const auto &childTree : pt.get_child("items")) {
            std::shared_ptr<OrderDigitalItemDTO> val =
                std::make_shared<OrderDigitalItemDTO>(childTree.second);
            m_Items.emplace_back(std::move(val));
		}
	}
}

std::vector<std::shared_ptr<OrderDigitalItemDTO>> ProvideOrderDigitalCodesRequest::getItems() const
{
    return m_Items;
}

void ProvideOrderDigitalCodesRequest::setItems(std::vector<std::shared_ptr<OrderDigitalItemDTO>> value)
{
	m_Items = value;
}

std::vector<ProvideOrderDigitalCodesRequest> createProvideOrderDigitalCodesRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ProvideOrderDigitalCodesRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(ProvideOrderDigitalCodesRequest(child.second));
    }

    return vec;
}

}
}
}
}

