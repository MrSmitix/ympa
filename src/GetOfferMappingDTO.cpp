#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOfferMappingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOfferMappingDTO::GetOfferMappingDTO()
{
	//__init();
}

GetOfferMappingDTO::~GetOfferMappingDTO()
{
	//__cleanup();
}

void
GetOfferMappingDTO::__init()
{
	//offer = new GetOfferDTO();
	//mapping = new GetMappingDTO();
}

void
GetOfferMappingDTO::__cleanup()
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
GetOfferMappingDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerKey = "offer";
	node = json_object_get_member(pJsonObject, offerKey);
	if (node !=NULL) {
	

		if (isprimitive("GetOfferDTO")) {
			jsonToValue(&offer, node, "GetOfferDTO", "GetOfferDTO");
		} else {
			
			GetOfferDTO* obj = static_cast<GetOfferDTO*> (&offer);
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

GetOfferMappingDTO::GetOfferMappingDTO(char* json)
{
	this->fromJson(json);
}

char*
GetOfferMappingDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GetOfferDTO")) {
		GetOfferDTO obj = getOffer();
		node = converttoJson(&obj, "GetOfferDTO", "");
	}
	else {
		
		GetOfferDTO obj = static_cast<GetOfferDTO> (getOffer());
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

GetOfferDTO
GetOfferMappingDTO::getOffer()
{
	return offer;
}

void
GetOfferMappingDTO::setOffer(GetOfferDTO  offer)
{
	this->offer = offer;
}

GetMappingDTO
GetOfferMappingDTO::getMapping()
{
	return mapping;
}

void
GetOfferMappingDTO::setMapping(GetMappingDTO  mapping)
{
	this->mapping = mapping;
}


