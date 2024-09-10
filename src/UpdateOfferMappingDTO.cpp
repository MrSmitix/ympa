#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOfferMappingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOfferMappingDTO::UpdateOfferMappingDTO()
{
	//__init();
}

UpdateOfferMappingDTO::~UpdateOfferMappingDTO()
{
	//__cleanup();
}

void
UpdateOfferMappingDTO::__init()
{
	//offer = new UpdateOfferDTO();
	//mapping = new UpdateMappingDTO();
}

void
UpdateOfferMappingDTO::__cleanup()
{
	//if(offer != NULL) {
	//
	//delete offer;
	//offer = NULL;
	//}
	//if(mapping != NULL) {
	//
	//delete mapping;
	//mapping = NULL;
	//}
	//
}

void
UpdateOfferMappingDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerKey = "offer";
	node = json_object_get_member(pJsonObject, offerKey);
	if (node !=NULL) {
	

		if (isprimitive("UpdateOfferDTO")) {
			jsonToValue(&offer, node, "UpdateOfferDTO", "UpdateOfferDTO");
		} else {
			
			UpdateOfferDTO* obj = static_cast<UpdateOfferDTO*> (&offer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mappingKey = "mapping";
	node = json_object_get_member(pJsonObject, mappingKey);
	if (node !=NULL) {
	

		if (isprimitive("UpdateMappingDTO")) {
			jsonToValue(&mapping, node, "UpdateMappingDTO", "UpdateMappingDTO");
		} else {
			
			UpdateMappingDTO* obj = static_cast<UpdateMappingDTO*> (&mapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdateOfferMappingDTO::UpdateOfferMappingDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateOfferMappingDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateOfferDTO")) {
		UpdateOfferDTO obj = getOffer();
		node = converttoJson(&obj, "UpdateOfferDTO", "");
	}
	else {
		
		UpdateOfferDTO obj = static_cast<UpdateOfferDTO> (getOffer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offerKey = "offer";
	json_object_set_member(pJsonObject, offerKey, node);
	if (isprimitive("UpdateMappingDTO")) {
		UpdateMappingDTO obj = getMapping();
		node = converttoJson(&obj, "UpdateMappingDTO", "");
	}
	else {
		
		UpdateMappingDTO obj = static_cast<UpdateMappingDTO> (getMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mappingKey = "mapping";
	json_object_set_member(pJsonObject, mappingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

UpdateOfferDTO
UpdateOfferMappingDTO::getOffer()
{
	return offer;
}

void
UpdateOfferMappingDTO::setOffer(UpdateOfferDTO  offer)
{
	this->offer = offer;
}

UpdateMappingDTO
UpdateOfferMappingDTO::getMapping()
{
	return mapping;
}

void
UpdateOfferMappingDTO::setMapping(UpdateMappingDTO  mapping)
{
	this->mapping = mapping;
}


