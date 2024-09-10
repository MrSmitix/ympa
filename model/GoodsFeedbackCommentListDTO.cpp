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



#include "GoodsFeedbackCommentListDTO.h"

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

GoodsFeedbackCommentListDTO::GoodsFeedbackCommentListDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string GoodsFeedbackCommentListDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void GoodsFeedbackCommentListDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GoodsFeedbackCommentListDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Comments
    tmp_node.clear();
	if (!m_Comments.empty()) {
        tmp_node = toPt(m_Comments);
		pt.add_child("comments", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("paging", m_Paging.toPropertyTree());
	return pt;
}

void GoodsFeedbackCommentListDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Comments into member
	if (pt.get_child_optional("comments")) {
        m_Comments = fromPt<std::vector<GoodsFeedbackCommentDTO>>(pt.get_child("comments"));
	}
	if (pt.get_child_optional("paging")) {
        m_Paging = fromPt<ForwardScrollingPagerDTO>(pt.get_child("paging"));
	}
}

std::vector<GoodsFeedbackCommentDTO> GoodsFeedbackCommentListDTO::getComments() const
{
    return m_Comments;
}

void GoodsFeedbackCommentListDTO::setComments(std::vector<GoodsFeedbackCommentDTO> value)
{
    m_Comments = value;
}


ForwardScrollingPagerDTO GoodsFeedbackCommentListDTO::getPaging() const
{
    return m_Paging;
}

void GoodsFeedbackCommentListDTO::setPaging(ForwardScrollingPagerDTO value)
{
    m_Paging = value;
}



std::vector<GoodsFeedbackCommentListDTO> createGoodsFeedbackCommentListDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GoodsFeedbackCommentListDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(GoodsFeedbackCommentListDTO(child.second));
    }

    return vec;
}

}
}
}
}

