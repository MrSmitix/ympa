#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferMappingEntryDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferMappingEntryDTO::OfferMappingEntryDTO()
{
	//__init();
}

OfferMappingEntryDTO::~OfferMappingEntryDTO()
{
	//__cleanup();
}

void
OfferMappingEntryDTO::__init()
{
	//mapping = new OfferMappingDTO();
	//awaitingModerationMapping = new OfferMappingDTO();
	//rejectedMapping = new OfferMappingDTO();
	//offer = new MappingsOfferDTO();
}

void
OfferMappingEntryDTO::__cleanup()
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
	//if(offer != NULL) {
	//
	//delete offer;
	//offer = NULL;
	//}
	//
}

void
OfferMappingEntryDTO::fromJson(char* jsonStr)
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
	const gchar *offerKey = "offer";
	node = json_object_get_member(pJsonObject, offerKey);
	if (node !=NULL) {
	

		if (isprimitive("MappingsOfferDTO")) {
			jsonToValue(&offer, node, "MappingsOfferDTO", "MappingsOfferDTO");
		} else {
			
			MappingsOfferDTO* obj = static_cast<MappingsOfferDTO*> (&offer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OfferMappingEntryDTO::OfferMappingEntryDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferMappingEntryDTO::toJson()
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
	if (isprimitive("MappingsOfferDTO")) {
		MappingsOfferDTO obj = getOffer();
		node = converttoJson(&obj, "MappingsOfferDTO", "");
	}
	else {
		
		MappingsOfferDTO obj = static_cast<MappingsOfferDTO> (getOffer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offerKey = "offer";
	json_object_set_member(pJsonObject, offerKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OfferMappingDTO
OfferMappingEntryDTO::getMapping()
{
	return mapping;
}

void
OfferMappingEntryDTO::setMapping(OfferMappingDTO  mapping)
{
	this->mapping = mapping;
}

OfferMappingDTO
OfferMappingEntryDTO::getAwaitingModerationMapping()
{
	return awaitingModerationMapping;
}

void
OfferMappingEntryDTO::setAwaitingModerationMapping(OfferMappingDTO  awaitingModerationMapping)
{
	this->awaitingModerationMapping = awaitingModerationMapping;
}

OfferMappingDTO
OfferMappingEntryDTO::getRejectedMapping()
{
	return rejectedMapping;
}

void
OfferMappingEntryDTO::setRejectedMapping(OfferMappingDTO  rejectedMapping)
{
	this->rejectedMapping = rejectedMapping;
}

MappingsOfferDTO
OfferMappingEntryDTO::getOffer()
{
	return offer;
}

void
OfferMappingEntryDTO::setOffer(MappingsOfferDTO  offer)
{
	this->offer = offer;
}


