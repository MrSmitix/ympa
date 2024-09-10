#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ReturnDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ReturnDTO::ReturnDTO()
{
	//__init();
}

ReturnDTO::~ReturnDTO()
{
	//__cleanup();
}

void
ReturnDTO::__init()
{
	//id = long(0);
	//orderId = long(0);
	//creationDate = null;
	//updateDate = null;
	//refundStatus = new RefundStatusType();
	//logisticPickupPoint = new LogisticPickupPointDTO();
	//shipmentRecipientType = new RecipientType();
	//shipmentStatus = new ReturnShipmentStatusType();
	//refundAmount = long(0);
	//new std::list()std::list> items;
	//returnType = new ReturnType();
	//fastReturn = bool(false);
}

void
ReturnDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(orderId != NULL) {
	//
	//delete orderId;
	//orderId = NULL;
	//}
	//if(creationDate != NULL) {
	//
	//delete creationDate;
	//creationDate = NULL;
	//}
	//if(updateDate != NULL) {
	//
	//delete updateDate;
	//updateDate = NULL;
	//}
	//if(refundStatus != NULL) {
	//
	//delete refundStatus;
	//refundStatus = NULL;
	//}
	//if(logisticPickupPoint != NULL) {
	//
	//delete logisticPickupPoint;
	//logisticPickupPoint = NULL;
	//}
	//if(shipmentRecipientType != NULL) {
	//
	//delete shipmentRecipientType;
	//shipmentRecipientType = NULL;
	//}
	//if(shipmentStatus != NULL) {
	//
	//delete shipmentStatus;
	//shipmentStatus = NULL;
	//}
	//if(refundAmount != NULL) {
	//
	//delete refundAmount;
	//refundAmount = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(returnType != NULL) {
	//
	//delete returnType;
	//returnType = NULL;
	//}
	//if(fastReturn != NULL) {
	//
	//delete fastReturn;
	//fastReturn = NULL;
	//}
	//
}

