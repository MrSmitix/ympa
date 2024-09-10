#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteOffersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteOffersRequest::DeleteOffersRequest()
{
	//__init();
}

DeleteOffersRequest::~DeleteOffersRequest()
{
	//__cleanup();
}

void
DeleteOffersRequest::__init()
{
	//new std::list()std::list> offerIds;
}

void
DeleteOffersRequest::__cleanup()
{
	//if(offerIds != NULL) {
	//offerIds.RemoveAll(true);
	//delete offerIds;
	//offerIds = NULL;
	//}
	//
}

void
DeleteOffersRequest::fromJson(char* jsonStr)
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

DeleteOffersRequest::DeleteOffersRequest(char* json)
{
	this->fromJson(json);
}

char*
DeleteOffersRequest::toJson()
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
DeleteOffersRequest::getOfferIds()
{
	return offerIds;
}

void
DeleteOffersRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}


