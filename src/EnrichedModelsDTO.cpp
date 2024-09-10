#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnrichedModelsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnrichedModelsDTO::EnrichedModelsDTO()
{
	//__init();
}

EnrichedModelsDTO::~EnrichedModelsDTO()
{
	//__cleanup();
}

void
EnrichedModelsDTO::__init()
{
	//new std::list()std::list> models;
}

void
EnrichedModelsDTO::__cleanup()
{
	//if(models != NULL) {
	//models.RemoveAll(true);
	//delete models;
	//models = NULL;
	//}
	//
}

void
EnrichedModelsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelsKey = "models";
	node = json_object_get_member(pJsonObject, modelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EnrichedModelDTO> new_list;
			EnrichedModelDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EnrichedModelDTO")) {
					jsonToValue(&inst, temp_json, "EnrichedModelDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			models = new_list;
		}
		
	}
}

EnrichedModelsDTO::EnrichedModelsDTO(char* json)
{
	this->fromJson(json);
}

char*
EnrichedModelsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EnrichedModelDTO")) {
		list<EnrichedModelDTO> new_list = static_cast<list <EnrichedModelDTO> > (getModels());
		node = converttoJson(&new_list, "EnrichedModelDTO", "array");
	} else {
		node = json_node_alloc();
		list<EnrichedModelDTO> new_list = static_cast<list <EnrichedModelDTO> > (getModels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EnrichedModelDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EnrichedModelDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *modelsKey = "models";
	json_object_set_member(pJsonObject, modelsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<EnrichedModelDTO>
EnrichedModelsDTO::getModels()
{
	return models;
}

void
EnrichedModelsDTO::setModels(std::list <EnrichedModelDTO> models)
{
	this->models = models;
}


