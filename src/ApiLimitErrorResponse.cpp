#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ApiLimitErrorResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ApiLimitErrorResponse::ApiLimitErrorResponse()
{
	//__init();
}

ApiLimitErrorResponse::~ApiLimitErrorResponse()
{
	//__cleanup();
}

void
ApiLimitErrorResponse::__init()
{
	//status = new ApiResponseStatusType();
	//new std::list()std::list> errors;
}

void
ApiLimitErrorResponse::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//
}

void
ApiLimitErrorResponse::fromJson(char* jsonStr)
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
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ApiErrorDTO> new_list;
			ApiErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ApiErrorDTO")) {
					jsonToValue(&inst, temp_json, "ApiErrorDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
}

ApiLimitErrorResponse::ApiLimitErrorResponse(char* json)
{
	this->fromJson(json);
}

char*
ApiLimitErrorResponse::toJson()
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
	if (isprimitive("ApiErrorDTO")) {
		list<ApiErrorDTO> new_list = static_cast<list <ApiErrorDTO> > (getErrors());
		node = converttoJson(&new_list, "ApiErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<ApiErrorDTO> new_list = static_cast<list <ApiErrorDTO> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ApiErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ApiErrorDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ApiResponseStatusType
ApiLimitErrorResponse::getStatus()
{
	return status;
}

void
ApiLimitErrorResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

std::list<ApiErrorDTO>
ApiLimitErrorResponse::getErrors()
{
	return errors;
}

void
ApiLimitErrorResponse::setErrors(std::list <ApiErrorDTO> errors)
{
	this->errors = errors;
}


