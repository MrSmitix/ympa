#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOfferContentResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOfferContentResultDTO::UpdateOfferContentResultDTO()
{
	//__init();
}

UpdateOfferContentResultDTO::~UpdateOfferContentResultDTO()
{
	//__cleanup();
}

void
UpdateOfferContentResultDTO::__init()
{
	//offerId = std::string();
	//new std::list()std::list> errors;
	//new std::list()std::list> warnings;
}

void
UpdateOfferContentResultDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(warnings != NULL) {
	//warnings.RemoveAll(true);
	//delete warnings;
	//warnings = NULL;
	//}
	//
}

void
UpdateOfferContentResultDTO::fromJson(char* jsonStr)
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
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferContentErrorDTO> new_list;
			OfferContentErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferContentErrorDTO")) {
					jsonToValue(&inst, temp_json, "OfferContentErrorDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
	const gchar *warningsKey = "warnings";
	node = json_object_get_member(pJsonObject, warningsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferContentErrorDTO> new_list;
			OfferContentErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferContentErrorDTO")) {
					jsonToValue(&inst, temp_json, "OfferContentErrorDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warnings = new_list;
		}
		
	}
}

UpdateOfferContentResultDTO::UpdateOfferContentResultDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateOfferContentResultDTO::toJson()
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
	if (isprimitive("OfferContentErrorDTO")) {
		list<OfferContentErrorDTO> new_list = static_cast<list <OfferContentErrorDTO> > (getErrors());
		node = converttoJson(&new_list, "OfferContentErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferContentErrorDTO> new_list = static_cast<list <OfferContentErrorDTO> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferContentErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferContentErrorDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("OfferContentErrorDTO")) {
		list<OfferContentErrorDTO> new_list = static_cast<list <OfferContentErrorDTO> > (getWarnings());
		node = converttoJson(&new_list, "OfferContentErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferContentErrorDTO> new_list = static_cast<list <OfferContentErrorDTO> > (getWarnings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferContentErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferContentErrorDTO obj = *it;
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
UpdateOfferContentResultDTO::getOfferId()
{
	return offerId;
}

void
UpdateOfferContentResultDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<OfferContentErrorDTO>
UpdateOfferContentResultDTO::getErrors()
{
	return errors;
}

void
UpdateOfferContentResultDTO::setErrors(std::list <OfferContentErrorDTO> errors)
{
	this->errors = errors;
}

std::list<OfferContentErrorDTO>
UpdateOfferContentResultDTO::getWarnings()
{
	return warnings;
}

void
UpdateOfferContentResultDTO::setWarnings(std::list <OfferContentErrorDTO> warnings)
{
	this->warnings = warnings;
}


