#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ShipmentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ShipmentDTO::ShipmentDTO()
{
	//__init();
}

ShipmentDTO::~ShipmentDTO()
{
	//__cleanup();
}

void
ShipmentDTO::__init()
{
	//id = long(0);
	//planIntervalFrom = null;
	//planIntervalTo = null;
	//shipmentType = new ShipmentType();
	//warehouse = new PartnerShipmentWarehouseDTO();
	//warehouseTo = new PartnerShipmentWarehouseDTO();
	//externalId = std::string();
	//deliveryService = new DeliveryServiceDTO();
	//palletsCount = new PalletsCountDTO();
	//new std::list()Set> orderIds;
	//draftCount = int(0);
	//plannedCount = int(0);
	//factCount = int(0);
	//currentStatus = new ShipmentStatusChangeDTO();
	//new std::list()Set> availableActions;
}

void
ShipmentDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(planIntervalFrom != NULL) {
	//
	//delete planIntervalFrom;
	//planIntervalFrom = NULL;
	//}
	//if(planIntervalTo != NULL) {
	//
	//delete planIntervalTo;
	//planIntervalTo = NULL;
	//}
	//if(shipmentType != NULL) {
	//
	//delete shipmentType;
	//shipmentType = NULL;
	//}
	//if(warehouse != NULL) {
	//
	//delete warehouse;
	//warehouse = NULL;
	//}
	//if(warehouseTo != NULL) {
	//
	//delete warehouseTo;
	//warehouseTo = NULL;
	//}
	//if(externalId != NULL) {
	//
	//delete externalId;
	//externalId = NULL;
	//}
	//if(deliveryService != NULL) {
	//
	//delete deliveryService;
	//deliveryService = NULL;
	//}
	//if(palletsCount != NULL) {
	//
	//delete palletsCount;
	//palletsCount = NULL;
	//}
	//if(orderIds != NULL) {
	//orderIds.RemoveAll(true);
	//delete orderIds;
	//orderIds = NULL;
	//}
	//if(draftCount != NULL) {
	//
	//delete draftCount;
	//draftCount = NULL;
	//}
	//if(plannedCount != NULL) {
	//
	//delete plannedCount;
	//plannedCount = NULL;
	//}
	//if(factCount != NULL) {
	//
	//delete factCount;
	//factCount = NULL;
	//}
	//if(currentStatus != NULL) {
	//
	//delete currentStatus;
	//currentStatus = NULL;
	//}
	//if(availableActions != NULL) {
	//availableActions.RemoveAll(true);
	//delete availableActions;
	//availableActions = NULL;
	//}
	//
}