void
ReturnDTO::fromJson(char* jsonStr)
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
	const gchar *orderIdKey = "orderId";
	node = json_object_get_member(pJsonObject, orderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&orderId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *creationDateKey = "creationDate";
	node = json_object_get_member(pJsonObject, creationDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creationDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updateDateKey = "updateDate";
	node = json_object_get_member(pJsonObject, updateDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updateDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *refundStatusKey = "refundStatus";
	node = json_object_get_member(pJsonObject, refundStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("RefundStatusType")) {
			jsonToValue(&refundStatus, node, "RefundStatusType", "RefundStatusType");
		} else {
			
			RefundStatusType* obj = static_cast<RefundStatusType*> (&refundStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *logisticPickupPointKey = "logisticPickupPoint";
	node = json_object_get_member(pJsonObject, logisticPickupPointKey);
	if (node !=NULL) {
	

		if (isprimitive("LogisticPickupPointDTO")) {
			jsonToValue(&logisticPickupPoint, node, "LogisticPickupPointDTO", "LogisticPickupPointDTO");
		} else {
			
			LogisticPickupPointDTO* obj = static_cast<LogisticPickupPointDTO*> (&logisticPickupPoint);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *shipmentRecipientTypeKey = "shipmentRecipientType";
	node = json_object_get_member(pJsonObject, shipmentRecipientTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("RecipientType")) {
			jsonToValue(&shipmentRecipientType, node, "RecipientType", "RecipientType");
		} else {
			
			RecipientType* obj = static_cast<RecipientType*> (&shipmentRecipientType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *shipmentStatusKey = "shipmentStatus";
	node = json_object_get_member(pJsonObject, shipmentStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("ReturnShipmentStatusType")) {
			jsonToValue(&shipmentStatus, node, "ReturnShipmentStatusType", "ReturnShipmentStatusType");
		} else {
			
			ReturnShipmentStatusType* obj = static_cast<ReturnShipmentStatusType*> (&shipmentStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *refundAmountKey = "refundAmount";
	node = json_object_get_member(pJsonObject, refundAmountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&refundAmount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ReturnItemDTO> new_list;
			ReturnItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ReturnItemDTO")) {
					jsonToValue(&inst, temp_json, "ReturnItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *returnTypeKey = "returnType";
	node = json_object_get_member(pJsonObject, returnTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ReturnType")) {
			jsonToValue(&returnType, node, "ReturnType", "ReturnType");
		} else {
			
			ReturnType* obj = static_cast<ReturnType*> (&returnType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fastReturnKey = "fastReturn";
	node = json_object_get_member(pJsonObject, fastReturnKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&fastReturn, node, "bool", "");
		} else {
			
		}
	}
}

ReturnDTO::ReturnDTO(char* json)
{
	this->fromJson(json);
}

char*
ReturnDTO::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getOrderId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *orderIdKey = "orderId";
	json_object_set_member(pJsonObject, orderIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreationDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creationDateKey = "creationDate";
	json_object_set_member(pJsonObject, creationDateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdateDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updateDateKey = "updateDate";
	json_object_set_member(pJsonObject, updateDateKey, node);
	if (isprimitive("RefundStatusType")) {
		RefundStatusType obj = getRefundStatus();
		node = converttoJson(&obj, "RefundStatusType", "");
	}
	else {
		
		RefundStatusType obj = static_cast<RefundStatusType> (getRefundStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *refundStatusKey = "refundStatus";
	json_object_set_member(pJsonObject, refundStatusKey, node);
	if (isprimitive("LogisticPickupPointDTO")) {
		LogisticPickupPointDTO obj = getLogisticPickupPoint();
		node = converttoJson(&obj, "LogisticPickupPointDTO", "");
	}
	else {
		
		LogisticPickupPointDTO obj = static_cast<LogisticPickupPointDTO> (getLogisticPickupPoint());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logisticPickupPointKey = "logisticPickupPoint";
	json_object_set_member(pJsonObject, logisticPickupPointKey, node);
	if (isprimitive("RecipientType")) {
		RecipientType obj = getShipmentRecipientType();
		node = converttoJson(&obj, "RecipientType", "");
	}
	else {
		
		RecipientType obj = static_cast<RecipientType> (getShipmentRecipientType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shipmentRecipientTypeKey = "shipmentRecipientType";
	json_object_set_member(pJsonObject, shipmentRecipientTypeKey, node);
	if (isprimitive("ReturnShipmentStatusType")) {
		ReturnShipmentStatusType obj = getShipmentStatus();
		node = converttoJson(&obj, "ReturnShipmentStatusType", "");
	}
	else {
		
		ReturnShipmentStatusType obj = static_cast<ReturnShipmentStatusType> (getShipmentStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shipmentStatusKey = "shipmentStatus";
	json_object_set_member(pJsonObject, shipmentStatusKey, node);
	if (isprimitive("long long")) {
		long long obj = getRefundAmount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *refundAmountKey = "refundAmount";
	json_object_set_member(pJsonObject, refundAmountKey, node);
	if (isprimitive("ReturnItemDTO")) {
		list<ReturnItemDTO> new_list = static_cast<list <ReturnItemDTO> > (getItems());
		node = converttoJson(&new_list, "ReturnItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<ReturnItemDTO> new_list = static_cast<list <ReturnItemDTO> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ReturnItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ReturnItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("ReturnType")) {
		ReturnType obj = getReturnType();
		node = converttoJson(&obj, "ReturnType", "");
	}
	else {
		
		ReturnType obj = static_cast<ReturnType> (getReturnType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *returnTypeKey = "returnType";
	json_object_set_member(pJsonObject, returnTypeKey, node);
	if (isprimitive("bool")) {
		bool obj = getFastReturn();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *fastReturnKey = "fastReturn";
	json_object_set_member(pJsonObject, fastReturnKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ReturnDTO::getId()
{
	return id;
}

void
ReturnDTO::setId(long long  id)
{
	this->id = id;
}

long long
ReturnDTO::getOrderId()
{
	return orderId;
}

void
ReturnDTO::setOrderId(long long  orderId)
{
	this->orderId = orderId;
}

std::string
ReturnDTO::getCreationDate()
{
	return creationDate;
}

void
ReturnDTO::setCreationDate(std::string  creationDate)
{
	this->creationDate = creationDate;
}

std::string
ReturnDTO::getUpdateDate()
{
	return updateDate;
}

void
ReturnDTO::setUpdateDate(std::string  updateDate)
{
	this->updateDate = updateDate;
}

RefundStatusType
ReturnDTO::getRefundStatus()
{
	return refundStatus;
}

void
ReturnDTO::setRefundStatus(RefundStatusType  refundStatus)
{
	this->refundStatus = refundStatus;
}

LogisticPickupPointDTO
ReturnDTO::getLogisticPickupPoint()
{
	return logisticPickupPoint;
}

void
ReturnDTO::setLogisticPickupPoint(LogisticPickupPointDTO  logisticPickupPoint)
{
	this->logisticPickupPoint = logisticPickupPoint;
}

RecipientType
ReturnDTO::getShipmentRecipientType()
{
	return shipmentRecipientType;
}

void
ReturnDTO::setShipmentRecipientType(RecipientType  shipmentRecipientType)
{
	this->shipmentRecipientType = shipmentRecipientType;
}

ReturnShipmentStatusType
ReturnDTO::getShipmentStatus()
{
	return shipmentStatus;
}

void
ReturnDTO::setShipmentStatus(ReturnShipmentStatusType  shipmentStatus)
{
	this->shipmentStatus = shipmentStatus;
}

long long
ReturnDTO::getRefundAmount()
{
	return refundAmount;
}

void
ReturnDTO::setRefundAmount(long long  refundAmount)
{
	this->refundAmount = refundAmount;
}

std::list<ReturnItemDTO>
ReturnDTO::getItems()
{
	return items;
}

void
ReturnDTO::setItems(std::list <ReturnItemDTO> items)
{
	this->items = items;
}

ReturnType
ReturnDTO::getReturnType()
{
	return returnType;
}

void
ReturnDTO::setReturnType(ReturnType  returnType)
{
	this->returnType = returnType;
}

bool
ReturnDTO::getFastReturn()
{
	return fastReturn;
}

void
ReturnDTO::setFastReturn(bool  fastReturn)
{
	this->fastReturn = fastReturn;
}


