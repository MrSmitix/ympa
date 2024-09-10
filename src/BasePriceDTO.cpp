#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BasePriceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BasePriceDTO::BasePriceDTO()
{
	//__init();
}

BasePriceDTO::~BasePriceDTO()
{
	//__cleanup();
}

void
BasePriceDTO::__init()
{
	//value = double(0);
	//currencyId = new CurrencyType();
}

void
BasePriceDTO::__cleanup()
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
	//
}

void
BasePriceDTO::fromJson(char* jsonStr)
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
}

BasePriceDTO::BasePriceDTO(char* json)
{
	this->fromJson(json);
}

char*
BasePriceDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
BasePriceDTO::getValue()
{
	return value;
}

void
BasePriceDTO::setValue(long long  value)
{
	this->value = value;
}

CurrencyType
BasePriceDTO::getCurrencyId()
{
	return currencyId;
}

void
BasePriceDTO::setCurrencyId(CurrencyType  currencyId)
{
	this->currencyId = currencyId;
}


