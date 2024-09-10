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
 * BaseShipmentDTO.h
 *
 * Информация об отгрузке.
 */

#ifndef BaseShipmentDTO_H_
#define BaseShipmentDTO_H_



#include "PalletsCountDTO.h"
#include "PartnerShipmentWarehouseDTO.h"
#include "DeliveryServiceDTO.h"
#include <string>
#include "ShipmentType.h"
#include <set>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация об отгрузке.
/// </summary>
class  BaseShipmentDTO 
{
public:
    BaseShipmentDTO() = default;
    explicit BaseShipmentDTO(boost::property_tree::ptree const& pt);
    virtual ~BaseShipmentDTO() = default;

    BaseShipmentDTO(const BaseShipmentDTO& other) = default; // copy constructor
    BaseShipmentDTO(BaseShipmentDTO&& other) noexcept = default; // move constructor

    BaseShipmentDTO& operator=(const BaseShipmentDTO& other) = default; // copy assignment
    BaseShipmentDTO& operator=(BaseShipmentDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// BaseShipmentDTO members

    /// <summary>
    /// Идентификатор отгрузки.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t value);

    /// <summary>
    /// Начало планового интервала отгрузки.
    /// </summary>
    std::string getPlanIntervalFrom() const;
    void setPlanIntervalFrom(std::string value);

    /// <summary>
    /// Конец планового интервала отгрузки.
    /// </summary>
    std::string getPlanIntervalTo() const;
    void setPlanIntervalTo(std::string value);

    /// <summary>
    /// 
    /// </summary>
    ShipmentType getShipmentType() const;
    void setShipmentType(ShipmentType value);

    /// <summary>
    /// 
    /// </summary>
    PartnerShipmentWarehouseDTO getWarehouse() const;
    void setWarehouse(PartnerShipmentWarehouseDTO value);

    /// <summary>
    /// 
    /// </summary>
    PartnerShipmentWarehouseDTO getWarehouseTo() const;
    void setWarehouseTo(PartnerShipmentWarehouseDTO value);

    /// <summary>
    /// Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
    /// </summary>
    std::string getExternalId() const;
    void setExternalId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    DeliveryServiceDTO getDeliveryService() const;
    void setDeliveryService(DeliveryServiceDTO value);

    /// <summary>
    /// 
    /// </summary>
    PalletsCountDTO getPalletsCount() const;
    void setPalletsCount(PalletsCountDTO value);

    /// <summary>
    /// Идентификаторы заказов в отгрузке.
    /// </summary>
    std::set<int64_t> getOrderIds() const;
    void setOrderIds(std::set<int64_t> value);

    /// <summary>
    /// Количество заказов, которое Маркет запланировал к отгрузке.
    /// </summary>
    int32_t getDraftCount() const;
    void setDraftCount(int32_t value);

    /// <summary>
    /// Количество заказов, которое Маркет подтвердил к отгрузке.
    /// </summary>
    int32_t getPlannedCount() const;
    void setPlannedCount(int32_t value);

    /// <summary>
    /// Количество заказов, принятых в сортировочном центре или пункте приема.
    /// </summary>
    int32_t getFactCount() const;
    void setFactCount(int32_t value);

protected:
    int64_t m_Id = 0L;
    std::string m_PlanIntervalFrom = "";
    std::string m_PlanIntervalTo = "";
    ShipmentType m_ShipmentType = ShipmentType{};
    PartnerShipmentWarehouseDTO m_Warehouse;
    PartnerShipmentWarehouseDTO m_WarehouseTo;
    std::string m_ExternalId = "";
    DeliveryServiceDTO m_DeliveryService;
    PalletsCountDTO m_PalletsCount;
    std::set<int64_t> m_OrderIds;
    int32_t m_DraftCount = 0;
    int32_t m_PlannedCount = 0;
    int32_t m_FactCount = 0;
};

std::vector<BaseShipmentDTO> createBaseShipmentDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<BaseShipmentDTO>(const BaseShipmentDTO& val) {
    return val.toPropertyTree();
}

template<>
inline BaseShipmentDTO fromPt<BaseShipmentDTO>(const boost::property_tree::ptree& pt) {
    BaseShipmentDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* BaseShipmentDTO_H_ */
