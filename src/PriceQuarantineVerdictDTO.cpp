#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceQuarantineVerdictDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceQuarantineVerdictDTO::PriceQuarantineVerdictDTO()
{
	//__init();
}

PriceQuarantineVerdictDTO::~PriceQuarantineVerdictDTO()
{
	//__cleanup();
}

void
PriceQuarantineVerdictDTO::__init()
{
	//type = new PriceQuarantineVerdictType();
	//new std::list()std::list> params;
}

void
PriceQuarantineVerdictDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(params != NULL) {
	//params.RemoveAll(true);
	//delete params;
	//params = NULL;
	//}
	//
}

void
PriceQuarantineVerdictDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PriceQuarantineVerdictType")) {
			jsonToValue(&type, node, "PriceQuarantineVerdictType", "PriceQuarantineVerdictType");
		} else {
			
			PriceQuarantineVerdictType* obj = static_cast<PriceQuarantineVerdictType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *paramsKey = "params";
	node = json_object_get_member(pJsonObject, paramsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PriceQuarantineVerdictParameterDTO> new_list;
			PriceQuarantineVerdictParameterDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PriceQuarantineVerdictParameterDTO")) {
					jsonToValue(&inst, temp_json, "PriceQuarantineVerdictParameterDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			params = new_list;
		}
		
	}
}

PriceQuarantineVerdictDTO::PriceQuarantineVerdictDTO(char* json)
{
	this->fromJson(json);
}

char*
PriceQuarantineVerdictDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PriceQuarantineVerdictType")) {
		PriceQuarantineVerdictType obj = getType();
		node = converttoJson(&obj, "PriceQuarantineVerdictType", "");
	}
	else {
		
		PriceQuarantineVerdictType obj = static_cast<PriceQuarantineVerdictType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("PriceQuarantineVerdictParameterDTO")) {
		list<PriceQuarantineVerdictParameterDTO> new_list = static_cast<list <PriceQuarantineVerdictParameterDTO> > (getParams());
		node = converttoJson(&new_list, "PriceQuarantineVerdictParameterDTO", "array");
	} else {
		node = json_node_alloc();
		list<PriceQuarantineVerdictParameterDTO> new_list = static_cast<list <PriceQuarantineVerdictParameterDTO> > (getParams());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PriceQuarantineVerdictParameterDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PriceQuarantineVerdictParameterDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *paramsKey = "params";
	json_object_set_member(pJsonObject, paramsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

PriceQuarantineVerdictType
PriceQuarantineVerdictDTO::getType()
{
	return type;
}

void
PriceQuarantineVerdictDTO::setType(PriceQuarantineVerdictType  type)
{
	this->type = type;
}

std::list<PriceQuarantineVerdictParameterDTO>
PriceQuarantineVerdictDTO::getParams()
{
	return params;
}

void
PriceQuarantineVerdictDTO::setParams(std::list <PriceQuarantineVerdictParameterDTO> params)
{
	this->params = params;
}


