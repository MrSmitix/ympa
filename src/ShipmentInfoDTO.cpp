#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ShipmentInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ShipmentInfoDTO::ShipmentInfoDTO()
{
	//__init();
}

ShipmentInfoDTO::~ShipmentInfoDTO()
{
	//__cleanup();
}

void
ShipmentInfoDTO::__init()
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
	//status = new ShipmentStatusType();
	//statusDescription = std::string();
	//statusUpdateTime = null;
}

void
ShipmentInfoDTO::__cleanup()
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
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(statusDescription != NULL) {
	//
	//delete statusDescription;
	//statusDescription = NULL;
	//}
	//if(statusUpdateTime != NULL) {
	//
	//delete statusUpdateTime;
	//statusUpdateTime = NULL;
	//}
	//
}

void
ShipmentInfoDTO::fromJson(char* jsonStr)
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ShipmentStatusType")) {
			jsonToValue(&status, node, "ShipmentStatusType", "ShipmentStatusType");
		} else {
			
			ShipmentStatusType* obj = static_cast<ShipmentStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusDescriptionKey = "statusDescription";
	node = json_object_get_member(pJsonObject, statusDescriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&statusDescription, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusUpdateTimeKey = "statusUpdateTime";
	node = json_object_get_member(pJsonObject, statusUpdateTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&statusUpdateTime, node, "std::string", "");
		} else {
			
		}
	}
}

ShipmentInfoDTO::ShipmentInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
ShipmentInfoDTO::toJson()
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
	if (isprimitive("ShipmentStatusType")) {
		ShipmentStatusType obj = getStatus();
		node = converttoJson(&obj, "ShipmentStatusType", "");
	}
	else {
		
		ShipmentStatusType obj = static_cast<ShipmentStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatusDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusDescriptionKey = "statusDescription";
	json_object_set_member(pJsonObject, statusDescriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatusUpdateTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusUpdateTimeKey = "statusUpdateTime";
	json_object_set_member(pJsonObject, statusUpdateTimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ShipmentInfoDTO::getId()
{
	return id;
}

void
ShipmentInfoDTO::setId(long long  id)
{
	this->id = id;
}

std::string
ShipmentInfoDTO::getPlanIntervalFrom()
{
	return planIntervalFrom;
}

void
ShipmentInfoDTO::setPlanIntervalFrom(std::string  planIntervalFrom)
{
	this->planIntervalFrom = planIntervalFrom;
}

std::string
ShipmentInfoDTO::getPlanIntervalTo()
{
	return planIntervalTo;
}

void
ShipmentInfoDTO::setPlanIntervalTo(std::string  planIntervalTo)
{
	this->planIntervalTo = planIntervalTo;
}

ShipmentType
ShipmentInfoDTO::getShipmentType()
{
	return shipmentType;
}

void
ShipmentInfoDTO::setShipmentType(ShipmentType  shipmentType)
{
	this->shipmentType = shipmentType;
}

PartnerShipmentWarehouseDTO
ShipmentInfoDTO::getWarehouse()
{
	return warehouse;
}

void
ShipmentInfoDTO::setWarehouse(PartnerShipmentWarehouseDTO  warehouse)
{
	this->warehouse = warehouse;
}

PartnerShipmentWarehouseDTO
ShipmentInfoDTO::getWarehouseTo()
{
	return warehouseTo;
}

void
ShipmentInfoDTO::setWarehouseTo(PartnerShipmentWarehouseDTO  warehouseTo)
{
	this->warehouseTo = warehouseTo;
}

std::string
ShipmentInfoDTO::getExternalId()
{
	return externalId;
}

void
ShipmentInfoDTO::setExternalId(std::string  externalId)
{
	this->externalId = externalId;
}

DeliveryServiceDTO
ShipmentInfoDTO::getDeliveryService()
{
	return deliveryService;
}

void
ShipmentInfoDTO::setDeliveryService(DeliveryServiceDTO  deliveryService)
{
	this->deliveryService = deliveryService;
}

PalletsCountDTO
ShipmentInfoDTO::getPalletsCount()
{
	return palletsCount;
}

void
ShipmentInfoDTO::setPalletsCount(PalletsCountDTO  palletsCount)
{
	this->palletsCount = palletsCount;
}

Set<long long>
ShipmentInfoDTO::getOrderIds()
{
	return orderIds;
}

void
ShipmentInfoDTO::setOrderIds(Set <long long> orderIds)
{
	this->orderIds = orderIds;
}

int
ShipmentInfoDTO::getDraftCount()
{
	return draftCount;
}

void
ShipmentInfoDTO::setDraftCount(int  draftCount)
{
	this->draftCount = draftCount;
}

int
ShipmentInfoDTO::getPlannedCount()
{
	return plannedCount;
}

void
ShipmentInfoDTO::setPlannedCount(int  plannedCount)
{
	this->plannedCount = plannedCount;
}

int
ShipmentInfoDTO::getFactCount()
{
	return factCount;
}

void
ShipmentInfoDTO::setFactCount(int  factCount)
{
	this->factCount = factCount;
}

ShipmentStatusType
ShipmentInfoDTO::getStatus()
{
	return status;
}

void
ShipmentInfoDTO::setStatus(ShipmentStatusType  status)
{
	this->status = status;
}

std::string
ShipmentInfoDTO::getStatusDescription()
{
	return statusDescription;
}

void
ShipmentInfoDTO::setStatusDescription(std::string  statusDescription)
{
	this->statusDescription = statusDescription;
}

std::string
ShipmentInfoDTO::getStatusUpdateTime()
{
	return statusUpdateTime;
}

void
ShipmentInfoDTO::setStatusUpdateTime(std::string  statusUpdateTime)
{
	this->statusUpdateTime = statusUpdateTime;
}


