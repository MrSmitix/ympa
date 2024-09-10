#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferMappingErrorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferMappingErrorDTO::OfferMappingErrorDTO()
{
	//__init();
}

OfferMappingErrorDTO::~OfferMappingErrorDTO()
{
	//__cleanup();
}

void
OfferMappingErrorDTO::__init()
{
	//type = new OfferMappingErrorType();
	//parameterId = long(0);
	//message = std::string();
}

void
OfferMappingErrorDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(parameterId != NULL) {
	//
	//delete parameterId;
	//parameterId = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
OfferMappingErrorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferMappingErrorType")) {
			jsonToValue(&type, node, "OfferMappingErrorType", "OfferMappingErrorType");
		} else {
			
			OfferMappingErrorType* obj = static_cast<OfferMappingErrorType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parameterIdKey = "parameterId";
	node = json_object_get_member(pJsonObject, parameterIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&parameterId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

OfferMappingErrorDTO::OfferMappingErrorDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferMappingErrorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferMappingErrorType")) {
		OfferMappingErrorType obj = getType();
		node = converttoJson(&obj, "OfferMappingErrorType", "");
	}
	else {
		
		OfferMappingErrorType obj = static_cast<OfferMappingErrorType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getParameterId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *parameterIdKey = "parameterId";
	json_object_set_member(pJsonObject, parameterIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OfferMappingErrorType
OfferMappingErrorDTO::getType()
{
	return type;
}

void
OfferMappingErrorDTO::setType(OfferMappingErrorType  type)
{
	this->type = type;
}

long long
OfferMappingErrorDTO::getParameterId()
{
	return parameterId;
}

void
OfferMappingErrorDTO::setParameterId(long long  parameterId)
{
	this->parameterId = parameterId;
}

std::string
OfferMappingErrorDTO::getMessage()
{
	return message;
}

void
OfferMappingErrorDTO::setMessage(std::string  message)
{
	this->message = message;
}


