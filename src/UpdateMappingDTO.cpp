#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateMappingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateMappingDTO::UpdateMappingDTO()
{
	//__init();
}

UpdateMappingDTO::~UpdateMappingDTO()
{
	//__cleanup();
}

void
UpdateMappingDTO::__init()
{
	//marketSku = long(0);
}

void
UpdateMappingDTO::__cleanup()
{
	//if(marketSku != NULL) {
	//
	//delete marketSku;
	//marketSku = NULL;
	//}
	//
}

void
UpdateMappingDTO::fromJson(char* jsonStr)
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
}

UpdateMappingDTO::UpdateMappingDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateMappingDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
UpdateMappingDTO::getMarketSku()
{
	return marketSku;
}

void
UpdateMappingDTO::setMarketSku(long long  marketSku)
{
	this->marketSku = marketSku;
}


