#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPricesByOfferIdsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPricesByOfferIdsRequest::GetPricesByOfferIdsRequest()
{
	//__init();
}

GetPricesByOfferIdsRequest::~GetPricesByOfferIdsRequest()
{
	//__cleanup();
}

void
GetPricesByOfferIdsRequest::__init()
{
	//new std::list()std::list> offerIds;
}

void
GetPricesByOfferIdsRequest::__cleanup()
{
	//if(offerIds != NULL) {
	//offerIds.RemoveAll(true);
	//delete offerIds;
	//offerIds = NULL;
	//}
	//
}

void
GetPricesByOfferIdsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerIdsKey = "offerIds";
	node = json_object_get_member(pJsonObject, offerIdsKey);
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
			offerIds = new_list;
		}
		
	}
}

GetPricesByOfferIdsRequest::GetPricesByOfferIdsRequest(char* json)
{
	this->fromJson(json);
}

char*
GetPricesByOfferIdsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getOfferIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getOfferIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *offerIdsKey = "offerIds";
	json_object_set_member(pJsonObject, offerIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
GetPricesByOfferIdsRequest::getOfferIds()
{
	return offerIds;
}

void
GetPricesByOfferIdsRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}


