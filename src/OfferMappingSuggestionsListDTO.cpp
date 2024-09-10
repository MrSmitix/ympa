#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferMappingSuggestionsListDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferMappingSuggestionsListDTO::OfferMappingSuggestionsListDTO()
{
	//__init();
}

OfferMappingSuggestionsListDTO::~OfferMappingSuggestionsListDTO()
{
	//__cleanup();
}

void
OfferMappingSuggestionsListDTO::__init()
{
	//new std::list()std::list> offers;
}

void
OfferMappingSuggestionsListDTO::__cleanup()
{
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//
}

void
OfferMappingSuggestionsListDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EnrichedMappingsOfferDTO> new_list;
			EnrichedMappingsOfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EnrichedMappingsOfferDTO")) {
					jsonToValue(&inst, temp_json, "EnrichedMappingsOfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
}

OfferMappingSuggestionsListDTO::OfferMappingSuggestionsListDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferMappingSuggestionsListDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EnrichedMappingsOfferDTO")) {
		list<EnrichedMappingsOfferDTO> new_list = static_cast<list <EnrichedMappingsOfferDTO> > (getOffers());
		node = converttoJson(&new_list, "EnrichedMappingsOfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<EnrichedMappingsOfferDTO> new_list = static_cast<list <EnrichedMappingsOfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EnrichedMappingsOfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EnrichedMappingsOfferDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<EnrichedMappingsOfferDTO>
OfferMappingSuggestionsListDTO::getOffers()
{
	return offers;
}

void
OfferMappingSuggestionsListDTO::setOffers(std::list <EnrichedMappingsOfferDTO> offers)
{
	this->offers = offers;
}


