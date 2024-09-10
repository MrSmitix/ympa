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
 * WarehousesDTO.h
 *
 * Информация о складах и группах складов.
 */

#ifndef WarehousesDTO_H_
#define WarehousesDTO_H_


#include "WarehouseDTO.h"
#include "WarehouseGroupDTO.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация о складах и группах складов.
/// </summary>
class  WarehousesDTO
{
public:
    WarehousesDTO();
    virtual ~WarehousesDTO() = default;


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

    bool operator==(const WarehousesDTO& rhs) const;
    bool operator!=(const WarehousesDTO& rhs) const;

    /////////////////////////////////////////////
    /// WarehousesDTO members

    /// <summary>
    /// Список складов, не входящих в группы.
    /// </summary>
    std::vector<org::openapitools::server::model::WarehouseDTO> getWarehouses() const;
    void setWarehouses(std::vector<org::openapitools::server::model::WarehouseDTO> const& value);
    /// <summary>
    /// Список групп складов.
    /// </summary>
    std::vector<org::openapitools::server::model::WarehouseGroupDTO> getWarehouseGroups() const;
    void setWarehouseGroups(std::vector<org::openapitools::server::model::WarehouseGroupDTO> const& value);

    friend  void to_json(nlohmann::json& j, const WarehousesDTO& o);
    friend  void from_json(const nlohmann::json& j, WarehousesDTO& o);
protected:
    std::vector<org::openapitools::server::model::WarehouseDTO> m_Warehouses;

    std::vector<org::openapitools::server::model::WarehouseGroupDTO> m_WarehouseGroups;

    
};

} // namespace org::openapitools::server::model

#endif /* WarehousesDTO_H_ */
