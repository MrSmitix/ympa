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
 * PromoPeriodDTO.h
 *
 * Время проведения акции.
 */

#ifndef PromoPeriodDTO_H_
#define PromoPeriodDTO_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Время проведения акции.
/// </summary>
class  PromoPeriodDTO 
{
public:
    PromoPeriodDTO() = default;
    explicit PromoPeriodDTO(boost::property_tree::ptree const& pt);
    virtual ~PromoPeriodDTO() = default;

    PromoPeriodDTO(const PromoPeriodDTO& other) = default; // copy constructor
    PromoPeriodDTO(PromoPeriodDTO&& other) noexcept = default; // move constructor

    PromoPeriodDTO& operator=(const PromoPeriodDTO& other) = default; // copy assignment
    PromoPeriodDTO& operator=(PromoPeriodDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// PromoPeriodDTO members

    /// <summary>
    /// Дата и время начала акции.
    /// </summary>
    std::string getDateTimeFrom() const;
    void setDateTimeFrom(std::string value);

    /// <summary>
    /// Дата и время окончания акции.
    /// </summary>
    std::string getDateTimeTo() const;
    void setDateTimeTo(std::string value);

protected:
    std::string m_DateTimeFrom = "";
    std::string m_DateTimeTo = "";
};

std::vector<PromoPeriodDTO> createPromoPeriodDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<PromoPeriodDTO>(const PromoPeriodDTO& val) {
    return val.toPropertyTree();
}

template<>
inline PromoPeriodDTO fromPt<PromoPeriodDTO>(const boost::property_tree::ptree& pt) {
    PromoPeriodDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* PromoPeriodDTO_H_ */
