#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ReportInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ReportInfoDTO::ReportInfoDTO()
{
	//__init();
}

ReportInfoDTO::~ReportInfoDTO()
{
	//__cleanup();
}

void
ReportInfoDTO::__init()
{
	//status = new ReportStatusType();
	//subStatus = new ReportSubStatusType();
	//generationRequestedAt = null;
	//generationFinishedAt = null;
	//file = std::string();
	//estimatedGenerationTime = long(0);
}

void
ReportInfoDTO::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(subStatus != NULL) {
	//
	//delete subStatus;
	//subStatus = NULL;
	//}
	//if(generationRequestedAt != NULL) {
	//
	//delete generationRequestedAt;
	//generationRequestedAt = NULL;
	//}
	//if(generationFinishedAt != NULL) {
	//
	//delete generationFinishedAt;
	//generationFinishedAt = NULL;
	//}
	//if(file != NULL) {
	//
	//delete file;
	//file = NULL;
	//}
	//if(estimatedGenerationTime != NULL) {
	//
	//delete estimatedGenerationTime;
	//estimatedGenerationTime = NULL;
	//}
	//
}

void
ReportInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ReportStatusType")) {
			jsonToValue(&status, node, "ReportStatusType", "ReportStatusType");
		} else {
			
			ReportStatusType* obj = static_cast<ReportStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *subStatusKey = "subStatus";
	node = json_object_get_member(pJsonObject, subStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("ReportSubStatusType")) {
			jsonToValue(&subStatus, node, "ReportSubStatusType", "ReportSubStatusType");
		} else {
			
			ReportSubStatusType* obj = static_cast<ReportSubStatusType*> (&subStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *generationRequestedAtKey = "generationRequestedAt";
	node = json_object_get_member(pJsonObject, generationRequestedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&generationRequestedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *generationFinishedAtKey = "generationFinishedAt";
	node = json_object_get_member(pJsonObject, generationFinishedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&generationFinishedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *fileKey = "file";
	node = json_object_get_member(pJsonObject, fileKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *estimatedGenerationTimeKey = "estimatedGenerationTime";
	node = json_object_get_member(pJsonObject, estimatedGenerationTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&estimatedGenerationTime, node, "long long", "");
		} else {
			
		}
	}
}

ReportInfoDTO::ReportInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
ReportInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ReportStatusType")) {
		ReportStatusType obj = getStatus();
		node = converttoJson(&obj, "ReportStatusType", "");
	}
	else {
		
		ReportStatusType obj = static_cast<ReportStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("ReportSubStatusType")) {
		ReportSubStatusType obj = getSubStatus();
		node = converttoJson(&obj, "ReportSubStatusType", "");
	}
	else {
		
		ReportSubStatusType obj = static_cast<ReportSubStatusType> (getSubStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *subStatusKey = "subStatus";
	json_object_set_member(pJsonObject, subStatusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGenerationRequestedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *generationRequestedAtKey = "generationRequestedAt";
	json_object_set_member(pJsonObject, generationRequestedAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGenerationFinishedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *generationFinishedAtKey = "generationFinishedAt";
	json_object_set_member(pJsonObject, generationFinishedAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFile();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fileKey = "file";
	json_object_set_member(pJsonObject, fileKey, node);
	if (isprimitive("long long")) {
		long long obj = getEstimatedGenerationTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *estimatedGenerationTimeKey = "estimatedGenerationTime";
	json_object_set_member(pJsonObject, estimatedGenerationTimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ReportStatusType
ReportInfoDTO::getStatus()
{
	return status;
}

void
ReportInfoDTO::setStatus(ReportStatusType  status)
{
	this->status = status;
}

ReportSubStatusType
ReportInfoDTO::getSubStatus()
{
	return subStatus;
}

void
ReportInfoDTO::setSubStatus(ReportSubStatusType  subStatus)
{
	this->subStatus = subStatus;
}

std::string
ReportInfoDTO::getGenerationRequestedAt()
{
	return generationRequestedAt;
}

void
ReportInfoDTO::setGenerationRequestedAt(std::string  generationRequestedAt)
{
	this->generationRequestedAt = generationRequestedAt;
}

std::string
ReportInfoDTO::getGenerationFinishedAt()
{
	return generationFinishedAt;
}

void
ReportInfoDTO::setGenerationFinishedAt(std::string  generationFinishedAt)
{
	this->generationFinishedAt = generationFinishedAt;
}

std::string
ReportInfoDTO::getFile()
{
	return file;
}

void
ReportInfoDTO::setFile(std::string  file)
{
	this->file = file;
}

long long
ReportInfoDTO::getEstimatedGenerationTime()
{
	return estimatedGenerationTime;
}

void
ReportInfoDTO::setEstimatedGenerationTime(long long  estimatedGenerationTime)
{
	this->estimatedGenerationTime = estimatedGenerationTime;
}


