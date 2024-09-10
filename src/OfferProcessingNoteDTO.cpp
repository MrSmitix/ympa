#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferProcessingNoteDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferProcessingNoteDTO::OfferProcessingNoteDTO()
{
	//__init();
}

OfferProcessingNoteDTO::~OfferProcessingNoteDTO()
{
	//__cleanup();
}

void
OfferProcessingNoteDTO::__init()
{
	//type = new OfferProcessingNoteType();
	//payload = std::string();
}

void
OfferProcessingNoteDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(payload != NULL) {
	//
	//delete payload;
	//payload = NULL;
	//}
	//
}

void
OfferProcessingNoteDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferProcessingNoteType")) {
			jsonToValue(&type, node, "OfferProcessingNoteType", "OfferProcessingNoteType");
		} else {
			
			OfferProcessingNoteType* obj = static_cast<OfferProcessingNoteType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *payloadKey = "payload";
	node = json_object_get_member(pJsonObject, payloadKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&payload, node, "std::string", "");
		} else {
			
		}
	}
}

OfferProcessingNoteDTO::OfferProcessingNoteDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferProcessingNoteDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferProcessingNoteType")) {
		OfferProcessingNoteType obj = getType();
		node = converttoJson(&obj, "OfferProcessingNoteType", "");
	}
	else {
		
		OfferProcessingNoteType obj = static_cast<OfferProcessingNoteType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPayload();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *payloadKey = "payload";
	json_object_set_member(pJsonObject, payloadKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OfferProcessingNoteType
OfferProcessingNoteDTO::getType()
{
	return type;
}

void
OfferProcessingNoteDTO::setType(OfferProcessingNoteType  type)
{
	this->type = type;
}

std::string
OfferProcessingNoteDTO::getPayload()
{
	return payload;
}

void
OfferProcessingNoteDTO::setPayload(std::string  payload)
{
	this->payload = payload;
}


