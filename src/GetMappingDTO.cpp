#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetMappingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetMappingDTO::GetMappingDTO()
{
	//__init();
}

GetMappingDTO::~GetMappingDTO()
{
	//__cleanup();
}

void
GetMappingDTO::__init()
{
	//marketSku = long(0);
	//marketSkuName = std::string();
	//marketModelId = long(0);
	//marketModelName = std::string();
	//marketCategoryId = long(0);
	//marketCategoryName = std::string();
}

void
GetMappingDTO::__cleanup()
{
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//if(marketSkuName != NULL) {
	//
	//delete marketSkuName;
	//marketSkuName = NULL;
	//}
	//if(marketModelId != NULL) {
	//
	//delete marketModelId;
	//marketModelId = NULL;
	//}
	//if(marketModelName != NULL) {
	//
	//delete marketModelName;
	//marketModelName = NULL;
	//}
	//if(marketCategoryId != NULL) {
	//
	//delete marketCategoryId;
	//marketCategoryId = NULL;
	//}
	//if(marketCategoryName != NULL) {
	//
	//delete marketCategoryName;
	//marketCategoryName = NULL;
	//}
	//
}

void
GetMappingDTO::fromJson(char* jsonStr)
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
	const gchar *marketSkuNameKey = "marketSkuName";
	node = json_object_get_member(pJsonObject, marketSkuNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&marketSkuName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *marketModelIdKey = "marketModelId";
	node = json_object_get_member(pJsonObject, marketModelIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketModelId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *marketModelNameKey = "marketModelName";
	node = json_object_get_member(pJsonObject, marketModelNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&marketModelName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *marketCategoryIdKey = "marketCategoryId";
	node = json_object_get_member(pJsonObject, marketCategoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&marketCategoryId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *marketCategoryNameKey = "marketCategoryName";
	node = json_object_get_member(pJsonObject, marketCategoryNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&marketCategoryName, node, "std::string", "");
		} else {
			
		}
	}
}

GetMappingDTO::GetMappingDTO(char* json)
{
	this->fromJson(json);
}

char*
GetMappingDTO::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getMarketSkuName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *marketSkuNameKey = "marketSkuName";
	json_object_set_member(pJsonObject, marketSkuNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getMarketModelId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketModelIdKey = "marketModelId";
	json_object_set_member(pJsonObject, marketModelIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMarketModelName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *marketModelNameKey = "marketModelName";
	json_object_set_member(pJsonObject, marketModelNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getMarketCategoryId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *marketCategoryIdKey = "marketCategoryId";
	json_object_set_member(pJsonObject, marketCategoryIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMarketCategoryName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *marketCategoryNameKey = "marketCategoryName";
	json_object_set_member(pJsonObject, marketCategoryNameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GetMappingDTO::getMarketSku()
{
	return marketSku;
}

void
GetMappingDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
GetMappingDTO::getMarketSkuName()
{
	return marketSkuName;
}

void
GetMappingDTO::setMarketSkuName(std::string  marketSkuName)
{
	this->marketSkuName = marketSkuName;
}

long long
GetMappingDTO::getMarketModelId()
{
	return marketModelId;
}

void
GetMappingDTO::setMarketModelId(long long  marketModelId)
{
	this->marketModelId = marketModelId;
}

std::string
GetMappingDTO::getMarketModelName()
{
	return marketModelName;
}

void
GetMappingDTO::setMarketModelName(std::string  marketModelName)
{
	this->marketModelName = marketModelName;
}

long long
GetMappingDTO::getMarketCategoryId()
{
	return marketCategoryId;
}

void
GetMappingDTO::setMarketCategoryId(long long  marketCategoryId)
{
	this->marketCategoryId = marketCategoryId;
}

std::string
GetMappingDTO::getMarketCategoryName()
{
	return marketCategoryName;
}

void
GetMappingDTO::setMarketCategoryName(std::string  marketCategoryName)
{
	this->marketCategoryName = marketCategoryName;
}


