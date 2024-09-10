#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferForRecommendationDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferForRecommendationDTO::OfferForRecommendationDTO()
{
	//__init();
}

OfferForRecommendationDTO::~OfferForRecommendationDTO()
{
	//__cleanup();
}

void
OfferForRecommendationDTO::__init()
{
	//offerId = std::string();
	//price = new BasePriceDTO();
	//cofinancePrice = new GetPriceDTO();
	//competitiveness = new PriceCompetitivenessType();
	//shows = long(0);
}

void
OfferForRecommendationDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(cofinancePrice != NULL) {
	//
	//delete cofinancePrice;
	//cofinancePrice = NULL;
	//}
	//if(competitiveness != NULL) {
	//
	//delete competitiveness;
	//competitiveness = NULL;
	//}
	//if(shows != NULL) {
	//
	//delete shows;
	//shows = NULL;
	//}
	//
}

void
OfferForRecommendationDTO::fromJson(char* jsonStr)
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
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("BasePriceDTO")) {
			jsonToValue(&price, node, "BasePriceDTO", "BasePriceDTO");
		} else {
			
			BasePriceDTO* obj = static_cast<BasePriceDTO*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cofinancePriceKey = "cofinancePrice";
	node = json_object_get_member(pJsonObject, cofinancePriceKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPriceDTO")) {
			jsonToValue(&cofinancePrice, node, "GetPriceDTO", "GetPriceDTO");
		} else {
			
			GetPriceDTO* obj = static_cast<GetPriceDTO*> (&cofinancePrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *competitivenessKey = "competitiveness";
	node = json_object_get_member(pJsonObject, competitivenessKey);
	if (node !=NULL) {
	

		if (isprimitive("PriceCompetitivenessType")) {
			jsonToValue(&competitiveness, node, "PriceCompetitivenessType", "PriceCompetitivenessType");
		} else {
			
			PriceCompetitivenessType* obj = static_cast<PriceCompetitivenessType*> (&competitiveness);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *showsKey = "shows";
	node = json_object_get_member(pJsonObject, showsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&shows, node, "long long", "");
		} else {
			
		}
	}
}

OfferForRecommendationDTO::OfferForRecommendationDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferForRecommendationDTO::toJson()
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
		BasePriceDTO obj = getPrice();
		node = converttoJson(&obj, "BasePriceDTO", "");
	}
	else {
		
		BasePriceDTO obj = static_cast<BasePriceDTO> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("GetPriceDTO")) {
		GetPriceDTO obj = getCofinancePrice();
		node = converttoJson(&obj, "GetPriceDTO", "");
	}
	else {
		
		GetPriceDTO obj = static_cast<GetPriceDTO> (getCofinancePrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cofinancePriceKey = "cofinancePrice";
	json_object_set_member(pJsonObject, cofinancePriceKey, node);
	if (isprimitive("PriceCompetitivenessType")) {
		PriceCompetitivenessType obj = getCompetitiveness();
		node = converttoJson(&obj, "PriceCompetitivenessType", "");
	}
	else {
		
		PriceCompetitivenessType obj = static_cast<PriceCompetitivenessType> (getCompetitiveness());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *competitivenessKey = "competitiveness";
	json_object_set_member(pJsonObject, competitivenessKey, node);
	if (isprimitive("long long")) {
		long long obj = getShows();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *showsKey = "shows";
	json_object_set_member(pJsonObject, showsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OfferForRecommendationDTO::getOfferId()
{
	return offerId;
}

void
OfferForRecommendationDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

BasePriceDTO
OfferForRecommendationDTO::getPrice()
{
	return price;
}

void
OfferForRecommendationDTO::setPrice(BasePriceDTO  price)
{
	this->price = price;
}

GetPriceDTO
OfferForRecommendationDTO::getCofinancePrice()
{
	return cofinancePrice;
}

void
OfferForRecommendationDTO::setCofinancePrice(GetPriceDTO  cofinancePrice)
{
	this->cofinancePrice = cofinancePrice;
}

PriceCompetitivenessType
OfferForRecommendationDTO::getCompetitiveness()
{
	return competitiveness;
}

void
OfferForRecommendationDTO::setCompetitiveness(PriceCompetitivenessType  competitiveness)
{
	this->competitiveness = competitiveness;
}

long long
OfferForRecommendationDTO::getShows()
{
	return shows;
}

void
OfferForRecommendationDTO::setShows(long long  shows)
{
	this->shows = shows;
}


