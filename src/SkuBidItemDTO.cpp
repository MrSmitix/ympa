#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SkuBidItemDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SkuBidItemDTO::SkuBidItemDTO()
{
	//__init();
}

SkuBidItemDTO::~SkuBidItemDTO()
{
	//__cleanup();
}

void
SkuBidItemDTO::__init()
{
	//sku = std::string();
	//bid = int(0);
}

void
SkuBidItemDTO::__cleanup()
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
	//
}

void
SkuBidItemDTO::fromJson(char* jsonStr)
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
}

SkuBidItemDTO::SkuBidItemDTO(char* json)
{
	this->fromJson(json);
}

char*
SkuBidItemDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SkuBidItemDTO::getSku()
{
	return sku;
}

void
SkuBidItemDTO::setSku(std::string  sku)
{
	this->sku = sku;
}

int
SkuBidItemDTO::getBid()
{
	return bid;
}

void
SkuBidItemDTO::setBid(int  bid)
{
	this->bid = bid;
}


