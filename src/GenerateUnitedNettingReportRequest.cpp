#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateUnitedNettingReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateUnitedNettingReportRequest::GenerateUnitedNettingReportRequest()
{
	//__init();
}

GenerateUnitedNettingReportRequest::~GenerateUnitedNettingReportRequest()
{
	//__cleanup();
}

void
GenerateUnitedNettingReportRequest::__init()
{
	//businessId = long(0);
	//dateTimeFrom = null;
	//dateTimeTo = null;
	//dateFrom = null;
	//dateTo = null;
	//bankOrderId = long(0);
	//bankOrderDateTime = null;
	//new std::list()std::list> placementPrograms;
	//new std::list()std::list> inns;
	//new std::list()std::list> campaignIds;
}

void
GenerateUnitedNettingReportRequest::__cleanup()
{
	//if(businessId != NULL) {
	//
	//delete businessId;
	//businessId = NULL;
	//}
	//if(dateTimeFrom != NULL) {
	//
	//delete dateTimeFrom;
	//dateTimeFrom = NULL;
	//}
	//if(dateTimeTo != NULL) {
	//
	//delete dateTimeTo;
	//dateTimeTo = NULL;
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
	//if(bankOrderId != NULL) {
	//
	//delete bankOrderId;
	//bankOrderId = NULL;
	//}
	//if(bankOrderDateTime != NULL) {
	//
	//delete bankOrderDateTime;
	//bankOrderDateTime = NULL;
	//}
	//if(placementPrograms != NULL) {
	//placementPrograms.RemoveAll(true);
	//delete placementPrograms;
	//placementPrograms = NULL;
	//}
	//if(inns != NULL) {
	//inns.RemoveAll(true);
	//delete inns;
	//inns = NULL;
	//}
	//if(campaignIds != NULL) {
	//campaignIds.RemoveAll(true);
	//delete campaignIds;
	//campaignIds = NULL;
	//}
	//
}

void
GenerateUnitedNettingReportRequest::fromJson(char* jsonStr)
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
	const gchar *dateTimeFromKey = "dateTimeFrom";
	node = json_object_get_member(pJsonObject, dateTimeFromKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dateTimeFrom, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dateTimeToKey = "dateTimeTo";
	node = json_object_get_member(pJsonObject, dateTimeToKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dateTimeTo, node, "std::string", "");
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
	const gchar *bankOrderIdKey = "bankOrderId";
	node = json_object_get_member(pJsonObject, bankOrderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&bankOrderId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *bankOrderDateTimeKey = "bankOrderDateTime";
	node = json_object_get_member(pJsonObject, bankOrderDateTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bankOrderDateTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *placementProgramsKey = "placementPrograms";
	node = json_object_get_member(pJsonObject, placementProgramsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PlacementType> new_list;
			PlacementType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PlacementType")) {
					jsonToValue(&inst, temp_json, "PlacementType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			placementPrograms = new_list;
		}
		
	}
	const gchar *innsKey = "inns";
	node = json_object_get_member(pJsonObject, innsKey);
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
			inns = new_list;
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
}

GenerateUnitedNettingReportRequest::GenerateUnitedNettingReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateUnitedNettingReportRequest::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getDateTimeFrom();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateTimeFromKey = "dateTimeFrom";
	json_object_set_member(pJsonObject, dateTimeFromKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDateTimeTo();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateTimeToKey = "dateTimeTo";
	json_object_set_member(pJsonObject, dateTimeToKey, node);
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
		long long obj = getBankOrderId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *bankOrderIdKey = "bankOrderId";
	json_object_set_member(pJsonObject, bankOrderIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBankOrderDateTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bankOrderDateTimeKey = "bankOrderDateTime";
	json_object_set_member(pJsonObject, bankOrderDateTimeKey, node);
	if (isprimitive("PlacementType")) {
		list<PlacementType> new_list = static_cast<list <PlacementType> > (getPlacementPrograms());
		node = converttoJson(&new_list, "PlacementType", "array");
	} else {
		node = json_node_alloc();
		list<PlacementType> new_list = static_cast<list <PlacementType> > (getPlacementPrograms());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PlacementType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PlacementType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *placementProgramsKey = "placementPrograms";
	json_object_set_member(pJsonObject, placementProgramsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getInns());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getInns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *innsKey = "inns";
	json_object_set_member(pJsonObject, innsKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateUnitedNettingReportRequest::getBusinessId()
{
	return businessId;
}

void
GenerateUnitedNettingReportRequest::setBusinessId(long long  businessId)
{
	this->businessId = businessId;
}

std::string
GenerateUnitedNettingReportRequest::getDateTimeFrom()
{
	return dateTimeFrom;
}

void
GenerateUnitedNettingReportRequest::setDateTimeFrom(std::string  dateTimeFrom)
{
	this->dateTimeFrom = dateTimeFrom;
}

std::string
GenerateUnitedNettingReportRequest::getDateTimeTo()
{
	return dateTimeTo;
}

void
GenerateUnitedNettingReportRequest::setDateTimeTo(std::string  dateTimeTo)
{
	this->dateTimeTo = dateTimeTo;
}

Date
GenerateUnitedNettingReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateUnitedNettingReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateUnitedNettingReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateUnitedNettingReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

long long
GenerateUnitedNettingReportRequest::getBankOrderId()
{
	return bankOrderId;
}

void
GenerateUnitedNettingReportRequest::setBankOrderId(long long  bankOrderId)
{
	this->bankOrderId = bankOrderId;
}

std::string
GenerateUnitedNettingReportRequest::getBankOrderDateTime()
{
	return bankOrderDateTime;
}

void
GenerateUnitedNettingReportRequest::setBankOrderDateTime(std::string  bankOrderDateTime)
{
	this->bankOrderDateTime = bankOrderDateTime;
}

std::list<PlacementType>
GenerateUnitedNettingReportRequest::getPlacementPrograms()
{
	return placementPrograms;
}

void
GenerateUnitedNettingReportRequest::setPlacementPrograms(std::list <PlacementType> placementPrograms)
{
	this->placementPrograms = placementPrograms;
}

std::list<std::string>
GenerateUnitedNettingReportRequest::getInns()
{
	return inns;
}

void
GenerateUnitedNettingReportRequest::setInns(std::list <std::string> inns)
{
	this->inns = inns;
}

std::list<long long>
GenerateUnitedNettingReportRequest::getCampaignIds()
{
	return campaignIds;
}

void
GenerateUnitedNettingReportRequest::setCampaignIds(std::list <long long> campaignIds)
{
	this->campaignIds = campaignIds;
}


