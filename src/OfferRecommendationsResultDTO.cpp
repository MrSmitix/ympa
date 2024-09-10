#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferRecommendationsResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferRecommendationsResultDTO::OfferRecommendationsResultDTO()
{
	//__init();
}

OfferRecommendationsResultDTO::~OfferRecommendationsResultDTO()
{
	//__cleanup();
}

void
OfferRecommendationsResultDTO::__init()
{
	//paging = new ScrollingPagerDTO();
	//new std::list()std::list> offerRecommendations;
}

void
OfferRecommendationsResultDTO::__cleanup()
{
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//if(offerRecommendations != NULL) {
	//offerRecommendations.RemoveAll(true);
	//delete offerRecommendations;
	//offerRecommendations = NULL;
	//}
	//
}

void
OfferRecommendationsResultDTO::fromJson(char* jsonStr)
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
	const gchar *offerRecommendationsKey = "offerRecommendations";
	node = json_object_get_member(pJsonObject, offerRecommendationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferRecommendationDTO> new_list;
			OfferRecommendationDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferRecommendationDTO")) {
					jsonToValue(&inst, temp_json, "OfferRecommendationDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offerRecommendations = new_list;
		}
		
	}
}

OfferRecommendationsResultDTO::OfferRecommendationsResultDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferRecommendationsResultDTO::toJson()
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
	if (isprimitive("OfferRecommendationDTO")) {
		list<OfferRecommendationDTO> new_list = static_cast<list <OfferRecommendationDTO> > (getOfferRecommendations());
		node = converttoJson(&new_list, "OfferRecommendationDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferRecommendationDTO> new_list = static_cast<list <OfferRecommendationDTO> > (getOfferRecommendations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferRecommendationDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferRecommendationDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offerRecommendationsKey = "offerRecommendations";
	json_object_set_member(pJsonObject, offerRecommendationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ScrollingPagerDTO
OfferRecommendationsResultDTO::getPaging()
{
	return paging;
}

void
OfferRecommendationsResultDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<OfferRecommendationDTO>
OfferRecommendationsResultDTO::getOfferRecommendations()
{
	return offerRecommendations;
}

void
OfferRecommendationsResultDTO::setOfferRecommendations(std::list <OfferRecommendationDTO> offerRecommendations)
{
	this->offerRecommendations = offerRecommendations;
}


