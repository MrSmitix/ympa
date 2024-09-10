#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ModelDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ModelDTO::ModelDTO()
{
	//__init();
}

ModelDTO::~ModelDTO()
{
	//__cleanup();
}

void
ModelDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//prices = new ModelPriceDTO();
}

void
ModelDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(prices != NULL) {
	//
	//delete prices;
	//prices = NULL;
	//}
	//
}

void
ModelDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
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
	const gchar *pricesKey = "prices";
	node = json_object_get_member(pJsonObject, pricesKey);
	if (node !=NULL) {
	

		if (isprimitive("ModelPriceDTO")) {
			jsonToValue(&prices, node, "ModelPriceDTO", "ModelPriceDTO");
		} else {
			
			ModelPriceDTO* obj = static_cast<ModelPriceDTO*> (&prices);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ModelDTO::ModelDTO(char* json)
{
	this->fromJson(json);
}

char*
ModelDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ModelPriceDTO")) {
		ModelPriceDTO obj = getPrices();
		node = converttoJson(&obj, "ModelPriceDTO", "");
	}
	else {
		
		ModelPriceDTO obj = static_cast<ModelPriceDTO> (getPrices());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pricesKey = "prices";
	json_object_set_member(pJsonObject, pricesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ModelDTO::getId()
{
	return id;
}

void
ModelDTO::setId(long long  id)
{
	this->id = id;
}

std::string
ModelDTO::getName()
{
	return name;
}

void
ModelDTO::setName(std::string  name)
{
	this->name = name;
}

ModelPriceDTO
ModelDTO::getPrices()
{
	return prices;
}

void
ModelDTO::setPrices(ModelPriceDTO  prices)
{
	this->prices = prices;
}


