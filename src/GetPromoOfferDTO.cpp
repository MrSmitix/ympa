#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoOfferDTO::GetPromoOfferDTO()
{
	//__init();
}

GetPromoOfferDTO::~GetPromoOfferDTO()
{
	//__cleanup();
}

void
GetPromoOfferDTO::__init()
{
	//offerId = std::string();
	//status = new PromoOfferParticipationStatusType();
	//params = new PromoOfferParamsDTO();
	//autoParticipatingDetails = new PromoOfferAutoParticipatingDetailsDTO();
}

void
GetPromoOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(params != NULL) {
	//
	//delete params;
	//params = NULL;
	//}
	//if(autoParticipatingDetails != NULL) {
	//
	//delete autoParticipatingDetails;
	//autoParticipatingDetails = NULL;
	//}
	//
}

void
GetPromoOfferDTO::fromJson(char* jsonStr)
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("PromoOfferParticipationStatusType")) {
			jsonToValue(&status, node, "PromoOfferParticipationStatusType", "PromoOfferParticipationStatusType");
		} else {
			
			PromoOfferParticipationStatusType* obj = static_cast<PromoOfferParticipationStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *paramsKey = "params";
	node = json_object_get_member(pJsonObject, paramsKey);
	if (node !=NULL) {
	

		if (isprimitive("PromoOfferParamsDTO")) {
			jsonToValue(&params, node, "PromoOfferParamsDTO", "PromoOfferParamsDTO");
		} else {
			
			PromoOfferParamsDTO* obj = static_cast<PromoOfferParamsDTO*> (&params);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *autoParticipatingDetailsKey = "autoParticipatingDetails";
	node = json_object_get_member(pJsonObject, autoParticipatingDetailsKey);
	if (node !=NULL) {
	

		if (isprimitive("PromoOfferAutoParticipatingDetailsDTO")) {
			jsonToValue(&autoParticipatingDetails, node, "PromoOfferAutoParticipatingDetailsDTO", "PromoOfferAutoParticipatingDetailsDTO");
		} else {
			
			PromoOfferAutoParticipatingDetailsDTO* obj = static_cast<PromoOfferAutoParticipatingDetailsDTO*> (&autoParticipatingDetails);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetPromoOfferDTO::GetPromoOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromoOfferDTO::toJson()
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
	if (isprimitive("PromoOfferParticipationStatusType")) {
		PromoOfferParticipationStatusType obj = getStatus();
		node = converttoJson(&obj, "PromoOfferParticipationStatusType", "");
	}
	else {
		
		PromoOfferParticipationStatusType obj = static_cast<PromoOfferParticipationStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("PromoOfferParamsDTO")) {
		PromoOfferParamsDTO obj = getParams();
		node = converttoJson(&obj, "PromoOfferParamsDTO", "");
	}
	else {
		
		PromoOfferParamsDTO obj = static_cast<PromoOfferParamsDTO> (getParams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paramsKey = "params";
	json_object_set_member(pJsonObject, paramsKey, node);
	if (isprimitive("PromoOfferAutoParticipatingDetailsDTO")) {
		PromoOfferAutoParticipatingDetailsDTO obj = getAutoParticipatingDetails();
		node = converttoJson(&obj, "PromoOfferAutoParticipatingDetailsDTO", "");
	}
	else {
		
		PromoOfferAutoParticipatingDetailsDTO obj = static_cast<PromoOfferAutoParticipatingDetailsDTO> (getAutoParticipatingDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *autoParticipatingDetailsKey = "autoParticipatingDetails";
	json_object_set_member(pJsonObject, autoParticipatingDetailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GetPromoOfferDTO::getOfferId()
{
	return offerId;
}

void
GetPromoOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

PromoOfferParticipationStatusType
GetPromoOfferDTO::getStatus()
{
	return status;
}

void
GetPromoOfferDTO::setStatus(PromoOfferParticipationStatusType  status)
{
	this->status = status;
}

PromoOfferParamsDTO
GetPromoOfferDTO::getParams()
{
	return params;
}

void
GetPromoOfferDTO::setParams(PromoOfferParamsDTO  params)
{
	this->params = params;
}

PromoOfferAutoParticipatingDetailsDTO
GetPromoOfferDTO::getAutoParticipatingDetails()
{
	return autoParticipatingDetails;
}

void
GetPromoOfferDTO::setAutoParticipatingDetails(PromoOfferAutoParticipatingDetailsDTO  autoParticipatingDetails)
{
	this->autoParticipatingDetails = autoParticipatingDetails;
}


