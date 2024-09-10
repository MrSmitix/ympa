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



#include "OrderItemsModificationRequestReasonType.h"

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

OrderItemsModificationRequestReasonType::OrderItemsModificationRequestReasonType(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OrderItemsModificationRequestReasonType::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OrderItemsModificationRequestReasonType::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OrderItemsModificationRequestReasonType::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OrderItemsModificationRequestReasonType::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OrderItemsModificationRequestReasonType::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OrderItemsModificationRequestReasonType::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OrderItemsModificationRequestReasonType::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void OrderItemsModificationRequestReasonType::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
}


std::vector<OrderItemsModificationRequestReasonType> createOrderItemsModificationRequestReasonTypeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OrderItemsModificationRequestReasonType>();
    for (const auto& child: pt) {
        vec.emplace_back(OrderItemsModificationRequestReasonType(child.second));
    }

    return vec;
}

}
}
}
}

