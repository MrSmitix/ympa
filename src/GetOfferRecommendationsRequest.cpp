#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOfferRecommendationsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOfferRecommendationsRequest::GetOfferRecommendationsRequest()
{
	//__init();
}

GetOfferRecommendationsRequest::~GetOfferRecommendationsRequest()
{
	//__cleanup();
}

void
GetOfferRecommendationsRequest::__init()
{
	//new std::list()std::list> offerIds;
	//cofinancePriceFilter = new FieldStateType();
	//recommendedCofinancePriceFilter = new FieldStateType();
	//competitivenessFilter = new PriceCompetitivenessType();
}

void
GetOfferRecommendationsRequest::__cleanup()
{
	//if(offerIds != NULL) {
	//offerIds.RemoveAll(true);
	//delete offerIds;
	//offerIds = NULL;
	//}
	//if(cofinancePriceFilter != NULL) {
	//
	//delete cofinancePriceFilter;
	//cofinancePriceFilter = NULL;
	//}
	//if(recommendedCofinancePriceFilter != NULL) {
	//
	//delete recommendedCofinancePriceFilter;
	//recommendedCofinancePriceFilter = NULL;
	//}
	//if(competitivenessFilter != NULL) {
	//
	//delete competitivenessFilter;
	//competitivenessFilter = NULL;
	//}
	//
}

void
GetOfferRecommendationsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerIdsKey = "offerIds";
	node = json_object_get_member(pJsonObject, offerIdsKey);
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
			offerIds = new_list;
		}
		
	}
	const gchar *cofinancePriceFilterKey = "cofinancePriceFilter";
	node = json_object_get_member(pJsonObject, cofinancePriceFilterKey);
	if (node !=NULL) {
	

		if (isprimitive("FieldStateType")) {
			jsonToValue(&cofinancePriceFilter, node, "FieldStateType", "FieldStateType");
		} else {
			
			FieldStateType* obj = static_cast<FieldStateType*> (&cofinancePriceFilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *recommendedCofinancePriceFilterKey = "recommendedCofinancePriceFilter";
	node = json_object_get_member(pJsonObject, recommendedCofinancePriceFilterKey);
	if (node !=NULL) {
	

		if (isprimitive("FieldStateType")) {
			jsonToValue(&recommendedCofinancePriceFilter, node, "FieldStateType", "FieldStateType");
		} else {
			
			FieldStateType* obj = static_cast<FieldStateType*> (&recommendedCofinancePriceFilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *competitivenessFilterKey = "competitivenessFilter";
	node = json_object_get_member(pJsonObject, competitivenessFilterKey);
	if (node !=NULL) {
	

		if (isprimitive("PriceCompetitivenessType")) {
			jsonToValue(&competitivenessFilter, node, "PriceCompetitivenessType", "PriceCompetitivenessType");
		} else {
			
			PriceCompetitivenessType* obj = static_cast<PriceCompetitivenessType*> (&competitivenessFilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetOfferRecommendationsRequest::GetOfferRecommendationsRequest(char* json)
{
	this->fromJson(json);
}

char*
GetOfferRecommendationsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getOfferIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getOfferIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *offerIdsKey = "offerIds";
	json_object_set_member(pJsonObject, offerIdsKey, node);
	if (isprimitive("FieldStateType")) {
		FieldStateType obj = getCofinancePriceFilter();
		node = converttoJson(&obj, "FieldStateType", "");
	}
	else {
		
		FieldStateType obj = static_cast<FieldStateType> (getCofinancePriceFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cofinancePriceFilterKey = "cofinancePriceFilter";
	json_object_set_member(pJsonObject, cofinancePriceFilterKey, node);
	if (isprimitive("FieldStateType")) {
		FieldStateType obj = getRecommendedCofinancePriceFilter();
		node = converttoJson(&obj, "FieldStateType", "");
	}
	else {
		
		FieldStateType obj = static_cast<FieldStateType> (getRecommendedCofinancePriceFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *recommendedCofinancePriceFilterKey = "recommendedCofinancePriceFilter";
	json_object_set_member(pJsonObject, recommendedCofinancePriceFilterKey, node);
	if (isprimitive("PriceCompetitivenessType")) {
		PriceCompetitivenessType obj = getCompetitivenessFilter();
		node = converttoJson(&obj, "PriceCompetitivenessType", "");
	}
	else {
		
		PriceCompetitivenessType obj = static_cast<PriceCompetitivenessType> (getCompetitivenessFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *competitivenessFilterKey = "competitivenessFilter";
	json_object_set_member(pJsonObject, competitivenessFilterKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
GetOfferRecommendationsRequest::getOfferIds()
{
	return offerIds;
}

void
GetOfferRecommendationsRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}

FieldStateType
GetOfferRecommendationsRequest::getCofinancePriceFilter()
{
	return cofinancePriceFilter;
}

void
GetOfferRecommendationsRequest::setCofinancePriceFilter(FieldStateType  cofinancePriceFilter)
{
	this->cofinancePriceFilter = cofinancePriceFilter;
}

FieldStateType
GetOfferRecommendationsRequest::getRecommendedCofinancePriceFilter()
{
	return recommendedCofinancePriceFilter;
}

void
GetOfferRecommendationsRequest::setRecommendedCofinancePriceFilter(FieldStateType  recommendedCofinancePriceFilter)
{
	this->recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
}

PriceCompetitivenessType
GetOfferRecommendationsRequest::getCompetitivenessFilter()
{
	return competitivenessFilter;
}

void
GetOfferRecommendationsRequest::setCompetitivenessFilter(PriceCompetitivenessType  competitivenessFilter)
{
	this->competitivenessFilter = competitivenessFilter;
}


