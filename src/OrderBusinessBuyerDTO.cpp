#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderBusinessBuyerDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderBusinessBuyerDTO::OrderBusinessBuyerDTO()
{
	//__init();
}

OrderBusinessBuyerDTO::~OrderBusinessBuyerDTO()
{
	//__cleanup();
}

void
OrderBusinessBuyerDTO::__init()
{
	//inn = std::string();
	//kpp = std::string();
	//organizationName = std::string();
	//organizationJurAddress = std::string();
}

void
OrderBusinessBuyerDTO::__cleanup()
{
	//if(inn != NULL) {
	//
	//delete inn;
	//inn = NULL;
	//}
	//if(kpp != NULL) {
	//
	//delete kpp;
	//kpp = NULL;
	//}
	//if(organizationName != NULL) {
	//
	//delete organizationName;
	//organizationName = NULL;
	//}
	//if(organizationJurAddress != NULL) {
	//
	//delete organizationJurAddress;
	//organizationJurAddress = NULL;
	//}
	//
}

void
OrderBusinessBuyerDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *innKey = "inn";
	node = json_object_get_member(pJsonObject, innKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&inn, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *kppKey = "kpp";
	node = json_object_get_member(pJsonObject, kppKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&kpp, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *organizationNameKey = "organizationName";
	node = json_object_get_member(pJsonObject, organizationNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&organizationName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *organizationJurAddressKey = "organizationJurAddress";
	node = json_object_get_member(pJsonObject, organizationJurAddressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&organizationJurAddress, node, "std::string", "");
		} else {
			
		}
	}
}

OrderBusinessBuyerDTO::OrderBusinessBuyerDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderBusinessBuyerDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getInn();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *innKey = "inn";
	json_object_set_member(pJsonObject, innKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getKpp();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *kppKey = "kpp";
	json_object_set_member(pJsonObject, kppKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrganizationName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *organizationNameKey = "organizationName";
	json_object_set_member(pJsonObject, organizationNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrganizationJurAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *organizationJurAddressKey = "organizationJurAddress";
	json_object_set_member(pJsonObject, organizationJurAddressKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OrderBusinessBuyerDTO::getInn()
{
	return inn;
}

void
OrderBusinessBuyerDTO::setInn(std::string  inn)
{
	this->inn = inn;
}

std::string
OrderBusinessBuyerDTO::getKpp()
{
	return kpp;
}

void
OrderBusinessBuyerDTO::setKpp(std::string  kpp)
{
	this->kpp = kpp;
}

std::string
OrderBusinessBuyerDTO::getOrganizationName()
{
	return organizationName;
}

void
OrderBusinessBuyerDTO::setOrganizationName(std::string  organizationName)
{
	this->organizationName = organizationName;
}

std::string
OrderBusinessBuyerDTO::getOrganizationJurAddress()
{
	return organizationJurAddress;
}

void
OrderBusinessBuyerDTO::setOrganizationJurAddress(std::string  organizationJurAddress)
{
	this->organizationJurAddress = organizationJurAddress;
}


