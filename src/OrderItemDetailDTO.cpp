#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderItemDetailDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderItemDetailDTO::OrderItemDetailDTO()
{
	//__init();
}

OrderItemDetailDTO::~OrderItemDetailDTO()
{
	//__cleanup();
}

void
OrderItemDetailDTO::__init()
{
	//itemCount = long(0);
	//itemStatus = new OrderItemStatusType();
	//updateDate = std::string();
}

void
OrderItemDetailDTO::__cleanup()
{
	//if(itemCount != NULL) {
	//
	//delete itemCount;
	//itemCount = NULL;
	//}
	//if(itemStatus != NULL) {
	//
	//delete itemStatus;
	//itemStatus = NULL;
	//}
	//if(updateDate != NULL) {
	//
	//delete updateDate;
	//updateDate = NULL;
	//}
	//
}

void
OrderItemDetailDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemCountKey = "itemCount";
	node = json_object_get_member(pJsonObject, itemCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&itemCount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *itemStatusKey = "itemStatus";
	node = json_object_get_member(pJsonObject, itemStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderItemStatusType")) {
			jsonToValue(&itemStatus, node, "OrderItemStatusType", "OrderItemStatusType");
		} else {
			
			OrderItemStatusType* obj = static_cast<OrderItemStatusType*> (&itemStatus);
			obj->fromJson(json_to_string(node, false));
			
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
}

OrderItemDetailDTO::OrderItemDetailDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderItemDetailDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getItemCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *itemCountKey = "itemCount";
	json_object_set_member(pJsonObject, itemCountKey, node);
	if (isprimitive("OrderItemStatusType")) {
		OrderItemStatusType obj = getItemStatus();
		node = converttoJson(&obj, "OrderItemStatusType", "");
	}
	else {
		
		OrderItemStatusType obj = static_cast<OrderItemStatusType> (getItemStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemStatusKey = "itemStatus";
	json_object_set_member(pJsonObject, itemStatusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdateDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updateDateKey = "updateDate";
	json_object_set_member(pJsonObject, updateDateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderItemDetailDTO::getItemCount()
{
	return itemCount;
}

void
OrderItemDetailDTO::setItemCount(long long  itemCount)
{
	this->itemCount = itemCount;
}

OrderItemStatusType
OrderItemDetailDTO::getItemStatus()
{
	return itemStatus;
}

void
OrderItemDetailDTO::setItemStatus(OrderItemStatusType  itemStatus)
{
	this->itemStatus = itemStatus;
}

std::string
OrderItemDetailDTO::getUpdateDate()
{
	return updateDate;
}

void
OrderItemDetailDTO::setUpdateDate(std::string  updateDate)
{
	this->updateDate = updateDate;
}


