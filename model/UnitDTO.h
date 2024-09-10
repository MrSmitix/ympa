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
 * UnitDTO.h
 *
 * Единица измерения.
 */

#ifndef UnitDTO_H_
#define UnitDTO_H_



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
/// Единица измерения.
/// </summary>
class  UnitDTO 
{
public:
    UnitDTO() = default;
    explicit UnitDTO(boost::property_tree::ptree const& pt);
    virtual ~UnitDTO() = default;

    UnitDTO(const UnitDTO& other) = default; // copy constructor
    UnitDTO(UnitDTO&& other) noexcept = default; // move constructor

    UnitDTO& operator=(const UnitDTO& other) = default; // copy assignment
    UnitDTO& operator=(UnitDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UnitDTO members

    /// <summary>
    /// Идентификатор единицы измерения.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t value);

    /// <summary>
    /// Сокращенное название единицы измерения.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Полное название единицы измерения.
    /// </summary>
    std::string getFullName() const;
    void setFullName(std::string value);

protected:
    int64_t m_Id = 0L;
    std::string m_Name = "";
    std::string m_FullName = "";
};

std::vector<UnitDTO> createUnitDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UnitDTO>(const UnitDTO& val) {
    return val.toPropertyTree();
}

template<>
inline UnitDTO fromPt<UnitDTO>(const boost::property_tree::ptree& pt) {
    UnitDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UnitDTO_H_ */
