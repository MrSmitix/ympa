#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferContentErrorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferContentErrorDTO::OfferContentErrorDTO()
{
	//__init();
}

OfferContentErrorDTO::~OfferContentErrorDTO()
{
	//__cleanup();
}

void
OfferContentErrorDTO::__init()
{
	//type = new OfferContentErrorType();
	//parameterId = long(0);
	//message = std::string();
}

void
OfferContentErrorDTO::__cleanup()
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
OfferContentErrorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferContentErrorType")) {
			jsonToValue(&type, node, "OfferContentErrorType", "OfferContentErrorType");
		} else {
			
			OfferContentErrorType* obj = static_cast<OfferContentErrorType*> (&type);
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

OfferContentErrorDTO::OfferContentErrorDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferContentErrorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferContentErrorType")) {
		OfferContentErrorType obj = getType();
		node = converttoJson(&obj, "OfferContentErrorType", "");
	}
	else {
		
		OfferContentErrorType obj = static_cast<OfferContentErrorType> (getType());
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

OfferContentErrorType
OfferContentErrorDTO::getType()
{
	return type;
}

void
OfferContentErrorDTO::setType(OfferContentErrorType  type)
{
	this->type = type;
}

long long
OfferContentErrorDTO::getParameterId()
{
	return parameterId;
}

void
OfferContentErrorDTO::setParameterId(long long  parameterId)
{
	this->parameterId = parameterId;
}

std::string
OfferContentErrorDTO::getMessage()
{
	return message;
}

void
OfferContentErrorDTO::setMessage(std::string  message)
{
	this->message = message;
}


