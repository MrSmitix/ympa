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



#include "FeedPublicationPriceAndStockUpdateDTO.h"

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

FeedPublicationPriceAndStockUpdateDTO::FeedPublicationPriceAndStockUpdateDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string FeedPublicationPriceAndStockUpdateDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void FeedPublicationPriceAndStockUpdateDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree FeedPublicationPriceAndStockUpdateDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void FeedPublicationPriceAndStockUpdateDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string FeedPublicationPriceAndStockUpdateDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void FeedPublicationPriceAndStockUpdateDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree FeedPublicationPriceAndStockUpdateDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("fileTime", m_FileTime);
	pt.put("publishedTime", m_PublishedTime);
	return pt;
}

void FeedPublicationPriceAndStockUpdateDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_FileTime = pt.get("fileTime", "");
	m_PublishedTime = pt.get("publishedTime", "");
}

std::string FeedPublicationPriceAndStockUpdateDTO::getFileTime() const
{
    return m_FileTime;
}

void FeedPublicationPriceAndStockUpdateDTO::setFileTime(std::string value)
{
	m_FileTime = value;
}
std::string FeedPublicationPriceAndStockUpdateDTO::getPublishedTime() const
{
    return m_PublishedTime;
}

void FeedPublicationPriceAndStockUpdateDTO::setPublishedTime(std::string value)
{
	m_PublishedTime = value;
}

std::vector<FeedPublicationPriceAndStockUpdateDTO> createFeedPublicationPriceAndStockUpdateDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<FeedPublicationPriceAndStockUpdateDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(FeedPublicationPriceAndStockUpdateDTO(child.second));
    }

    return vec;
}

}
}
}
}

