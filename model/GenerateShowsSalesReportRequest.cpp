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



#include "GenerateShowsSalesReportRequest.h"

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

GenerateShowsSalesReportRequest::GenerateShowsSalesReportRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GenerateShowsSalesReportRequest::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GenerateShowsSalesReportRequest::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GenerateShowsSalesReportRequest::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GenerateShowsSalesReportRequest::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GenerateShowsSalesReportRequest::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GenerateShowsSalesReportRequest::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GenerateShowsSalesReportRequest::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("businessId", m_BusinessId);
	pt.put("campaignId", m_CampaignId);
	pt.put("dateFrom", m_DateFrom);
	pt.put("dateTo", m_DateTo);
	return pt;
}

void GenerateShowsSalesReportRequest::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_BusinessId = pt.get("businessId", 0L);
	m_CampaignId = pt.get("campaignId", 0L);
	m_DateFrom = pt.get("dateFrom", "");
	m_DateTo = pt.get("dateTo", "");
}

int64_t GenerateShowsSalesReportRequest::getBusinessId() const
{
    return m_BusinessId;
}

void GenerateShowsSalesReportRequest::setBusinessId(int64_t value)
{
	m_BusinessId = value;
}
int64_t GenerateShowsSalesReportRequest::getCampaignId() const
{
    return m_CampaignId;
}

void GenerateShowsSalesReportRequest::setCampaignId(int64_t value)
{
	m_CampaignId = value;
}
std::string GenerateShowsSalesReportRequest::getDateFrom() const
{
    return m_DateFrom;
}

void GenerateShowsSalesReportRequest::setDateFrom(std::string value)
{
	m_DateFrom = value;
}
std::string GenerateShowsSalesReportRequest::getDateTo() const
{
    return m_DateTo;
}

void GenerateShowsSalesReportRequest::setDateTo(std::string value)
{
	m_DateTo = value;
}
std::shared_ptr<ShowsSalesGroupingType> GenerateShowsSalesReportRequest::getGrouping() const
{
    return m_Grouping;
}

void GenerateShowsSalesReportRequest::setGrouping(std::shared_ptr<ShowsSalesGroupingType> value)
{
	m_Grouping = value;
}

std::vector<GenerateShowsSalesReportRequest> createGenerateShowsSalesReportRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GenerateShowsSalesReportRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(GenerateShowsSalesReportRequest(child.second));
    }

    return vec;
}

}
}
}
}

