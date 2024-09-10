
/*
 * ShipmentDTO.h
 *
 * Информация об отгрузке.
 */

#ifndef TINY_CPP_CLIENT_ShipmentDTO_H_
#define TINY_CPP_CLIENT_ShipmentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeliveryServiceDTO.h"
#include "PalletsCountDTO.h"
#include "PartnerShipmentWarehouseDTO.h"
#include "Set.h"
#include "ShipmentActionType.h"
#include "ShipmentStatusChangeDTO.h"
#include "ShipmentType.h"

namespace Tiny {


/*! \brief Информация об отгрузке.
 *
 *  \ingroup Models
 *
 */

class ShipmentDTO{
public:

    /*! \brief Constructor.
	 */
    ShipmentDTO();
    ShipmentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ShipmentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор отгрузки.
	 */
	long getId();

	/*! \brief Set Идентификатор отгрузки.
	 */
	void setId(long  id);
	/*! \brief Get Начало планового интервала отгрузки.
	 */
	std::string getPlanIntervalFrom();

	/*! \brief Set Начало планового интервала отгрузки.
	 */
	void setPlanIntervalFrom(std::string  planIntervalFrom);
	/*! \brief Get Конец планового интервала отгрузки.
	 */
	std::string getPlanIntervalTo();

	/*! \brief Set Конец планового интервала отгрузки.
	 */
	void setPlanIntervalTo(std::string  planIntervalTo);
	/*! \brief Get 
	 */
	ShipmentType getShipmentType();

	/*! \brief Set 
	 */
	void setShipmentType(ShipmentType  shipmentType);
	/*! \brief Get 
	 */
	PartnerShipmentWarehouseDTO getWarehouse();

	/*! \brief Set 
	 */
	void setWarehouse(PartnerShipmentWarehouseDTO  warehouse);
	/*! \brief Get 
	 */
	PartnerShipmentWarehouseDTO getWarehouseTo();

	/*! \brief Set 
	 */
	void setWarehouseTo(PartnerShipmentWarehouseDTO  warehouseTo);
	/*! \brief Get Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
	 */
	std::string getExternalId();

	/*! \brief Set Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
	 */
	void setExternalId(std::string  externalId);
	/*! \brief Get 
	 */
	DeliveryServiceDTO getDeliveryService();

	/*! \brief Set 
	 */
	void setDeliveryService(DeliveryServiceDTO  deliveryService);
	/*! \brief Get 
	 */
	PalletsCountDTO getPalletsCount();

	/*! \brief Set 
	 */
	void setPalletsCount(PalletsCountDTO  palletsCount);
	/*! \brief Get Идентификаторы заказов в отгрузке.
	 */
	Set<long> getOrderIds();

	/*! \brief Set Идентификаторы заказов в отгрузке.
	 */
	void setOrderIds(Set <long> orderIds);
	/*! \brief Get Количество заказов, которое Маркет запланировал к отгрузке.
	 */
	int getDraftCount();

	/*! \brief Set Количество заказов, которое Маркет запланировал к отгрузке.
	 */
	void setDraftCount(int  draftCount);
	/*! \brief Get Количество заказов, которое Маркет подтвердил к отгрузке.
	 */
	int getPlannedCount();

	/*! \brief Set Количество заказов, которое Маркет подтвердил к отгрузке.
	 */
	void setPlannedCount(int  plannedCount);
	/*! \brief Get Количество заказов, принятых в сортировочном центре или пункте приема.
	 */
	int getFactCount();

	/*! \brief Set Количество заказов, принятых в сортировочном центре или пункте приема.
	 */
	void setFactCount(int  factCount);
	/*! \brief Get 
	 */
	ShipmentStatusChangeDTO getCurrentStatus();

	/*! \brief Set 
	 */
	void setCurrentStatus(ShipmentStatusChangeDTO  currentStatus);
	/*! \brief Get Доступные действия над отгрузкой.
	 */
	Set<ShipmentActionType> getAvailableActions();

	/*! \brief Set Доступные действия над отгрузкой.
	 */
	void setAvailableActions(Set <ShipmentActionType> availableActions);


    private:
    long id{};
    std::string planIntervalFrom{};
    std::string planIntervalTo{};
    ShipmentType shipmentType;
    PartnerShipmentWarehouseDTO warehouse;
    PartnerShipmentWarehouseDTO warehouseTo;
    std::string externalId{};
    DeliveryServiceDTO deliveryService;
    PalletsCountDTO palletsCount;
    Set<long> orderIds;
    int draftCount{};
    int plannedCount{};
    int factCount{};
    ShipmentStatusChangeDTO currentStatus;
    Set<ShipmentActionType> availableActions;
};
}

#endif /* TINY_CPP_CLIENT_ShipmentDTO_H_ */
