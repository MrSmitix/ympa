#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateUnitedMarketplaceServicesReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateUnitedMarketplaceServicesReportRequest::GenerateUnitedMarketplaceServicesReportRequest()
{
	//__init();
}

GenerateUnitedMarketplaceServicesReportRequest::~GenerateUnitedMarketplaceServicesReportRequest()
{
	//__cleanup();
}

void
GenerateUnitedMarketplaceServicesReportRequest::__init()
{
	//businessId = long(0);
	//dateTimeFrom = null;
	//dateTimeTo = null;
	//dateFrom = null;
	//dateTo = null;
	//yearFrom = int(0);
	//monthFrom = int(0);
	//yearTo = int(0);
	//monthTo = int(0);
	//new std::list()std::list> placementPrograms;
	//new std::list()std::list> inns;
	//new std::list()std::list> campaignIds;
}

void
GenerateUnitedMarketplaceServicesReportRequest::__cleanup()
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
	//if(yearFrom != NULL) {
	//
	//delete yearFrom;
	//yearFrom = NULL;
	//}
	//if(monthFrom != NULL) {
	//
	//delete monthFrom;
	//monthFrom = NULL;
	//}
	//if(yearTo != NULL) {
	//
	//delete yearTo;
	//yearTo = NULL;
	//}
	//if(monthTo != NULL) {
	//
	//delete monthTo;
	//monthTo = NULL;
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
GenerateUnitedMarketplaceServicesReportRequest::fromJson(char* jsonStr)
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
	const gchar *yearFromKey = "yearFrom";
	node = json_object_get_member(pJsonObject, yearFromKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&yearFrom, node, "int", "");
		} else {
			
		}
	}
	const gchar *monthFromKey = "monthFrom";
	node = json_object_get_member(pJsonObject, monthFromKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&monthFrom, node, "int", "");
		} else {
			
		}
	}
	const gchar *yearToKey = "yearTo";
	node = json_object_get_member(pJsonObject, yearToKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&yearTo, node, "int", "");
		} else {
			
		}
	}
	const gchar *monthToKey = "monthTo";
	node = json_object_get_member(pJsonObject, monthToKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&monthTo, node, "int", "");
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

GenerateUnitedMarketplaceServicesReportRequest::GenerateUnitedMarketplaceServicesReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateUnitedMarketplaceServicesReportRequest::toJson()
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
	if (isprimitive("int")) {
		int obj = getYearFrom();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *yearFromKey = "yearFrom";
	json_object_set_member(pJsonObject, yearFromKey, node);
	if (isprimitive("int")) {
		int obj = getMonthFrom();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *monthFromKey = "monthFrom";
	json_object_set_member(pJsonObject, monthFromKey, node);
	if (isprimitive("int")) {
		int obj = getYearTo();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *yearToKey = "yearTo";
	json_object_set_member(pJsonObject, yearToKey, node);
	if (isprimitive("int")) {
		int obj = getMonthTo();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *monthToKey = "monthTo";
	json_object_set_member(pJsonObject, monthToKey, node);
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
GenerateUnitedMarketplaceServicesReportRequest::getBusinessId()
{
	return businessId;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setBusinessId(long long  businessId)
{
	this->businessId = businessId;
}

std::string
GenerateUnitedMarketplaceServicesReportRequest::getDateTimeFrom()
{
	return dateTimeFrom;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setDateTimeFrom(std::string  dateTimeFrom)
{
	this->dateTimeFrom = dateTimeFrom;
}

std::string
GenerateUnitedMarketplaceServicesReportRequest::getDateTimeTo()
{
	return dateTimeTo;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setDateTimeTo(std::string  dateTimeTo)
{
	this->dateTimeTo = dateTimeTo;
}

Date
GenerateUnitedMarketplaceServicesReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateUnitedMarketplaceServicesReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

int
GenerateUnitedMarketplaceServicesReportRequest::getYearFrom()
{
	return yearFrom;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setYearFrom(int  yearFrom)
{
	this->yearFrom = yearFrom;
}

int
GenerateUnitedMarketplaceServicesReportRequest::getMonthFrom()
{
	return monthFrom;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setMonthFrom(int  monthFrom)
{
	this->monthFrom = monthFrom;
}

int
GenerateUnitedMarketplaceServicesReportRequest::getYearTo()
{
	return yearTo;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setYearTo(int  yearTo)
{
	this->yearTo = yearTo;
}

int
GenerateUnitedMarketplaceServicesReportRequest::getMonthTo()
{
	return monthTo;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setMonthTo(int  monthTo)
{
	this->monthTo = monthTo;
}

std::list<PlacementType>
GenerateUnitedMarketplaceServicesReportRequest::getPlacementPrograms()
{
	return placementPrograms;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setPlacementPrograms(std::list <PlacementType> placementPrograms)
{
	this->placementPrograms = placementPrograms;
}

std::list<std::string>
GenerateUnitedMarketplaceServicesReportRequest::getInns()
{
	return inns;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setInns(std::list <std::string> inns)
{
	this->inns = inns;
}

std::list<long long>
GenerateUnitedMarketplaceServicesReportRequest::getCampaignIds()
{
	return campaignIds;
}

void
GenerateUnitedMarketplaceServicesReportRequest::setCampaignIds(std::list <long long> campaignIds)
{
	this->campaignIds = campaignIds;
}


