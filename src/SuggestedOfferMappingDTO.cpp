#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SuggestedOfferMappingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SuggestedOfferMappingDTO::SuggestedOfferMappingDTO()
{
	//__init();
}

SuggestedOfferMappingDTO::~SuggestedOfferMappingDTO()
{
	//__cleanup();
}

void
SuggestedOfferMappingDTO::__init()
{
	//offer = new SuggestedOfferDTO();
	//mapping = new GetMappingDTO();
}

void
SuggestedOfferMappingDTO::__cleanup()
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
SuggestedOfferMappingDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerKey = "offer";
	node = json_object_get_member(pJsonObject, offerKey);
	if (node !=NULL) {
	

		if (isprimitive("SuggestedOfferDTO")) {
			jsonToValue(&offer, node, "SuggestedOfferDTO", "SuggestedOfferDTO");
		} else {
			
			SuggestedOfferDTO* obj = static_cast<SuggestedOfferDTO*> (&offer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mappingKey = "mapping";
	node = json_object_get_member(pJsonObject, mappingKey);
	if (node !=NULL) {
	

		if (isprimitive("GetMappingDTO")) {
			jsonToValue(&mapping, node, "GetMappingDTO", "GetMappingDTO");
		} else {
			
			GetMappingDTO* obj = static_cast<GetMappingDTO*> (&mapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

SuggestedOfferMappingDTO::SuggestedOfferMappingDTO(char* json)
{
	this->fromJson(json);
}

char*
SuggestedOfferMappingDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SuggestedOfferDTO")) {
		SuggestedOfferDTO obj = getOffer();
		node = converttoJson(&obj, "SuggestedOfferDTO", "");
	}
	else {
		
		SuggestedOfferDTO obj = static_cast<SuggestedOfferDTO> (getOffer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offerKey = "offer";
	json_object_set_member(pJsonObject, offerKey, node);
	if (isprimitive("GetMappingDTO")) {
		GetMappingDTO obj = getMapping();
		node = converttoJson(&obj, "GetMappingDTO", "");
	}
	else {
		
		GetMappingDTO obj = static_cast<GetMappingDTO> (getMapping());
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

SuggestedOfferDTO
SuggestedOfferMappingDTO::getOffer()
{
	return offer;
}

void
SuggestedOfferMappingDTO::setOffer(SuggestedOfferDTO  offer)
{
	this->offer = offer;
}

GetMappingDTO
SuggestedOfferMappingDTO::getMapping()
{
	return mapping;
}

void
SuggestedOfferMappingDTO::setMapping(GetMappingDTO  mapping)
{
	this->mapping = mapping;
}


