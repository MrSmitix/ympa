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



#include "ModelsDTO.h"

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

ModelsDTO::ModelsDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string ModelsDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void ModelsDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree ModelsDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void ModelsDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string ModelsDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void ModelsDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ModelsDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Models
	if (!m_Models.empty()) {
		for (const auto &childEntry : m_Models) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("models", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ModelsDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Models into member vector
	if (pt.get_child_optional("models")) {
		for (const auto &childTree : pt.get_child("models")) {
            std::shared_ptr<ModelDTO> val =
                std::make_shared<ModelDTO>(childTree.second);
            m_Models.emplace_back(std::move(val));
		}
	}
}

std::vector<std::shared_ptr<ModelDTO>> ModelsDTO::getModels() const
{
    return m_Models;
}

void ModelsDTO::setModels(std::vector<std::shared_ptr<ModelDTO>> value)
{
	m_Models = value;
}

std::vector<ModelsDTO> createModelsDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ModelsDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(ModelsDTO(child.second));
    }

    return vec;
}

}
}
}
}

