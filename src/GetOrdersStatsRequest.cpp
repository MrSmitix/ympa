#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOrdersStatsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOrdersStatsRequest::GetOrdersStatsRequest()
{
	//__init();
}

GetOrdersStatsRequest::~GetOrdersStatsRequest()
{
	//__cleanup();
}

void
GetOrdersStatsRequest::__init()
{
	//dateFrom = null;
	//dateTo = null;
	//updateFrom = null;
	//updateTo = null;
	//new std::list()std::list> orders;
	//new std::list()std::list> statuses;
	//hasCis = bool(false);
}

void
GetOrdersStatsRequest::__cleanup()
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
	//if(updateFrom != NULL) {
	//
	//delete updateFrom;
	//updateFrom = NULL;
	//}
	//if(updateTo != NULL) {
	//
	//delete updateTo;
	//updateTo = NULL;
	//}
	//if(orders != NULL) {
	//orders.RemoveAll(true);
	//delete orders;
	//orders = NULL;
	//}
	//if(statuses != NULL) {
	//statuses.RemoveAll(true);
	//delete statuses;
	//statuses = NULL;
	//}
	//if(hasCis != NULL) {
	//
	//delete hasCis;
	//hasCis = NULL;
	//}
	//
}

void
GetOrdersStatsRequest::fromJson(char* jsonStr)
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
	const gchar *updateFromKey = "updateFrom";
	node = json_object_get_member(pJsonObject, updateFromKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&updateFrom, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *updateToKey = "updateTo";
	node = json_object_get_member(pJsonObject, updateToKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&updateTo, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *ordersKey = "orders";
	node = json_object_get_member(pJsonObject, ordersKey);
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
			orders = new_list;
		}
		
	}
	const gchar *statusesKey = "statuses";
	node = json_object_get_member(pJsonObject, statusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderStatsStatusType> new_list;
			OrderStatsStatusType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderStatsStatusType")) {
					jsonToValue(&inst, temp_json, "OrderStatsStatusType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			statuses = new_list;
		}
		
	}
	const gchar *hasCisKey = "hasCis";
	node = json_object_get_member(pJsonObject, hasCisKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&hasCis, node, "bool", "");
		} else {
			
		}
	}
}

GetOrdersStatsRequest::GetOrdersStatsRequest(char* json)
{
	this->fromJson(json);
}

char*
GetOrdersStatsRequest::toJson()
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
	if (isprimitive("Date")) {
		Date obj = getUpdateFrom();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *updateFromKey = "updateFrom";
	json_object_set_member(pJsonObject, updateFromKey, node);
	if (isprimitive("Date")) {
		Date obj = getUpdateTo();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *updateToKey = "updateTo";
	json_object_set_member(pJsonObject, updateToKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getOrders());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getOrders());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ordersKey = "orders";
	json_object_set_member(pJsonObject, ordersKey, node);
	if (isprimitive("OrderStatsStatusType")) {
		list<OrderStatsStatusType> new_list = static_cast<list <OrderStatsStatusType> > (getStatuses());
		node = converttoJson(&new_list, "OrderStatsStatusType", "array");
	} else {
		node = json_node_alloc();
		list<OrderStatsStatusType> new_list = static_cast<list <OrderStatsStatusType> > (getStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderStatsStatusType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderStatsStatusType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *statusesKey = "statuses";
	json_object_set_member(pJsonObject, statusesKey, node);
	if (isprimitive("bool")) {
		bool obj = getHasCis();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *hasCisKey = "hasCis";
	json_object_set_member(pJsonObject, hasCisKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
GetOrdersStatsRequest::getDateFrom()
{
	return dateFrom;
}

void
GetOrdersStatsRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GetOrdersStatsRequest::getDateTo()
{
	return dateTo;
}

void
GetOrdersStatsRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

Date
GetOrdersStatsRequest::getUpdateFrom()
{
	return updateFrom;
}

void
GetOrdersStatsRequest::setUpdateFrom(Date  updateFrom)
{
	this->updateFrom = updateFrom;
}

Date
GetOrdersStatsRequest::getUpdateTo()
{
	return updateTo;
}

void
GetOrdersStatsRequest::setUpdateTo(Date  updateTo)
{
	this->updateTo = updateTo;
}

std::list<long long>
GetOrdersStatsRequest::getOrders()
{
	return orders;
}

void
GetOrdersStatsRequest::setOrders(std::list <long long> orders)
{
	this->orders = orders;
}

std::list<OrderStatsStatusType>
GetOrdersStatsRequest::getStatuses()
{
	return statuses;
}

void
GetOrdersStatsRequest::setStatuses(std::list <OrderStatsStatusType> statuses)
{
	this->statuses = statuses;
}

bool
GetOrdersStatsRequest::getHasCis()
{
	return hasCis;
}

void
GetOrdersStatsRequest::setHasCis(bool  hasCis)
{
	this->hasCis = hasCis;
}


