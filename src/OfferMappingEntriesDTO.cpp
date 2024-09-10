#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferMappingEntriesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferMappingEntriesDTO::OfferMappingEntriesDTO()
{
	//__init();
}

OfferMappingEntriesDTO::~OfferMappingEntriesDTO()
{
	//__cleanup();
}

void
OfferMappingEntriesDTO::__init()
{
	//paging = new ScrollingPagerDTO();
	//new std::list()std::list> offerMappingEntries;
}

void
OfferMappingEntriesDTO::__cleanup()
{
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//if(offerMappingEntries != NULL) {
	//offerMappingEntries.RemoveAll(true);
	//delete offerMappingEntries;
	//offerMappingEntries = NULL;
	//}
	//
}

void
OfferMappingEntriesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ScrollingPagerDTO", "ScrollingPagerDTO");
		} else {
			
			ScrollingPagerDTO* obj = static_cast<ScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *offerMappingEntriesKey = "offerMappingEntries";
	node = json_object_get_member(pJsonObject, offerMappingEntriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferMappingEntryDTO> new_list;
			OfferMappingEntryDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferMappingEntryDTO")) {
					jsonToValue(&inst, temp_json, "OfferMappingEntryDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offerMappingEntries = new_list;
		}
		
	}
}

OfferMappingEntriesDTO::OfferMappingEntriesDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferMappingEntriesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ScrollingPagerDTO")) {
		ScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ScrollingPagerDTO", "");
	}
	else {
		
		ScrollingPagerDTO obj = static_cast<ScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	if (isprimitive("OfferMappingEntryDTO")) {
		list<OfferMappingEntryDTO> new_list = static_cast<list <OfferMappingEntryDTO> > (getOfferMappingEntries());
		node = converttoJson(&new_list, "OfferMappingEntryDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferMappingEntryDTO> new_list = static_cast<list <OfferMappingEntryDTO> > (getOfferMappingEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferMappingEntryDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferMappingEntryDTO obj = *it;
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

ScrollingPagerDTO
OfferMappingEntriesDTO::getPaging()
{
	return paging;
}

void
OfferMappingEntriesDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<OfferMappingEntryDTO>
OfferMappingEntriesDTO::getOfferMappingEntries()
{
	return offerMappingEntries;
}

void
OfferMappingEntriesDTO::setOfferMappingEntries(std::list <OfferMappingEntryDTO> offerMappingEntries)
{
	this->offerMappingEntries = offerMappingEntries;
}


