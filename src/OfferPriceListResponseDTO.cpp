#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferPriceListResponseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferPriceListResponseDTO::OfferPriceListResponseDTO()
{
	//__init();
}

OfferPriceListResponseDTO::~OfferPriceListResponseDTO()
{
	//__cleanup();
}

void
OfferPriceListResponseDTO::__init()
{
	//new std::list()std::list> offers;
	//paging = new ScrollingPagerDTO();
	//total = int(0);
}

void
OfferPriceListResponseDTO::__cleanup()
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
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//
}

void
OfferPriceListResponseDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersKey = "offers";
	node = json_object_get_member(pJsonObject, offersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferPriceResponseDTO> new_list;
			OfferPriceResponseDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferPriceResponseDTO")) {
					jsonToValue(&inst, temp_json, "OfferPriceResponseDTO", "");
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
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total, node, "int", "");
		} else {
			
		}
	}
}

OfferPriceListResponseDTO::OfferPriceListResponseDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferPriceListResponseDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferPriceResponseDTO")) {
		list<OfferPriceResponseDTO> new_list = static_cast<list <OfferPriceResponseDTO> > (getOffers());
		node = converttoJson(&new_list, "OfferPriceResponseDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferPriceResponseDTO> new_list = static_cast<list <OfferPriceResponseDTO> > (getOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferPriceResponseDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferPriceResponseDTO obj = *it;
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
	if (isprimitive("int")) {
		int obj = getTotal();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OfferPriceResponseDTO>
OfferPriceListResponseDTO::getOffers()
{
	return offers;
}

void
OfferPriceListResponseDTO::setOffers(std::list <OfferPriceResponseDTO> offers)
{
	this->offers = offers;
}

ScrollingPagerDTO
OfferPriceListResponseDTO::getPaging()
{
	return paging;
}

void
OfferPriceListResponseDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

int
OfferPriceListResponseDTO::getTotal()
{
	return total;
}

void
OfferPriceListResponseDTO::setTotal(int  total)
{
	this->total = total;
}


