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
 * CategoryErrorDTO.h
 *
 * Текст ошибки.
 */

#ifndef CategoryErrorDTO_H_
#define CategoryErrorDTO_H_



#include "CategoryErrorType.h"
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
/// Текст ошибки.
/// </summary>
class  CategoryErrorDTO 
{
public:
    CategoryErrorDTO() = default;
    explicit CategoryErrorDTO(boost::property_tree::ptree const& pt);
    virtual ~CategoryErrorDTO() = default;

    CategoryErrorDTO(const CategoryErrorDTO& other) = default; // copy constructor
    CategoryErrorDTO(CategoryErrorDTO&& other) noexcept = default; // move constructor

    CategoryErrorDTO& operator=(const CategoryErrorDTO& other) = default; // copy assignment
    CategoryErrorDTO& operator=(CategoryErrorDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CategoryErrorDTO members

    /// <summary>
    /// Идентификатор категории.
    /// </summary>
    int64_t getCategoryId() const;
    void setCategoryId(int64_t value);

    /// <summary>
    /// 
    /// </summary>
    CategoryErrorType getType() const;
    void setType(CategoryErrorType value);

protected:
    int64_t m_CategoryId = 0L;
    CategoryErrorType m_Type = CategoryErrorType{};
};

std::vector<CategoryErrorDTO> createCategoryErrorDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CategoryErrorDTO>(const CategoryErrorDTO& val) {
    return val.toPropertyTree();
}

template<>
inline CategoryErrorDTO fromPt<CategoryErrorDTO>(const boost::property_tree::ptree& pt) {
    CategoryErrorDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CategoryErrorDTO_H_ */
