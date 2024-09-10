/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ShipmentDTO.h
 *
 * Информация об отгрузке.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ShipmentDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ShipmentDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/PalletsCountDTO.h"
#include "ympa_cpp_restsdk_client/model/ShipmentStatusChangeDTO.h"
#include "ympa_cpp_restsdk_client/model/ShipmentType.h"
#include "ympa_cpp_restsdk_client/model/ShipmentActionType.h"
#include "ympa_cpp_restsdk_client/model/PartnerShipmentWarehouseDTO.h"
#include <cpprest/details/basic_types.h>
#include "ympa_cpp_restsdk_client/model/DeliveryServiceDTO.h"
#include <set>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class PartnerShipmentWarehouseDTO;
class DeliveryServiceDTO;
class PalletsCountDTO;
class ShipmentStatusChangeDTO;


/// <summary>
/// Информация об отгрузке.
/// </summary>
class  ShipmentDTO
    : public ModelBase
{
public:
    ShipmentDTO();
    virtual ~ShipmentDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ShipmentDTO members

    /// <summary>
    /// Идентификатор отгрузки.
    /// </summary>
    int64_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(int64_t value);

    /// <summary>
    /// Начало планового интервала отгрузки.
    /// </summary>
    utility::datetime getPlanIntervalFrom() const;
    bool planIntervalFromIsSet() const;
    void unsetPlanIntervalFrom();

    void setPlanIntervalFrom(const utility::datetime& value);

    /// <summary>
    /// Конец планового интервала отгрузки.
    /// </summary>
    utility::datetime getPlanIntervalTo() const;
    bool planIntervalToIsSet() const;
    void unsetPlanIntervalTo();

    void setPlanIntervalTo(const utility::datetime& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ShipmentType> getShipmentType() const;
    bool shipmentTypeIsSet() const;
    void unsetShipmentType();

    void setShipmentType(const std::shared_ptr<ShipmentType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PartnerShipmentWarehouseDTO> getWarehouse() const;
    bool warehouseIsSet() const;
    void unsetWarehouse();

    void setWarehouse(const std::shared_ptr<PartnerShipmentWarehouseDTO>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PartnerShipmentWarehouseDTO> getWarehouseTo() const;
    bool warehouseToIsSet() const;
    void unsetWarehouseTo();

    void setWarehouseTo(const std::shared_ptr<PartnerShipmentWarehouseDTO>& value);

    /// <summary>
    /// Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
    /// </summary>
    utility::string_t getExternalId() const;
    bool externalIdIsSet() const;
    void unsetExternalId();

    void setExternalId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<DeliveryServiceDTO> getDeliveryService() const;
    bool deliveryServiceIsSet() const;
    void unsetDeliveryService();

    void setDeliveryService(const std::shared_ptr<DeliveryServiceDTO>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PalletsCountDTO> getPalletsCount() const;
    bool palletsCountIsSet() const;
    void unsetPalletsCount();

    void setPalletsCount(const std::shared_ptr<PalletsCountDTO>& value);

    /// <summary>
    /// Идентификаторы заказов в отгрузке.
    /// </summary>
    std::set<int64_t>& getOrderIds();
    bool orderIdsIsSet() const;
    void unsetOrderIds();

    void setOrderIds(std::set<int64_t> value);

    /// <summary>
    /// Количество заказов, которое Маркет запланировал к отгрузке.
    /// </summary>
    int32_t getDraftCount() const;
    bool draftCountIsSet() const;
    void unsetDraftCount();

    void setDraftCount(int32_t value);

    /// <summary>
    /// Количество заказов, которое Маркет подтвердил к отгрузке.
    /// </summary>
    int32_t getPlannedCount() const;
    bool plannedCountIsSet() const;
    void unsetPlannedCount();

    void setPlannedCount(int32_t value);

    /// <summary>
    /// Количество заказов, принятых в сортировочном центре или пункте приема.
    /// </summary>
    int32_t getFactCount() const;
    bool factCountIsSet() const;
    void unsetFactCount();

    void setFactCount(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ShipmentStatusChangeDTO> getCurrentStatus() const;
    bool currentStatusIsSet() const;
    void unsetCurrentStatus();

    void setCurrentStatus(const std::shared_ptr<ShipmentStatusChangeDTO>& value);

    /// <summary>
    /// Доступные действия над отгрузкой.
    /// </summary>
    std::set<std::shared_ptr<ShipmentActionType>>& getAvailableActions();
    bool availableActionsIsSet() const;
    void unsetAvailableActions();

    void setAvailableActions(const std::set<std::shared_ptr<ShipmentActionType>>& value);


protected:
    int64_t m_Id;
    bool m_IdIsSet;
    utility::datetime m_PlanIntervalFrom;
    bool m_PlanIntervalFromIsSet;
    utility::datetime m_PlanIntervalTo;
    bool m_PlanIntervalToIsSet;
    std::shared_ptr<ShipmentType> m_ShipmentType;
    bool m_ShipmentTypeIsSet;
    std::shared_ptr<PartnerShipmentWarehouseDTO> m_Warehouse;
    bool m_WarehouseIsSet;
    std::shared_ptr<PartnerShipmentWarehouseDTO> m_WarehouseTo;
    bool m_WarehouseToIsSet;
    utility::string_t m_ExternalId;
    bool m_ExternalIdIsSet;
    std::shared_ptr<DeliveryServiceDTO> m_DeliveryService;
    bool m_DeliveryServiceIsSet;
    std::shared_ptr<PalletsCountDTO> m_PalletsCount;
    bool m_PalletsCountIsSet;
    std::set<int64_t> m_OrderIds;
    bool m_OrderIdsIsSet;
    int32_t m_DraftCount;
    bool m_DraftCountIsSet;
    int32_t m_PlannedCount;
    bool m_PlannedCountIsSet;
    int32_t m_FactCount;
    bool m_FactCountIsSet;
    std::shared_ptr<ShipmentStatusChangeDTO> m_CurrentStatus;
    bool m_CurrentStatusIsSet;
    std::set<std::shared_ptr<ShipmentActionType>> m_AvailableActions;
    bool m_AvailableActionsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ShipmentDTO_H_ */
