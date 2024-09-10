#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOfferRecommendationsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOfferRecommendationsResponse::GetOfferRecommendationsResponse()
{
	//__init();
}

GetOfferRecommendationsResponse::~GetOfferRecommendationsResponse()
{
	//__cleanup();
}

void
GetOfferRecommendationsResponse::__init()
{
	//status = new ApiResponseStatusType();
	//result = new OfferRecommendationsResultDTO();
}

void
GetOfferRecommendationsResponse::__cleanup()
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
GetOfferRecommendationsResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("OfferRecommendationsResultDTO")) {
			jsonToValue(&result, node, "OfferRecommendationsResultDTO", "OfferRecommendationsResultDTO");
		} else {
			
			OfferRecommendationsResultDTO* obj = static_cast<OfferRecommendationsResultDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetOfferRecommendationsResponse::GetOfferRecommendationsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetOfferRecommendationsResponse::toJson()
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
	if (isprimitive("OfferRecommendationsResultDTO")) {
		OfferRecommendationsResultDTO obj = getResult();
		node = converttoJson(&obj, "OfferRecommendationsResultDTO", "");
	}
	else {
		
		OfferRecommendationsResultDTO obj = static_cast<OfferRecommendationsResultDTO> (getResult());
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
GetOfferRecommendationsResponse::getStatus()
{
	return status;
}

void
GetOfferRecommendationsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferRecommendationsResultDTO
GetOfferRecommendationsResponse::getResult()
{
	return result;
}

void
GetOfferRecommendationsResponse::setResult(OfferRecommendationsResultDTO  result)
{
	this->result = result;
}


