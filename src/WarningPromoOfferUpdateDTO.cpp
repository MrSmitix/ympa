#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "WarningPromoOfferUpdateDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

WarningPromoOfferUpdateDTO::WarningPromoOfferUpdateDTO()
{
	//__init();
}

WarningPromoOfferUpdateDTO::~WarningPromoOfferUpdateDTO()
{
	//__cleanup();
}

void
WarningPromoOfferUpdateDTO::__init()
{
	//offerId = std::string();
	//new std::list()std::list> warnings;
}

void
WarningPromoOfferUpdateDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(warnings != NULL) {
	//warnings.RemoveAll(true);
	//delete warnings;
	//warnings = NULL;
	//}
	//
}

void
WarningPromoOfferUpdateDTO::fromJson(char* jsonStr)
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
	const gchar *warningsKey = "warnings";
	node = json_object_get_member(pJsonObject, warningsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PromoOfferUpdateWarningDTO> new_list;
			PromoOfferUpdateWarningDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PromoOfferUpdateWarningDTO")) {
					jsonToValue(&inst, temp_json, "PromoOfferUpdateWarningDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warnings = new_list;
		}
		
	}
}

WarningPromoOfferUpdateDTO::WarningPromoOfferUpdateDTO(char* json)
{
	this->fromJson(json);
}

char*
WarningPromoOfferUpdateDTO::toJson()
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
	if (isprimitive("PromoOfferUpdateWarningDTO")) {
		list<PromoOfferUpdateWarningDTO> new_list = static_cast<list <PromoOfferUpdateWarningDTO> > (getWarnings());
		node = converttoJson(&new_list, "PromoOfferUpdateWarningDTO", "array");
	} else {
		node = json_node_alloc();
		list<PromoOfferUpdateWarningDTO> new_list = static_cast<list <PromoOfferUpdateWarningDTO> > (getWarnings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PromoOfferUpdateWarningDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PromoOfferUpdateWarningDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *warningsKey = "warnings";
	json_object_set_member(pJsonObject, warningsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
WarningPromoOfferUpdateDTO::getOfferId()
{
	return offerId;
}

void
WarningPromoOfferUpdateDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<PromoOfferUpdateWarningDTO>
WarningPromoOfferUpdateDTO::getWarnings()
{
	return warnings;
}

void
WarningPromoOfferUpdateDTO::setWarnings(std::list <PromoOfferUpdateWarningDTO> warnings)
{
	this->warnings = warnings;
}


