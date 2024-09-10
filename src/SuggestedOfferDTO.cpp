#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SuggestedOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SuggestedOfferDTO::SuggestedOfferDTO()
{
	//__init();
}

SuggestedOfferDTO::~SuggestedOfferDTO()
{
	//__cleanup();
}

void
SuggestedOfferDTO::__init()
{
	//offerId = std::string();
	//name = std::string();
	//category = std::string();
	//vendor = std::string();
	//new std::list()std::list> barcodes;
	//description = std::string();
	//vendorCode = std::string();
	//basicPrice = new BasePriceDTO();
}

void
SuggestedOfferDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(vendor != NULL) {
	//
	//delete vendor;
	//vendor = NULL;
	//}
	//if(barcodes != NULL) {
	//barcodes.RemoveAll(true);
	//delete barcodes;
	//barcodes = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(vendorCode != NULL) {
	//
	//delete vendorCode;
	//vendorCode = NULL;
	//}
	//if(basicPrice != NULL) {
	//
	//delete basicPrice;
	//basicPrice = NULL;
	//}
	//
}

void
SuggestedOfferDTO::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vendorKey = "vendor";
	node = json_object_get_member(pJsonObject, vendorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vendor, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *barcodesKey = "barcodes";
	node = json_object_get_member(pJsonObject, barcodesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			barcodes = new_list;
		}
		
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vendorCodeKey = "vendorCode";
	node = json_object_get_member(pJsonObject, vendorCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vendorCode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *basicPriceKey = "basicPrice";
	node = json_object_get_member(pJsonObject, basicPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("BasePriceDTO")) {
			jsonToValue(&basicPrice, node, "BasePriceDTO", "BasePriceDTO");
		} else {
			
			BasePriceDTO* obj = static_cast<BasePriceDTO*> (&basicPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

SuggestedOfferDTO::SuggestedOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
SuggestedOfferDTO::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVendor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vendorKey = "vendor";
	json_object_set_member(pJsonObject, vendorKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getBarcodes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getBarcodes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *barcodesKey = "barcodes";
	json_object_set_member(pJsonObject, barcodesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVendorCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vendorCodeKey = "vendorCode";
	json_object_set_member(pJsonObject, vendorCodeKey, node);
	if (isprimitive("BasePriceDTO")) {
		BasePriceDTO obj = getBasicPrice();
		node = converttoJson(&obj, "BasePriceDTO", "");
	}
	else {
		
		BasePriceDTO obj = static_cast<BasePriceDTO> (getBasicPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *basicPriceKey = "basicPrice";
	json_object_set_member(pJsonObject, basicPriceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SuggestedOfferDTO::getOfferId()
{
	return offerId;
}

void
SuggestedOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::string
SuggestedOfferDTO::getName()
{
	return name;
}

void
SuggestedOfferDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
SuggestedOfferDTO::getCategory()
{
	return category;
}

void
SuggestedOfferDTO::setCategory(std::string  category)
{
	this->category = category;
}

std::string
SuggestedOfferDTO::getVendor()
{
	return vendor;
}

void
SuggestedOfferDTO::setVendor(std::string  vendor)
{
	this->vendor = vendor;
}

std::list<std::string>
SuggestedOfferDTO::getBarcodes()
{
	return barcodes;
}

void
SuggestedOfferDTO::setBarcodes(std::list <std::string> barcodes)
{
	this->barcodes = barcodes;
}

std::string
SuggestedOfferDTO::getDescription()
{
	return description;
}

void
SuggestedOfferDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::string
SuggestedOfferDTO::getVendorCode()
{
	return vendorCode;
}

void
SuggestedOfferDTO::setVendorCode(std::string  vendorCode)
{
	this->vendorCode = vendorCode;
}

BasePriceDTO
SuggestedOfferDTO::getBasicPrice()
{
	return basicPrice;
}

void
SuggestedOfferDTO::setBasicPrice(BasePriceDTO  basicPrice)
{
	this->basicPrice = basicPrice;
}


