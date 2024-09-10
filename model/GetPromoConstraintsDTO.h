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
 * GetPromoConstraintsDTO.h
 *
 * Ограничения в акции.
 */

#ifndef GetPromoConstraintsDTO_H_
#define GetPromoConstraintsDTO_H_



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
/// Ограничения в акции.
/// </summary>
class  GetPromoConstraintsDTO 
{
public:
    GetPromoConstraintsDTO() = default;
    explicit GetPromoConstraintsDTO(boost::property_tree::ptree const& pt);
    virtual ~GetPromoConstraintsDTO() = default;

    GetPromoConstraintsDTO(const GetPromoConstraintsDTO& other) = default; // copy constructor
    GetPromoConstraintsDTO(GetPromoConstraintsDTO&& other) noexcept = default; // move constructor

    GetPromoConstraintsDTO& operator=(const GetPromoConstraintsDTO& other) = default; // copy assignment
    GetPromoConstraintsDTO& operator=(GetPromoConstraintsDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetPromoConstraintsDTO members

    /// <summary>
    /// Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
    /// </summary>
    std::vector<int64_t> getWarehouseIds() const;
    void setWarehouseIds(std::vector<int64_t> value);

protected:
    std::vector<int64_t> m_WarehouseIds;
};

std::vector<GetPromoConstraintsDTO> createGetPromoConstraintsDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetPromoConstraintsDTO>(const GetPromoConstraintsDTO& val) {
    return val.toPropertyTree();
}

template<>
inline GetPromoConstraintsDTO fromPt<GetPromoConstraintsDTO>(const boost::property_tree::ptree& pt) {
    GetPromoConstraintsDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetPromoConstraintsDTO_H_ */
