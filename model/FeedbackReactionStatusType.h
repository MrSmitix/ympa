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
 * FeedbackReactionStatusType.h
 *
 * Статус реакции на отзыв:  * &#x60;ALL&#x60; — все отзывы.  * &#x60;NEED_REACTION&#x60; — отзывы, на которые нужно ответить. 
 */

#ifndef FeedbackReactionStatusType_H_
#define FeedbackReactionStatusType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Статус реакции на отзыв:  * &#x60;ALL&#x60; — все отзывы.  * &#x60;NEED_REACTION&#x60; — отзывы, на которые нужно ответить. 
/// </summary>
class  FeedbackReactionStatusType 
{
public:
    FeedbackReactionStatusType() = default;
    explicit FeedbackReactionStatusType(boost::property_tree::ptree const& pt);
    virtual ~FeedbackReactionStatusType() = default;

    FeedbackReactionStatusType(const FeedbackReactionStatusType& other) = default; // copy constructor
    FeedbackReactionStatusType(FeedbackReactionStatusType&& other) noexcept = default; // move constructor

    FeedbackReactionStatusType& operator=(const FeedbackReactionStatusType& other) = default; // copy assignment
    FeedbackReactionStatusType& operator=(FeedbackReactionStatusType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// FeedbackReactionStatusType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_FeedbackReactionStatusTypeEnumValue;
};

std::vector<FeedbackReactionStatusType> createFeedbackReactionStatusTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FeedbackReactionStatusType>(const FeedbackReactionStatusType& val) {
    return val.toPropertyTree();
}

template<>
inline FeedbackReactionStatusType fromPt<FeedbackReactionStatusType>(const boost::property_tree::ptree& pt) {
    FeedbackReactionStatusType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FeedbackReactionStatusType_H_ */
