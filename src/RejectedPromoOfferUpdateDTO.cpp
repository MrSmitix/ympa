#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RejectedPromoOfferUpdateDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RejectedPromoOfferUpdateDTO::RejectedPromoOfferUpdateDTO()
{
	//__init();
}

RejectedPromoOfferUpdateDTO::~RejectedPromoOfferUpdateDTO()
{
	//__cleanup();
}

void
RejectedPromoOfferUpdateDTO::__init()
{
	//offerId = std::string();
	//reason = new RejectedPromoOfferUpdateReasonType();
}

void
RejectedPromoOfferUpdateDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
RejectedPromoOfferUpdateDTO::fromJson(char* jsonStr)
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
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("RejectedPromoOfferUpdateReasonType")) {
			jsonToValue(&reason, node, "RejectedPromoOfferUpdateReasonType", "RejectedPromoOfferUpdateReasonType");
		} else {
			
			RejectedPromoOfferUpdateReasonType* obj = static_cast<RejectedPromoOfferUpdateReasonType*> (&reason);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RejectedPromoOfferUpdateDTO::RejectedPromoOfferUpdateDTO(char* json)
{
	this->fromJson(json);
}

char*
RejectedPromoOfferUpdateDTO::toJson()
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
	if (isprimitive("RejectedPromoOfferUpdateReasonType")) {
		RejectedPromoOfferUpdateReasonType obj = getReason();
		node = converttoJson(&obj, "RejectedPromoOfferUpdateReasonType", "");
	}
	else {
		
		RejectedPromoOfferUpdateReasonType obj = static_cast<RejectedPromoOfferUpdateReasonType> (getReason());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RejectedPromoOfferUpdateDTO::getOfferId()
{
	return offerId;
}

void
RejectedPromoOfferUpdateDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

RejectedPromoOfferUpdateReasonType
RejectedPromoOfferUpdateDTO::getReason()
{
	return reason;
}

void
RejectedPromoOfferUpdateDTO::setReason(RejectedPromoOfferUpdateReasonType  reason)
{
	this->reason = reason;
}


