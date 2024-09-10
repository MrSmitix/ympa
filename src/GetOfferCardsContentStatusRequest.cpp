#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOfferCardsContentStatusRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOfferCardsContentStatusRequest::GetOfferCardsContentStatusRequest()
{
	//__init();
}

GetOfferCardsContentStatusRequest::~GetOfferCardsContentStatusRequest()
{
	//__cleanup();
}

void
GetOfferCardsContentStatusRequest::__init()
{
	//new std::list()Set> offerIds;
	//new std::list()Set> cardStatuses;
	//new std::list()Set> categoryIds;
}

void
GetOfferCardsContentStatusRequest::__cleanup()
{
	//if(offerIds != NULL) {
	//offerIds.RemoveAll(true);
	//delete offerIds;
	//offerIds = NULL;
	//}
	//if(cardStatuses != NULL) {
	//cardStatuses.RemoveAll(true);
	//delete cardStatuses;
	//cardStatuses = NULL;
	//}
	//if(categoryIds != NULL) {
	//categoryIds.RemoveAll(true);
	//delete categoryIds;
	//categoryIds = NULL;
	//}
	//
}

void
GetOfferCardsContentStatusRequest::fromJson(char* jsonStr)
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
	const gchar *cardStatusesKey = "cardStatuses";
	node = json_object_get_member(pJsonObject, cardStatusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferCardStatusType> new_list;
			OfferCardStatusType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferCardStatusType")) {
					jsonToValue(&inst, temp_json, "OfferCardStatusType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			cardStatuses = new_list;
		}
		
	}
	const gchar *categoryIdsKey = "categoryIds";
	node = json_object_get_member(pJsonObject, categoryIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			categoryIds = new_list;
		}
		
	}
}

GetOfferCardsContentStatusRequest::GetOfferCardsContentStatusRequest(char* json)
{
	this->fromJson(json);
}

char*
GetOfferCardsContentStatusRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("OfferCardStatusType")) {
		list<OfferCardStatusType> new_list = static_cast<list <OfferCardStatusType> > (getCardStatuses());
		node = converttoJson(&new_list, "OfferCardStatusType", "set");
	} else {
		node = json_node_alloc();
		list<OfferCardStatusType> new_list = static_cast<list <OfferCardStatusType> > (getCardStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferCardStatusType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferCardStatusType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *cardStatusesKey = "cardStatuses";
	json_object_set_member(pJsonObject, cardStatusesKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getCategoryIds());
		node = converttoJson(&new_list, "int", "set");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getCategoryIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *categoryIdsKey = "categoryIds";
	json_object_set_member(pJsonObject, categoryIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Set<std::string>
GetOfferCardsContentStatusRequest::getOfferIds()
{
	return offerIds;
}

void
GetOfferCardsContentStatusRequest::setOfferIds(Set <std::string> offerIds)
{
	this->offerIds = offerIds;
}

Set<OfferCardStatusType>
GetOfferCardsContentStatusRequest::getCardStatuses()
{
	return cardStatuses;
}

void
GetOfferCardsContentStatusRequest::setCardStatuses(Set <OfferCardStatusType> cardStatuses)
{
	this->cardStatuses = cardStatuses;
}

Set<int>
GetOfferCardsContentStatusRequest::getCategoryIds()
{
	return categoryIds;
}

void
GetOfferCardsContentStatusRequest::setCategoryIds(Set <int> categoryIds)
{
	this->categoryIds = categoryIds;
}


