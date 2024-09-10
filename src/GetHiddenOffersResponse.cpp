#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetHiddenOffersResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetHiddenOffersResponse::GetHiddenOffersResponse()
{
	//__init();
}

GetHiddenOffersResponse::~GetHiddenOffersResponse()
{
	//__cleanup();
}

void
GetHiddenOffersResponse::__init()
{
	//status = new ApiResponseStatusType();
	//result = new GetHiddenOffersResultDTO();
}

void
GetHiddenOffersResponse::__cleanup()
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
GetHiddenOffersResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("GetHiddenOffersResultDTO")) {
			jsonToValue(&result, node, "GetHiddenOffersResultDTO", "GetHiddenOffersResultDTO");
		} else {
			
			GetHiddenOffersResultDTO* obj = static_cast<GetHiddenOffersResultDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetHiddenOffersResponse::GetHiddenOffersResponse(char* json)
{
	this->fromJson(json);
}

char*
GetHiddenOffersResponse::toJson()
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
	if (isprimitive("GetHiddenOffersResultDTO")) {
		GetHiddenOffersResultDTO obj = getResult();
		node = converttoJson(&obj, "GetHiddenOffersResultDTO", "");
	}
	else {
		
		GetHiddenOffersResultDTO obj = static_cast<GetHiddenOffersResultDTO> (getResult());
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
GetHiddenOffersResponse::getStatus()
{
	return status;
}

void
GetHiddenOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetHiddenOffersResultDTO
GetHiddenOffersResponse::getResult()
{
	return result;
}

void
GetHiddenOffersResponse::setResult(GetHiddenOffersResultDTO  result)
{
	this->result = result;
}


