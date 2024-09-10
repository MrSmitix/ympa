#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetSuggestedOfferMappingEntriesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetSuggestedOfferMappingEntriesResponse::GetSuggestedOfferMappingEntriesResponse()
{
	//__init();
}

GetSuggestedOfferMappingEntriesResponse::~GetSuggestedOfferMappingEntriesResponse()
{
	//__cleanup();
}

void
GetSuggestedOfferMappingEntriesResponse::__init()
{
	//status = new ApiResponseStatusType();
	//result = new OfferMappingSuggestionsListDTO();
}

void
GetSuggestedOfferMappingEntriesResponse::__cleanup()
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
GetSuggestedOfferMappingEntriesResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("OfferMappingSuggestionsListDTO")) {
			jsonToValue(&result, node, "OfferMappingSuggestionsListDTO", "OfferMappingSuggestionsListDTO");
		} else {
			
			OfferMappingSuggestionsListDTO* obj = static_cast<OfferMappingSuggestionsListDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetSuggestedOfferMappingEntriesResponse::GetSuggestedOfferMappingEntriesResponse(char* json)
{
	this->fromJson(json);
}

char*
GetSuggestedOfferMappingEntriesResponse::toJson()
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
	if (isprimitive("OfferMappingSuggestionsListDTO")) {
		OfferMappingSuggestionsListDTO obj = getResult();
		node = converttoJson(&obj, "OfferMappingSuggestionsListDTO", "");
	}
	else {
		
		OfferMappingSuggestionsListDTO obj = static_cast<OfferMappingSuggestionsListDTO> (getResult());
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
GetSuggestedOfferMappingEntriesResponse::getStatus()
{
	return status;
}

void
GetSuggestedOfferMappingEntriesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferMappingSuggestionsListDTO
GetSuggestedOfferMappingEntriesResponse::getResult()
{
	return result;
}

void
GetSuggestedOfferMappingEntriesResponse::setResult(OfferMappingSuggestionsListDTO  result)
{
	this->result = result;
}


