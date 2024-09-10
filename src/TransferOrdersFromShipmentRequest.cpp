#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TransferOrdersFromShipmentRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TransferOrdersFromShipmentRequest::TransferOrdersFromShipmentRequest()
{
	//__init();
}

TransferOrdersFromShipmentRequest::~TransferOrdersFromShipmentRequest()
{
	//__cleanup();
}

void
TransferOrdersFromShipmentRequest::__init()
{
	//new std::list()std::list> orderIds;
}

void
TransferOrdersFromShipmentRequest::__cleanup()
{
	//if(orderIds != NULL) {
	//orderIds.RemoveAll(true);
	//delete orderIds;
	//orderIds = NULL;
	//}
	//
}

void
TransferOrdersFromShipmentRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
}

TransferOrdersFromShipmentRequest::TransferOrdersFromShipmentRequest(char* json)
{
	this->fromJson(json);
}

char*
TransferOrdersFromShipmentRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getOrderIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getOrderIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *orderIdsKey = "orderIds";
	json_object_set_member(pJsonObject, orderIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<long long>
TransferOrdersFromShipmentRequest::getOrderIds()
{
	return orderIds;
}

void
TransferOrdersFromShipmentRequest::setOrderIds(std::list <long long> orderIds)
{
	this->orderIds = orderIds;
}


