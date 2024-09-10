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



#include "UpdateOrderStatusResponse.h"

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

UpdateOrderStatusResponse::UpdateOrderStatusResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string UpdateOrderStatusResponse::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void UpdateOrderStatusResponse::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree UpdateOrderStatusResponse::toPropertyTree()
{
    return toPropertyTree_internal();
}

void UpdateOrderStatusResponse::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string UpdateOrderStatusResponse::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void UpdateOrderStatusResponse::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UpdateOrderStatusResponse::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_Order != nullptr) {
		pt.add_child("order", m_Order->toPropertyTree());
	}
	return pt;
}

void UpdateOrderStatusResponse::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("order")) {
		m_Order = std::make_shared<OrderDTO>();
		m_Order->fromPropertyTree(pt.get_child("order"));
	}
}

std::shared_ptr<OrderDTO> UpdateOrderStatusResponse::getOrder() const
{
    return m_Order;
}

void UpdateOrderStatusResponse::setOrder(std::shared_ptr<OrderDTO> value)
{
	m_Order = value;
}

std::vector<UpdateOrderStatusResponse> createUpdateOrderStatusResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<UpdateOrderStatusResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(UpdateOrderStatusResponse(child.second));
    }

    return vec;
}

}
}
}
}

