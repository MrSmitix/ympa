#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCategoriesMaxSaleQuantumRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCategoriesMaxSaleQuantumRequest::GetCategoriesMaxSaleQuantumRequest()
{
	//__init();
}

GetCategoriesMaxSaleQuantumRequest::~GetCategoriesMaxSaleQuantumRequest()
{
	//__cleanup();
}

void
GetCategoriesMaxSaleQuantumRequest::__init()
{
	//new std::list()Set> marketCategoryIds;
}

void
GetCategoriesMaxSaleQuantumRequest::__cleanup()
{
	//if(marketCategoryIds != NULL) {
	//marketCategoryIds.RemoveAll(true);
	//delete marketCategoryIds;
	//marketCategoryIds = NULL;
	//}
	//
}

void
GetCategoriesMaxSaleQuantumRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *marketCategoryIdsKey = "marketCategoryIds";
	node = json_object_get_member(pJsonObject, marketCategoryIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			marketCategoryIds = new_list;
		}
		
	}
}

GetCategoriesMaxSaleQuantumRequest::GetCategoriesMaxSaleQuantumRequest(char* json)
{
	this->fromJson(json);
}

char*
GetCategoriesMaxSaleQuantumRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getMarketCategoryIds());
		node = converttoJson(&new_list, "long long", "set");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getMarketCategoryIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *marketCategoryIdsKey = "marketCategoryIds";
	json_object_set_member(pJsonObject, marketCategoryIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Set<long long>
GetCategoriesMaxSaleQuantumRequest::getMarketCategoryIds()
{
	return marketCategoryIds;
}

void
GetCategoriesMaxSaleQuantumRequest::setMarketCategoryIds(Set <long long> marketCategoryIds)
{
	this->marketCategoryIds = marketCategoryIds;
}


