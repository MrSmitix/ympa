#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOfferMappingEntriesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOfferMappingEntriesResponse::GetOfferMappingEntriesResponse()
{
	//__init();
}

GetOfferMappingEntriesResponse::~GetOfferMappingEntriesResponse()
{
	//__cleanup();
}

void
GetOfferMappingEntriesResponse::__init()
{
	//status = new ApiResponseStatusType();
	//result = new OfferMappingEntriesDTO();
}

void
GetOfferMappingEntriesResponse::__cleanup()
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
GetOfferMappingEntriesResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("OfferMappingEntriesDTO")) {
			jsonToValue(&result, node, "OfferMappingEntriesDTO", "OfferMappingEntriesDTO");
		} else {
			
			OfferMappingEntriesDTO* obj = static_cast<OfferMappingEntriesDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetOfferMappingEntriesResponse::GetOfferMappingEntriesResponse(char* json)
{
	this->fromJson(json);
}

char*
GetOfferMappingEntriesResponse::toJson()
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
	if (isprimitive("OfferMappingEntriesDTO")) {
		OfferMappingEntriesDTO obj = getResult();
		node = converttoJson(&obj, "OfferMappingEntriesDTO", "");
	}
	else {
		
		OfferMappingEntriesDTO obj = static_cast<OfferMappingEntriesDTO> (getResult());
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
GetOfferMappingEntriesResponse::getStatus()
{
	return status;
}

void
GetOfferMappingEntriesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferMappingEntriesDTO
GetOfferMappingEntriesResponse::getResult()
{
	return result;
}

void
GetOfferMappingEntriesResponse::setResult(OfferMappingEntriesDTO  result)
{
	this->result = result;
}


