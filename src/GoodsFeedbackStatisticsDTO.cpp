#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackStatisticsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackStatisticsDTO::GoodsFeedbackStatisticsDTO()
{
	//__init();
}

GoodsFeedbackStatisticsDTO::~GoodsFeedbackStatisticsDTO()
{
	//__cleanup();
}

void
GoodsFeedbackStatisticsDTO::__init()
{
	//rating = int(0);
	//commentsCount = long(0);
	//recommended = bool(false);
	//paidAmount = long(0);
}

void
GoodsFeedbackStatisticsDTO::__cleanup()
{
	//if(rating != NULL) {
	//
	//delete rating;
	//rating = NULL;
	//}
	//if(commentsCount != NULL) {
	//
	//delete commentsCount;
	//commentsCount = NULL;
	//}
	//if(recommended != NULL) {
	//
	//delete recommended;
	//recommended = NULL;
	//}
	//if(paidAmount != NULL) {
	//
	//delete paidAmount;
	//paidAmount = NULL;
	//}
	//
}

void
GoodsFeedbackStatisticsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ratingKey = "rating";
	node = json_object_get_member(pJsonObject, ratingKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&rating, node, "int", "");
		} else {
			
		}
	}
	const gchar *commentsCountKey = "commentsCount";
	node = json_object_get_member(pJsonObject, commentsCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&commentsCount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *recommendedKey = "recommended";
	node = json_object_get_member(pJsonObject, recommendedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&recommended, node, "bool", "");
		} else {
			
		}
	}
	const gchar *paidAmountKey = "paidAmount";
	node = json_object_get_member(pJsonObject, paidAmountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&paidAmount, node, "long long", "");
		} else {
			
		}
	}
}

GoodsFeedbackStatisticsDTO::GoodsFeedbackStatisticsDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackStatisticsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getRating();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ratingKey = "rating";
	json_object_set_member(pJsonObject, ratingKey, node);
	if (isprimitive("long long")) {
		long long obj = getCommentsCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *commentsCountKey = "commentsCount";
	json_object_set_member(pJsonObject, commentsCountKey, node);
	if (isprimitive("bool")) {
		bool obj = getRecommended();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *recommendedKey = "recommended";
	json_object_set_member(pJsonObject, recommendedKey, node);
	if (isprimitive("long long")) {
		long long obj = getPaidAmount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *paidAmountKey = "paidAmount";
	json_object_set_member(pJsonObject, paidAmountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
GoodsFeedbackStatisticsDTO::getRating()
{
	return rating;
}

void
GoodsFeedbackStatisticsDTO::setRating(int  rating)
{
	this->rating = rating;
}

long long
GoodsFeedbackStatisticsDTO::getCommentsCount()
{
	return commentsCount;
}

void
GoodsFeedbackStatisticsDTO::setCommentsCount(long long  commentsCount)
{
	this->commentsCount = commentsCount;
}

bool
GoodsFeedbackStatisticsDTO::getRecommended()
{
	return recommended;
}

void
GoodsFeedbackStatisticsDTO::setRecommended(bool  recommended)
{
	this->recommended = recommended;
}

long long
GoodsFeedbackStatisticsDTO::getPaidAmount()
{
	return paidAmount;
}

void
GoodsFeedbackStatisticsDTO::setPaidAmount(long long  paidAmount)
{
	this->paidAmount = paidAmount;
}


