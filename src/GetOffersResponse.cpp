#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOffersResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOffersResponse::GetOffersResponse()
{
	//__init();
}

GetOffersResponse::~GetOffersResponse()
{
	//__cleanup();
}

void
GetOffersResponse::__init()
{
	//new std::list()std::list> offers;
	//pager = new FlippingPagerDTO();
}

void
GetOffersResponse::__cleanup()
{
	//if(offers != NULL) {
	//offers.RemoveAll(true);
	//delete offers;
	//offers = NULL;
	//}
	//if(pager != NULL) {
	//
	//delete pager;
	//pager = NULL;
	//}
	//
}

void
GetOffersResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferDTO> new_list;
			OfferDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferDTO")) {
					jsonToValue(&inst, temp_json, "OfferDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offers = new_list;
		}
		
	}
	const gchar *pagerKey = "pager";
	node = json_object_get_member(pJsonObject, pagerKey);
	if (node !=NULL) {
	

		if (isprimitive("FlippingPagerDTO")) {
			jsonToValue(&pager, node, "FlippingPagerDTO", "FlippingPagerDTO");
		} else {
			
			FlippingPagerDTO* obj = static_cast<FlippingPagerDTO*> (&pager);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetOffersResponse::GetOffersResponse(char* json)
{
	this->fromJson(json);
}

char*
GetOffersResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferDTO")) {
		list<OfferDTO> new_list = static_cast<list <OfferDTO> > (getOffers());
		node = converttoJson(&new_list, "OfferDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferDTO> new_list = static_cast<list <OfferDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersKey = "offers";
	json_object_set_member(pJsonObject, offersKey, node);
	if (isprimitive("FlippingPagerDTO")) {
		FlippingPagerDTO obj = getPager();
		node = converttoJson(&obj, "FlippingPagerDTO", "");
	}
	else {
		
		FlippingPagerDTO obj = static_cast<FlippingPagerDTO> (getPager());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagerKey = "pager";
	json_object_set_member(pJsonObject, pagerKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OfferDTO>
GetOffersResponse::getOffers()
{
	return offers;
}

void
GetOffersResponse::setOffers(std::list <OfferDTO> offers)
{
	this->offers = offers;
}

FlippingPagerDTO
GetOffersResponse::getPager()
{
	return pager;
}

void
GetOffersResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}


