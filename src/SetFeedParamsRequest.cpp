#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SetFeedParamsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SetFeedParamsRequest::SetFeedParamsRequest()
{
	//__init();
}

SetFeedParamsRequest::~SetFeedParamsRequest()
{
	//__cleanup();
}

void
SetFeedParamsRequest::__init()
{
	//new std::list()std::list> parameters;
}

void
SetFeedParamsRequest::__cleanup()
{
	//if(parameters != NULL) {
	//parameters.RemoveAll(true);
	//delete parameters;
	//parameters = NULL;
	//}
	//
}

void
SetFeedParamsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *parametersKey = "parameters";
	node = json_object_get_member(pJsonObject, parametersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FeedParameterDTO> new_list;
			FeedParameterDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FeedParameterDTO")) {
					jsonToValue(&inst, temp_json, "FeedParameterDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			parameters = new_list;
		}
		
	}
}

SetFeedParamsRequest::SetFeedParamsRequest(char* json)
{
	this->fromJson(json);
}

char*
SetFeedParamsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FeedParameterDTO")) {
		list<FeedParameterDTO> new_list = static_cast<list <FeedParameterDTO> > (getParameters());
		node = converttoJson(&new_list, "FeedParameterDTO", "array");
	} else {
		node = json_node_alloc();
		list<FeedParameterDTO> new_list = static_cast<list <FeedParameterDTO> > (getParameters());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FeedParameterDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FeedParameterDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *parametersKey = "parameters";
	json_object_set_member(pJsonObject, parametersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<FeedParameterDTO>
SetFeedParamsRequest::getParameters()
{
	return parameters;
}

void
SetFeedParamsRequest::setParameters(std::list <FeedParameterDTO> parameters)
{
	this->parameters = parameters;
}


