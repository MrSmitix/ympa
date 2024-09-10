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



#include "UpdateStocksRequest.h"

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

UpdateStocksRequest::UpdateStocksRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string UpdateStocksRequest::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void UpdateStocksRequest::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree UpdateStocksRequest::toPropertyTree()
{
    return toPropertyTree_internal();
}

void UpdateStocksRequest::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string UpdateStocksRequest::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void UpdateStocksRequest::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UpdateStocksRequest::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Skus
	if (!m_Skus.empty()) {
		for (const auto &childEntry : m_Skus) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("skus", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void UpdateStocksRequest::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Skus into member vector
	if (pt.get_child_optional("skus")) {
		for (const auto &childTree : pt.get_child("skus")) {
            std::shared_ptr<UpdateStockDTO> val =
                std::make_shared<UpdateStockDTO>(childTree.second);
            m_Skus.emplace_back(std::move(val));
		}
	}
}

Set<std::shared_ptr<UpdateStockDTO>> UpdateStocksRequest::getSkus() const
{
    return m_Skus;
}

void UpdateStocksRequest::setSkus(Set<std::shared_ptr<UpdateStockDTO>> value)
{
	m_Skus = value;
}

std::vector<UpdateStocksRequest> createUpdateStocksRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<UpdateStocksRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(UpdateStocksRequest(child.second));
    }

    return vec;
}

}
}
}
}

