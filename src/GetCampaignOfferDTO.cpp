#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCampaignOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCampaignOfferDTO::GetCampaignOfferDTO()
{
	//__init();
}

GetCampaignOfferDTO::~GetCampaignOfferDTO()
{
	//__cleanup();
}

void
GetCampaignOfferDTO::__init()
{
	//offerId = std::string();
	//quantum = new QuantumDTO();
	//available = bool(false);
	//basicPrice = new GetPriceWithDiscountDTO();
	//campaignPrice = new GetPriceWithVatDTO();
	//status = new OfferCampaignStatusType();
	//new std::list()std::list> errors;
	//new std::list()std::list> warnings;
}

void
GetCampaignOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(quantum != NULL) {
	//
	//delete quantum;
	//quantum = NULL;
	//}
	//if(available != NULL) {
	//
	//delete available;
	//available = NULL;
	//}
	//if(basicPrice != NULL) {
	//
	//delete basicPrice;
	//basicPrice = NULL;
	//}
	//if(campaignPrice != NULL) {
	//
	//delete campaignPrice;
	//campaignPrice = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
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
GetCampaignOfferDTO::fromJson(char* jsonStr)
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
	const gchar *quantumKey = "quantum";
	node = json_object_get_member(pJsonObject, quantumKey);
	if (node !=NULL) {
	

		if (isprimitive("QuantumDTO")) {
			jsonToValue(&quantum, node, "QuantumDTO", "QuantumDTO");
		} else {
			
			QuantumDTO* obj = static_cast<QuantumDTO*> (&quantum);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *availableKey = "available";
	node = json_object_get_member(pJsonObject, availableKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&available, node, "bool", "");
		} else {
			
		}
	}
	const gchar *basicPriceKey = "basicPrice";
	node = json_object_get_member(pJsonObject, basicPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPriceWithDiscountDTO")) {
			jsonToValue(&basicPrice, node, "GetPriceWithDiscountDTO", "GetPriceWithDiscountDTO");
		} else {
			
			GetPriceWithDiscountDTO* obj = static_cast<GetPriceWithDiscountDTO*> (&basicPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *campaignPriceKey = "campaignPrice";
	node = json_object_get_member(pJsonObject, campaignPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPriceWithVatDTO")) {
			jsonToValue(&campaignPrice, node, "GetPriceWithVatDTO", "GetPriceWithVatDTO");
		} else {
			
			GetPriceWithVatDTO* obj = static_cast<GetPriceWithVatDTO*> (&campaignPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferCampaignStatusType")) {
			jsonToValue(&status, node, "OfferCampaignStatusType", "OfferCampaignStatusType");
		} else {
			
			OfferCampaignStatusType* obj = static_cast<OfferCampaignStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
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

GetCampaignOfferDTO::GetCampaignOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
GetCampaignOfferDTO::toJson()
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
	if (isprimitive("QuantumDTO")) {
		QuantumDTO obj = getQuantum();
		node = converttoJson(&obj, "QuantumDTO", "");
	}
	else {
		
		QuantumDTO obj = static_cast<QuantumDTO> (getQuantum());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *quantumKey = "quantum";
	json_object_set_member(pJsonObject, quantumKey, node);
	if (isprimitive("bool")) {
		bool obj = getAvailable();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *availableKey = "available";
	json_object_set_member(pJsonObject, availableKey, node);
	if (isprimitive("GetPriceWithDiscountDTO")) {
		GetPriceWithDiscountDTO obj = getBasicPrice();
		node = converttoJson(&obj, "GetPriceWithDiscountDTO", "");
	}
	else {
		
		GetPriceWithDiscountDTO obj = static_cast<GetPriceWithDiscountDTO> (getBasicPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *basicPriceKey = "basicPrice";
	json_object_set_member(pJsonObject, basicPriceKey, node);
	if (isprimitive("GetPriceWithVatDTO")) {
		GetPriceWithVatDTO obj = getCampaignPrice();
		node = converttoJson(&obj, "GetPriceWithVatDTO", "");
	}
	else {
		
		GetPriceWithVatDTO obj = static_cast<GetPriceWithVatDTO> (getCampaignPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *campaignPriceKey = "campaignPrice";
	json_object_set_member(pJsonObject, campaignPriceKey, node);
	if (isprimitive("OfferCampaignStatusType")) {
		OfferCampaignStatusType obj = getStatus();
		node = converttoJson(&obj, "OfferCampaignStatusType", "");
	}
	else {
		
		OfferCampaignStatusType obj = static_cast<OfferCampaignStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
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
GetCampaignOfferDTO::getOfferId()
{
	return offerId;
}

void
GetCampaignOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

QuantumDTO
GetCampaignOfferDTO::getQuantum()
{
	return quantum;
}

void
GetCampaignOfferDTO::setQuantum(QuantumDTO  quantum)
{
	this->quantum = quantum;
}

bool
GetCampaignOfferDTO::getAvailable()
{
	return available;
}

void
GetCampaignOfferDTO::setAvailable(bool  available)
{
	this->available = available;
}

GetPriceWithDiscountDTO
GetCampaignOfferDTO::getBasicPrice()
{
	return basicPrice;
}

void
GetCampaignOfferDTO::setBasicPrice(GetPriceWithDiscountDTO  basicPrice)
{
	this->basicPrice = basicPrice;
}

GetPriceWithVatDTO
GetCampaignOfferDTO::getCampaignPrice()
{
	return campaignPrice;
}

void
GetCampaignOfferDTO::setCampaignPrice(GetPriceWithVatDTO  campaignPrice)
{
	this->campaignPrice = campaignPrice;
}

OfferCampaignStatusType
GetCampaignOfferDTO::getStatus()
{
	return status;
}

void
GetCampaignOfferDTO::setStatus(OfferCampaignStatusType  status)
{
	this->status = status;
}

std::list<OfferErrorDTO>
GetCampaignOfferDTO::getErrors()
{
	return errors;
}

void
GetCampaignOfferDTO::setErrors(std::list <OfferErrorDTO> errors)
{
	this->errors = errors;
}

std::list<OfferErrorDTO>
GetCampaignOfferDTO::getWarnings()
{
	return warnings;
}

void
GetCampaignOfferDTO::setWarnings(std::list <OfferErrorDTO> warnings)
{
	this->warnings = warnings;
}


