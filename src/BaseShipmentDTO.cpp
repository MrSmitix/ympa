#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BaseShipmentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BaseShipmentDTO::BaseShipmentDTO()
{
	//__init();
}

BaseShipmentDTO::~BaseShipmentDTO()
{
	//__cleanup();
}

void
BaseShipmentDTO::__init()
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
}

void
BaseShipmentDTO::__cleanup()
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
	//
}

void
BaseShipmentDTO::fromJson(char* jsonStr)
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
}

BaseShipmentDTO::BaseShipmentDTO(char* json)
{
	this->fromJson(json);
}

char*
BaseShipmentDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
BaseShipmentDTO::getId()
{
	return id;
}

void
BaseShipmentDTO::setId(long long  id)
{
	this->id = id;
}

std::string
BaseShipmentDTO::getPlanIntervalFrom()
{
	return planIntervalFrom;
}

void
BaseShipmentDTO::setPlanIntervalFrom(std::string  planIntervalFrom)
{
	this->planIntervalFrom = planIntervalFrom;
}

std::string
BaseShipmentDTO::getPlanIntervalTo()
{
	return planIntervalTo;
}

void
BaseShipmentDTO::setPlanIntervalTo(std::string  planIntervalTo)
{
	this->planIntervalTo = planIntervalTo;
}

ShipmentType
BaseShipmentDTO::getShipmentType()
{
	return shipmentType;
}

void
BaseShipmentDTO::setShipmentType(ShipmentType  shipmentType)
{
	this->shipmentType = shipmentType;
}

PartnerShipmentWarehouseDTO
BaseShipmentDTO::getWarehouse()
{
	return warehouse;
}

void
BaseShipmentDTO::setWarehouse(PartnerShipmentWarehouseDTO  warehouse)
{
	this->warehouse = warehouse;
}

PartnerShipmentWarehouseDTO
BaseShipmentDTO::getWarehouseTo()
{
	return warehouseTo;
}

void
BaseShipmentDTO::setWarehouseTo(PartnerShipmentWarehouseDTO  warehouseTo)
{
	this->warehouseTo = warehouseTo;
}

std::string
BaseShipmentDTO::getExternalId()
{
	return externalId;
}

void
BaseShipmentDTO::setExternalId(std::string  externalId)
{
	this->externalId = externalId;
}

DeliveryServiceDTO
BaseShipmentDTO::getDeliveryService()
{
	return deliveryService;
}

void
BaseShipmentDTO::setDeliveryService(DeliveryServiceDTO  deliveryService)
{
	this->deliveryService = deliveryService;
}

PalletsCountDTO
BaseShipmentDTO::getPalletsCount()
{
	return palletsCount;
}

void
BaseShipmentDTO::setPalletsCount(PalletsCountDTO  palletsCount)
{
	this->palletsCount = palletsCount;
}

Set<long long>
BaseShipmentDTO::getOrderIds()
{
	return orderIds;
}

void
BaseShipmentDTO::setOrderIds(Set <long long> orderIds)
{
	this->orderIds = orderIds;
}

int
BaseShipmentDTO::getDraftCount()
{
	return draftCount;
}

void
BaseShipmentDTO::setDraftCount(int  draftCount)
{
	this->draftCount = draftCount;
}

int
BaseShipmentDTO::getPlannedCount()
{
	return plannedCount;
}

void
BaseShipmentDTO::setPlannedCount(int  plannedCount)
{
	this->plannedCount = plannedCount;
}

int
BaseShipmentDTO::getFactCount()
{
	return factCount;
}

void
BaseShipmentDTO::setFactCount(int  factCount)
{
	this->factCount = factCount;
}


