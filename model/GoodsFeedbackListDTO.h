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
 * GoodsFeedbackListDTO.h
 *
 * Список отзывов о товарах. 
 */

#ifndef GoodsFeedbackListDTO_H_
#define GoodsFeedbackListDTO_H_



#include "ForwardScrollingPagerDTO.h"
#include "GoodsFeedbackDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Список отзывов о товарах. 
/// </summary>
class  GoodsFeedbackListDTO 
{
public:
    GoodsFeedbackListDTO() = default;
    explicit GoodsFeedbackListDTO(boost::property_tree::ptree const& pt);
    virtual ~GoodsFeedbackListDTO() = default;

    GoodsFeedbackListDTO(const GoodsFeedbackListDTO& other) = default; // copy constructor
    GoodsFeedbackListDTO(GoodsFeedbackListDTO&& other) noexcept = default; // move constructor

    GoodsFeedbackListDTO& operator=(const GoodsFeedbackListDTO& other) = default; // copy assignment
    GoodsFeedbackListDTO& operator=(GoodsFeedbackListDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GoodsFeedbackListDTO members

    /// <summary>
    /// Список отзывов.
    /// </summary>
    std::vector<GoodsFeedbackDTO> getFeedbacks() const;
    void setFeedbacks(std::vector<GoodsFeedbackDTO> value);

    /// <summary>
    /// 
    /// </summary>
    ForwardScrollingPagerDTO getPaging() const;
    void setPaging(ForwardScrollingPagerDTO value);

protected:
    std::vector<GoodsFeedbackDTO> m_Feedbacks;
    ForwardScrollingPagerDTO m_Paging;
};

std::vector<GoodsFeedbackListDTO> createGoodsFeedbackListDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GoodsFeedbackListDTO>(const GoodsFeedbackListDTO& val) {
    return val.toPropertyTree();
}

template<>
inline GoodsFeedbackListDTO fromPt<GoodsFeedbackListDTO>(const boost::property_tree::ptree& pt) {
    GoodsFeedbackListDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GoodsFeedbackListDTO_H_ */
