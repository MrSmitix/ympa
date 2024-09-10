#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateGoodsTurnoverRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateGoodsTurnoverRequest::GenerateGoodsTurnoverRequest()
{
	//__init();
}

GenerateGoodsTurnoverRequest::~GenerateGoodsTurnoverRequest()
{
	//__cleanup();
}

void
GenerateGoodsTurnoverRequest::__init()
{
	//campaignId = long(0);
	//date = null;
}

void
GenerateGoodsTurnoverRequest::__cleanup()
{
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//
}

void
GenerateGoodsTurnoverRequest::fromJson(char* jsonStr)
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
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&date, node, "Date", "Date");
		} else {
			
		}
	}
}

GenerateGoodsTurnoverRequest::GenerateGoodsTurnoverRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateGoodsTurnoverRequest::toJson()
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
		Date obj = getDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateGoodsTurnoverRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateGoodsTurnoverRequest::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

Date
GenerateGoodsTurnoverRequest::getDate()
{
	return date;
}

void
GenerateGoodsTurnoverRequest::setDate(Date  date)
{
	this->date = date;
}


