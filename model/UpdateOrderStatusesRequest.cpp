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



#include "UpdateOrderStatusesRequest.h"

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

UpdateOrderStatusesRequest::UpdateOrderStatusesRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string UpdateOrderStatusesRequest::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void UpdateOrderStatusesRequest::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree UpdateOrderStatusesRequest::toPropertyTree()
{
    return toPropertyTree_internal();
}

void UpdateOrderStatusesRequest::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string UpdateOrderStatusesRequest::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void UpdateOrderStatusesRequest::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UpdateOrderStatusesRequest::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Orders
	if (!m_Orders.empty()) {
		for (const auto &childEntry : m_Orders) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("orders", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void UpdateOrderStatusesRequest::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Orders into member vector
	if (pt.get_child_optional("orders")) {
		for (const auto &childTree : pt.get_child("orders")) {
            std::shared_ptr<OrderStateDTO> val =
                std::make_shared<OrderStateDTO>(childTree.second);
            m_Orders.emplace_back(std::move(val));
		}
	}
}

std::vector<std::shared_ptr<OrderStateDTO>> UpdateOrderStatusesRequest::getOrders() const
{
    return m_Orders;
}

void UpdateOrderStatusesRequest::setOrders(std::vector<std::shared_ptr<OrderStateDTO>> value)
{
	m_Orders = value;
}

std::vector<UpdateOrderStatusesRequest> createUpdateOrderStatusesRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<UpdateOrderStatusesRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(UpdateOrderStatusesRequest(child.second));
    }

    return vec;
}

}
}
}
}

