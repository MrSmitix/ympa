#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RegionalModelInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RegionalModelInfoDTO::RegionalModelInfoDTO()
{
	//__init();
}

RegionalModelInfoDTO::~RegionalModelInfoDTO()
{
	//__cleanup();
}

void
RegionalModelInfoDTO::__init()
{
	//currency = new CurrencyType();
	//regionId = long(0);
}

void
RegionalModelInfoDTO::__cleanup()
{
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(regionId != NULL) {
	//
	//delete regionId;
	//regionId = NULL;
	//}
	//
}

void
RegionalModelInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *regionIdKey = "regionId";
	node = json_object_get_member(pJsonObject, regionIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&regionId, node, "long long", "");
		} else {
			
		}
	}
}

RegionalModelInfoDTO::RegionalModelInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
RegionalModelInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("long long")) {
		long long obj = getRegionId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *regionIdKey = "regionId";
	json_object_set_member(pJsonObject, regionIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CurrencyType
RegionalModelInfoDTO::getCurrency()
{
	return currency;
}

void
RegionalModelInfoDTO::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long long
RegionalModelInfoDTO::getRegionId()
{
	return regionId;
}

void
RegionalModelInfoDTO::setRegionId(long long  regionId)
{
	this->regionId = regionId;
}


