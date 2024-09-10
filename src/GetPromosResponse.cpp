#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromosResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromosResponse::GetPromosResponse()
{
	//__init();
}

GetPromosResponse::~GetPromosResponse()
{
	//__cleanup();
}

void
GetPromosResponse::__init()
{
	//status = new ApiResponseStatusType();
	//result = new GetPromosResultDTO();
}

void
GetPromosResponse::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(result != NULL) {
	//
	//delete result;
	//result = NULL;
	//}
	//
}

void
GetPromosResponse::fromJson(char* jsonStr)
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
	const gchar *resultKey = "result";
	node = json_object_get_member(pJsonObject, resultKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPromosResultDTO")) {
			jsonToValue(&result, node, "GetPromosResultDTO", "GetPromosResultDTO");
		} else {
			
			GetPromosResultDTO* obj = static_cast<GetPromosResultDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetPromosResponse::GetPromosResponse(char* json)
{
	this->fromJson(json);
}

char*
GetPromosResponse::toJson()
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
	if (isprimitive("GetPromosResultDTO")) {
		GetPromosResultDTO obj = getResult();
		node = converttoJson(&obj, "GetPromosResultDTO", "");
	}
	else {
		
		GetPromosResultDTO obj = static_cast<GetPromosResultDTO> (getResult());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resultKey = "result";
	json_object_set_member(pJsonObject, resultKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ApiResponseStatusType
GetPromosResponse::getStatus()
{
	return status;
}

void
GetPromosResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetPromosResultDTO
GetPromosResponse::getResult()
{
	return result;
}

void
GetPromosResponse::setResult(GetPromosResultDTO  result)
{
	this->result = result;
}


