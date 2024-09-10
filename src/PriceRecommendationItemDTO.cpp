#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceRecommendationItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceRecommendationItemDTO::PriceRecommendationItemDTO()
{
	//__init();
}

PriceRecommendationItemDTO::~PriceRecommendationItemDTO()
{
	//__cleanup();
}

void
PriceRecommendationItemDTO::__init()
{
	//campaignId = long(0);
	//price = double(0);
}

void
PriceRecommendationItemDTO::__cleanup()
{
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//
}

void
PriceRecommendationItemDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignIdKey = "campaignId";
	node = json_object_get_member(pJsonObject, campaignIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&campaignId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&price, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PriceRecommendationItemDTO::PriceRecommendationItemDTO(char* json)
{
	this->fromJson(json);
}

char*
PriceRecommendationItemDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCampaignId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *campaignIdKey = "campaignId";
	json_object_set_member(pJsonObject, campaignIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
PriceRecommendationItemDTO::getCampaignId()
{
	return campaignId;
}

void
PriceRecommendationItemDTO::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

long long
PriceRecommendationItemDTO::getPrice()
{
	return price;
}

void
PriceRecommendationItemDTO::setPrice(long long  price)
{
	this->price = price;
}


