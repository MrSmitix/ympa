#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOfferMappingEntryRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOfferMappingEntryRequest::UpdateOfferMappingEntryRequest()
{
	//__init();
}

UpdateOfferMappingEntryRequest::~UpdateOfferMappingEntryRequest()
{
	//__cleanup();
}

void
UpdateOfferMappingEntryRequest::__init()
{
	//new std::list()std::list> offerMappingEntries;
}

void
UpdateOfferMappingEntryRequest::__cleanup()
{
	//if(offerMappingEntries != NULL) {
	//offerMappingEntries.RemoveAll(true);
	//delete offerMappingEntries;
	//offerMappingEntries = NULL;
	//}
	//
}

void
UpdateOfferMappingEntryRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerMappingEntriesKey = "offerMappingEntries";
	node = json_object_get_member(pJsonObject, offerMappingEntriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateOfferMappingEntryDTO> new_list;
			UpdateOfferMappingEntryDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateOfferMappingEntryDTO")) {
					jsonToValue(&inst, temp_json, "UpdateOfferMappingEntryDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offerMappingEntries = new_list;
		}
		
	}
}

UpdateOfferMappingEntryRequest::UpdateOfferMappingEntryRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateOfferMappingEntryRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateOfferMappingEntryDTO")) {
		list<UpdateOfferMappingEntryDTO> new_list = static_cast<list <UpdateOfferMappingEntryDTO> > (getOfferMappingEntries());
		node = converttoJson(&new_list, "UpdateOfferMappingEntryDTO", "array");
	} else {
		node = json_node_alloc();
		list<UpdateOfferMappingEntryDTO> new_list = static_cast<list <UpdateOfferMappingEntryDTO> > (getOfferMappingEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateOfferMappingEntryDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateOfferMappingEntryDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offerMappingEntriesKey = "offerMappingEntries";
	json_object_set_member(pJsonObject, offerMappingEntriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<UpdateOfferMappingEntryDTO>
UpdateOfferMappingEntryRequest::getOfferMappingEntries()
{
	return offerMappingEntries;
}

void
UpdateOfferMappingEntryRequest::setOfferMappingEntries(std::list <UpdateOfferMappingEntryDTO> offerMappingEntries)
{
	this->offerMappingEntries = offerMappingEntries;
}


