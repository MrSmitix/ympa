#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetWarehouseStocksRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetWarehouseStocksRequest::GetWarehouseStocksRequest()
{
	//__init();
}

GetWarehouseStocksRequest::~GetWarehouseStocksRequest()
{
	//__cleanup();
}

void
GetWarehouseStocksRequest::__init()
{
	//withTurnover = bool(false);
	//archived = bool(false);
	//new std::list()Set> offerIds;
}

void
GetWarehouseStocksRequest::__cleanup()
{
	//if(withTurnover != NULL) {
	//
	//delete withTurnover;
	//withTurnover = NULL;
	//}
	//if(archived != NULL) {
	//
	//delete archived;
	//archived = NULL;
	//}
	//if(offerIds != NULL) {
	//offerIds.RemoveAll(true);
	//delete offerIds;
	//offerIds = NULL;
	//}
	//
}

void
GetWarehouseStocksRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *withTurnoverKey = "withTurnover";
	node = json_object_get_member(pJsonObject, withTurnoverKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&withTurnover, node, "bool", "");
		} else {
			
		}
	}
	const gchar *archivedKey = "archived";
	node = json_object_get_member(pJsonObject, archivedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&archived, node, "bool", "");
		} else {
			
		}
	}
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

GetWarehouseStocksRequest::GetWarehouseStocksRequest(char* json)
{
	this->fromJson(json);
}

char*
GetWarehouseStocksRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getWithTurnover();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *withTurnoverKey = "withTurnover";
	json_object_set_member(pJsonObject, withTurnoverKey, node);
	if (isprimitive("bool")) {
		bool obj = getArchived();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *archivedKey = "archived";
	json_object_set_member(pJsonObject, archivedKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getOfferIds());
		node = converttoJson(&new_list, "std::string", "set");
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

bool
GetWarehouseStocksRequest::getWithTurnover()
{
	return withTurnover;
}

void
GetWarehouseStocksRequest::setWithTurnover(bool  withTurnover)
{
	this->withTurnover = withTurnover;
}

bool
GetWarehouseStocksRequest::getArchived()
{
	return archived;
}

void
GetWarehouseStocksRequest::setArchived(bool  archived)
{
	this->archived = archived;
}

Set<std::string>
GetWarehouseStocksRequest::getOfferIds()
{
	return offerIds;
}

void
GetWarehouseStocksRequest::setOfferIds(Set <std::string> offerIds)
{
	this->offerIds = offerIds;
}


