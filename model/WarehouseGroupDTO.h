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
 * WarehouseGroupDTO.h
 *
 * Информация о группе складов.
 */

#ifndef WarehouseGroupDTO_H_
#define WarehouseGroupDTO_H_



#include "WarehouseDTO.h"
#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о группе складов.
/// </summary>
class  WarehouseGroupDTO 
{
public:
    WarehouseGroupDTO() = default;
    explicit WarehouseGroupDTO(boost::property_tree::ptree const& pt);
    virtual ~WarehouseGroupDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// WarehouseGroupDTO members

    /// <summary>
    /// Название группы складов.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<WarehouseDTO> getMainWarehouse() const;
    void setMainWarehouse(std::shared_ptr<WarehouseDTO> value);

    /// <summary>
    /// Список складов, входящих в группу.
    /// </summary>
    std::vector<std::shared_ptr<WarehouseDTO>> getWarehouses() const;
    void setWarehouses(std::vector<std::shared_ptr<WarehouseDTO>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Name = "";
    std::shared_ptr<WarehouseDTO> m_MainWarehouse;
    std::vector<std::shared_ptr<WarehouseDTO>> m_Warehouses;
};

std::vector<WarehouseGroupDTO> createWarehouseGroupDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* WarehouseGroupDTO_H_ */
