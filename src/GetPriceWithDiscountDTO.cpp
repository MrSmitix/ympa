#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPriceWithDiscountDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPriceWithDiscountDTO::GetPriceWithDiscountDTO()
{
	//__init();
}

GetPriceWithDiscountDTO::~GetPriceWithDiscountDTO()
{
	//__cleanup();
}

void
GetPriceWithDiscountDTO::__init()
{
	//value = double(0);
	//currencyId = new CurrencyType();
	//discountBase = double(0);
	//updatedAt = null;
}

void
GetPriceWithDiscountDTO::__cleanup()
{
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(currencyId != NULL) {
	//
	//delete currencyId;
	//currencyId = NULL;
	//}
	//if(discountBase != NULL) {
	//
	//delete discountBase;
	//discountBase = NULL;
	//}
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//
}

void
GetPriceWithDiscountDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&value, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&value);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *currencyIdKey = "currencyId";
	node = json_object_get_member(pJsonObject, currencyIdKey);
	if (node !=NULL) {
	

		if (isprimitive("CurrencyType")) {
			jsonToValue(&currencyId, node, "CurrencyType", "CurrencyType");
		} else {
			
			CurrencyType* obj = static_cast<CurrencyType*> (&currencyId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *discountBaseKey = "discountBase";
	node = json_object_get_member(pJsonObject, discountBaseKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&discountBase, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&discountBase);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *updatedAtKey = "updatedAt";
	node = json_object_get_member(pJsonObject, updatedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updatedAt, node, "std::string", "");
		} else {
			
		}
	}
}

GetPriceWithDiscountDTO::GetPriceWithDiscountDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPriceWithDiscountDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getValue();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("CurrencyType")) {
		CurrencyType obj = getCurrencyId();
		node = converttoJson(&obj, "CurrencyType", "");
	}
	else {
		
		CurrencyType obj = static_cast<CurrencyType> (getCurrencyId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyIdKey = "currencyId";
	json_object_set_member(pJsonObject, currencyIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getDiscountBase();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getDiscountBase());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *discountBaseKey = "discountBase";
	json_object_set_member(pJsonObject, discountBaseKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updatedAtKey = "updatedAt";
	json_object_set_member(pJsonObject, updatedAtKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GetPriceWithDiscountDTO::getValue()
{
	return value;
}

void
GetPriceWithDiscountDTO::setValue(long long  value)
{
	this->value = value;
}

CurrencyType
GetPriceWithDiscountDTO::getCurrencyId()
{
	return currencyId;
}

void
GetPriceWithDiscountDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}

long long
GetPriceWithDiscountDTO::getDiscountBase()
{
	return discountBase;
}

void
GetPriceWithDiscountDTO::setDiscountBase(long long  discountBase)
{
	this->discountBase = discountBase;
}

std::string
GetPriceWithDiscountDTO::getUpdatedAt()
{
	return updatedAt;
}

void
GetPriceWithDiscountDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}


