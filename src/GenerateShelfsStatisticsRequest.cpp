#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateShelfsStatisticsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateShelfsStatisticsRequest::GenerateShelfsStatisticsRequest()
{
	//__init();
}

GenerateShelfsStatisticsRequest::~GenerateShelfsStatisticsRequest()
{
	//__cleanup();
}

void
GenerateShelfsStatisticsRequest::__init()
{
	//businessId = long(0);
	//dateFrom = null;
	//dateTo = null;
	//attributionType = new ShelfsStatisticsAttributionType();
}

void
GenerateShelfsStatisticsRequest::__cleanup()
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
	//if(attributionType != NULL) {
	//
	//delete attributionType;
	//attributionType = NULL;
	//}
	//
}

void
GenerateShelfsStatisticsRequest::fromJson(char* jsonStr)
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
	const gchar *attributionTypeKey = "attributionType";
	node = json_object_get_member(pJsonObject, attributionTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ShelfsStatisticsAttributionType")) {
			jsonToValue(&attributionType, node, "ShelfsStatisticsAttributionType", "ShelfsStatisticsAttributionType");
		} else {
			
			ShelfsStatisticsAttributionType* obj = static_cast<ShelfsStatisticsAttributionType*> (&attributionType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GenerateShelfsStatisticsRequest::GenerateShelfsStatisticsRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateShelfsStatisticsRequest::toJson()
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
	if (isprimitive("ShelfsStatisticsAttributionType")) {
		ShelfsStatisticsAttributionType obj = getAttributionType();
		node = converttoJson(&obj, "ShelfsStatisticsAttributionType", "");
	}
	else {
		
		ShelfsStatisticsAttributionType obj = static_cast<ShelfsStatisticsAttributionType> (getAttributionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attributionTypeKey = "attributionType";
	json_object_set_member(pJsonObject, attributionTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateShelfsStatisticsRequest::getBusinessId()
{
	return businessId;
}

void
GenerateShelfsStatisticsRequest::setBusinessId(long long  businessId)
{
	this->businessId = businessId;
}

Date
GenerateShelfsStatisticsRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateShelfsStatisticsRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateShelfsStatisticsRequest::getDateTo()
{
	return dateTo;
}

void
GenerateShelfsStatisticsRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

ShelfsStatisticsAttributionType
GenerateShelfsStatisticsRequest::getAttributionType()
{
	return attributionType;
}

void
GenerateShelfsStatisticsRequest::setAttributionType(ShelfsStatisticsAttributionType  attributionType)
{
	this->attributionType = attributionType;
}


