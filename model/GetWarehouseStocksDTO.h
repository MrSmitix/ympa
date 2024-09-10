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
 * GetWarehouseStocksDTO.h
 *
 * Список складов с информацией об остатках на каждом из них.
 */

#ifndef GetWarehouseStocksDTO_H_
#define GetWarehouseStocksDTO_H_


#include "ScrollingPagerDTO.h"
#include <vector>
#include "WarehouseOffersDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Список складов с информацией об остатках на каждом из них.
/// </summary>
class  GetWarehouseStocksDTO
{
public:
    GetWarehouseStocksDTO();
    virtual ~GetWarehouseStocksDTO() = default;


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

    bool operator==(const GetWarehouseStocksDTO& rhs) const;
    bool operator!=(const GetWarehouseStocksDTO& rhs) const;

    /////////////////////////////////////////////
    /// GetWarehouseStocksDTO members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ScrollingPagerDTO getPaging() const;
    void setPaging(org::openapitools::server::model::ScrollingPagerDTO const& value);
    bool pagingIsSet() const;
    void unsetPaging();
    /// <summary>
    /// Страница списка складов.
    /// </summary>
    std::vector<org::openapitools::server::model::WarehouseOffersDTO> getWarehouses() const;
    void setWarehouses(std::vector<org::openapitools::server::model::WarehouseOffersDTO> const& value);

    friend  void to_json(nlohmann::json& j, const GetWarehouseStocksDTO& o);
    friend  void from_json(const nlohmann::json& j, GetWarehouseStocksDTO& o);
protected:
    org::openapitools::server::model::ScrollingPagerDTO m_Paging;
    bool m_PagingIsSet;
    std::vector<org::openapitools::server::model::WarehouseOffersDTO> m_Warehouses;

    
};

} // namespace org::openapitools::server::model

#endif /* GetWarehouseStocksDTO_H_ */
