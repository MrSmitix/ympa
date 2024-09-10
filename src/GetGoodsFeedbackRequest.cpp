#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetGoodsFeedbackRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetGoodsFeedbackRequest::GetGoodsFeedbackRequest()
{
	//__init();
}

GetGoodsFeedbackRequest::~GetGoodsFeedbackRequest()
{
	//__cleanup();
}

void
GetGoodsFeedbackRequest::__init()
{
	//dateTimeFrom = null;
	//dateTimeTo = null;
	//reactionStatus = new FeedbackReactionStatusType();
	//new std::list()Set> ratingValues;
	//new std::list()Set> modelIds;
	//paid = bool(false);
}

void
GetGoodsFeedbackRequest::__cleanup()
{
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
	//if(reactionStatus != NULL) {
	//
	//delete reactionStatus;
	//reactionStatus = NULL;
	//}
	//if(ratingValues != NULL) {
	//ratingValues.RemoveAll(true);
	//delete ratingValues;
	//ratingValues = NULL;
	//}
	//if(modelIds != NULL) {
	//modelIds.RemoveAll(true);
	//delete modelIds;
	//modelIds = NULL;
	//}
	//if(paid != NULL) {
	//
	//delete paid;
	//paid = NULL;
	//}
	//
}

void
GetGoodsFeedbackRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *reactionStatusKey = "reactionStatus";
	node = json_object_get_member(pJsonObject, reactionStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackReactionStatusType")) {
			jsonToValue(&reactionStatus, node, "FeedbackReactionStatusType", "FeedbackReactionStatusType");
		} else {
			
			FeedbackReactionStatusType* obj = static_cast<FeedbackReactionStatusType*> (&reactionStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ratingValuesKey = "ratingValues";
	node = json_object_get_member(pJsonObject, ratingValuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			ratingValues = new_list;
		}
		
	}
	const gchar *modelIdsKey = "modelIds";
	node = json_object_get_member(pJsonObject, modelIdsKey);
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
			modelIds = new_list;
		}
		
	}
	const gchar *paidKey = "paid";
	node = json_object_get_member(pJsonObject, paidKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&paid, node, "bool", "");
		} else {
			
		}
	}
}

GetGoodsFeedbackRequest::GetGoodsFeedbackRequest(char* json)
{
	this->fromJson(json);
}

char*
GetGoodsFeedbackRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("FeedbackReactionStatusType")) {
		FeedbackReactionStatusType obj = getReactionStatus();
		node = converttoJson(&obj, "FeedbackReactionStatusType", "");
	}
	else {
		
		FeedbackReactionStatusType obj = static_cast<FeedbackReactionStatusType> (getReactionStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reactionStatusKey = "reactionStatus";
	json_object_set_member(pJsonObject, reactionStatusKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getRatingValues());
		node = converttoJson(&new_list, "int", "set");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getRatingValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ratingValuesKey = "ratingValues";
	json_object_set_member(pJsonObject, ratingValuesKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getModelIds());
		node = converttoJson(&new_list, "long long", "set");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getModelIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *modelIdsKey = "modelIds";
	json_object_set_member(pJsonObject, modelIdsKey, node);
	if (isprimitive("bool")) {
		bool obj = getPaid();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *paidKey = "paid";
	json_object_set_member(pJsonObject, paidKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GetGoodsFeedbackRequest::getDateTimeFrom()
{
	return dateTimeFrom;
}

void
GetGoodsFeedbackRequest::setDateTimeFrom(std::string  dateTimeFrom)
{
	this->dateTimeFrom = dateTimeFrom;
}

std::string
GetGoodsFeedbackRequest::getDateTimeTo()
{
	return dateTimeTo;
}

void
GetGoodsFeedbackRequest::setDateTimeTo(std::string  dateTimeTo)
{
	this->dateTimeTo = dateTimeTo;
}

FeedbackReactionStatusType
GetGoodsFeedbackRequest::getReactionStatus()
{
	return reactionStatus;
}

void
GetGoodsFeedbackRequest::setReactionStatus(FeedbackReactionStatusType  reactionStatus)
{
	this->reactionStatus = reactionStatus;
}

Set<int>
GetGoodsFeedbackRequest::getRatingValues()
{
	return ratingValues;
}

void
GetGoodsFeedbackRequest::setRatingValues(Set <int> ratingValues)
{
	this->ratingValues = ratingValues;
}

Set<long long>
GetGoodsFeedbackRequest::getModelIds()
{
	return modelIds;
}

void
GetGoodsFeedbackRequest::setModelIds(Set <long long> modelIds)
{
	this->modelIds = modelIds;
}

bool
GetGoodsFeedbackRequest::getPaid()
{
	return paid;
}

void
GetGoodsFeedbackRequest::setPaid(bool  paid)
{
	this->paid = paid;
}


