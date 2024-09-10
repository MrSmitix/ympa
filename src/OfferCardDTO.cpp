#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferCardDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferCardDTO::OfferCardDTO()
{
	//__init();
}

OfferCardDTO::~OfferCardDTO()
{
	//__cleanup();
}

void
OfferCardDTO::__init()
{
	//offerId = std::string();
	//mapping = new GetMappingDTO();
	//new std::list()std::list> parameterValues;
	//cardStatus = new OfferCardStatusType();
	//contentRating = int(0);
	//new std::list()std::list> recommendations;
	//new std::list()std::list> errors;
	//new std::list()std::list> warnings;
}

void
OfferCardDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(mapping != NULL) {
	//
	//delete mapping;
	//mapping = NULL;
	//}
	//if(parameterValues != NULL) {
	//parameterValues.RemoveAll(true);
	//delete parameterValues;
	//parameterValues = NULL;
	//}
	//if(cardStatus != NULL) {
	//
	//delete cardStatus;
	//cardStatus = NULL;
	//}
	//if(contentRating != NULL) {
	//
	//delete contentRating;
	//contentRating = NULL;
	//}
	//if(recommendations != NULL) {
	//recommendations.RemoveAll(true);
	//delete recommendations;
	//recommendations = NULL;
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
OfferCardDTO::fromJson(char* jsonStr)
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
	const gchar *mappingKey = "mapping";
	node = json_object_get_member(pJsonObject, mappingKey);
	if (node !=NULL) {
	

		if (isprimitive("GetMappingDTO")) {
			jsonToValue(&mapping, node, "GetMappingDTO", "GetMappingDTO");
		} else {
			
			GetMappingDTO* obj = static_cast<GetMappingDTO*> (&mapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parameterValuesKey = "parameterValues";
	node = json_object_get_member(pJsonObject, parameterValuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ParameterValueDTO> new_list;
			ParameterValueDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ParameterValueDTO")) {
					jsonToValue(&inst, temp_json, "ParameterValueDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			parameterValues = new_list;
		}
		
	}
	const gchar *cardStatusKey = "cardStatus";
	node = json_object_get_member(pJsonObject, cardStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferCardStatusType")) {
			jsonToValue(&cardStatus, node, "OfferCardStatusType", "OfferCardStatusType");
		} else {
			
			OfferCardStatusType* obj = static_cast<OfferCardStatusType*> (&cardStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *contentRatingKey = "contentRating";
	node = json_object_get_member(pJsonObject, contentRatingKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&contentRating, node, "int", "");
		} else {
			
		}
	}
	const gchar *recommendationsKey = "recommendations";
	node = json_object_get_member(pJsonObject, recommendationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferCardRecommendationDTO> new_list;
			OfferCardRecommendationDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferCardRecommendationDTO")) {
					jsonToValue(&inst, temp_json, "OfferCardRecommendationDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			recommendations = new_list;
		}
		
	}
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferErrorDTO> new_list;
			OfferErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferErrorDTO")) {
					jsonToValue(&inst, temp_json, "OfferErrorDTO", "");
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
			list<OfferErrorDTO> new_list;
			OfferErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferErrorDTO")) {
					jsonToValue(&inst, temp_json, "OfferErrorDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warnings = new_list;
		}
		
	}
}

OfferCardDTO::OfferCardDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferCardDTO::toJson()
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
	if (isprimitive("GetMappingDTO")) {
		GetMappingDTO obj = getMapping();
		node = converttoJson(&obj, "GetMappingDTO", "");
	}
	else {
		
		GetMappingDTO obj = static_cast<GetMappingDTO> (getMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mappingKey = "mapping";
	json_object_set_member(pJsonObject, mappingKey, node);
	if (isprimitive("ParameterValueDTO")) {
		list<ParameterValueDTO> new_list = static_cast<list <ParameterValueDTO> > (getParameterValues());
		node = converttoJson(&new_list, "ParameterValueDTO", "array");
	} else {
		node = json_node_alloc();
		list<ParameterValueDTO> new_list = static_cast<list <ParameterValueDTO> > (getParameterValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ParameterValueDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ParameterValueDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *parameterValuesKey = "parameterValues";
	json_object_set_member(pJsonObject, parameterValuesKey, node);
	if (isprimitive("OfferCardStatusType")) {
		OfferCardStatusType obj = getCardStatus();
		node = converttoJson(&obj, "OfferCardStatusType", "");
	}
	else {
		
		OfferCardStatusType obj = static_cast<OfferCardStatusType> (getCardStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cardStatusKey = "cardStatus";
	json_object_set_member(pJsonObject, cardStatusKey, node);
	if (isprimitive("int")) {
		int obj = getContentRating();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *contentRatingKey = "contentRating";
	json_object_set_member(pJsonObject, contentRatingKey, node);
	if (isprimitive("OfferCardRecommendationDTO")) {
		list<OfferCardRecommendationDTO> new_list = static_cast<list <OfferCardRecommendationDTO> > (getRecommendations());
		node = converttoJson(&new_list, "OfferCardRecommendationDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferCardRecommendationDTO> new_list = static_cast<list <OfferCardRecommendationDTO> > (getRecommendations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferCardRecommendationDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferCardRecommendationDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *recommendationsKey = "recommendations";
	json_object_set_member(pJsonObject, recommendationsKey, node);
	if (isprimitive("OfferErrorDTO")) {
		list<OfferErrorDTO> new_list = static_cast<list <OfferErrorDTO> > (getErrors());
		node = converttoJson(&new_list, "OfferErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferErrorDTO> new_list = static_cast<list <OfferErrorDTO> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferErrorDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("OfferErrorDTO")) {
		list<OfferErrorDTO> new_list = static_cast<list <OfferErrorDTO> > (getWarnings());
		node = converttoJson(&new_list, "OfferErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferErrorDTO> new_list = static_cast<list <OfferErrorDTO> > (getWarnings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferErrorDTO obj = *it;
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
OfferCardDTO::getOfferId()
{
	return offerId;
}

void
OfferCardDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

GetMappingDTO
OfferCardDTO::getMapping()
{
	return mapping;
}

void
OfferCardDTO::setMapping(GetMappingDTO  mapping)
{
	this->mapping = mapping;
}

std::list<ParameterValueDTO>
OfferCardDTO::getParameterValues()
{
	return parameterValues;
}

void
OfferCardDTO::setParameterValues(std::list <ParameterValueDTO> parameterValues)
{
	this->parameterValues = parameterValues;
}

OfferCardStatusType
OfferCardDTO::getCardStatus()
{
	return cardStatus;
}

void
OfferCardDTO::setCardStatus(OfferCardStatusType  cardStatus)
{
	this->cardStatus = cardStatus;
}

int
OfferCardDTO::getContentRating()
{
	return contentRating;
}

void
OfferCardDTO::setContentRating(int  contentRating)
{
	this->contentRating = contentRating;
}

std::list<OfferCardRecommendationDTO>
OfferCardDTO::getRecommendations()
{
	return recommendations;
}

void
OfferCardDTO::setRecommendations(std::list <OfferCardRecommendationDTO> recommendations)
{
	this->recommendations = recommendations;
}

std::list<OfferErrorDTO>
OfferCardDTO::getErrors()
{
	return errors;
}

void
OfferCardDTO::setErrors(std::list <OfferErrorDTO> errors)
{
	this->errors = errors;
}

std::list<OfferErrorDTO>
OfferCardDTO::getWarnings()
{
	return warnings;
}

void
OfferCardDTO::setWarnings(std::list <OfferErrorDTO> warnings)
{
	this->warnings = warnings;
}


