#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedContentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedContentDTO::FeedContentDTO()
{
	//__init();
}

FeedContentDTO::~FeedContentDTO()
{
	//__cleanup();
}

void
FeedContentDTO::__init()
{
	//rejectedOffersCount = long(0);
	//status = new FeedStatusType();
	//totalOffersCount = long(0);
	//error = new FeedContentErrorDTO();
}

void
FeedContentDTO::__cleanup()
{
	//if(rejectedOffersCount != NULL) {
	//
	//delete rejectedOffersCount;
	//rejectedOffersCount = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(totalOffersCount != NULL) {
	//
	//delete totalOffersCount;
	//totalOffersCount = NULL;
	//}
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
FeedContentDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rejectedOffersCountKey = "rejectedOffersCount";
	node = json_object_get_member(pJsonObject, rejectedOffersCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&rejectedOffersCount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedStatusType")) {
			jsonToValue(&status, node, "FeedStatusType", "FeedStatusType");
		} else {
			
			FeedStatusType* obj = static_cast<FeedStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *totalOffersCountKey = "totalOffersCount";
	node = json_object_get_member(pJsonObject, totalOffersCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&totalOffersCount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedContentErrorDTO")) {
			jsonToValue(&error, node, "FeedContentErrorDTO", "FeedContentErrorDTO");
		} else {
			
			FeedContentErrorDTO* obj = static_cast<FeedContentErrorDTO*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FeedContentDTO::FeedContentDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedContentDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getRejectedOffersCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *rejectedOffersCountKey = "rejectedOffersCount";
	json_object_set_member(pJsonObject, rejectedOffersCountKey, node);
	if (isprimitive("FeedStatusType")) {
		FeedStatusType obj = getStatus();
		node = converttoJson(&obj, "FeedStatusType", "");
	}
	else {
		
		FeedStatusType obj = static_cast<FeedStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("long long")) {
		long long obj = getTotalOffersCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *totalOffersCountKey = "totalOffersCount";
	json_object_set_member(pJsonObject, totalOffersCountKey, node);
	if (isprimitive("FeedContentErrorDTO")) {
		FeedContentErrorDTO obj = getError();
		node = converttoJson(&obj, "FeedContentErrorDTO", "");
	}
	else {
		
		FeedContentErrorDTO obj = static_cast<FeedContentErrorDTO> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FeedContentDTO::getRejectedOffersCount()
{
	return rejectedOffersCount;
}

void
FeedContentDTO::setRejectedOffersCount(long long  rejectedOffersCount)
{
	this->rejectedOffersCount = rejectedOffersCount;
}

FeedStatusType
FeedContentDTO::getStatus()
{
	return status;
}

void
FeedContentDTO::setStatus(FeedStatusType  status)
{
	this->status = status;
}

long long
FeedContentDTO::getTotalOffersCount()
{
	return totalOffersCount;
}

void
FeedContentDTO::setTotalOffersCount(long long  totalOffersCount)
{
	this->totalOffersCount = totalOffersCount;
}

FeedContentErrorDTO
FeedContentDTO::getError()
{
	return error;
}

void
FeedContentDTO::setError(FeedContentErrorDTO  error)
{
	this->error = error;
}


