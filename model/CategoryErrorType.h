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
 * CategoryErrorType.h
 *
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_IS_NOT_LEAF&#x60; — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 */

#ifndef CategoryErrorType_H_
#define CategoryErrorType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_IS_NOT_LEAF&#x60; — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
/// </summary>
class  CategoryErrorType 
{
public:
    CategoryErrorType() = default;
    explicit CategoryErrorType(boost::property_tree::ptree const& pt);
    virtual ~CategoryErrorType() = default;

    CategoryErrorType(const CategoryErrorType& other) = default; // copy constructor
    CategoryErrorType(CategoryErrorType&& other) noexcept = default; // move constructor

    CategoryErrorType& operator=(const CategoryErrorType& other) = default; // copy assignment
    CategoryErrorType& operator=(CategoryErrorType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// CategoryErrorType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_CategoryErrorTypeEnumValue;
};

std::vector<CategoryErrorType> createCategoryErrorTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CategoryErrorType>(const CategoryErrorType& val) {
    return val.toPropertyTree();
}

template<>
inline CategoryErrorType fromPt<CategoryErrorType>(const boost::property_tree::ptree& pt) {
    CategoryErrorType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CategoryErrorType_H_ */
