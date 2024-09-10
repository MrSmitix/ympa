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



#include "FeedDownloadDTO.h"

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

FeedDownloadDTO::FeedDownloadDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string FeedDownloadDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void FeedDownloadDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree FeedDownloadDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void FeedDownloadDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string FeedDownloadDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void FeedDownloadDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree FeedDownloadDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_Error != nullptr) {
		pt.add_child("error", m_Error->toPropertyTree());
	}
	return pt;
}

void FeedDownloadDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("error")) {
		m_Error = std::make_shared<FeedDownloadErrorDTO>();
		m_Error->fromPropertyTree(pt.get_child("error"));
	}
}

std::shared_ptr<FeedStatusType> FeedDownloadDTO::getStatus() const
{
    return m_Status;
}

void FeedDownloadDTO::setStatus(std::shared_ptr<FeedStatusType> value)
{
	m_Status = value;
}
std::shared_ptr<FeedDownloadErrorDTO> FeedDownloadDTO::getError() const
{
    return m_Error;
}

void FeedDownloadDTO::setError(std::shared_ptr<FeedDownloadErrorDTO> value)
{
	m_Error = value;
}

std::vector<FeedDownloadDTO> createFeedDownloadDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<FeedDownloadDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(FeedDownloadDTO(child.second));
    }

    return vec;
}

}
}
}
}

