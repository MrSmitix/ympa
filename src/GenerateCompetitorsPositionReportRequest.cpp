#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateCompetitorsPositionReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateCompetitorsPositionReportRequest::GenerateCompetitorsPositionReportRequest()
{
	//__init();
}

GenerateCompetitorsPositionReportRequest::~GenerateCompetitorsPositionReportRequest()
{
	//__cleanup();
}

void
GenerateCompetitorsPositionReportRequest::__init()
{
	//businessId = long(0);
	//categoryId = long(0);
	//dateFrom = null;
	//dateTo = null;
}

void
GenerateCompetitorsPositionReportRequest::__cleanup()
{
	//if(businessId != NULL) {
	//
	//delete businessId;
	//businessId = NULL;
	//}
	//if(categoryId != NULL) {
	//
	//delete categoryId;
	//categoryId = NULL;
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
	//
}

void
GenerateCompetitorsPositionReportRequest::fromJson(char* jsonStr)
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
	const gchar *categoryIdKey = "categoryId";
	node = json_object_get_member(pJsonObject, categoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&categoryId, node, "long long", "");
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
}

GenerateCompetitorsPositionReportRequest::GenerateCompetitorsPositionReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateCompetitorsPositionReportRequest::toJson()
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
		long long obj = getCategoryId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *categoryIdKey = "categoryId";
	json_object_set_member(pJsonObject, categoryIdKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateCompetitorsPositionReportRequest::getBusinessId()
{
	return businessId;
}

void
GenerateCompetitorsPositionReportRequest::setBusinessId(long long  businessId)
{
	this->businessId = businessId;
}

long long
GenerateCompetitorsPositionReportRequest::getCategoryId()
{
	return categoryId;
}

void
GenerateCompetitorsPositionReportRequest::setCategoryId(long long  categoryId)
{
	this->categoryId = categoryId;
}

Date
GenerateCompetitorsPositionReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateCompetitorsPositionReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateCompetitorsPositionReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateCompetitorsPositionReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}


