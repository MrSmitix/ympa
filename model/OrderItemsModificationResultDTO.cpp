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



#include "OrderItemsModificationResultDTO.h"

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

OrderItemsModificationResultDTO::OrderItemsModificationResultDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OrderItemsModificationResultDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OrderItemsModificationResultDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OrderItemsModificationResultDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OrderItemsModificationResultDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OrderItemsModificationResultDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OrderItemsModificationResultDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OrderItemsModificationResultDTO::toPropertyTree_internal()
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

void OrderItemsModificationResultDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Items into member vector
	if (pt.get_child_optional("items")) {
		for (const auto &childTree : pt.get_child("items")) {
            std::shared_ptr<BriefOrderItemDTO> val =
                std::make_shared<BriefOrderItemDTO>(childTree.second);
            m_Items.emplace_back(std::move(val));
		}
	}
}

std::vector<std::shared_ptr<BriefOrderItemDTO>> OrderItemsModificationResultDTO::getItems() const
{
    return m_Items;
}

void OrderItemsModificationResultDTO::setItems(std::vector<std::shared_ptr<BriefOrderItemDTO>> value)
{
	m_Items = value;
}

std::vector<OrderItemsModificationResultDTO> createOrderItemsModificationResultDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OrderItemsModificationResultDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OrderItemsModificationResultDTO(child.second));
    }

    return vec;
}

}
}
}
}

