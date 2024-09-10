#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferPriceByOfferIdsListResponseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferPriceByOfferIdsListResponseDTO::OfferPriceByOfferIdsListResponseDTO()
{
	//__init();
}

OfferPriceByOfferIdsListResponseDTO::~OfferPriceByOfferIdsListResponseDTO()
{
	//__cleanup();
}

void
OfferPriceByOfferIdsListResponseDTO::__init()
{
	//new std::list()std::list> offers;
	//paging = new ScrollingPagerDTO();
}

void
OfferPriceByOfferIdsListResponseDTO::__cleanup()
{
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
OfferPriceByOfferIdsListResponseDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferPriceByOfferIdsResponseDTO> new_list;
			OfferPriceByOfferIdsResponseDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferPriceByOfferIdsResponseDTO")) {
					jsonToValue(&inst, temp_json, "OfferPriceByOfferIdsResponseDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
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
}

OfferPriceByOfferIdsListResponseDTO::OfferPriceByOfferIdsListResponseDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferPriceByOfferIdsListResponseDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferPriceByOfferIdsResponseDTO")) {
		list<OfferPriceByOfferIdsResponseDTO> new_list = static_cast<list <OfferPriceByOfferIdsResponseDTO> > (getOffers());
		node = converttoJson(&new_list, "OfferPriceByOfferIdsResponseDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferPriceByOfferIdsResponseDTO> new_list = static_cast<list <OfferPriceByOfferIdsResponseDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferPriceByOfferIdsResponseDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferPriceByOfferIdsResponseDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OfferPriceByOfferIdsResponseDTO>
OfferPriceByOfferIdsListResponseDTO::getOffers()
{
	return offers;
}

void
OfferPriceByOfferIdsListResponseDTO::setOffers(std::list <OfferPriceByOfferIdsResponseDTO> offers)
{
	this->offers = offers;
}

ScrollingPagerDTO
OfferPriceByOfferIdsListResponseDTO::getPaging()
{
	return paging;
}

void
OfferPriceByOfferIdsListResponseDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}


