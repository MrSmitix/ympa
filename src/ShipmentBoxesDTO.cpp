#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ShipmentBoxesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ShipmentBoxesDTO::ShipmentBoxesDTO()
{
	//__init();
}

ShipmentBoxesDTO::~ShipmentBoxesDTO()
{
	//__cleanup();
}

void
ShipmentBoxesDTO::__init()
{
	//new std::list()std::list> boxes;
}

void
ShipmentBoxesDTO::__cleanup()
{
	//if(boxes != NULL) {
	//boxes.RemoveAll(true);
	//delete boxes;
	//boxes = NULL;
	//}
	//
}

void
ShipmentBoxesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *boxesKey = "boxes";
	node = json_object_get_member(pJsonObject, boxesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ParcelBoxDTO> new_list;
			ParcelBoxDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ParcelBoxDTO")) {
					jsonToValue(&inst, temp_json, "ParcelBoxDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			boxes = new_list;
		}
		
	}
}

ShipmentBoxesDTO::ShipmentBoxesDTO(char* json)
{
	this->fromJson(json);
}

char*
ShipmentBoxesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ParcelBoxDTO")) {
		list<ParcelBoxDTO> new_list = static_cast<list <ParcelBoxDTO> > (getBoxes());
		node = converttoJson(&new_list, "ParcelBoxDTO", "array");
	} else {
		node = json_node_alloc();
		list<ParcelBoxDTO> new_list = static_cast<list <ParcelBoxDTO> > (getBoxes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ParcelBoxDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ParcelBoxDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *boxesKey = "boxes";
	json_object_set_member(pJsonObject, boxesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ParcelBoxDTO>
ShipmentBoxesDTO::getBoxes()
{
	return boxes;
}

void
ShipmentBoxesDTO::setBoxes(std::list <ParcelBoxDTO> boxes)
{
	this->boxes = boxes;
}


