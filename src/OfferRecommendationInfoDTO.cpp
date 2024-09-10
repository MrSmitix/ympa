#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferRecommendationInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferRecommendationInfoDTO::OfferRecommendationInfoDTO()
{
	//__init();
}

OfferRecommendationInfoDTO::~OfferRecommendationInfoDTO()
{
	//__cleanup();
}

void
OfferRecommendationInfoDTO::__init()
{
	//offerId = std::string();
	//recommendedCofinancePrice = new BasePriceDTO();
	//competitivenessThresholds = new PriceCompetitivenessThresholdsDTO();
}

void
OfferRecommendationInfoDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(recommendedCofinancePrice != NULL) {
	//
	//delete recommendedCofinancePrice;
	//recommendedCofinancePrice = NULL;
	//}
	//if(competitivenessThresholds != NULL) {
	//
	//delete competitivenessThresholds;
	//competitivenessThresholds = NULL;
	//}
	//
}

void
OfferRecommendationInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerIdKey = "offerId";
	node = json_object_get_member(pJsonObject, offerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *recommendedCofinancePriceKey = "recommendedCofinancePrice";
	node = json_object_get_member(pJsonObject, recommendedCofinancePriceKey);
	if (node !=NULL) {
	

		if (isprimitive("BasePriceDTO")) {
			jsonToValue(&recommendedCofinancePrice, node, "BasePriceDTO", "BasePriceDTO");
		} else {
			
			BasePriceDTO* obj = static_cast<BasePriceDTO*> (&recommendedCofinancePrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *competitivenessThresholdsKey = "competitivenessThresholds";
	node = json_object_get_member(pJsonObject, competitivenessThresholdsKey);
	if (node !=NULL) {
	

		if (isprimitive("PriceCompetitivenessThresholdsDTO")) {
			jsonToValue(&competitivenessThresholds, node, "PriceCompetitivenessThresholdsDTO", "PriceCompetitivenessThresholdsDTO");
		} else {
			
			PriceCompetitivenessThresholdsDTO* obj = static_cast<PriceCompetitivenessThresholdsDTO*> (&competitivenessThresholds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OfferRecommendationInfoDTO::OfferRecommendationInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferRecommendationInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOfferId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerIdKey = "offerId";
	json_object_set_member(pJsonObject, offerIdKey, node);
	if (isprimitive("BasePriceDTO")) {
		BasePriceDTO obj = getRecommendedCofinancePrice();
		node = converttoJson(&obj, "BasePriceDTO", "");
	}
	else {
		
		BasePriceDTO obj = static_cast<BasePriceDTO> (getRecommendedCofinancePrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *recommendedCofinancePriceKey = "recommendedCofinancePrice";
	json_object_set_member(pJsonObject, recommendedCofinancePriceKey, node);
	if (isprimitive("PriceCompetitivenessThresholdsDTO")) {
		PriceCompetitivenessThresholdsDTO obj = getCompetitivenessThresholds();
		node = converttoJson(&obj, "PriceCompetitivenessThresholdsDTO", "");
	}
	else {
		
		PriceCompetitivenessThresholdsDTO obj = static_cast<PriceCompetitivenessThresholdsDTO> (getCompetitivenessThresholds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *competitivenessThresholdsKey = "competitivenessThresholds";
	json_object_set_member(pJsonObject, competitivenessThresholdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OfferRecommendationInfoDTO::getOfferId()
{
	return offerId;
}

void
OfferRecommendationInfoDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

BasePriceDTO
OfferRecommendationInfoDTO::getRecommendedCofinancePrice()
{
	return recommendedCofinancePrice;
}

void
OfferRecommendationInfoDTO::setRecommendedCofinancePrice(BasePriceDTO  recommendedCofinancePrice)
{
	this->recommendedCofinancePrice = recommendedCofinancePrice;
}

PriceCompetitivenessThresholdsDTO
OfferRecommendationInfoDTO::getCompetitivenessThresholds()
{
	return competitivenessThresholds;
}

void
OfferRecommendationInfoDTO::setCompetitivenessThresholds(PriceCompetitivenessThresholdsDTO  competitivenessThresholds)
{
	this->competitivenessThresholds = competitivenessThresholds;
}


