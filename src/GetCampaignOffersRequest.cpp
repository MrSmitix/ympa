#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCampaignOffersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCampaignOffersRequest::GetCampaignOffersRequest()
{
	//__init();
}

GetCampaignOffersRequest::~GetCampaignOffersRequest()
{
	//__cleanup();
}

void
GetCampaignOffersRequest::__init()
{
	//new std::list()std::list> offerIds;
	//new std::list()std::list> statuses;
	//new std::list()std::list> categoryIds;
	//new std::list()std::list> vendorNames;
	//new std::list()std::list> tags;
}

void
GetCampaignOffersRequest::__cleanup()
{
	//if(offerIds != NULL) {
	//offerIds.RemoveAll(true);
	//delete offerIds;
	//offerIds = NULL;
	//}
	//if(statuses != NULL) {
	//statuses.RemoveAll(true);
	//delete statuses;
	//statuses = NULL;
	//}
	//if(categoryIds != NULL) {
	//categoryIds.RemoveAll(true);
	//delete categoryIds;
	//categoryIds = NULL;
	//}
	//if(vendorNames != NULL) {
	//vendorNames.RemoveAll(true);
	//delete vendorNames;
	//vendorNames = NULL;
	//}
	//if(tags != NULL) {
	//tags.RemoveAll(true);
	//delete tags;
	//tags = NULL;
	//}
	//
}

void
GetCampaignOffersRequest::fromJson(char* jsonStr)
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
	const gchar *statusesKey = "statuses";
	node = json_object_get_member(pJsonObject, statusesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferCampaignStatusType> new_list;
			OfferCampaignStatusType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferCampaignStatusType")) {
					jsonToValue(&inst, temp_json, "OfferCampaignStatusType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			statuses = new_list;
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
	const gchar *vendorNamesKey = "vendorNames";
	node = json_object_get_member(pJsonObject, vendorNamesKey);
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
			vendorNames = new_list;
		}
		
	}
	const gchar *tagsKey = "tags";
	node = json_object_get_member(pJsonObject, tagsKey);
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
			tags = new_list;
		}
		
	}
}

GetCampaignOffersRequest::GetCampaignOffersRequest(char* json)
{
	this->fromJson(json);
}

char*
GetCampaignOffersRequest::toJson()
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
	if (isprimitive("OfferCampaignStatusType")) {
		list<OfferCampaignStatusType> new_list = static_cast<list <OfferCampaignStatusType> > (getStatuses());
		node = converttoJson(&new_list, "OfferCampaignStatusType", "array");
	} else {
		node = json_node_alloc();
		list<OfferCampaignStatusType> new_list = static_cast<list <OfferCampaignStatusType> > (getStatuses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferCampaignStatusType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferCampaignStatusType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *statusesKey = "statuses";
	json_object_set_member(pJsonObject, statusesKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getCategoryIds());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getCategoryIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *categoryIdsKey = "categoryIds";
	json_object_set_member(pJsonObject, categoryIdsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getVendorNames());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getVendorNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *vendorNamesKey = "vendorNames";
	json_object_set_member(pJsonObject, vendorNamesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTags());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tagsKey = "tags";
	json_object_set_member(pJsonObject, tagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
GetCampaignOffersRequest::getOfferIds()
{
	return offerIds;
}

void
GetCampaignOffersRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}

std::list<OfferCampaignStatusType>
GetCampaignOffersRequest::getStatuses()
{
	return statuses;
}

void
GetCampaignOffersRequest::setStatuses(std::list <OfferCampaignStatusType> statuses)
{
	this->statuses = statuses;
}

std::list<int>
GetCampaignOffersRequest::getCategoryIds()
{
	return categoryIds;
}

void
GetCampaignOffersRequest::setCategoryIds(std::list <int> categoryIds)
{
	this->categoryIds = categoryIds;
}

std::list<std::string>
GetCampaignOffersRequest::getVendorNames()
{
	return vendorNames;
}

void
GetCampaignOffersRequest::setVendorNames(std::list <std::string> vendorNames)
{
	this->vendorNames = vendorNames;
}

std::list<std::string>
GetCampaignOffersRequest::getTags()
{
	return tags;
}

void
GetCampaignOffersRequest::setTags(std::list <std::string> tags)
{
	this->tags = tags;
}


