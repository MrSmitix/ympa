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
 * WarehouseStockDTO.h
 *
 * Информация об остатках товара.
 */

#ifndef WarehouseStockDTO_H_
#define WarehouseStockDTO_H_


#include "WarehouseStockType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация об остатках товара.
/// </summary>
class  WarehouseStockDTO
{
public:
    WarehouseStockDTO();
    virtual ~WarehouseStockDTO() = default;


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

    bool operator==(const WarehouseStockDTO& rhs) const;
    bool operator!=(const WarehouseStockDTO& rhs) const;

    /////////////////////////////////////////////
    /// WarehouseStockDTO members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::WarehouseStockType getType() const;
    void setType(org::openapitools::server::model::WarehouseStockType const& value);
    /// <summary>
    /// Значение остатков.
    /// </summary>
    int64_t getCount() const;
    void setCount(int64_t const value);

    friend  void to_json(nlohmann::json& j, const WarehouseStockDTO& o);
    friend  void from_json(const nlohmann::json& j, WarehouseStockDTO& o);
protected:
    org::openapitools::server::model::WarehouseStockType m_Type;

    int64_t m_Count;

    
};

} // namespace org::openapitools::server::model

#endif /* WarehouseStockDTO_H_ */
