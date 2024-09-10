#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOfferMappingsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOfferMappingsRequest::UpdateOfferMappingsRequest()
{
	//__init();
}

UpdateOfferMappingsRequest::~UpdateOfferMappingsRequest()
{
	//__cleanup();
}

void
UpdateOfferMappingsRequest::__init()
{
	//new std::list()std::list> offerMappings;
	//onlyPartnerMediaContent = bool(false);
}

void
UpdateOfferMappingsRequest::__cleanup()
{
	//if(offerMappings != NULL) {
	//offerMappings.RemoveAll(true);
	//delete offerMappings;
	//offerMappings = NULL;
	//}
	//if(onlyPartnerMediaContent != NULL) {
	//
	//delete onlyPartnerMediaContent;
	//onlyPartnerMediaContent = NULL;
	//}
	//
}

void
UpdateOfferMappingsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerMappingsKey = "offerMappings";
	node = json_object_get_member(pJsonObject, offerMappingsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateOfferMappingDTO> new_list;
			UpdateOfferMappingDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateOfferMappingDTO")) {
					jsonToValue(&inst, temp_json, "UpdateOfferMappingDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offerMappings = new_list;
		}
		
	}
	const gchar *onlyPartnerMediaContentKey = "onlyPartnerMediaContent";
	node = json_object_get_member(pJsonObject, onlyPartnerMediaContentKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&onlyPartnerMediaContent, node, "bool", "");
		} else {
			
		}
	}
}

UpdateOfferMappingsRequest::UpdateOfferMappingsRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateOfferMappingsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateOfferMappingDTO")) {
		list<UpdateOfferMappingDTO> new_list = static_cast<list <UpdateOfferMappingDTO> > (getOfferMappings());
		node = converttoJson(&new_list, "UpdateOfferMappingDTO", "array");
	} else {
		node = json_node_alloc();
		list<UpdateOfferMappingDTO> new_list = static_cast<list <UpdateOfferMappingDTO> > (getOfferMappings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateOfferMappingDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateOfferMappingDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offerMappingsKey = "offerMappings";
	json_object_set_member(pJsonObject, offerMappingsKey, node);
	if (isprimitive("bool")) {
		bool obj = getOnlyPartnerMediaContent();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *onlyPartnerMediaContentKey = "onlyPartnerMediaContent";
	json_object_set_member(pJsonObject, onlyPartnerMediaContentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<UpdateOfferMappingDTO>
UpdateOfferMappingsRequest::getOfferMappings()
{
	return offerMappings;
}

void
UpdateOfferMappingsRequest::setOfferMappings(std::list <UpdateOfferMappingDTO> offerMappings)
{
	this->offerMappings = offerMappings;
}

bool
UpdateOfferMappingsRequest::getOnlyPartnerMediaContent()
{
	return onlyPartnerMediaContent;
}

void
UpdateOfferMappingsRequest::setOnlyPartnerMediaContent(bool  onlyPartnerMediaContent)
{
	this->onlyPartnerMediaContent = onlyPartnerMediaContent;
}


