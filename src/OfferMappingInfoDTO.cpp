#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferMappingInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferMappingInfoDTO::OfferMappingInfoDTO()
{
	//__init();
}

OfferMappingInfoDTO::~OfferMappingInfoDTO()
{
	//__cleanup();
}

void
OfferMappingInfoDTO::__init()
{
	//mapping = new OfferMappingDTO();
	//awaitingModerationMapping = new OfferMappingDTO();
	//rejectedMapping = new OfferMappingDTO();
}

void
OfferMappingInfoDTO::__cleanup()
{
	//if(mapping != NULL) {
	//
	//delete mapping;
	//mapping = NULL;
	//}
	//if(awaitingModerationMapping != NULL) {
	//
	//delete awaitingModerationMapping;
	//awaitingModerationMapping = NULL;
	//}
	//if(rejectedMapping != NULL) {
	//
	//delete rejectedMapping;
	//rejectedMapping = NULL;
	//}
	//
}

void
OfferMappingInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mappingKey = "mapping";
	node = json_object_get_member(pJsonObject, mappingKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferMappingDTO")) {
			jsonToValue(&mapping, node, "OfferMappingDTO", "OfferMappingDTO");
		} else {
			
			OfferMappingDTO* obj = static_cast<OfferMappingDTO*> (&mapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *awaitingModerationMappingKey = "awaitingModerationMapping";
	node = json_object_get_member(pJsonObject, awaitingModerationMappingKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferMappingDTO")) {
			jsonToValue(&awaitingModerationMapping, node, "OfferMappingDTO", "OfferMappingDTO");
		} else {
			
			OfferMappingDTO* obj = static_cast<OfferMappingDTO*> (&awaitingModerationMapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rejectedMappingKey = "rejectedMapping";
	node = json_object_get_member(pJsonObject, rejectedMappingKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferMappingDTO")) {
			jsonToValue(&rejectedMapping, node, "OfferMappingDTO", "OfferMappingDTO");
		} else {
			
			OfferMappingDTO* obj = static_cast<OfferMappingDTO*> (&rejectedMapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OfferMappingInfoDTO::OfferMappingInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferMappingInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferMappingDTO")) {
		OfferMappingDTO obj = getMapping();
		node = converttoJson(&obj, "OfferMappingDTO", "");
	}
	else {
		
		OfferMappingDTO obj = static_cast<OfferMappingDTO> (getMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mappingKey = "mapping";
	json_object_set_member(pJsonObject, mappingKey, node);
	if (isprimitive("OfferMappingDTO")) {
		OfferMappingDTO obj = getAwaitingModerationMapping();
		node = converttoJson(&obj, "OfferMappingDTO", "");
	}
	else {
		
		OfferMappingDTO obj = static_cast<OfferMappingDTO> (getAwaitingModerationMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *awaitingModerationMappingKey = "awaitingModerationMapping";
	json_object_set_member(pJsonObject, awaitingModerationMappingKey, node);
	if (isprimitive("OfferMappingDTO")) {
		OfferMappingDTO obj = getRejectedMapping();
		node = converttoJson(&obj, "OfferMappingDTO", "");
	}
	else {
		
		OfferMappingDTO obj = static_cast<OfferMappingDTO> (getRejectedMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rejectedMappingKey = "rejectedMapping";
	json_object_set_member(pJsonObject, rejectedMappingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OfferMappingDTO
OfferMappingInfoDTO::getMapping()
{
	return mapping;
}

void
OfferMappingInfoDTO::setMapping(OfferMappingDTO  mapping)
{
	this->mapping = mapping;
}

OfferMappingDTO
OfferMappingInfoDTO::getAwaitingModerationMapping()
{
	return awaitingModerationMapping;
}

void
OfferMappingInfoDTO::setAwaitingModerationMapping(OfferMappingDTO  awaitingModerationMapping)
{
	this->awaitingModerationMapping = awaitingModerationMapping;
}

OfferMappingDTO
OfferMappingInfoDTO::getRejectedMapping()
{
	return rejectedMapping;
}

void
OfferMappingInfoDTO::setRejectedMapping(OfferMappingDTO  rejectedMapping)
{
	this->rejectedMapping = rejectedMapping;
}


