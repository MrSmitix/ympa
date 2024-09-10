#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferMappingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferMappingDTO::OfferMappingDTO()
{
	//__init();
}

OfferMappingDTO::~OfferMappingDTO()
{
	//__cleanup();
}

void
OfferMappingDTO::__init()
{
	//marketSku = long(0);
	//modelId = long(0);
	//categoryId = long(0);
}

void
OfferMappingDTO::__cleanup()
{
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//if(modelId != NULL) {
	//
	//delete modelId;
	//modelId = NULL;
	//}
	//if(categoryId != NULL) {
	//
	//delete categoryId;
	//categoryId = NULL;
	//}
	//
}

void
OfferMappingDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *marketSkuKey = "marketSku";
	node = json_object_get_member(pJsonObject, marketSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketSku, node, "long long", "");
		} else {
			
		}
	}
	const gchar *modelIdKey = "modelId";
	node = json_object_get_member(pJsonObject, modelIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&modelId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *categoryIdKey = "categoryId";
	node = json_object_get_member(pJsonObject, categoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&categoryId, node, "long long", "");
		} else {
			
		}
	}
}

OfferMappingDTO::OfferMappingDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferMappingDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getMarketSku();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketSkuKey = "marketSku";
	json_object_set_member(pJsonObject, marketSkuKey, node);
	if (isprimitive("long long")) {
		long long obj = getModelId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *modelIdKey = "modelId";
	json_object_set_member(pJsonObject, modelIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getCategoryId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *categoryIdKey = "categoryId";
	json_object_set_member(pJsonObject, categoryIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OfferMappingDTO::getMarketSku()
{
	return marketSku;
}

void
OfferMappingDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}

long long
OfferMappingDTO::getModelId()
{
	return modelId;
}

void
OfferMappingDTO::setModelId(long long  modelId)
{
	this->modelId = modelId;
}

long long
OfferMappingDTO::getCategoryId()
{
	return categoryId;
}

void
OfferMappingDTO::setCategoryId(long long  categoryId)
{
	this->categoryId = categoryId;
}


