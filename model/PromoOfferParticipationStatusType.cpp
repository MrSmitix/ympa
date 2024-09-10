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



#include "PromoOfferParticipationStatusType.h"

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

PromoOfferParticipationStatusType::PromoOfferParticipationStatusType(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string PromoOfferParticipationStatusType::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void PromoOfferParticipationStatusType::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree PromoOfferParticipationStatusType::toPropertyTree()
{
    return toPropertyTree_internal();
}

void PromoOfferParticipationStatusType::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string PromoOfferParticipationStatusType::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void PromoOfferParticipationStatusType::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree PromoOfferParticipationStatusType::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void PromoOfferParticipationStatusType::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
}


std::vector<PromoOfferParticipationStatusType> createPromoOfferParticipationStatusTypeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<PromoOfferParticipationStatusType>();
    for (const auto& child: pt) {
        vec.emplace_back(PromoOfferParticipationStatusType(child.second));
    }

    return vec;
}

}
}
}
}

