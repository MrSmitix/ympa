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
 * FlippingPagerDTO.h
 *
 * Модель для пагинации.
 */

#ifndef FlippingPagerDTO_H_
#define FlippingPagerDTO_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Модель для пагинации.
/// </summary>
class  FlippingPagerDTO 
{
public:
    FlippingPagerDTO() = default;
    explicit FlippingPagerDTO(boost::property_tree::ptree const& pt);
    virtual ~FlippingPagerDTO() = default;

    FlippingPagerDTO(const FlippingPagerDTO& other) = default; // copy constructor
    FlippingPagerDTO(FlippingPagerDTO&& other) noexcept = default; // move constructor

    FlippingPagerDTO& operator=(const FlippingPagerDTO& other) = default; // copy assignment
    FlippingPagerDTO& operator=(FlippingPagerDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FlippingPagerDTO members

    /// <summary>
    /// Сколько всего найдено элементов.
    /// </summary>
    int32_t getTotal() const;
    void setTotal(int32_t value);

    /// <summary>
    /// Начальный номер найденного элемента на странице.
    /// </summary>
    int32_t getFrom() const;
    void setFrom(int32_t value);

    /// <summary>
    /// Конечный номер найденного элемента на странице.
    /// </summary>
    int32_t getTo() const;
    void setTo(int32_t value);

    /// <summary>
    /// Текущая страница.
    /// </summary>
    int32_t getCurrentPage() const;
    void setCurrentPage(int32_t value);

    /// <summary>
    /// Общее количество страниц.
    /// </summary>
    int32_t getPagesCount() const;
    void setPagesCount(int32_t value);

    /// <summary>
    /// Размер страницы.
    /// </summary>
    int32_t getPageSize() const;
    void setPageSize(int32_t value);

protected:
    int32_t m_Total = 0;
    int32_t m_From = 0;
    int32_t m_To = 0;
    int32_t m_CurrentPage = 0;
    int32_t m_PagesCount = 0;
    int32_t m_PageSize = 0;
};

std::vector<FlippingPagerDTO> createFlippingPagerDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FlippingPagerDTO>(const FlippingPagerDTO& val) {
    return val.toPropertyTree();
}

template<>
inline FlippingPagerDTO fromPt<FlippingPagerDTO>(const boost::property_tree::ptree& pt) {
    FlippingPagerDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FlippingPagerDTO_H_ */
