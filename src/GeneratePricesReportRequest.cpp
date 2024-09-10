#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GeneratePricesReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GeneratePricesReportRequest::GeneratePricesReportRequest()
{
	//__init();
}

GeneratePricesReportRequest::~GeneratePricesReportRequest()
{
	//__cleanup();
}

void
GeneratePricesReportRequest::__init()
{
	//businessId = long(0);
	//campaignId = long(0);
	//new std::list()std::list> categoryIds;
	//creationDateFrom = null;
	//creationDateTo = null;
}

void
GeneratePricesReportRequest::__cleanup()
{
	//if(businessId != NULL) {
	//
	//delete businessId;
	//businessId = NULL;
	//}
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(categoryIds != NULL) {
	//categoryIds.RemoveAll(true);
	//delete categoryIds;
	//categoryIds = NULL;
	//}
	//if(creationDateFrom != NULL) {
	//
	//delete creationDateFrom;
	//creationDateFrom = NULL;
	//}
	//if(creationDateTo != NULL) {
	//
	//delete creationDateTo;
	//creationDateTo = NULL;
	//}
	//
}

void
GeneratePricesReportRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *businessIdKey = "businessId";
	node = json_object_get_member(pJsonObject, businessIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&businessId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *campaignIdKey = "campaignId";
	node = json_object_get_member(pJsonObject, campaignIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&campaignId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *categoryIdsKey = "categoryIds";
	node = json_object_get_member(pJsonObject, categoryIdsKey);
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
			categoryIds = new_list;
		}
		
	}
	const gchar *creationDateFromKey = "creationDateFrom";
	node = json_object_get_member(pJsonObject, creationDateFromKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&creationDateFrom, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *creationDateToKey = "creationDateTo";
	node = json_object_get_member(pJsonObject, creationDateToKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&creationDateTo, node, "Date", "Date");
		} else {
			
		}
	}
}

GeneratePricesReportRequest::GeneratePricesReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GeneratePricesReportRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getBusinessId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *businessIdKey = "businessId";
	json_object_set_member(pJsonObject, businessIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getCampaignId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *campaignIdKey = "campaignId";
	json_object_set_member(pJsonObject, campaignIdKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getCategoryIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getCategoryIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *categoryIdsKey = "categoryIds";
	json_object_set_member(pJsonObject, categoryIdsKey, node);
	if (isprimitive("Date")) {
		Date obj = getCreationDateFrom();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *creationDateFromKey = "creationDateFrom";
	json_object_set_member(pJsonObject, creationDateFromKey, node);
	if (isprimitive("Date")) {
		Date obj = getCreationDateTo();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *creationDateToKey = "creationDateTo";
	json_object_set_member(pJsonObject, creationDateToKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GeneratePricesReportRequest::getBusinessId()
{
	return businessId;
}

void
GeneratePricesReportRequest::setBusinessId(long long  businessId)
{
	this->businessId = businessId;
}

long long
GeneratePricesReportRequest::getCampaignId()
{
	return campaignId;
}

void
GeneratePricesReportRequest::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

std::list<long long>
GeneratePricesReportRequest::getCategoryIds()
{
	return categoryIds;
}

void
GeneratePricesReportRequest::setCategoryIds(std::list <long long> categoryIds)
{
	this->categoryIds = categoryIds;
}

Date
GeneratePricesReportRequest::getCreationDateFrom()
{
	return creationDateFrom;
}

void
GeneratePricesReportRequest::setCreationDateFrom(Date  creationDateFrom)
{
	this->creationDateFrom = creationDateFrom;
}

Date
GeneratePricesReportRequest::getCreationDateTo()
{
	return creationDateTo;
}

void
GeneratePricesReportRequest::setCreationDateTo(Date  creationDateTo)
{
	this->creationDateTo = creationDateTo;
}


