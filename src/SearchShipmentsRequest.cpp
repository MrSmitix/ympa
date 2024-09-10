#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SearchShipmentsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SearchShipmentsRequest::SearchShipmentsRequest()
{
	//__init();
}

SearchShipmentsRequest::~SearchShipmentsRequest()
{
	//__cleanup();
}

void
SearchShipmentsRequest::__init()
{
	//dateFrom = null;
	//dateTo = null;
	//new std::list()Set> statuses;
	//new std::list()Set> orderIds;
	//cancelledOrders = bool(false);
}

void
SearchShipmentsRequest::__cleanup()
{
	//if(dateFrom != NULL) {
	//
	//delete dateFrom;
	//dateFrom = NULL;
	//}
	//if(dateTo != NULL) {
	//
	//delete dateTo;
	//dateTo = NULL;
	//}
	//if(statuses != NULL) {
	//statuses.RemoveAll(true);
	//delete statuses;
	//statuses = NULL;
	//}
	//if(orderIds != NULL) {
	//orderIds.RemoveAll(true);
	//delete orderIds;
	//orderIds = NULL;
	//}
	//if(cancelledOrders != NULL) {
	//
	//delete cancelledOrders;
	//cancelledOrders = NULL;
	//}
	//
}

void
SearchShipmentsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dateFromKey = "dateFrom";
	node = json_object_get_member(pJsonObject, dateFromKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&dateFrom, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *dateToKey = "dateTo";
	node = json_object_get_member(pJsonObject, dateToKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&dateTo, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *statusesKey = "statuses";
	node = json_object_get_member(pJsonObject, statusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ShipmentStatusType> new_list;
			ShipmentStatusType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ShipmentStatusType")) {
					jsonToValue(&inst, temp_json, "ShipmentStatusType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			statuses = new_list;
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
	const gchar *cancelledOrdersKey = "cancelledOrders";
	node = json_object_get_member(pJsonObject, cancelledOrdersKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&cancelledOrders, node, "bool", "");
		} else {
			
		}
	}
}

SearchShipmentsRequest::SearchShipmentsRequest(char* json)
{
	this->fromJson(json);
}

char*
SearchShipmentsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Date")) {
		Date obj = getDateFrom();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dateFromKey = "dateFrom";
	json_object_set_member(pJsonObject, dateFromKey, node);
	if (isprimitive("Date")) {
		Date obj = getDateTo();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dateToKey = "dateTo";
	json_object_set_member(pJsonObject, dateToKey, node);
	if (isprimitive("ShipmentStatusType")) {
		list<ShipmentStatusType> new_list = static_cast<list <ShipmentStatusType> > (getStatuses());
		node = converttoJson(&new_list, "ShipmentStatusType", "set");
	} else {
		node = json_node_alloc();
		list<ShipmentStatusType> new_list = static_cast<list <ShipmentStatusType> > (getStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ShipmentStatusType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ShipmentStatusType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *statusesKey = "statuses";
	json_object_set_member(pJsonObject, statusesKey, node);
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
	if (isprimitive("bool")) {
		bool obj = getCancelledOrders();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *cancelledOrdersKey = "cancelledOrders";
	json_object_set_member(pJsonObject, cancelledOrdersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
SearchShipmentsRequest::getDateFrom()
{
	return dateFrom;
}

void
SearchShipmentsRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
SearchShipmentsRequest::getDateTo()
{
	return dateTo;
}

void
SearchShipmentsRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

Set<ShipmentStatusType>
SearchShipmentsRequest::getStatuses()
{
	return statuses;
}

void
SearchShipmentsRequest::setStatuses(Set <ShipmentStatusType> statuses)
{
	this->statuses = statuses;
}

Set<long long>
SearchShipmentsRequest::getOrderIds()
{
	return orderIds;
}

void
SearchShipmentsRequest::setOrderIds(Set <long long> orderIds)
{
	this->orderIds = orderIds;
}

bool
SearchShipmentsRequest::getCancelledOrders()
{
	return cancelledOrders;
}

void
SearchShipmentsRequest::setCancelledOrders(bool  cancelledOrders)
{
	this->cancelledOrders = cancelledOrders;
}


