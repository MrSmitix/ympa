#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferErrorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferErrorDTO::OfferErrorDTO()
{
	//__init();
}

OfferErrorDTO::~OfferErrorDTO()
{
	//__cleanup();
}

void
OfferErrorDTO::__init()
{
	//message = std::string();
	//comment = std::string();
}

void
OfferErrorDTO::__cleanup()
{
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(comment != NULL) {
	//
	//delete comment;
	//comment = NULL;
	//}
	//
}

void
OfferErrorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *commentKey = "comment";
	node = json_object_get_member(pJsonObject, commentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&comment, node, "std::string", "");
		} else {
			
		}
	}
}

OfferErrorDTO::OfferErrorDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferErrorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getComment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *commentKey = "comment";
	json_object_set_member(pJsonObject, commentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OfferErrorDTO::getMessage()
{
	return message;
}

void
OfferErrorDTO::setMessage(std::string  message)
{
	this->message = message;
}

std::string
OfferErrorDTO::getComment()
{
	return comment;
}

void
OfferErrorDTO::setComment(std::string  comment)
{
	this->comment = comment;
}


