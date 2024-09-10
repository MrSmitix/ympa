#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateGoodsRealizationReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateGoodsRealizationReportRequest::GenerateGoodsRealizationReportRequest()
{
	//__init();
}

GenerateGoodsRealizationReportRequest::~GenerateGoodsRealizationReportRequest()
{
	//__cleanup();
}

void
GenerateGoodsRealizationReportRequest::__init()
{
	//campaignId = long(0);
	//year = int(0);
	//month = int(0);
}

void
GenerateGoodsRealizationReportRequest::__cleanup()
{
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(year != NULL) {
	//
	//delete year;
	//year = NULL;
	//}
	//if(month != NULL) {
	//
	//delete month;
	//month = NULL;
	//}
	//
}

void
GenerateGoodsRealizationReportRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignIdKey = "campaignId";
	node = json_object_get_member(pJsonObject, campaignIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&campaignId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *yearKey = "year";
	node = json_object_get_member(pJsonObject, yearKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&year, node, "int", "");
		} else {
			
		}
	}
	const gchar *monthKey = "month";
	node = json_object_get_member(pJsonObject, monthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&month, node, "int", "");
		} else {
			
		}
	}
}

GenerateGoodsRealizationReportRequest::GenerateGoodsRealizationReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateGoodsRealizationReportRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCampaignId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *campaignIdKey = "campaignId";
	json_object_set_member(pJsonObject, campaignIdKey, node);
	if (isprimitive("int")) {
		int obj = getYear();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *yearKey = "year";
	json_object_set_member(pJsonObject, yearKey, node);
	if (isprimitive("int")) {
		int obj = getMonth();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *monthKey = "month";
	json_object_set_member(pJsonObject, monthKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateGoodsRealizationReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateGoodsRealizationReportRequest::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

int
GenerateGoodsRealizationReportRequest::getYear()
{
	return year;
}

void
GenerateGoodsRealizationReportRequest::setYear(int  year)
{
	this->year = year;
}

int
GenerateGoodsRealizationReportRequest::getMonth()
{
	return month;
}

void
GenerateGoodsRealizationReportRequest::setMonth(int  month)
{
	this->month = month;
}


