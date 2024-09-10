#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BusinessSettingsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BusinessSettingsDTO::BusinessSettingsDTO()
{
	//__init();
}

BusinessSettingsDTO::~BusinessSettingsDTO()
{
	//__cleanup();
}

void
BusinessSettingsDTO::__init()
{
	//onlyDefaultPrice = bool(false);
	//currency = new CurrencyType();
}

void
BusinessSettingsDTO::__cleanup()
{
	//if(onlyDefaultPrice != NULL) {
	//
	//delete onlyDefaultPrice;
	//onlyDefaultPrice = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//
}

void
BusinessSettingsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *onlyDefaultPriceKey = "onlyDefaultPrice";
	node = json_object_get_member(pJsonObject, onlyDefaultPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&onlyDefaultPrice, node, "bool", "");
		} else {
			
		}
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("CurrencyType")) {
			jsonToValue(&currency, node, "CurrencyType", "CurrencyType");
		} else {
			
			CurrencyType* obj = static_cast<CurrencyType*> (&currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BusinessSettingsDTO::BusinessSettingsDTO(char* json)
{
	this->fromJson(json);
}

char*
BusinessSettingsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getOnlyDefaultPrice();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *onlyDefaultPriceKey = "onlyDefaultPrice";
	json_object_set_member(pJsonObject, onlyDefaultPriceKey, node);
	if (isprimitive("CurrencyType")) {
		CurrencyType obj = getCurrency();
		node = converttoJson(&obj, "CurrencyType", "");
	}
	else {
		
		CurrencyType obj = static_cast<CurrencyType> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
BusinessSettingsDTO::getOnlyDefaultPrice()
{
	return onlyDefaultPrice;
}

void
BusinessSettingsDTO::setOnlyDefaultPrice(bool  onlyDefaultPrice)
{
	this->onlyDefaultPrice = onlyDefaultPrice;
}

CurrencyType
BusinessSettingsDTO::getCurrency()
{
	return currency;
}

void
BusinessSettingsDTO::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}


