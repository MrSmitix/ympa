#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetBidsRecommendationsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetBidsRecommendationsRequest::GetBidsRecommendationsRequest()
{
	//__init();
}

GetBidsRecommendationsRequest::~GetBidsRecommendationsRequest()
{
	//__cleanup();
}

void
GetBidsRecommendationsRequest::__init()
{
	//new std::list()std::list> skus;
}

void
GetBidsRecommendationsRequest::__cleanup()
{
	//if(skus != NULL) {
	//skus.RemoveAll(true);
	//delete skus;
	//skus = NULL;
	//}
	//
}

void
GetBidsRecommendationsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *skusKey = "skus";
	node = json_object_get_member(pJsonObject, skusKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			skus = new_list;
		}
		
	}
}

GetBidsRecommendationsRequest::GetBidsRecommendationsRequest(char* json)
{
	this->fromJson(json);
}

char*
GetBidsRecommendationsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSkus());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSkus());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *skusKey = "skus";
	json_object_set_member(pJsonObject, skusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
GetBidsRecommendationsRequest::getSkus()
{
	return skus;
}

void
GetBidsRecommendationsRequest::setSkus(std::list <std::string> skus)
{
	this->skus = skus;
}


