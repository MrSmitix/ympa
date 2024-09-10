#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoOffersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoOffersRequest::GetPromoOffersRequest()
{
	//__init();
}

GetPromoOffersRequest::~GetPromoOffersRequest()
{
	//__cleanup();
}

void
GetPromoOffersRequest::__init()
{
	//promoId = std::string();
	//statusType = new PromoOfferParticipationStatusFilterType();
}

void
GetPromoOffersRequest::__cleanup()
{
	//if(promoId != NULL) {
	//
	//delete promoId;
	//promoId = NULL;
	//}
	//if(statusType != NULL) {
	//
	//delete statusType;
	//statusType = NULL;
	//}
	//
}

void
GetPromoOffersRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *promoIdKey = "promoId";
	node = json_object_get_member(pJsonObject, promoIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promoId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusTypeKey = "statusType";
	node = json_object_get_member(pJsonObject, statusTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("PromoOfferParticipationStatusFilterType")) {
			jsonToValue(&statusType, node, "PromoOfferParticipationStatusFilterType", "PromoOfferParticipationStatusFilterType");
		} else {
			
			PromoOfferParticipationStatusFilterType* obj = static_cast<PromoOfferParticipationStatusFilterType*> (&statusType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetPromoOffersRequest::GetPromoOffersRequest(char* json)
{
	this->fromJson(json);
}

char*
GetPromoOffersRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPromoId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promoIdKey = "promoId";
	json_object_set_member(pJsonObject, promoIdKey, node);
	if (isprimitive("PromoOfferParticipationStatusFilterType")) {
		PromoOfferParticipationStatusFilterType obj = getStatusType();
		node = converttoJson(&obj, "PromoOfferParticipationStatusFilterType", "");
	}
	else {
		
		PromoOfferParticipationStatusFilterType obj = static_cast<PromoOfferParticipationStatusFilterType> (getStatusType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusTypeKey = "statusType";
	json_object_set_member(pJsonObject, statusTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GetPromoOffersRequest::getPromoId()
{
	return promoId;
}

void
GetPromoOffersRequest::setPromoId(std::string  promoId)
{
	this->promoId = promoId;
}

PromoOfferParticipationStatusFilterType
GetPromoOffersRequest::getStatusType()
{
	return statusType;
}

void
GetPromoOffersRequest::setStatusType(PromoOfferParticipationStatusFilterType  statusType)
{
	this->statusType = statusType;
}


