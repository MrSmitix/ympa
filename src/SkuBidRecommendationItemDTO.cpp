#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SkuBidRecommendationItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SkuBidRecommendationItemDTO::SkuBidRecommendationItemDTO()
{
	//__init();
}

SkuBidRecommendationItemDTO::~SkuBidRecommendationItemDTO()
{
	//__cleanup();
}

void
SkuBidRecommendationItemDTO::__init()
{
	//sku = std::string();
	//bid = int(0);
	//new std::list()std::list> bidRecommendations;
	//new std::list()std::list> priceRecommendations;
}

void
SkuBidRecommendationItemDTO::__cleanup()
{
	//if(sku != NULL) {
	//
	//delete sku;
	//sku = NULL;
	//}
	//if(bid != NULL) {
	//
	//delete bid;
	//bid = NULL;
	//}
	//if(bidRecommendations != NULL) {
	//bidRecommendations.RemoveAll(true);
	//delete bidRecommendations;
	//bidRecommendations = NULL;
	//}
	//if(priceRecommendations != NULL) {
	//priceRecommendations.RemoveAll(true);
	//delete priceRecommendations;
	//priceRecommendations = NULL;
	//}
	//
}

void
SkuBidRecommendationItemDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *skuKey = "sku";
	node = json_object_get_member(pJsonObject, skuKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sku, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *bidKey = "bid";
	node = json_object_get_member(pJsonObject, bidKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bid, node, "int", "");
		} else {
			
		}
	}
	const gchar *bidRecommendationsKey = "bidRecommendations";
	node = json_object_get_member(pJsonObject, bidRecommendationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BidRecommendationItemDTO> new_list;
			BidRecommendationItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BidRecommendationItemDTO")) {
					jsonToValue(&inst, temp_json, "BidRecommendationItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			bidRecommendations = new_list;
		}
		
	}
	const gchar *priceRecommendationsKey = "priceRecommendations";
	node = json_object_get_member(pJsonObject, priceRecommendationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PriceRecommendationItemDTO> new_list;
			PriceRecommendationItemDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PriceRecommendationItemDTO")) {
					jsonToValue(&inst, temp_json, "PriceRecommendationItemDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			priceRecommendations = new_list;
		}
		
	}
}

SkuBidRecommendationItemDTO::SkuBidRecommendationItemDTO(char* json)
{
	this->fromJson(json);
}

char*
SkuBidRecommendationItemDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *skuKey = "sku";
	json_object_set_member(pJsonObject, skuKey, node);
	if (isprimitive("int")) {
		int obj = getBid();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bidKey = "bid";
	json_object_set_member(pJsonObject, bidKey, node);
	if (isprimitive("BidRecommendationItemDTO")) {
		list<BidRecommendationItemDTO> new_list = static_cast<list <BidRecommendationItemDTO> > (getBidRecommendations());
		node = converttoJson(&new_list, "BidRecommendationItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<BidRecommendationItemDTO> new_list = static_cast<list <BidRecommendationItemDTO> > (getBidRecommendations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BidRecommendationItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BidRecommendationItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *bidRecommendationsKey = "bidRecommendations";
	json_object_set_member(pJsonObject, bidRecommendationsKey, node);
	if (isprimitive("PriceRecommendationItemDTO")) {
		list<PriceRecommendationItemDTO> new_list = static_cast<list <PriceRecommendationItemDTO> > (getPriceRecommendations());
		node = converttoJson(&new_list, "PriceRecommendationItemDTO", "array");
	} else {
		node = json_node_alloc();
		list<PriceRecommendationItemDTO> new_list = static_cast<list <PriceRecommendationItemDTO> > (getPriceRecommendations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PriceRecommendationItemDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PriceRecommendationItemDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *priceRecommendationsKey = "priceRecommendations";
	json_object_set_member(pJsonObject, priceRecommendationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SkuBidRecommendationItemDTO::getSku()
{
	return sku;
}

void
SkuBidRecommendationItemDTO::setSku(std::string  sku)
{
	this->sku = sku;
}

int
SkuBidRecommendationItemDTO::getBid()
{
	return bid;
}

void
SkuBidRecommendationItemDTO::setBid(int  bid)
{
	this->bid = bid;
}

std::list<BidRecommendationItemDTO>
SkuBidRecommendationItemDTO::getBidRecommendations()
{
	return bidRecommendations;
}

void
SkuBidRecommendationItemDTO::setBidRecommendations(std::list <BidRecommendationItemDTO> bidRecommendations)
{
	this->bidRecommendations = bidRecommendations;
}

std::list<PriceRecommendationItemDTO>
SkuBidRecommendationItemDTO::getPriceRecommendations()
{
	return priceRecommendations;
}

void
SkuBidRecommendationItemDTO::setPriceRecommendations(std::list <PriceRecommendationItemDTO> priceRecommendations)
{
	this->priceRecommendations = priceRecommendations;
}


