/*
 * ShipmentDTO.h
 *
 * Информация об отгрузке.
 */

#ifndef _ShipmentDTO_H_
#define _ShipmentDTO_H_


#include <string>
#include "DeliveryServiceDTO.h"
#include "PalletsCountDTO.h"
#include "PartnerShipmentWarehouseDTO.h"
#include "Set.h"
#include "ShipmentActionType.h"
#include "ShipmentStatusChangeDTO.h"
#include "ShipmentType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об отгрузке.
 *
 *  \ingroup Models
 *
 */

class ShipmentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ShipmentDTO();
	ShipmentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ShipmentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор отгрузки.
	 */
	long long getId();

	/*! \brief Set Идентификатор отгрузки.
	 */
	void setId(long long  id);
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
	Set<long long> getOrderIds();

	/*! \brief Set Идентификаторы заказов в отгрузке.
	 */
	void setOrderIds(Set <long long> orderIds);
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
	long long id;
	std::string planIntervalFrom;
	std::string planIntervalTo;
	ShipmentType shipmentType;
	PartnerShipmentWarehouseDTO warehouse;
	PartnerShipmentWarehouseDTO warehouseTo;
	std::string externalId;
	DeliveryServiceDTO deliveryService;
	PalletsCountDTO palletsCount;
	Set <long long>orderIds;
	int draftCount;
	int plannedCount;
	int factCount;
	ShipmentStatusChangeDTO currentStatus;
	Set <ShipmentActionType>availableActions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ShipmentDTO_H_ */
