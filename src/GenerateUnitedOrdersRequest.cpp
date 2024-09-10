#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateUnitedOrdersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateUnitedOrdersRequest::GenerateUnitedOrdersRequest()
{
	//__init();
}

GenerateUnitedOrdersRequest::~GenerateUnitedOrdersRequest()
{
	//__cleanup();
}

void
GenerateUnitedOrdersRequest::__init()
{
	//businessId = long(0);
	//dateFrom = null;
	//dateTo = null;
	//new std::list()std::list> campaignIds;
	//promoId = std::string();
}

void
GenerateUnitedOrdersRequest::__cleanup()
{
	//if(businessId != NULL) {
	//
	//delete businessId;
	//businessId = NULL;
	//}
	//if(dateFrom != NULL) {
	//
	//delete dateFrom;
	//dateFrom = NULL;
	//}
	//if(dateTo != NULL) {
	//
	//delete dateTo;
	//dateTo = NULL;
	//}
	//if(campaignIds != NULL) {
	//campaignIds.RemoveAll(true);
	//delete campaignIds;
	//campaignIds = NULL;
	//}
	//if(promoId != NULL) {
	//
	//delete promoId;
	//promoId = NULL;
	//}
	//
}

void
GenerateUnitedOrdersRequest::fromJson(char* jsonStr)
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
	const gchar *dateFromKey = "dateFrom";
	node = json_object_get_member(pJsonObject, dateFromKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&dateFrom, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *dateToKey = "dateTo";
	node = json_object_get_member(pJsonObject, dateToKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&dateTo, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *campaignIdsKey = "campaignIds";
	node = json_object_get_member(pJsonObject, campaignIdsKey);
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
			campaignIds = new_list;
		}
		
	}
	const gchar *promoIdKey = "promoId";
	node = json_object_get_member(pJsonObject, promoIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promoId, node, "std::string", "");
		} else {
			
		}
	}
}

GenerateUnitedOrdersRequest::GenerateUnitedOrdersRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateUnitedOrdersRequest::toJson()
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
	if (isprimitive("Date")) {
		Date obj = getDateFrom();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dateFromKey = "dateFrom";
	json_object_set_member(pJsonObject, dateFromKey, node);
	if (isprimitive("Date")) {
		Date obj = getDateTo();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dateToKey = "dateTo";
	json_object_set_member(pJsonObject, dateToKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getCampaignIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getCampaignIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *campaignIdsKey = "campaignIds";
	json_object_set_member(pJsonObject, campaignIdsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPromoId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promoIdKey = "promoId";
	json_object_set_member(pJsonObject, promoIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateUnitedOrdersRequest::getBusinessId()
{
	return businessId;
}

void
GenerateUnitedOrdersRequest::setBusinessId(long long  businessId)
{
	this->businessId = businessId;
}

Date
GenerateUnitedOrdersRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateUnitedOrdersRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateUnitedOrdersRequest::getDateTo()
{
	return dateTo;
}

void
GenerateUnitedOrdersRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

std::list<long long>
GenerateUnitedOrdersRequest::getCampaignIds()
{
	return campaignIds;
}

void
GenerateUnitedOrdersRequest::setCampaignIds(std::list <long long> campaignIds)
{
	this->campaignIds = campaignIds;
}

std::string
GenerateUnitedOrdersRequest::getPromoId()
{
	return promoId;
}

void
GenerateUnitedOrdersRequest::setPromoId(std::string  promoId)
{
	this->promoId = promoId;
}