void
ShipmentDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *planIntervalFromKey = "planIntervalFrom";
	node = json_object_get_member(pJsonObject, planIntervalFromKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&planIntervalFrom, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *planIntervalToKey = "planIntervalTo";
	node = json_object_get_member(pJsonObject, planIntervalToKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&planIntervalTo, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shipmentTypeKey = "shipmentType";
	node = json_object_get_member(pJsonObject, shipmentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ShipmentType")) {
			jsonToValue(&shipmentType, node, "ShipmentType", "ShipmentType");
		} else {
			
			ShipmentType* obj = static_cast<ShipmentType*> (&shipmentType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *warehouseKey = "warehouse";
	node = json_object_get_member(pJsonObject, warehouseKey);
	if (node !=NULL) {
	

		if (isprimitive("PartnerShipmentWarehouseDTO")) {
			jsonToValue(&warehouse, node, "PartnerShipmentWarehouseDTO", "PartnerShipmentWarehouseDTO");
		} else {
			
			PartnerShipmentWarehouseDTO* obj = static_cast<PartnerShipmentWarehouseDTO*> (&warehouse);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *warehouseToKey = "warehouseTo";
	node = json_object_get_member(pJsonObject, warehouseToKey);
	if (node !=NULL) {
	

		if (isprimitive("PartnerShipmentWarehouseDTO")) {
			jsonToValue(&warehouseTo, node, "PartnerShipmentWarehouseDTO", "PartnerShipmentWarehouseDTO");
		} else {
			
			PartnerShipmentWarehouseDTO* obj = static_cast<PartnerShipmentWarehouseDTO*> (&warehouseTo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *externalIdKey = "externalId";
	node = json_object_get_member(pJsonObject, externalIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&externalId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deliveryServiceKey = "deliveryService";
	node = json_object_get_member(pJsonObject, deliveryServiceKey);
	if (node !=NULL) {
	

		if (isprimitive("DeliveryServiceDTO")) {
			jsonToValue(&deliveryService, node, "DeliveryServiceDTO", "DeliveryServiceDTO");
		} else {
			
			DeliveryServiceDTO* obj = static_cast<DeliveryServiceDTO*> (&deliveryService);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *palletsCountKey = "palletsCount";
	node = json_object_get_member(pJsonObject, palletsCountKey);
	if (node !=NULL) {
	

		if (isprimitive("PalletsCountDTO")) {
			jsonToValue(&palletsCount, node, "PalletsCountDTO", "PalletsCountDTO");
		} else {
			
			PalletsCountDTO* obj = static_cast<PalletsCountDTO*> (&palletsCount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orderIdsKey = "orderIds";
	node = json_object_get_member(pJsonObject, orderIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			orderIds = new_list;
		}
		
	}
	const gchar *draftCountKey = "draftCount";
	node = json_object_get_member(pJsonObject, draftCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&draftCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *plannedCountKey = "plannedCount";
	node = json_object_get_member(pJsonObject, plannedCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&plannedCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *factCountKey = "factCount";
	node = json_object_get_member(pJsonObject, factCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&factCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *currentStatusKey = "currentStatus";
	node = json_object_get_member(pJsonObject, currentStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("ShipmentStatusChangeDTO")) {
			jsonToValue(&currentStatus, node, "ShipmentStatusChangeDTO", "ShipmentStatusChangeDTO");
		} else {
			
			ShipmentStatusChangeDTO* obj = static_cast<ShipmentStatusChangeDTO*> (&currentStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *availableActionsKey = "availableActions";
	node = json_object_get_member(pJsonObject, availableActionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ShipmentActionType> new_list;
			ShipmentActionType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ShipmentActionType")) {
					jsonToValue(&inst, temp_json, "ShipmentActionType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			availableActions = new_list;
		}
		
	}
}

ShipmentDTO::ShipmentDTO(char* json)
{
	this->fromJson(json);
}

char*
ShipmentDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPlanIntervalFrom();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *planIntervalFromKey = "planIntervalFrom";
	json_object_set_member(pJsonObject, planIntervalFromKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPlanIntervalTo();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *planIntervalToKey = "planIntervalTo";
	json_object_set_member(pJsonObject, planIntervalToKey, node);
	if (isprimitive("ShipmentType")) {
		ShipmentType obj = getShipmentType();
		node = converttoJson(&obj, "ShipmentType", "");
	}
	else {
		
		ShipmentType obj = static_cast<ShipmentType> (getShipmentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shipmentTypeKey = "shipmentType";
	json_object_set_member(pJsonObject, shipmentTypeKey, node);
	if (isprimitive("PartnerShipmentWarehouseDTO")) {
		PartnerShipmentWarehouseDTO obj = getWarehouse();
		node = converttoJson(&obj, "PartnerShipmentWarehouseDTO", "");
	}
	else {
		
		PartnerShipmentWarehouseDTO obj = static_cast<PartnerShipmentWarehouseDTO> (getWarehouse());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *warehouseKey = "warehouse";
	json_object_set_member(pJsonObject, warehouseKey, node);
	if (isprimitive("PartnerShipmentWarehouseDTO")) {
		PartnerShipmentWarehouseDTO obj = getWarehouseTo();
		node = converttoJson(&obj, "PartnerShipmentWarehouseDTO", "");
	}
	else {
		
		PartnerShipmentWarehouseDTO obj = static_cast<PartnerShipmentWarehouseDTO> (getWarehouseTo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *warehouseToKey = "warehouseTo";
	json_object_set_member(pJsonObject, warehouseToKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExternalId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *externalIdKey = "externalId";
	json_object_set_member(pJsonObject, externalIdKey, node);
	if (isprimitive("DeliveryServiceDTO")) {
		DeliveryServiceDTO obj = getDeliveryService();
		node = converttoJson(&obj, "DeliveryServiceDTO", "");
	}
	else {
		
		DeliveryServiceDTO obj = static_cast<DeliveryServiceDTO> (getDeliveryService());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryServiceKey = "deliveryService";
	json_object_set_member(pJsonObject, deliveryServiceKey, node);
	if (isprimitive("PalletsCountDTO")) {
		PalletsCountDTO obj = getPalletsCount();
		node = converttoJson(&obj, "PalletsCountDTO", "");
	}
	else {
		
		PalletsCountDTO obj = static_cast<PalletsCountDTO> (getPalletsCount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *palletsCountKey = "palletsCount";
	json_object_set_member(pJsonObject, palletsCountKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getOrderIds());
		node = converttoJson(&new_list, "long long", "set");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getOrderIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *orderIdsKey = "orderIds";
	json_object_set_member(pJsonObject, orderIdsKey, node);
	if (isprimitive("int")) {
		int obj = getDraftCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *draftCountKey = "draftCount";
	json_object_set_member(pJsonObject, draftCountKey, node);
	if (isprimitive("int")) {
		int obj = getPlannedCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *plannedCountKey = "plannedCount";
	json_object_set_member(pJsonObject, plannedCountKey, node);
	if (isprimitive("int")) {
		int obj = getFactCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *factCountKey = "factCount";
	json_object_set_member(pJsonObject, factCountKey, node);
	if (isprimitive("ShipmentStatusChangeDTO")) {
		ShipmentStatusChangeDTO obj = getCurrentStatus();
		node = converttoJson(&obj, "ShipmentStatusChangeDTO", "");
	}
	else {
		
		ShipmentStatusChangeDTO obj = static_cast<ShipmentStatusChangeDTO> (getCurrentStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currentStatusKey = "currentStatus";
	json_object_set_member(pJsonObject, currentStatusKey, node);
	if (isprimitive("ShipmentActionType")) {
		list<ShipmentActionType> new_list = static_cast<list <ShipmentActionType> > (getAvailableActions());
		node = converttoJson(&new_list, "ShipmentActionType", "set");
	} else {
		node = json_node_alloc();
		list<ShipmentActionType> new_list = static_cast<list <ShipmentActionType> > (getAvailableActions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ShipmentActionType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ShipmentActionType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *availableActionsKey = "availableActions";
	json_object_set_member(pJsonObject, availableActionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ShipmentDTO::getId()
{
	return id;
}

void
ShipmentDTO::setId(long long  id)
{
	this->id = id;
}

std::string
ShipmentDTO::getPlanIntervalFrom()
{
	return planIntervalFrom;
}

void
ShipmentDTO::setPlanIntervalFrom(std::string  planIntervalFrom)
{
	this->planIntervalFrom = planIntervalFrom;
}

std::string
ShipmentDTO::getPlanIntervalTo()
{
	return planIntervalTo;
}

void
ShipmentDTO::setPlanIntervalTo(std::string  planIntervalTo)
{
	this->planIntervalTo = planIntervalTo;
}

ShipmentType
ShipmentDTO::getShipmentType()
{
	return shipmentType;
}

void
ShipmentDTO::setShipmentType(ShipmentType  shipmentType)
{
	this->shipmentType = shipmentType;
}

PartnerShipmentWarehouseDTO
ShipmentDTO::getWarehouse()
{
	return warehouse;
}

void
ShipmentDTO::setWarehouse(PartnerShipmentWarehouseDTO  warehouse)
{
	this->warehouse = warehouse;
}

PartnerShipmentWarehouseDTO
ShipmentDTO::getWarehouseTo()
{
	return warehouseTo;
}

void
ShipmentDTO::setWarehouseTo(PartnerShipmentWarehouseDTO  warehouseTo)
{
	this->warehouseTo = warehouseTo;
}

std::string
ShipmentDTO::getExternalId()
{
	return externalId;
}

void
ShipmentDTO::setExternalId(std::string  externalId)
{
	this->externalId = externalId;
}

DeliveryServiceDTO
ShipmentDTO::getDeliveryService()
{
	return deliveryService;
}

void
ShipmentDTO::setDeliveryService(DeliveryServiceDTO  deliveryService)
{
	this->deliveryService = deliveryService;
}

PalletsCountDTO
ShipmentDTO::getPalletsCount()
{
	return palletsCount;
}

void
ShipmentDTO::setPalletsCount(PalletsCountDTO  palletsCount)
{
	this->palletsCount = palletsCount;
}

Set<long long>
ShipmentDTO::getOrderIds()
{
	return orderIds;
}

void
ShipmentDTO::setOrderIds(Set <long long> orderIds)
{
	this->orderIds = orderIds;
}

int
ShipmentDTO::getDraftCount()
{
	return draftCount;
}

void
ShipmentDTO::setDraftCount(int  draftCount)
{
	this->draftCount = draftCount;
}

int
ShipmentDTO::getPlannedCount()
{
	return plannedCount;
}

void
ShipmentDTO::setPlannedCount(int  plannedCount)
{
	this->plannedCount = plannedCount;
}

int
ShipmentDTO::getFactCount()
{
	return factCount;
}

void
ShipmentDTO::setFactCount(int  factCount)
{
	this->factCount = factCount;
}

ShipmentStatusChangeDTO
ShipmentDTO::getCurrentStatus()
{
	return currentStatus;
}

void
ShipmentDTO::setCurrentStatus(ShipmentStatusChangeDTO  currentStatus)
{
	this->currentStatus = currentStatus;
}

Set<ShipmentActionType>
ShipmentDTO::getAvailableActions()
{
	return availableActions;
}

void
ShipmentDTO::setAvailableActions(Set <ShipmentActionType> availableActions)
{
	this->availableActions = availableActions;
}


