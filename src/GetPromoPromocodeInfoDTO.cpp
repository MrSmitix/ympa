#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoPromocodeInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoPromocodeInfoDTO::GetPromoPromocodeInfoDTO()
{
	//__init();
}

GetPromoPromocodeInfoDTO::~GetPromoPromocodeInfoDTO()
{
	//__cleanup();
}

void
GetPromoPromocodeInfoDTO::__init()
{
	//promocode = std::string();
	//discount = int(0);
}

void
GetPromoPromocodeInfoDTO::__cleanup()
{
	//if(promocode != NULL) {
	//
	//delete promocode;
	//promocode = NULL;
	//}
	//if(discount != NULL) {
	//
	//delete discount;
	//discount = NULL;
	//}
	//
}

void
GetPromoPromocodeInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *promocodeKey = "promocode";
	node = json_object_get_member(pJsonObject, promocodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promocode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *discountKey = "discount";
	node = json_object_get_member(pJsonObject, discountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&discount, node, "int", "");
		} else {
			
		}
	}
}

GetPromoPromocodeInfoDTO::GetPromoPromocodeInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromoPromocodeInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPromocode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promocodeKey = "promocode";
	json_object_set_member(pJsonObject, promocodeKey, node);
	if (isprimitive("int")) {
		int obj = getDiscount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *discountKey = "discount";
	json_object_set_member(pJsonObject, discountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GetPromoPromocodeInfoDTO::getPromocode()
{
	return promocode;
}

void
GetPromoPromocodeInfoDTO::setPromocode(std::string  promocode)
{
	this->promocode = promocode;
}

int
GetPromoPromocodeInfoDTO::getDiscount()
{
	return discount;
}

void
GetPromoPromocodeInfoDTO::setDiscount(int  discount)
{
	this->discount = discount;
}


