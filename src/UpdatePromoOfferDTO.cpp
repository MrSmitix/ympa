#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePromoOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePromoOfferDTO::UpdatePromoOfferDTO()
{
	//__init();
}

UpdatePromoOfferDTO::~UpdatePromoOfferDTO()
{
	//__cleanup();
}

void
UpdatePromoOfferDTO::__init()
{
	//offerId = std::string();
	//params = new UpdatePromoOfferParamsDTO();
}

void
UpdatePromoOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(params != NULL) {
	//
	//delete params;
	//params = NULL;
	//}
	//
}

void
UpdatePromoOfferDTO::fromJson(char* jsonStr)
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
	const gchar *paramsKey = "params";
	node = json_object_get_member(pJsonObject, paramsKey);
	if (node !=NULL) {
	

		if (isprimitive("UpdatePromoOfferParamsDTO")) {
			jsonToValue(&params, node, "UpdatePromoOfferParamsDTO", "UpdatePromoOfferParamsDTO");
		} else {
			
			UpdatePromoOfferParamsDTO* obj = static_cast<UpdatePromoOfferParamsDTO*> (&params);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdatePromoOfferDTO::UpdatePromoOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdatePromoOfferDTO::toJson()
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
	if (isprimitive("UpdatePromoOfferParamsDTO")) {
		UpdatePromoOfferParamsDTO obj = getParams();
		node = converttoJson(&obj, "UpdatePromoOfferParamsDTO", "");
	}
	else {
		
		UpdatePromoOfferParamsDTO obj = static_cast<UpdatePromoOfferParamsDTO> (getParams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paramsKey = "params";
	json_object_set_member(pJsonObject, paramsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UpdatePromoOfferDTO::getOfferId()
{
	return offerId;
}

void
UpdatePromoOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

UpdatePromoOfferParamsDTO
UpdatePromoOfferDTO::getParams()
{
	return params;
}

void
UpdatePromoOfferDTO::setParams(UpdatePromoOfferParamsDTO  params)
{
	this->params = params;
}


