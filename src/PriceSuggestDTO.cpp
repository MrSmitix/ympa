#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceSuggestDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceSuggestDTO::PriceSuggestDTO()
{
	//__init();
}

PriceSuggestDTO::~PriceSuggestDTO()
{
	//__cleanup();
}

void
PriceSuggestDTO::__init()
{
	//type = new PriceSuggestType();
	//price = double(0);
}

void
PriceSuggestDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//
}

void
PriceSuggestDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PriceSuggestType")) {
			jsonToValue(&type, node, "PriceSuggestType", "PriceSuggestType");
		} else {
			
			PriceSuggestType* obj = static_cast<PriceSuggestType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&price, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PriceSuggestDTO::PriceSuggestDTO(char* json)
{
	this->fromJson(json);
}

char*
PriceSuggestDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PriceSuggestType")) {
		PriceSuggestType obj = getType();
		node = converttoJson(&obj, "PriceSuggestType", "");
	}
	else {
		
		PriceSuggestType obj = static_cast<PriceSuggestType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

PriceSuggestType
PriceSuggestDTO::getType()
{
	return type;
}

void
PriceSuggestDTO::setType(PriceSuggestType  type)
{
	this->type = type;
}

long long
PriceSuggestDTO::getPrice()
{
	return price;
}

void
PriceSuggestDTO::setPrice(long long  price)
{
	this->price = price;
}


