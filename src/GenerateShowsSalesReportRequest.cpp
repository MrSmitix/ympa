#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateShowsSalesReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateShowsSalesReportRequest::GenerateShowsSalesReportRequest()
{
	//__init();
}

GenerateShowsSalesReportRequest::~GenerateShowsSalesReportRequest()
{
	//__cleanup();
}

void
GenerateShowsSalesReportRequest::__init()
{
	//businessId = long(0);
	//campaignId = long(0);
	//dateFrom = null;
	//dateTo = null;
	//grouping = new ShowsSalesGroupingType();
}

void
GenerateShowsSalesReportRequest::__cleanup()
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
	//if(grouping != NULL) {
	//
	//delete grouping;
	//grouping = NULL;
	//}
	//
}

void
GenerateShowsSalesReportRequest::fromJson(char* jsonStr)
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
	const gchar *groupingKey = "grouping";
	node = json_object_get_member(pJsonObject, groupingKey);
	if (node !=NULL) {
	

		if (isprimitive("ShowsSalesGroupingType")) {
			jsonToValue(&grouping, node, "ShowsSalesGroupingType", "ShowsSalesGroupingType");
		} else {
			
			ShowsSalesGroupingType* obj = static_cast<ShowsSalesGroupingType*> (&grouping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GenerateShowsSalesReportRequest::GenerateShowsSalesReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateShowsSalesReportRequest::toJson()
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
	if (isprimitive("ShowsSalesGroupingType")) {
		ShowsSalesGroupingType obj = getGrouping();
		node = converttoJson(&obj, "ShowsSalesGroupingType", "");
	}
	else {
		
		ShowsSalesGroupingType obj = static_cast<ShowsSalesGroupingType> (getGrouping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupingKey = "grouping";
	json_object_set_member(pJsonObject, groupingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateShowsSalesReportRequest::getBusinessId()
{
	return businessId;
}

void
GenerateShowsSalesReportRequest::setBusinessId(long long  businessId)
{
	this->businessId = businessId;
}

long long
GenerateShowsSalesReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateShowsSalesReportRequest::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

Date
GenerateShowsSalesReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateShowsSalesReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateShowsSalesReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateShowsSalesReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

ShowsSalesGroupingType
GenerateShowsSalesReportRequest::getGrouping()
{
	return grouping;
}

void
GenerateShowsSalesReportRequest::setGrouping(ShowsSalesGroupingType  grouping)
{
	this->grouping = grouping;
}


