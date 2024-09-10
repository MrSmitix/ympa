#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RejectedPromoOfferDeleteDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RejectedPromoOfferDeleteDTO::RejectedPromoOfferDeleteDTO()
{
	//__init();
}

RejectedPromoOfferDeleteDTO::~RejectedPromoOfferDeleteDTO()
{
	//__cleanup();
}

void
RejectedPromoOfferDeleteDTO::__init()
{
	//offerId = std::string();
	//reason = new RejectedPromoOfferDeleteReasonType();
}

void
RejectedPromoOfferDeleteDTO::__cleanup()
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
RejectedPromoOfferDeleteDTO::fromJson(char* jsonStr)
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
	

		if (isprimitive("RejectedPromoOfferDeleteReasonType")) {
			jsonToValue(&reason, node, "RejectedPromoOfferDeleteReasonType", "RejectedPromoOfferDeleteReasonType");
		} else {
			
			RejectedPromoOfferDeleteReasonType* obj = static_cast<RejectedPromoOfferDeleteReasonType*> (&reason);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RejectedPromoOfferDeleteDTO::RejectedPromoOfferDeleteDTO(char* json)
{
	this->fromJson(json);
}

char*
RejectedPromoOfferDeleteDTO::toJson()
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
	if (isprimitive("RejectedPromoOfferDeleteReasonType")) {
		RejectedPromoOfferDeleteReasonType obj = getReason();
		node = converttoJson(&obj, "RejectedPromoOfferDeleteReasonType", "");
	}
	else {
		
		RejectedPromoOfferDeleteReasonType obj = static_cast<RejectedPromoOfferDeleteReasonType> (getReason());
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
RejectedPromoOfferDeleteDTO::getOfferId()
{
	return offerId;
}

void
RejectedPromoOfferDeleteDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

RejectedPromoOfferDeleteReasonType
RejectedPromoOfferDeleteDTO::getReason()
{
	return reason;
}

void
RejectedPromoOfferDeleteDTO::setReason(RejectedPromoOfferDeleteReasonType  reason)
{
	this->reason = reason;
}


