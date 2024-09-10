#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidRecommendationItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidRecommendationItemDTO::BidRecommendationItemDTO()
{
	//__init();
}

BidRecommendationItemDTO::~BidRecommendationItemDTO()
{
	//__cleanup();
}

void
BidRecommendationItemDTO::__init()
{
	//bid = int(0);
	//showPercent = long(0);
}

void
BidRecommendationItemDTO::__cleanup()
{
	//if(bid != NULL) {
	//
	//delete bid;
	//bid = NULL;
	//}
	//if(showPercent != NULL) {
	//
	//delete showPercent;
	//showPercent = NULL;
	//}
	//
}

void
BidRecommendationItemDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bidKey = "bid";
	node = json_object_get_member(pJsonObject, bidKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bid, node, "int", "");
		} else {
			
		}
	}
	const gchar *showPercentKey = "showPercent";
	node = json_object_get_member(pJsonObject, showPercentKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&showPercent, node, "long long", "");
		} else {
			
		}
	}
}

BidRecommendationItemDTO::BidRecommendationItemDTO(char* json)
{
	this->fromJson(json);
}

char*
BidRecommendationItemDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getBid();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bidKey = "bid";
	json_object_set_member(pJsonObject, bidKey, node);
	if (isprimitive("long long")) {
		long long obj = getShowPercent();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *showPercentKey = "showPercent";
	json_object_set_member(pJsonObject, showPercentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BidRecommendationItemDTO::getBid()
{
	return bid;
}

void
BidRecommendationItemDTO::setBid(int  bid)
{
	this->bid = bid;
}

long long
BidRecommendationItemDTO::getShowPercent()
{
	return showPercent;
}

void
BidRecommendationItemDTO::setShowPercent(long long  showPercent)
{
	this->showPercent = showPercent;
}


