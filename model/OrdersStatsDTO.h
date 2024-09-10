/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * OrdersStatsDTO.h
 *
 * Информация по заказам.
 */

#ifndef OrdersStatsDTO_H_
#define OrdersStatsDTO_H_


#include "ForwardScrollingPagerDTO.h"
#include "OrdersStatsOrderDTO.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация по заказам.
/// </summary>
class  OrdersStatsDTO
{
public:
    OrdersStatsDTO();
    virtual ~OrdersStatsDTO() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const OrdersStatsDTO& rhs) const;
    bool operator!=(const OrdersStatsDTO& rhs) const;

    /////////////////////////////////////////////
    /// OrdersStatsDTO members

    /// <summary>
    /// Список заказов.
    /// </summary>
    std::vector<org::openapitools::server::model::OrdersStatsOrderDTO> getOrders() const;
    void setOrders(std::vector<org::openapitools::server::model::OrdersStatsOrderDTO> const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ForwardScrollingPagerDTO getPaging() const;
    void setPaging(org::openapitools::server::model::ForwardScrollingPagerDTO const& value);
    bool pagingIsSet() const;
    void unsetPaging();

    friend  void to_json(nlohmann::json& j, const OrdersStatsDTO& o);
    friend  void from_json(const nlohmann::json& j, OrdersStatsDTO& o);
protected:
    std::vector<org::openapitools::server::model::OrdersStatsOrderDTO> m_Orders;

    org::openapitools::server::model::ForwardScrollingPagerDTO m_Paging;
    bool m_PagingIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OrdersStatsDTO_H_ */
