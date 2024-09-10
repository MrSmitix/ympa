#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePromoOfferParamsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePromoOfferParamsDTO::UpdatePromoOfferParamsDTO()
{
	//__init();
}

UpdatePromoOfferParamsDTO::~UpdatePromoOfferParamsDTO()
{
	//__cleanup();
}

void
UpdatePromoOfferParamsDTO::__init()
{
	//discountParams = new UpdatePromoOfferDiscountParamsDTO();
}

void
UpdatePromoOfferParamsDTO::__cleanup()
{
	//if(discountParams != NULL) {
	//
	//delete discountParams;
	//discountParams = NULL;
	//}
	//
}

void
UpdatePromoOfferParamsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *discountParamsKey = "discountParams";
	node = json_object_get_member(pJsonObject, discountParamsKey);
	if (node !=NULL) {
	

		if (isprimitive("UpdatePromoOfferDiscountParamsDTO")) {
			jsonToValue(&discountParams, node, "UpdatePromoOfferDiscountParamsDTO", "UpdatePromoOfferDiscountParamsDTO");
		} else {
			
			UpdatePromoOfferDiscountParamsDTO* obj = static_cast<UpdatePromoOfferDiscountParamsDTO*> (&discountParams);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UpdatePromoOfferParamsDTO::UpdatePromoOfferParamsDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdatePromoOfferParamsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdatePromoOfferDiscountParamsDTO")) {
		UpdatePromoOfferDiscountParamsDTO obj = getDiscountParams();
		node = converttoJson(&obj, "UpdatePromoOfferDiscountParamsDTO", "");
	}
	else {
		
		UpdatePromoOfferDiscountParamsDTO obj = static_cast<UpdatePromoOfferDiscountParamsDTO> (getDiscountParams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *discountParamsKey = "discountParams";
	json_object_set_member(pJsonObject, discountParamsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

UpdatePromoOfferDiscountParamsDTO
UpdatePromoOfferParamsDTO::getDiscountParams()
{
	return discountParams;
}

void
UpdatePromoOfferParamsDTO::setDiscountParams(UpdatePromoOfferDiscountParamsDTO  discountParams)
{
	this->discountParams = discountParams;
}


