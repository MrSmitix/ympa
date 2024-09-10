#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferRecommendationDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferRecommendationDTO::OfferRecommendationDTO()
{
	//__init();
}

OfferRecommendationDTO::~OfferRecommendationDTO()
{
	//__cleanup();
}

void
OfferRecommendationDTO::__init()
{
	//offer = new OfferForRecommendationDTO();
	//recommendation = new OfferRecommendationInfoDTO();
}

void
OfferRecommendationDTO::__cleanup()
{
	//if(offer != NULL) {
	//
	//delete offer;
	//offer = NULL;
	//}
	//if(recommendation != NULL) {
	//
	//delete recommendation;
	//recommendation = NULL;
	//}
	//
}

void
OfferRecommendationDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerKey = "offer";
	node = json_object_get_member(pJsonObject, offerKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferForRecommendationDTO")) {
			jsonToValue(&offer, node, "OfferForRecommendationDTO", "OfferForRecommendationDTO");
		} else {
			
			OfferForRecommendationDTO* obj = static_cast<OfferForRecommendationDTO*> (&offer);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *recommendationKey = "recommendation";
	node = json_object_get_member(pJsonObject, recommendationKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferRecommendationInfoDTO")) {
			jsonToValue(&recommendation, node, "OfferRecommendationInfoDTO", "OfferRecommendationInfoDTO");
		} else {
			
			OfferRecommendationInfoDTO* obj = static_cast<OfferRecommendationInfoDTO*> (&recommendation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OfferRecommendationDTO::OfferRecommendationDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferRecommendationDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferForRecommendationDTO")) {
		OfferForRecommendationDTO obj = getOffer();
		node = converttoJson(&obj, "OfferForRecommendationDTO", "");
	}
	else {
		
		OfferForRecommendationDTO obj = static_cast<OfferForRecommendationDTO> (getOffer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offerKey = "offer";
	json_object_set_member(pJsonObject, offerKey, node);
	if (isprimitive("OfferRecommendationInfoDTO")) {
		OfferRecommendationInfoDTO obj = getRecommendation();
		node = converttoJson(&obj, "OfferRecommendationInfoDTO", "");
	}
	else {
		
		OfferRecommendationInfoDTO obj = static_cast<OfferRecommendationInfoDTO> (getRecommendation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *recommendationKey = "recommendation";
	json_object_set_member(pJsonObject, recommendationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OfferForRecommendationDTO
OfferRecommendationDTO::getOffer()
{
	return offer;
}

void
OfferRecommendationDTO::setOffer(OfferForRecommendationDTO  offer)
{
	this->offer = offer;
}

OfferRecommendationInfoDTO
OfferRecommendationDTO::getRecommendation()
{
	return recommendation;
}

void
OfferRecommendationDTO::setRecommendation(OfferRecommendationInfoDTO  recommendation)
{
	this->recommendation = recommendation;
}


