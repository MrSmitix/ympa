#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetFeedIndexLogsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetFeedIndexLogsResponse::GetFeedIndexLogsResponse()
{
	//__init();
}

GetFeedIndexLogsResponse::~GetFeedIndexLogsResponse()
{
	//__cleanup();
}

void
GetFeedIndexLogsResponse::__init()
{
	//status = new ApiResponseStatusType();
	//result = new FeedIndexLogsResultDTO();
}

void
GetFeedIndexLogsResponse::__cleanup()
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
GetFeedIndexLogsResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("FeedIndexLogsResultDTO")) {
			jsonToValue(&result, node, "FeedIndexLogsResultDTO", "FeedIndexLogsResultDTO");
		} else {
			
			FeedIndexLogsResultDTO* obj = static_cast<FeedIndexLogsResultDTO*> (&result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetFeedIndexLogsResponse::GetFeedIndexLogsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetFeedIndexLogsResponse::toJson()
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
	if (isprimitive("FeedIndexLogsResultDTO")) {
		FeedIndexLogsResultDTO obj = getResult();
		node = converttoJson(&obj, "FeedIndexLogsResultDTO", "");
	}
	else {
		
		FeedIndexLogsResultDTO obj = static_cast<FeedIndexLogsResultDTO> (getResult());
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
GetFeedIndexLogsResponse::getStatus()
{
	return status;
}

void
GetFeedIndexLogsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

FeedIndexLogsResultDTO
GetFeedIndexLogsResponse::getResult()
{
	return result;
}

void
GetFeedIndexLogsResponse::setResult(FeedIndexLogsResultDTO  result)
{
	this->result = result;
}


