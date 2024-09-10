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

/*
 * GoodsFeedbackCommentAuthorDTO.h
 *
 * Информация об авторе комментария.
 */

#ifndef GoodsFeedbackCommentAuthorDTO_H_
#define GoodsFeedbackCommentAuthorDTO_H_



#include <string>
#include "GoodsFeedbackCommentAuthorType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация об авторе комментария.
/// </summary>
class  GoodsFeedbackCommentAuthorDTO 
{
public:
    GoodsFeedbackCommentAuthorDTO() = default;
    explicit GoodsFeedbackCommentAuthorDTO(boost::property_tree::ptree const& pt);
    virtual ~GoodsFeedbackCommentAuthorDTO() = default;

    GoodsFeedbackCommentAuthorDTO(const GoodsFeedbackCommentAuthorDTO& other) = default; // copy constructor
    GoodsFeedbackCommentAuthorDTO(GoodsFeedbackCommentAuthorDTO&& other) noexcept = default; // move constructor

    GoodsFeedbackCommentAuthorDTO& operator=(const GoodsFeedbackCommentAuthorDTO& other) = default; // copy assignment
    GoodsFeedbackCommentAuthorDTO& operator=(GoodsFeedbackCommentAuthorDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GoodsFeedbackCommentAuthorDTO members

    /// <summary>
    /// 
    /// </summary>
    GoodsFeedbackCommentAuthorType getType() const;
    void setType(GoodsFeedbackCommentAuthorType value);

    /// <summary>
    /// Имя автора или название кабинета.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

protected:
    GoodsFeedbackCommentAuthorType m_Type = GoodsFeedbackCommentAuthorType{};
    std::string m_Name = "";
};

std::vector<GoodsFeedbackCommentAuthorDTO> createGoodsFeedbackCommentAuthorDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GoodsFeedbackCommentAuthorDTO>(const GoodsFeedbackCommentAuthorDTO& val) {
    return val.toPropertyTree();
}

template<>
inline GoodsFeedbackCommentAuthorDTO fromPt<GoodsFeedbackCommentAuthorDTO>(const boost::property_tree::ptree& pt) {
    GoodsFeedbackCommentAuthorDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GoodsFeedbackCommentAuthorDTO_H_ */
