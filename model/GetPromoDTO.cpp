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



#include "GetPromoDTO.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

GetPromoDTO::GetPromoDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string GetPromoDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void GetPromoDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetPromoDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("name", m_Name);
	pt.add_child("period", m_Period.toPropertyTree());
	pt.put("participating", m_Participating);
	pt.add_child("assortmentInfo", m_AssortmentInfo.toPropertyTree());
	pt.add_child("mechanicsInfo", m_MechanicsInfo.toPropertyTree());
	pt.add_child("bestsellerInfo", m_BestsellerInfo.toPropertyTree());
	// generate tree for Channels
    tmp_node.clear();
	if (!m_Channels.empty()) {
        tmp_node = toPt(m_Channels);
		pt.add_child("channels", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("constraints", m_Constraints.toPropertyTree());
	return pt;
}

void GetPromoDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_Name = pt.get("name", "");
	if (pt.get_child_optional("period")) {
        m_Period = fromPt<PromoPeriodDTO>(pt.get_child("period"));
	}
	m_Participating = pt.get("participating", false);
	if (pt.get_child_optional("assortmentInfo")) {
        m_AssortmentInfo = fromPt<GetPromoAssortmentInfoDTO>(pt.get_child("assortmentInfo"));
	}
	if (pt.get_child_optional("mechanicsInfo")) {
        m_MechanicsInfo = fromPt<GetPromoMechanicsInfoDTO>(pt.get_child("mechanicsInfo"));
	}
	if (pt.get_child_optional("bestsellerInfo")) {
        m_BestsellerInfo = fromPt<GetPromoBestsellerInfoDTO>(pt.get_child("bestsellerInfo"));
	}
	// push all items of Channels into member
	if (pt.get_child_optional("channels")) {
        m_Channels = fromPt<std::vector<ChannelType>>(pt.get_child("channels"));
	}
	if (pt.get_child_optional("constraints")) {
        m_Constraints = fromPt<GetPromoConstraintsDTO>(pt.get_child("constraints"));
	}
}

std::string GetPromoDTO::getId() const
{
    return m_Id;
}

void GetPromoDTO::setId(std::string value)
{
    m_Id = value;
}


std::string GetPromoDTO::getName() const
{
    return m_Name;
}

void GetPromoDTO::setName(std::string value)
{
    m_Name = value;
}


PromoPeriodDTO GetPromoDTO::getPeriod() const
{
    return m_Period;
}

void GetPromoDTO::setPeriod(PromoPeriodDTO value)
{
    m_Period = value;
}


bool GetPromoDTO::isParticipating() const
{
    return m_Participating;
}

void GetPromoDTO::setParticipating(bool value)
{
    m_Participating = value;
}


GetPromoAssortmentInfoDTO GetPromoDTO::getAssortmentInfo() const
{
    return m_AssortmentInfo;
}

void GetPromoDTO::setAssortmentInfo(GetPromoAssortmentInfoDTO value)
{
    m_AssortmentInfo = value;
}


GetPromoMechanicsInfoDTO GetPromoDTO::getMechanicsInfo() const
{
    return m_MechanicsInfo;
}

void GetPromoDTO::setMechanicsInfo(GetPromoMechanicsInfoDTO value)
{
    m_MechanicsInfo = value;
}


GetPromoBestsellerInfoDTO GetPromoDTO::getBestsellerInfo() const
{
    return m_BestsellerInfo;
}

void GetPromoDTO::setBestsellerInfo(GetPromoBestsellerInfoDTO value)
{
    m_BestsellerInfo = value;
}


std::vector<ChannelType> GetPromoDTO::getChannels() const
{
    return m_Channels;
}

void GetPromoDTO::setChannels(std::vector<ChannelType> value)
{
    m_Channels = value;
}


GetPromoConstraintsDTO GetPromoDTO::getConstraints() const
{
    return m_Constraints;
}

void GetPromoDTO::setConstraints(GetPromoConstraintsDTO value)
{
    m_Constraints = value;
}



std::vector<GetPromoDTO> createGetPromoDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetPromoDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(GetPromoDTO(child.second));
    }

    return vec;
}

}
}
}
}

