#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOfferMappingsResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOfferMappingsResultDTO::GetOfferMappingsResultDTO()
{
	//__init();
}

GetOfferMappingsResultDTO::~GetOfferMappingsResultDTO()
{
	//__cleanup();
}

void
GetOfferMappingsResultDTO::__init()
{
	//paging = new ScrollingPagerDTO();
	//new std::list()std::list> offerMappings;
}

void
GetOfferMappingsResultDTO::__cleanup()
{
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//if(offerMappings != NULL) {
	//offerMappings.RemoveAll(true);
	//delete offerMappings;
	//offerMappings = NULL;
	//}
	//
}

void
GetOfferMappingsResultDTO::fromJson(char* jsonStr)
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
	const gchar *offerMappingsKey = "offerMappings";
	node = json_object_get_member(pJsonObject, offerMappingsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GetOfferMappingDTO> new_list;
			GetOfferMappingDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GetOfferMappingDTO")) {
					jsonToValue(&inst, temp_json, "GetOfferMappingDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offerMappings = new_list;
		}
		
	}
}

GetOfferMappingsResultDTO::GetOfferMappingsResultDTO(char* json)
{
	this->fromJson(json);
}

char*
GetOfferMappingsResultDTO::toJson()
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
	if (isprimitive("GetOfferMappingDTO")) {
		list<GetOfferMappingDTO> new_list = static_cast<list <GetOfferMappingDTO> > (getOfferMappings());
		node = converttoJson(&new_list, "GetOfferMappingDTO", "array");
	} else {
		node = json_node_alloc();
		list<GetOfferMappingDTO> new_list = static_cast<list <GetOfferMappingDTO> > (getOfferMappings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GetOfferMappingDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GetOfferMappingDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offerMappingsKey = "offerMappings";
	json_object_set_member(pJsonObject, offerMappingsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ScrollingPagerDTO
GetOfferMappingsResultDTO::getPaging()
{
	return paging;
}

void
GetOfferMappingsResultDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<GetOfferMappingDTO>
GetOfferMappingsResultDTO::getOfferMappings()
{
	return offerMappings;
}

void
GetOfferMappingsResultDTO::setOfferMappings(std::list <GetOfferMappingDTO> offerMappings)
{
	this->offerMappings = offerMappings;
}


