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



#include "AddOffersToArchiveErrorDTO.h"

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

AddOffersToArchiveErrorDTO::AddOffersToArchiveErrorDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string AddOffersToArchiveErrorDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void AddOffersToArchiveErrorDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree AddOffersToArchiveErrorDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void AddOffersToArchiveErrorDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string AddOffersToArchiveErrorDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void AddOffersToArchiveErrorDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AddOffersToArchiveErrorDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("offerId", m_OfferId);
	return pt;
}

void AddOffersToArchiveErrorDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_OfferId = pt.get("offerId", "");
}

std::string AddOffersToArchiveErrorDTO::getOfferId() const
{
    return m_OfferId;
}

void AddOffersToArchiveErrorDTO::setOfferId(std::string value)
{
	m_OfferId = value;
}
std::shared_ptr<AddOffersToArchiveErrorType> AddOffersToArchiveErrorDTO::getError() const
{
    return m_Error;
}

void AddOffersToArchiveErrorDTO::setError(std::shared_ptr<AddOffersToArchiveErrorType> value)
{
	m_Error = value;
}

std::vector<AddOffersToArchiveErrorDTO> createAddOffersToArchiveErrorDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AddOffersToArchiveErrorDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(AddOffersToArchiveErrorDTO(child.second));
    }

    return vec;
}

}
}
}
}

