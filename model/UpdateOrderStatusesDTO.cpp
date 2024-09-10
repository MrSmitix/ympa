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



#include "UpdateOrderStatusesDTO.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

UpdateOrderStatusesDTO::UpdateOrderStatusesDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string UpdateOrderStatusesDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void UpdateOrderStatusesDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UpdateOrderStatusesDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Orders
    tmp_node.clear();
	if (!m_Orders.empty()) {
        tmp_node = toPt(m_Orders);
		pt.add_child("orders", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void UpdateOrderStatusesDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Orders into member
	if (pt.get_child_optional("orders")) {
        m_Orders = fromPt<std::vector<UpdateOrderStatusDTO>>(pt.get_child("orders"));
	}
}

std::vector<UpdateOrderStatusDTO> UpdateOrderStatusesDTO::getOrders() const
{
    return m_Orders;
}

void UpdateOrderStatusesDTO::setOrders(std::vector<UpdateOrderStatusDTO> value)
{
    m_Orders = value;
}



std::vector<UpdateOrderStatusesDTO> createUpdateOrderStatusesDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<UpdateOrderStatusesDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(UpdateOrderStatusesDTO(child.second));
    }

    return vec;
}

}
}
}
}

