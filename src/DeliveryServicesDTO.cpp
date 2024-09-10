#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeliveryServicesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeliveryServicesDTO::DeliveryServicesDTO()
{
	//__init();
}

DeliveryServicesDTO::~DeliveryServicesDTO()
{
	//__cleanup();
}

void
DeliveryServicesDTO::__init()
{
	//new std::list()std::list> deliveryService;
}

void
DeliveryServicesDTO::__cleanup()
{
	//if(deliveryService != NULL) {
	//deliveryService.RemoveAll(true);
	//delete deliveryService;
	//deliveryService = NULL;
	//}
	//
}

void
DeliveryServicesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deliveryServiceKey = "deliveryService";
	node = json_object_get_member(pJsonObject, deliveryServiceKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DeliveryServiceInfoDTO> new_list;
			DeliveryServiceInfoDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DeliveryServiceInfoDTO")) {
					jsonToValue(&inst, temp_json, "DeliveryServiceInfoDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			deliveryService = new_list;
		}
		
	}
}

DeliveryServicesDTO::DeliveryServicesDTO(char* json)
{
	this->fromJson(json);
}

char*
DeliveryServicesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DeliveryServiceInfoDTO")) {
		list<DeliveryServiceInfoDTO> new_list = static_cast<list <DeliveryServiceInfoDTO> > (getDeliveryService());
		node = converttoJson(&new_list, "DeliveryServiceInfoDTO", "array");
	} else {
		node = json_node_alloc();
		list<DeliveryServiceInfoDTO> new_list = static_cast<list <DeliveryServiceInfoDTO> > (getDeliveryService());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DeliveryServiceInfoDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DeliveryServiceInfoDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *deliveryServiceKey = "deliveryService";
	json_object_set_member(pJsonObject, deliveryServiceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<DeliveryServiceInfoDTO>
DeliveryServicesDTO::getDeliveryService()
{
	return deliveryService;
}

void
DeliveryServicesDTO::setDeliveryService(std::list <DeliveryServiceInfoDTO> deliveryService)
{
	this->deliveryService = deliveryService;
}


