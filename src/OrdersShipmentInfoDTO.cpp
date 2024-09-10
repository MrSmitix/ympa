#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrdersShipmentInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrdersShipmentInfoDTO::OrdersShipmentInfoDTO()
{
	//__init();
}

OrdersShipmentInfoDTO::~OrdersShipmentInfoDTO()
{
	//__cleanup();
}

void
OrdersShipmentInfoDTO::__init()
{
	//new std::list()Set> orderIdsWithLabels;
	//new std::list()Set> orderIdsWithoutLabels;
}

void
OrdersShipmentInfoDTO::__cleanup()
{
	//if(orderIdsWithLabels != NULL) {
	//orderIdsWithLabels.RemoveAll(true);
	//delete orderIdsWithLabels;
	//orderIdsWithLabels = NULL;
	//}
	//if(orderIdsWithoutLabels != NULL) {
	//orderIdsWithoutLabels.RemoveAll(true);
	//delete orderIdsWithoutLabels;
	//orderIdsWithoutLabels = NULL;
	//}
	//
}

void
OrdersShipmentInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orderIdsWithLabelsKey = "orderIdsWithLabels";
	node = json_object_get_member(pJsonObject, orderIdsWithLabelsKey);
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
			orderIdsWithLabels = new_list;
		}
		
	}
	const gchar *orderIdsWithoutLabelsKey = "orderIdsWithoutLabels";
	node = json_object_get_member(pJsonObject, orderIdsWithoutLabelsKey);
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
			orderIdsWithoutLabels = new_list;
		}
		
	}
}

OrdersShipmentInfoDTO::OrdersShipmentInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
OrdersShipmentInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getOrderIdsWithLabels());
		node = converttoJson(&new_list, "long long", "set");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getOrderIdsWithLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *orderIdsWithLabelsKey = "orderIdsWithLabels";
	json_object_set_member(pJsonObject, orderIdsWithLabelsKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getOrderIdsWithoutLabels());
		node = converttoJson(&new_list, "long long", "set");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getOrderIdsWithoutLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *orderIdsWithoutLabelsKey = "orderIdsWithoutLabels";
	json_object_set_member(pJsonObject, orderIdsWithoutLabelsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Set<long long>
OrdersShipmentInfoDTO::getOrderIdsWithLabels()
{
	return orderIdsWithLabels;
}

void
OrdersShipmentInfoDTO::setOrderIdsWithLabels(Set <long long> orderIdsWithLabels)
{
	this->orderIdsWithLabels = orderIdsWithLabels;
}

Set<long long>
OrdersShipmentInfoDTO::getOrderIdsWithoutLabels()
{
	return orderIdsWithoutLabels;
}

void
OrdersShipmentInfoDTO::setOrderIdsWithoutLabels(Set <long long> orderIdsWithoutLabels)
{
	this->orderIdsWithoutLabels = orderIdsWithoutLabels;
}


