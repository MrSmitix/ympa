#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOfferMappingEntryDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOfferMappingEntryDTO::UpdateOfferMappingEntryDTO()
{
	//__init();
}

UpdateOfferMappingEntryDTO::~UpdateOfferMappingEntryDTO()
{
	//__cleanup();
}

void
UpdateOfferMappingEntryDTO::__init()
{
	//mapping = new OfferMappingDTO();
	//awaitingModerationMapping = new OfferMappingDTO();
	//rejectedMapping = new OfferMappingDTO();
	//offer = new UpdateMappingsOfferDTO();
}

void
UpdateOfferMappingEntryDTO::__cleanup()
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
UpdateOfferMappingEntryDTO::fromJson(char* jsonStr)
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
	

		if (isprimitive("UpdateMappingsOfferDTO")) {
			jsonToValue(&offer, node, "UpdateMappingsOfferDTO", "UpdateMappingsOfferDTO");
		} else {
			
			UpdateMappingsOfferDTO* obj = static_cast<UpdateMappingsOfferDTO*> (&offer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateOfferMappingEntryDTO::UpdateOfferMappingEntryDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateOfferMappingEntryDTO::toJson()
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
	if (isprimitive("UpdateMappingsOfferDTO")) {
		UpdateMappingsOfferDTO obj = getOffer();
		node = converttoJson(&obj, "UpdateMappingsOfferDTO", "");
	}
	else {
		
		UpdateMappingsOfferDTO obj = static_cast<UpdateMappingsOfferDTO> (getOffer());
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
UpdateOfferMappingEntryDTO::getMapping()
{
	return mapping;
}

void
UpdateOfferMappingEntryDTO::setMapping(OfferMappingDTO  mapping)
{
	this->mapping = mapping;
}

OfferMappingDTO
UpdateOfferMappingEntryDTO::getAwaitingModerationMapping()
{
	return awaitingModerationMapping;
}

void
UpdateOfferMappingEntryDTO::setAwaitingModerationMapping(OfferMappingDTO  awaitingModerationMapping)
{
	this->awaitingModerationMapping = awaitingModerationMapping;
}

OfferMappingDTO
UpdateOfferMappingEntryDTO::getRejectedMapping()
{
	return rejectedMapping;
}

void
UpdateOfferMappingEntryDTO::setRejectedMapping(OfferMappingDTO  rejectedMapping)
{
	this->rejectedMapping = rejectedMapping;
}

UpdateMappingsOfferDTO
UpdateOfferMappingEntryDTO::getOffer()
{
	return offer;
}

void
UpdateOfferMappingEntryDTO::setOffer(UpdateMappingsOfferDTO  offer)
{
	this->offer = offer;
}


