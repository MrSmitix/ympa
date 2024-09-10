#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateStocksOnWarehousesReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateStocksOnWarehousesReportRequest::GenerateStocksOnWarehousesReportRequest()
{
	//__init();
}

GenerateStocksOnWarehousesReportRequest::~GenerateStocksOnWarehousesReportRequest()
{
	//__cleanup();
}

void
GenerateStocksOnWarehousesReportRequest::__init()
{
	//campaignId = long(0);
	//new std::list()std::list> warehouseIds;
	//reportDate = null;
	//new std::list()std::list> categoryIds;
	//hasStocks = bool(false);
}

void
GenerateStocksOnWarehousesReportRequest::__cleanup()
{
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(warehouseIds != NULL) {
	//warehouseIds.RemoveAll(true);
	//delete warehouseIds;
	//warehouseIds = NULL;
	//}
	//if(reportDate != NULL) {
	//
	//delete reportDate;
	//reportDate = NULL;
	//}
	//if(categoryIds != NULL) {
	//categoryIds.RemoveAll(true);
	//delete categoryIds;
	//categoryIds = NULL;
	//}
	//if(hasStocks != NULL) {
	//
	//delete hasStocks;
	//hasStocks = NULL;
	//}
	//
}

void
GenerateStocksOnWarehousesReportRequest::fromJson(char* jsonStr)
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
	const gchar *warehouseIdsKey = "warehouseIds";
	node = json_object_get_member(pJsonObject, warehouseIdsKey);
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
			warehouseIds = new_list;
		}
		
	}
	const gchar *reportDateKey = "reportDate";
	node = json_object_get_member(pJsonObject, reportDateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&reportDate, node, "Date", "Date");
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
	const gchar *hasStocksKey = "hasStocks";
	node = json_object_get_member(pJsonObject, hasStocksKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&hasStocks, node, "bool", "");
		} else {
			
		}
	}
}

GenerateStocksOnWarehousesReportRequest::GenerateStocksOnWarehousesReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateStocksOnWarehousesReportRequest::toJson()
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
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getWarehouseIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getWarehouseIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *warehouseIdsKey = "warehouseIds";
	json_object_set_member(pJsonObject, warehouseIdsKey, node);
	if (isprimitive("Date")) {
		Date obj = getReportDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *reportDateKey = "reportDate";
	json_object_set_member(pJsonObject, reportDateKey, node);
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
	if (isprimitive("bool")) {
		bool obj = getHasStocks();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *hasStocksKey = "hasStocks";
	json_object_set_member(pJsonObject, hasStocksKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateStocksOnWarehousesReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateStocksOnWarehousesReportRequest::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

std::list<long long>
GenerateStocksOnWarehousesReportRequest::getWarehouseIds()
{
	return warehouseIds;
}

void
GenerateStocksOnWarehousesReportRequest::setWarehouseIds(std::list <long long> warehouseIds)
{
	this->warehouseIds = warehouseIds;
}

Date
GenerateStocksOnWarehousesReportRequest::getReportDate()
{
	return reportDate;
}

void
GenerateStocksOnWarehousesReportRequest::setReportDate(Date  reportDate)
{
	this->reportDate = reportDate;
}

std::list<long long>
GenerateStocksOnWarehousesReportRequest::getCategoryIds()
{
	return categoryIds;
}

void
GenerateStocksOnWarehousesReportRequest::setCategoryIds(std::list <long long> categoryIds)
{
	this->categoryIds = categoryIds;
}

bool
GenerateStocksOnWarehousesReportRequest::getHasStocks()
{
	return hasStocks;
}

void
GenerateStocksOnWarehousesReportRequest::setHasStocks(bool  hasStocks)
{
	this->hasStocks = hasStocks;
}


