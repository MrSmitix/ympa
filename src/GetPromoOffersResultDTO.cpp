#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoOffersResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoOffersResultDTO::GetPromoOffersResultDTO()
{
	//__init();
}

GetPromoOffersResultDTO::~GetPromoOffersResultDTO()
{
	//__cleanup();
}

void
GetPromoOffersResultDTO::__init()
{
	//new std::list()std::list> offers;
	//paging = new ForwardScrollingPagerDTO();
}

void
GetPromoOffersResultDTO::__cleanup()
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
GetPromoOffersResultDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GetPromoOfferDTO> new_list;
			GetPromoOfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GetPromoOfferDTO")) {
					jsonToValue(&inst, temp_json, "GetPromoOfferDTO", "");
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
	

		if (isprimitive("ForwardScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ForwardScrollingPagerDTO", "ForwardScrollingPagerDTO");
		} else {
			
			ForwardScrollingPagerDTO* obj = static_cast<ForwardScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetPromoOffersResultDTO::GetPromoOffersResultDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromoOffersResultDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GetPromoOfferDTO")) {
		list<GetPromoOfferDTO> new_list = static_cast<list <GetPromoOfferDTO> > (getOffers());
		node = converttoJson(&new_list, "GetPromoOfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<GetPromoOfferDTO> new_list = static_cast<list <GetPromoOfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GetPromoOfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GetPromoOfferDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
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

std::list<GetPromoOfferDTO>
GetPromoOffersResultDTO::getOffers()
{
	return offers;
}

void
GetPromoOffersResultDTO::setOffers(std::list <GetPromoOfferDTO> offers)
{
	this->offers = offers;
}

ForwardScrollingPagerDTO
GetPromoOffersResultDTO::getPaging()
{
	return paging;
}

void
GetPromoOffersResultDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


