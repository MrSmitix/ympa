#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetQualityRatingRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetQualityRatingRequest::GetQualityRatingRequest()
{
	//__init();
}

GetQualityRatingRequest::~GetQualityRatingRequest()
{
	//__cleanup();
}

void
GetQualityRatingRequest::__init()
{
	//dateFrom = null;
	//dateTo = null;
	//new std::list()Set> campaignIds;
}

void
GetQualityRatingRequest::__cleanup()
{
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
	//
}

void
GetQualityRatingRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
}

GetQualityRatingRequest::GetQualityRatingRequest(char* json)
{
	this->fromJson(json);
}

char*
GetQualityRatingRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		node = converttoJson(&new_list, "long long", "set");
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

Date
GetQualityRatingRequest::getDateFrom()
{
	return dateFrom;
}

void
GetQualityRatingRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GetQualityRatingRequest::getDateTo()
{
	return dateTo;
}

void
GetQualityRatingRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}

Set<long long>
GetQualityRatingRequest::getCampaignIds()
{
	return campaignIds;
}

void
GetQualityRatingRequest::setCampaignIds(Set <long long> campaignIds)
{
	this->campaignIds = campaignIds;
}


