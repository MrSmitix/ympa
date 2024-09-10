#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetModelsOffersResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetModelsOffersResponse::GetModelsOffersResponse()
{
	//__init();
}

GetModelsOffersResponse::~GetModelsOffersResponse()
{
	//__cleanup();
}

void
GetModelsOffersResponse::__init()
{
	//new std::list()std::list> models;
	//currency = new CurrencyType();
	//regionId = long(0);
}

void
GetModelsOffersResponse::__cleanup()
{
	//if(models != NULL) {
	//models.RemoveAll(true);
	//delete models;
	//models = NULL;
	//}
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
GetModelsOffersResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelsKey = "models";
	node = json_object_get_member(pJsonObject, modelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EnrichedModelDTO> new_list;
			EnrichedModelDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EnrichedModelDTO")) {
					jsonToValue(&inst, temp_json, "EnrichedModelDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			models = new_list;
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
	const gchar *regionIdKey = "regionId";
	node = json_object_get_member(pJsonObject, regionIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&regionId, node, "long long", "");
		} else {
			
		}
	}
}

GetModelsOffersResponse::GetModelsOffersResponse(char* json)
{
	this->fromJson(json);
}

char*
GetModelsOffersResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EnrichedModelDTO")) {
		list<EnrichedModelDTO> new_list = static_cast<list <EnrichedModelDTO> > (getModels());
		node = converttoJson(&new_list, "EnrichedModelDTO", "array");
	} else {
		node = json_node_alloc();
		list<EnrichedModelDTO> new_list = static_cast<list <EnrichedModelDTO> > (getModels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EnrichedModelDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EnrichedModelDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *modelsKey = "models";
	json_object_set_member(pJsonObject, modelsKey, node);
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

std::list<EnrichedModelDTO>
GetModelsOffersResponse::getModels()
{
	return models;
}

void
GetModelsOffersResponse::setModels(std::list <EnrichedModelDTO> models)
{
	this->models = models;
}

CurrencyType
GetModelsOffersResponse::getCurrency()
{
	return currency;
}

void
GetModelsOffersResponse::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long long
GetModelsOffersResponse::getRegionId()
{
	return regionId;
}

void
GetModelsOffersResponse::setRegionId(long long  regionId)
{
	this->regionId = regionId;
}


