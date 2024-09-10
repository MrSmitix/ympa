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



#include "GetModelsRequest.h"

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

GetModelsRequest::GetModelsRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetModelsRequest::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetModelsRequest::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetModelsRequest::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetModelsRequest::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetModelsRequest::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetModelsRequest::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetModelsRequest::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Models
	if (!m_Models.empty()) {
		for (const auto &childEntry : m_Models) {
            ptree Models_node;
            Models_node.put("", childEntry);
            tmp_node.push_back(std::make_pair("", Models_node));
		}
		pt.add_child("models", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void GetModelsRequest::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Models into member vector
	if (pt.get_child_optional("models")) {
		for (const auto &childTree : pt.get_child("models")) {
            int64_t val =
                std::stol(childTree.second.data());
            m_Models.emplace_back(std::move(val));
		}
	}
}

std::vector<int64_t> GetModelsRequest::getModels() const
{
    return m_Models;
}

void GetModelsRequest::setModels(std::vector<int64_t> value)
{
	m_Models = value;
}

std::vector<GetModelsRequest> createGetModelsRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetModelsRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(GetModelsRequest(child.second));
    }

    return vec;
}

}
}
}
}

