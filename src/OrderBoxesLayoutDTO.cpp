#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderBoxesLayoutDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderBoxesLayoutDTO::OrderBoxesLayoutDTO()
{
	//__init();
}

OrderBoxesLayoutDTO::~OrderBoxesLayoutDTO()
{
	//__cleanup();
}

void
OrderBoxesLayoutDTO::__init()
{
	//new std::list()std::list> boxes;
}

void
OrderBoxesLayoutDTO::__cleanup()
{
	//if(boxes != NULL) {
	//boxes.RemoveAll(true);
	//delete boxes;
	//boxes = NULL;
	//}
	//
}

void
OrderBoxesLayoutDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *boxesKey = "boxes";
	node = json_object_get_member(pJsonObject, boxesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EnrichedOrderBoxLayoutDTO> new_list;
			EnrichedOrderBoxLayoutDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EnrichedOrderBoxLayoutDTO")) {
					jsonToValue(&inst, temp_json, "EnrichedOrderBoxLayoutDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			boxes = new_list;
		}
		
	}
}

OrderBoxesLayoutDTO::OrderBoxesLayoutDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderBoxesLayoutDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EnrichedOrderBoxLayoutDTO")) {
		list<EnrichedOrderBoxLayoutDTO> new_list = static_cast<list <EnrichedOrderBoxLayoutDTO> > (getBoxes());
		node = converttoJson(&new_list, "EnrichedOrderBoxLayoutDTO", "array");
	} else {
		node = json_node_alloc();
		list<EnrichedOrderBoxLayoutDTO> new_list = static_cast<list <EnrichedOrderBoxLayoutDTO> > (getBoxes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EnrichedOrderBoxLayoutDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EnrichedOrderBoxLayoutDTO obj = *it;
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

std::list<EnrichedOrderBoxLayoutDTO>
OrderBoxesLayoutDTO::getBoxes()
{
	return boxes;
}

void
OrderBoxesLayoutDTO::setBoxes(std::list <EnrichedOrderBoxLayoutDTO> boxes)
{
	this->boxes = boxes;
}


