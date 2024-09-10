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
 * OrderParcelBoxDTO.h
 *
 * Информация о грузоместе.
 */

#ifndef OrderParcelBoxDTO_H_
#define OrderParcelBoxDTO_H_



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
/// Информация о грузоместе.
/// </summary>
class  OrderParcelBoxDTO 
{
public:
    OrderParcelBoxDTO() = default;
    explicit OrderParcelBoxDTO(boost::property_tree::ptree const& pt);
    virtual ~OrderParcelBoxDTO() = default;

    OrderParcelBoxDTO(const OrderParcelBoxDTO& other) = default; // copy constructor
    OrderParcelBoxDTO(OrderParcelBoxDTO&& other) noexcept = default; // move constructor

    OrderParcelBoxDTO& operator=(const OrderParcelBoxDTO& other) = default; // copy assignment
    OrderParcelBoxDTO& operator=(OrderParcelBoxDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// OrderParcelBoxDTO members

    /// <summary>
    /// Идентификатор грузоместа.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t value);

    /// <summary>
    /// Идентификатор грузового места в информационной системе магазина.
    /// </summary>
    std::string getFulfilmentId() const;
    void setFulfilmentId(std::string value);

protected:
    int64_t m_Id = 0L;
    std::string m_FulfilmentId = "";
};

std::vector<OrderParcelBoxDTO> createOrderParcelBoxDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OrderParcelBoxDTO>(const OrderParcelBoxDTO& val) {
    return val.toPropertyTree();
}

template<>
inline OrderParcelBoxDTO fromPt<OrderParcelBoxDTO>(const boost::property_tree::ptree& pt) {
    OrderParcelBoxDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OrderParcelBoxDTO_H_ */
