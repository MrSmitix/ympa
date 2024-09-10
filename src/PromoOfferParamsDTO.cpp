#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromoOfferParamsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromoOfferParamsDTO::PromoOfferParamsDTO()
{
	//__init();
}

PromoOfferParamsDTO::~PromoOfferParamsDTO()
{
	//__cleanup();
}

void
PromoOfferParamsDTO::__init()
{
	//discountParams = new PromoOfferDiscountParamsDTO();
	//promocodeParams = new PromoOfferPromocodeParamsDTO();
}

void
PromoOfferParamsDTO::__cleanup()
{
	//if(discountParams != NULL) {
	//
	//delete discountParams;
	//discountParams = NULL;
	//}
	//if(promocodeParams != NULL) {
	//
	//delete promocodeParams;
	//promocodeParams = NULL;
	//}
	//
}

void
PromoOfferParamsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *discountParamsKey = "discountParams";
	node = json_object_get_member(pJsonObject, discountParamsKey);
	if (node !=NULL) {
	

		if (isprimitive("PromoOfferDiscountParamsDTO")) {
			jsonToValue(&discountParams, node, "PromoOfferDiscountParamsDTO", "PromoOfferDiscountParamsDTO");
		} else {
			
			PromoOfferDiscountParamsDTO* obj = static_cast<PromoOfferDiscountParamsDTO*> (&discountParams);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *promocodeParamsKey = "promocodeParams";
	node = json_object_get_member(pJsonObject, promocodeParamsKey);
	if (node !=NULL) {
	

		if (isprimitive("PromoOfferPromocodeParamsDTO")) {
			jsonToValue(&promocodeParams, node, "PromoOfferPromocodeParamsDTO", "PromoOfferPromocodeParamsDTO");
		} else {
			
			PromoOfferPromocodeParamsDTO* obj = static_cast<PromoOfferPromocodeParamsDTO*> (&promocodeParams);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PromoOfferParamsDTO::PromoOfferParamsDTO(char* json)
{
	this->fromJson(json);
}

char*
PromoOfferParamsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PromoOfferDiscountParamsDTO")) {
		PromoOfferDiscountParamsDTO obj = getDiscountParams();
		node = converttoJson(&obj, "PromoOfferDiscountParamsDTO", "");
	}
	else {
		
		PromoOfferDiscountParamsDTO obj = static_cast<PromoOfferDiscountParamsDTO> (getDiscountParams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *discountParamsKey = "discountParams";
	json_object_set_member(pJsonObject, discountParamsKey, node);
	if (isprimitive("PromoOfferPromocodeParamsDTO")) {
		PromoOfferPromocodeParamsDTO obj = getPromocodeParams();
		node = converttoJson(&obj, "PromoOfferPromocodeParamsDTO", "");
	}
	else {
		
		PromoOfferPromocodeParamsDTO obj = static_cast<PromoOfferPromocodeParamsDTO> (getPromocodeParams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *promocodeParamsKey = "promocodeParams";
	json_object_set_member(pJsonObject, promocodeParamsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

PromoOfferDiscountParamsDTO
PromoOfferParamsDTO::getDiscountParams()
{
	return discountParams;
}

void
PromoOfferParamsDTO::setDiscountParams(PromoOfferDiscountParamsDTO  discountParams)
{
	this->discountParams = discountParams;
}

PromoOfferPromocodeParamsDTO
PromoOfferParamsDTO::getPromocodeParams()
{
	return promocodeParams;
}

void
PromoOfferParamsDTO::setPromocodeParams(PromoOfferPromocodeParamsDTO  promocodeParams)
{
	this->promocodeParams = promocodeParams;
}


