#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedIndexLogsRecordDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedIndexLogsRecordDTO::FeedIndexLogsRecordDTO()
{
	//__init();
}

FeedIndexLogsRecordDTO::~FeedIndexLogsRecordDTO()
{
	//__cleanup();
}

void
FeedIndexLogsRecordDTO::__init()
{
	//downloadTime = null;
	//fileTime = null;
	//generationId = long(0);
	//indexType = new FeedIndexLogsIndexType();
	//publishedTime = null;
	//status = new FeedIndexLogsStatusType();
	//error = new FeedIndexLogsErrorDTO();
	//offers = new FeedIndexLogsOffersDTO();
}

void
FeedIndexLogsRecordDTO::__cleanup()
{
	//if(downloadTime != NULL) {
	//
	//delete downloadTime;
	//downloadTime = NULL;
	//}
	//if(fileTime != NULL) {
	//
	//delete fileTime;
	//fileTime = NULL;
	//}
	//if(generationId != NULL) {
	//
	//delete generationId;
	//generationId = NULL;
	//}
	//if(indexType != NULL) {
	//
	//delete indexType;
	//indexType = NULL;
	//}
	//if(publishedTime != NULL) {
	//
	//delete publishedTime;
	//publishedTime = NULL;
	//}
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
	//if(offers != NULL) {
	//
	//delete offers;
	//offers = NULL;
	//}
	//
}

void
FeedIndexLogsRecordDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *downloadTimeKey = "downloadTime";
	node = json_object_get_member(pJsonObject, downloadTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&downloadTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *fileTimeKey = "fileTime";
	node = json_object_get_member(pJsonObject, fileTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fileTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *generationIdKey = "generationId";
	node = json_object_get_member(pJsonObject, generationIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&generationId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *indexTypeKey = "indexType";
	node = json_object_get_member(pJsonObject, indexTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedIndexLogsIndexType")) {
			jsonToValue(&indexType, node, "FeedIndexLogsIndexType", "FeedIndexLogsIndexType");
		} else {
			
			FeedIndexLogsIndexType* obj = static_cast<FeedIndexLogsIndexType*> (&indexType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *publishedTimeKey = "publishedTime";
	node = json_object_get_member(pJsonObject, publishedTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&publishedTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedIndexLogsStatusType")) {
			jsonToValue(&status, node, "FeedIndexLogsStatusType", "FeedIndexLogsStatusType");
		} else {
			
			FeedIndexLogsStatusType* obj = static_cast<FeedIndexLogsStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedIndexLogsErrorDTO")) {
			jsonToValue(&error, node, "FeedIndexLogsErrorDTO", "FeedIndexLogsErrorDTO");
		} else {
			
			FeedIndexLogsErrorDTO* obj = static_cast<FeedIndexLogsErrorDTO*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedIndexLogsOffersDTO")) {
			jsonToValue(&offers, node, "FeedIndexLogsOffersDTO", "FeedIndexLogsOffersDTO");
		} else {
			
			FeedIndexLogsOffersDTO* obj = static_cast<FeedIndexLogsOffersDTO*> (&offers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FeedIndexLogsRecordDTO::FeedIndexLogsRecordDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedIndexLogsRecordDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDownloadTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *downloadTimeKey = "downloadTime";
	json_object_set_member(pJsonObject, downloadTimeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFileTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fileTimeKey = "fileTime";
	json_object_set_member(pJsonObject, fileTimeKey, node);
	if (isprimitive("long long")) {
		long long obj = getGenerationId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *generationIdKey = "generationId";
	json_object_set_member(pJsonObject, generationIdKey, node);
	if (isprimitive("FeedIndexLogsIndexType")) {
		FeedIndexLogsIndexType obj = getIndexType();
		node = converttoJson(&obj, "FeedIndexLogsIndexType", "");
	}
	else {
		
		FeedIndexLogsIndexType obj = static_cast<FeedIndexLogsIndexType> (getIndexType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *indexTypeKey = "indexType";
	json_object_set_member(pJsonObject, indexTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPublishedTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *publishedTimeKey = "publishedTime";
	json_object_set_member(pJsonObject, publishedTimeKey, node);
	if (isprimitive("FeedIndexLogsStatusType")) {
		FeedIndexLogsStatusType obj = getStatus();
		node = converttoJson(&obj, "FeedIndexLogsStatusType", "");
	}
	else {
		
		FeedIndexLogsStatusType obj = static_cast<FeedIndexLogsStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("FeedIndexLogsErrorDTO")) {
		FeedIndexLogsErrorDTO obj = getError();
		node = converttoJson(&obj, "FeedIndexLogsErrorDTO", "");
	}
	else {
		
		FeedIndexLogsErrorDTO obj = static_cast<FeedIndexLogsErrorDTO> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	if (isprimitive("FeedIndexLogsOffersDTO")) {
		FeedIndexLogsOffersDTO obj = getOffers();
		node = converttoJson(&obj, "FeedIndexLogsOffersDTO", "");
	}
	else {
		
		FeedIndexLogsOffersDTO obj = static_cast<FeedIndexLogsOffersDTO> (getOffers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FeedIndexLogsRecordDTO::getDownloadTime()
{
	return downloadTime;
}

void
FeedIndexLogsRecordDTO::setDownloadTime(std::string  downloadTime)
{
	this->downloadTime = downloadTime;
}

std::string
FeedIndexLogsRecordDTO::getFileTime()
{
	return fileTime;
}

void
FeedIndexLogsRecordDTO::setFileTime(std::string  fileTime)
{
	this->fileTime = fileTime;
}

long long
FeedIndexLogsRecordDTO::getGenerationId()
{
	return generationId;
}

void
FeedIndexLogsRecordDTO::setGenerationId(long long  generationId)
{
	this->generationId = generationId;
}

FeedIndexLogsIndexType
FeedIndexLogsRecordDTO::getIndexType()
{
	return indexType;
}

void
FeedIndexLogsRecordDTO::setIndexType(FeedIndexLogsIndexType  indexType)
{
	this->indexType = indexType;
}

std::string
FeedIndexLogsRecordDTO::getPublishedTime()
{
	return publishedTime;
}

void
FeedIndexLogsRecordDTO::setPublishedTime(std::string  publishedTime)
{
	this->publishedTime = publishedTime;
}

FeedIndexLogsStatusType
FeedIndexLogsRecordDTO::getStatus()
{
	return status;
}

void
FeedIndexLogsRecordDTO::setStatus(FeedIndexLogsStatusType  status)
{
	this->status = status;
}

FeedIndexLogsErrorDTO
FeedIndexLogsRecordDTO::getError()
{
	return error;
}

void
FeedIndexLogsRecordDTO::setError(FeedIndexLogsErrorDTO  error)
{
	this->error = error;
}

FeedIndexLogsOffersDTO
FeedIndexLogsRecordDTO::getOffers()
{
	return offers;
}

void
FeedIndexLogsRecordDTO::setOffers(FeedIndexLogsOffersDTO  offers)
{
	this->offers = offers;
}


