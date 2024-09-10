#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderItemInstanceModificationDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderItemInstanceModificationDTO::OrderItemInstanceModificationDTO()
{
	//__init();
}

OrderItemInstanceModificationDTO::~OrderItemInstanceModificationDTO()
{
	//__cleanup();
}

void
OrderItemInstanceModificationDTO::__init()
{
	//id = long(0);
	//new std::list()std::list> instances;
}

void
OrderItemInstanceModificationDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(instances != NULL) {
	//instances.RemoveAll(true);
	//delete instances;
	//instances = NULL;
	//}
	//
}

void
OrderItemInstanceModificationDTO::fromJson(char* jsonStr)
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
	const gchar *instancesKey = "instances";
	node = json_object_get_member(pJsonObject, instancesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BriefOrderItemInstanceDTO> new_list;
			BriefOrderItemInstanceDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BriefOrderItemInstanceDTO")) {
					jsonToValue(&inst, temp_json, "BriefOrderItemInstanceDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			instances = new_list;
		}
		
	}
}

OrderItemInstanceModificationDTO::OrderItemInstanceModificationDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderItemInstanceModificationDTO::toJson()
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
	if (isprimitive("BriefOrderItemInstanceDTO")) {
		list<BriefOrderItemInstanceDTO> new_list = static_cast<list <BriefOrderItemInstanceDTO> > (getInstances());
		node = converttoJson(&new_list, "BriefOrderItemInstanceDTO", "array");
	} else {
		node = json_node_alloc();
		list<BriefOrderItemInstanceDTO> new_list = static_cast<list <BriefOrderItemInstanceDTO> > (getInstances());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BriefOrderItemInstanceDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BriefOrderItemInstanceDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *instancesKey = "instances";
	json_object_set_member(pJsonObject, instancesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderItemInstanceModificationDTO::getId()
{
	return id;
}

void
OrderItemInstanceModificationDTO::setId(long long  id)
{
	this->id = id;
}

std::list<BriefOrderItemInstanceDTO>
OrderItemInstanceModificationDTO::getInstances()
{
	return instances;
}

void
OrderItemInstanceModificationDTO::setInstances(std::list <BriefOrderItemInstanceDTO> instances)
{
	this->instances = instances;
}


