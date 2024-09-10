#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOrderStatusesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOrderStatusesResponse::UpdateOrderStatusesResponse()
{
	//__init();
}

UpdateOrderStatusesResponse::~UpdateOrderStatusesResponse()
{
	//__cleanup();
}

void
UpdateOrderStatusesResponse::__init()
{
	//status = new ApiResponseStatusType();
	//result = new UpdateOrderStatusesDTO();
}

void
UpdateOrderStatusesResponse::__cleanup()
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
UpdateOrderStatusesResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("UpdateOrderStatusesDTO")) {
			jsonToValue(&result, node, "UpdateOrderStatusesDTO", "UpdateOrderStatusesDTO");
		} else {
			
			UpdateOrderStatusesDTO* obj = static_cast<UpdateOrderStatusesDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateOrderStatusesResponse::UpdateOrderStatusesResponse(char* json)
{
	this->fromJson(json);
}

char*
UpdateOrderStatusesResponse::toJson()
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
	if (isprimitive("UpdateOrderStatusesDTO")) {
		UpdateOrderStatusesDTO obj = getResult();
		node = converttoJson(&obj, "UpdateOrderStatusesDTO", "");
	}
	else {
		
		UpdateOrderStatusesDTO obj = static_cast<UpdateOrderStatusesDTO> (getResult());
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
UpdateOrderStatusesResponse::getStatus()
{
	return status;
}

void
UpdateOrderStatusesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

UpdateOrderStatusesDTO
UpdateOrderStatusesResponse::getResult()
{
	return result;
}

void
UpdateOrderStatusesResponse::setResult(UpdateOrderStatusesDTO  result)
{
	this->result = result;
}


