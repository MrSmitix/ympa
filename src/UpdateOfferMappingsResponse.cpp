#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOfferMappingsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOfferMappingsResponse::UpdateOfferMappingsResponse()
{
	//__init();
}

UpdateOfferMappingsResponse::~UpdateOfferMappingsResponse()
{
	//__cleanup();
}

void
UpdateOfferMappingsResponse::__init()
{
	//status = new ApiResponseStatusType();
	//new std::list()std::list> results;
}

void
UpdateOfferMappingsResponse::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(results != NULL) {
	//results.RemoveAll(true);
	//delete results;
	//results = NULL;
	//}
	//
}

void
UpdateOfferMappingsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ApiResponseStatusType")) {
			jsonToValue(&status, node, "ApiResponseStatusType", "ApiResponseStatusType");
		} else {
			
			ApiResponseStatusType* obj = static_cast<ApiResponseStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resultsKey = "results";
	node = json_object_get_member(pJsonObject, resultsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateOfferMappingResultDTO> new_list;
			UpdateOfferMappingResultDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateOfferMappingResultDTO")) {
					jsonToValue(&inst, temp_json, "UpdateOfferMappingResultDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			results = new_list;
		}
		
	}
}

UpdateOfferMappingsResponse::UpdateOfferMappingsResponse(char* json)
{
	this->fromJson(json);
}

char*
UpdateOfferMappingsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ApiResponseStatusType")) {
		ApiResponseStatusType obj = getStatus();
		node = converttoJson(&obj, "ApiResponseStatusType", "");
	}
	else {
		
		ApiResponseStatusType obj = static_cast<ApiResponseStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("UpdateOfferMappingResultDTO")) {
		list<UpdateOfferMappingResultDTO> new_list = static_cast<list <UpdateOfferMappingResultDTO> > (getResults());
		node = converttoJson(&new_list, "UpdateOfferMappingResultDTO", "array");
	} else {
		node = json_node_alloc();
		list<UpdateOfferMappingResultDTO> new_list = static_cast<list <UpdateOfferMappingResultDTO> > (getResults());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateOfferMappingResultDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateOfferMappingResultDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *resultsKey = "results";
	json_object_set_member(pJsonObject, resultsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ApiResponseStatusType
UpdateOfferMappingsResponse::getStatus()
{
	return status;
}

void
UpdateOfferMappingsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

std::list<UpdateOfferMappingResultDTO>
UpdateOfferMappingsResponse::getResults()
{
	return results;
}

void
UpdateOfferMappingsResponse::setResults(std::list <UpdateOfferMappingResultDTO> results)
{
	this->results = results;
}


