#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedDownloadDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedDownloadDTO::FeedDownloadDTO()
{
	//__init();
}

FeedDownloadDTO::~FeedDownloadDTO()
{
	//__cleanup();
}

void
FeedDownloadDTO::__init()
{
	//status = new FeedStatusType();
	//error = new FeedDownloadErrorDTO();
}

void
FeedDownloadDTO::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
FeedDownloadDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedDownloadErrorDTO")) {
			jsonToValue(&error, node, "FeedDownloadErrorDTO", "FeedDownloadErrorDTO");
		} else {
			
			FeedDownloadErrorDTO* obj = static_cast<FeedDownloadErrorDTO*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FeedDownloadDTO::FeedDownloadDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedDownloadDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("FeedDownloadErrorDTO")) {
		FeedDownloadErrorDTO obj = getError();
		node = converttoJson(&obj, "FeedDownloadErrorDTO", "");
	}
	else {
		
		FeedDownloadErrorDTO obj = static_cast<FeedDownloadErrorDTO> (getError());
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

FeedStatusType
FeedDownloadDTO::getStatus()
{
	return status;
}

void
FeedDownloadDTO::setStatus(FeedStatusType  status)
{
	this->status = status;
}

FeedDownloadErrorDTO
FeedDownloadDTO::getError()
{
	return error;
}

void
FeedDownloadDTO::setError(FeedDownloadErrorDTO  error)
{
	this->error = error;
}


