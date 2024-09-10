#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrdersStatsDetailsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrdersStatsDetailsDTO::OrdersStatsDetailsDTO()
{
	//__init();
}

OrdersStatsDetailsDTO::~OrdersStatsDetailsDTO()
{
	//__cleanup();
}

void
OrdersStatsDetailsDTO::__init()
{
	//itemStatus = new OrdersStatsItemStatusType();
	//itemCount = long(0);
	//updateDate = null;
	//stockType = new OrdersStatsStockType();
}

void
OrdersStatsDetailsDTO::__cleanup()
{
	//if(itemStatus != NULL) {
	//
	//delete itemStatus;
	//itemStatus = NULL;
	//}
	//if(itemCount != NULL) {
	//
	//delete itemCount;
	//itemCount = NULL;
	//}
	//if(updateDate != NULL) {
	//
	//delete updateDate;
	//updateDate = NULL;
	//}
	//if(stockType != NULL) {
	//
	//delete stockType;
	//stockType = NULL;
	//}
	//
}

void
OrdersStatsDetailsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemStatusKey = "itemStatus";
	node = json_object_get_member(pJsonObject, itemStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsItemStatusType")) {
			jsonToValue(&itemStatus, node, "OrdersStatsItemStatusType", "OrdersStatsItemStatusType");
		} else {
			
			OrdersStatsItemStatusType* obj = static_cast<OrdersStatsItemStatusType*> (&itemStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *itemCountKey = "itemCount";
	node = json_object_get_member(pJsonObject, itemCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&itemCount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *updateDateKey = "updateDate";
	node = json_object_get_member(pJsonObject, updateDateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&updateDate, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *stockTypeKey = "stockType";
	node = json_object_get_member(pJsonObject, stockTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsStockType")) {
			jsonToValue(&stockType, node, "OrdersStatsStockType", "OrdersStatsStockType");
		} else {
			
			OrdersStatsStockType* obj = static_cast<OrdersStatsStockType*> (&stockType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrdersStatsDetailsDTO::OrdersStatsDetailsDTO(char* json)
{
	this->fromJson(json);
}

char*
OrdersStatsDetailsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrdersStatsItemStatusType")) {
		OrdersStatsItemStatusType obj = getItemStatus();
		node = converttoJson(&obj, "OrdersStatsItemStatusType", "");
	}
	else {
		
		OrdersStatsItemStatusType obj = static_cast<OrdersStatsItemStatusType> (getItemStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemStatusKey = "itemStatus";
	json_object_set_member(pJsonObject, itemStatusKey, node);
	if (isprimitive("long long")) {
		long long obj = getItemCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *itemCountKey = "itemCount";
	json_object_set_member(pJsonObject, itemCountKey, node);
	if (isprimitive("Date")) {
		Date obj = getUpdateDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *updateDateKey = "updateDate";
	json_object_set_member(pJsonObject, updateDateKey, node);
	if (isprimitive("OrdersStatsStockType")) {
		OrdersStatsStockType obj = getStockType();
		node = converttoJson(&obj, "OrdersStatsStockType", "");
	}
	else {
		
		OrdersStatsStockType obj = static_cast<OrdersStatsStockType> (getStockType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stockTypeKey = "stockType";
	json_object_set_member(pJsonObject, stockTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrdersStatsItemStatusType
OrdersStatsDetailsDTO::getItemStatus()
{
	return itemStatus;
}

void
OrdersStatsDetailsDTO::setItemStatus(OrdersStatsItemStatusType  itemStatus)
{
	this->itemStatus = itemStatus;
}

long long
OrdersStatsDetailsDTO::getItemCount()
{
	return itemCount;
}

void
OrdersStatsDetailsDTO::setItemCount(long long  itemCount)
{
	this->itemCount = itemCount;
}

Date
OrdersStatsDetailsDTO::getUpdateDate()
{
	return updateDate;
}

void
OrdersStatsDetailsDTO::setUpdateDate(Date  updateDate)
{
	this->updateDate = updateDate;
}

OrdersStatsStockType
OrdersStatsDetailsDTO::getStockType()
{
	return stockType;
}

void
OrdersStatsDetailsDTO::setStockType(OrdersStatsStockType  stockType)
{
	this->stockType = stockType;
}


