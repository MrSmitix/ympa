#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOfferMappingResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOfferMappingResultDTO::UpdateOfferMappingResultDTO()
{
	//__init();
}

UpdateOfferMappingResultDTO::~UpdateOfferMappingResultDTO()
{
	//__cleanup();
}

void
UpdateOfferMappingResultDTO::__init()
{
	//offerId = std::string();
	//new std::list()std::list> errors;
	//new std::list()std::list> warnings;
}

void
UpdateOfferMappingResultDTO::__cleanup()
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
UpdateOfferMappingResultDTO::fromJson(char* jsonStr)
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
			list<OfferMappingErrorDTO> new_list;
			OfferMappingErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferMappingErrorDTO")) {
					jsonToValue(&inst, temp_json, "OfferMappingErrorDTO", "");
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
			list<OfferMappingErrorDTO> new_list;
			OfferMappingErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferMappingErrorDTO")) {
					jsonToValue(&inst, temp_json, "OfferMappingErrorDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warnings = new_list;
		}
		
	}
}

UpdateOfferMappingResultDTO::UpdateOfferMappingResultDTO(char* json)
{
	this->fromJson(json);
}

char*
UpdateOfferMappingResultDTO::toJson()
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
	if (isprimitive("OfferMappingErrorDTO")) {
		list<OfferMappingErrorDTO> new_list = static_cast<list <OfferMappingErrorDTO> > (getErrors());
		node = converttoJson(&new_list, "OfferMappingErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferMappingErrorDTO> new_list = static_cast<list <OfferMappingErrorDTO> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferMappingErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferMappingErrorDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("OfferMappingErrorDTO")) {
		list<OfferMappingErrorDTO> new_list = static_cast<list <OfferMappingErrorDTO> > (getWarnings());
		node = converttoJson(&new_list, "OfferMappingErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferMappingErrorDTO> new_list = static_cast<list <OfferMappingErrorDTO> > (getWarnings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferMappingErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferMappingErrorDTO obj = *it;
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
UpdateOfferMappingResultDTO::getOfferId()
{
	return offerId;
}

void
UpdateOfferMappingResultDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<OfferMappingErrorDTO>
UpdateOfferMappingResultDTO::getErrors()
{
	return errors;
}

void
UpdateOfferMappingResultDTO::setErrors(std::list <OfferMappingErrorDTO> errors)
{
	this->errors = errors;
}

std::list<OfferMappingErrorDTO>
UpdateOfferMappingResultDTO::getWarnings()
{
	return warnings;
}

void
UpdateOfferMappingResultDTO::setWarnings(std::list <OfferMappingErrorDTO> warnings)
{
	this->warnings = warnings;
}


