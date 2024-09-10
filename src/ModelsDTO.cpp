#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ModelsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ModelsDTO::ModelsDTO()
{
	//__init();
}

ModelsDTO::~ModelsDTO()
{
	//__cleanup();
}

void
ModelsDTO::__init()
{
	//new std::list()std::list> models;
}

void
ModelsDTO::__cleanup()
{
	//if(models != NULL) {
	//models.RemoveAll(true);
	//delete models;
	//models = NULL;
	//}
	//
}

void
ModelsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelsKey = "models";
	node = json_object_get_member(pJsonObject, modelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ModelDTO> new_list;
			ModelDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ModelDTO")) {
					jsonToValue(&inst, temp_json, "ModelDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			models = new_list;
		}
		
	}
}

ModelsDTO::ModelsDTO(char* json)
{
	this->fromJson(json);
}

char*
ModelsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ModelDTO")) {
		list<ModelDTO> new_list = static_cast<list <ModelDTO> > (getModels());
		node = converttoJson(&new_list, "ModelDTO", "array");
	} else {
		node = json_node_alloc();
		list<ModelDTO> new_list = static_cast<list <ModelDTO> > (getModels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ModelDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ModelDTO obj = *it;
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

std::list<ModelDTO>
ModelsDTO::getModels()
{
	return models;
}

void
ModelsDTO::setModels(std::list <ModelDTO> models)
{
	this->models = models;
}


