#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferCardsContentStatusDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferCardsContentStatusDTO::OfferCardsContentStatusDTO()
{
	//__init();
}

OfferCardsContentStatusDTO::~OfferCardsContentStatusDTO()
{
	//__cleanup();
}

void
OfferCardsContentStatusDTO::__init()
{
	//new std::list()std::list> offerCards;
	//paging = new ForwardScrollingPagerDTO();
}

void
OfferCardsContentStatusDTO::__cleanup()
{
	//if(offerCards != NULL) {
	//offerCards.RemoveAll(true);
	//delete offerCards;
	//offerCards = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
OfferCardsContentStatusDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerCardsKey = "offerCards";
	node = json_object_get_member(pJsonObject, offerCardsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferCardDTO> new_list;
			OfferCardDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferCardDTO")) {
					jsonToValue(&inst, temp_json, "OfferCardDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offerCards = new_list;
		}
		
	}
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ForwardScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ForwardScrollingPagerDTO", "ForwardScrollingPagerDTO");
		} else {
			
			ForwardScrollingPagerDTO* obj = static_cast<ForwardScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OfferCardsContentStatusDTO::OfferCardsContentStatusDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferCardsContentStatusDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferCardDTO")) {
		list<OfferCardDTO> new_list = static_cast<list <OfferCardDTO> > (getOfferCards());
		node = converttoJson(&new_list, "OfferCardDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferCardDTO> new_list = static_cast<list <OfferCardDTO> > (getOfferCards());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferCardDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferCardDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offerCardsKey = "offerCards";
	json_object_set_member(pJsonObject, offerCardsKey, node);
	if (isprimitive("ForwardScrollingPagerDTO")) {
		ForwardScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ForwardScrollingPagerDTO", "");
	}
	else {
		
		ForwardScrollingPagerDTO obj = static_cast<ForwardScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OfferCardDTO>
OfferCardsContentStatusDTO::getOfferCards()
{
	return offerCards;
}

void
OfferCardsContentStatusDTO::setOfferCards(std::list <OfferCardDTO> offerCards)
{
	this->offerCards = offerCards;
}

ForwardScrollingPagerDTO
OfferCardsContentStatusDTO::getPaging()
{
	return paging;
}

void
OfferCardsContentStatusDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


