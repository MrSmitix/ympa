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



#include "ApiForbiddenErrorResponse.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

ApiForbiddenErrorResponse::ApiForbiddenErrorResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string ApiForbiddenErrorResponse::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void ApiForbiddenErrorResponse::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree ApiForbiddenErrorResponse::toPropertyTree()
{
    return toPropertyTree_internal();
}

void ApiForbiddenErrorResponse::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string ApiForbiddenErrorResponse::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void ApiForbiddenErrorResponse::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ApiForbiddenErrorResponse::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Errors
	if (!m_Errors.empty()) {
		for (const auto &childEntry : m_Errors) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("errors", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ApiForbiddenErrorResponse::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Errors into member vector
	if (pt.get_child_optional("errors")) {
		for (const auto &childTree : pt.get_child("errors")) {
            std::shared_ptr<ApiErrorDTO> val =
                std::make_shared<ApiErrorDTO>(childTree.second);
            m_Errors.emplace_back(std::move(val));
		}
	}
}

std::shared_ptr<ApiResponseStatusType> ApiForbiddenErrorResponse::getStatus() const
{
    return m_Status;
}

void ApiForbiddenErrorResponse::setStatus(std::shared_ptr<ApiResponseStatusType> value)
{
	m_Status = value;
}
std::vector<std::shared_ptr<ApiErrorDTO>> ApiForbiddenErrorResponse::getErrors() const
{
    return m_Errors;
}

void ApiForbiddenErrorResponse::setErrors(std::vector<std::shared_ptr<ApiErrorDTO>> value)
{
	m_Errors = value;
}

std::vector<ApiForbiddenErrorResponse> createApiForbiddenErrorResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ApiForbiddenErrorResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(ApiForbiddenErrorResponse(child.second));
    }

    return vec;
}

}
}
}
}

