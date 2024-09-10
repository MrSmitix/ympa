#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateGoodsMovementReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateGoodsMovementReportRequest::GenerateGoodsMovementReportRequest()
{
	//__init();
}

GenerateGoodsMovementReportRequest::~GenerateGoodsMovementReportRequest()
{
	//__cleanup();
}

void
GenerateGoodsMovementReportRequest::__init()
{
	//campaignId = long(0);
	//dateFrom = null;
	//dateTo = null;
	//shopSku = std::string();
}

void
GenerateGoodsMovementReportRequest::__cleanup()
{
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
	//if(shopSku != NULL) {
	//
	//delete shopSku;
	//shopSku = NULL;
	//}
	//
}

void
GenerateGoodsMovementReportRequest::fromJson(char* jsonStr)
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
	const gchar *shopSkuKey = "shopSku";
	node = json_object_get_member(pJsonObject, shopSkuKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shopSku, node, "std::string", "");
		} else {
			
		}
	}
}

GenerateGoodsMovementReportRequest::GenerateGoodsMovementReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateGoodsMovementReportRequest::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getShopSku();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shopSkuKey = "shopSku";
	json_object_set_member(pJsonObject, shopSkuKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateGoodsMovementReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateGoodsMovementReportRequest::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

Date
GenerateGoodsMovementReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateGoodsMovementReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateGoodsMovementReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateGoodsMovementReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

std::string
GenerateGoodsMovementReportRequest::getShopSku()
{
	return shopSku;
}

void
GenerateGoodsMovementReportRequest::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}


