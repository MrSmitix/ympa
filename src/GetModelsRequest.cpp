#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetModelsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetModelsRequest::GetModelsRequest()
{
	//__init();
}

GetModelsRequest::~GetModelsRequest()
{
	//__cleanup();
}

void
GetModelsRequest::__init()
{
	//new std::list()std::list> models;
}

void
GetModelsRequest::__cleanup()
{
	//if(models != NULL) {
	//models.RemoveAll(true);
	//delete models;
	//models = NULL;
	//}
	//
}

void
GetModelsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelsKey = "models";
	node = json_object_get_member(pJsonObject, modelsKey);
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
			models = new_list;
		}
		
	}
}

GetModelsRequest::GetModelsRequest(char* json)
{
	this->fromJson(json);
}

char*
GetModelsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getModels());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getModels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
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

std::list<long long>
GetModelsRequest::getModels()
{
	return models;
}

void
GetModelsRequest::setModels(std::list <long long> models)
{
	this->models = models;
}


