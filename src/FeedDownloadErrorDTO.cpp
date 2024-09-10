#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedDownloadErrorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedDownloadErrorDTO::FeedDownloadErrorDTO()
{
	//__init();
}

FeedDownloadErrorDTO::~FeedDownloadErrorDTO()
{
	//__cleanup();
}

void
FeedDownloadErrorDTO::__init()
{
	//httpStatusCode = int(0);
	//type = new FeedDownloadErrorType();
	//description = std::string();
}

void
FeedDownloadErrorDTO::__cleanup()
{
	//if(httpStatusCode != NULL) {
	//
	//delete httpStatusCode;
	//httpStatusCode = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//
}

void
FeedDownloadErrorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *httpStatusCodeKey = "httpStatusCode";
	node = json_object_get_member(pJsonObject, httpStatusCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&httpStatusCode, node, "int", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedDownloadErrorType")) {
			jsonToValue(&type, node, "FeedDownloadErrorType", "FeedDownloadErrorType");
		} else {
			
			FeedDownloadErrorType* obj = static_cast<FeedDownloadErrorType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
}

FeedDownloadErrorDTO::FeedDownloadErrorDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedDownloadErrorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getHttpStatusCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *httpStatusCodeKey = "httpStatusCode";
	json_object_set_member(pJsonObject, httpStatusCodeKey, node);
	if (isprimitive("FeedDownloadErrorType")) {
		FeedDownloadErrorType obj = getType();
		node = converttoJson(&obj, "FeedDownloadErrorType", "");
	}
	else {
		
		FeedDownloadErrorType obj = static_cast<FeedDownloadErrorType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
FeedDownloadErrorDTO::getHttpStatusCode()
{
	return httpStatusCode;
}

void
FeedDownloadErrorDTO::setHttpStatusCode(int  httpStatusCode)
{
	this->httpStatusCode = httpStatusCode;
}

FeedDownloadErrorType
FeedDownloadErrorDTO::getType()
{
	return type;
}

void
FeedDownloadErrorDTO::setType(FeedDownloadErrorType  type)
{
	this->type = type;
}

std::string
FeedDownloadErrorDTO::getDescription()
{
	return description;
}

void
FeedDownloadErrorDTO::setDescription(std::string  description)
{
	this->description = description;
}


