#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceDTO::PriceDTO()
{
	//__init();
}

PriceDTO::~PriceDTO()
{
	//__cleanup();
}

void
PriceDTO::__init()
{
	//value = double(0);
	//discountBase = double(0);
	//currencyId = new CurrencyType();
	//vat = int(0);
}

void
PriceDTO::__cleanup()
{
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(discountBase != NULL) {
	//
	//delete discountBase;
	//discountBase = NULL;
	//}
	//if(currencyId != NULL) {
	//
	//delete currencyId;
	//currencyId = NULL;
	//}
	//if(vat != NULL) {
	//
	//delete vat;
	//vat = NULL;
	//}
	//
}

void
PriceDTO::fromJson(char* jsonStr)
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
	const gchar *vatKey = "vat";
	node = json_object_get_member(pJsonObject, vatKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vat, node, "int", "");
		} else {
			
		}
	}
}

PriceDTO::PriceDTO(char* json)
{
	this->fromJson(json);
}

char*
PriceDTO::toJson()
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
	if (isprimitive("int")) {
		int obj = getVat();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vatKey = "vat";
	json_object_set_member(pJsonObject, vatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
PriceDTO::getValue()
{
	return value;
}

void
PriceDTO::setValue(long long  value)
{
	this->value = value;
}

long long
PriceDTO::getDiscountBase()
{
	return discountBase;
}

void
PriceDTO::setDiscountBase(long long  discountBase)
{
	this->discountBase = discountBase;
}

CurrencyType
PriceDTO::getCurrencyId()
{
	return currencyId;
}

void
PriceDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}

int
PriceDTO::getVat()
{
	return vat;
}

void
PriceDTO::setVat(int  vat)
{
	this->vat = vat;
}


