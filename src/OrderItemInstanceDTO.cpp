#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderItemInstanceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderItemInstanceDTO::OrderItemInstanceDTO()
{
	//__init();
}

OrderItemInstanceDTO::~OrderItemInstanceDTO()
{
	//__cleanup();
}

void
OrderItemInstanceDTO::__init()
{
	//cis = std::string();
	//cisFull = std::string();
	//uin = std::string();
	//rnpt = std::string();
	//gtd = std::string();
}

void
OrderItemInstanceDTO::__cleanup()
{
	//if(cis != NULL) {
	//
	//delete cis;
	//cis = NULL;
	//}
	//if(cisFull != NULL) {
	//
	//delete cisFull;
	//cisFull = NULL;
	//}
	//if(uin != NULL) {
	//
	//delete uin;
	//uin = NULL;
	//}
	//if(rnpt != NULL) {
	//
	//delete rnpt;
	//rnpt = NULL;
	//}
	//if(gtd != NULL) {
	//
	//delete gtd;
	//gtd = NULL;
	//}
	//
}

void
OrderItemInstanceDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cisKey = "cis";
	node = json_object_get_member(pJsonObject, cisKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cis, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cisFullKey = "cisFull";
	node = json_object_get_member(pJsonObject, cisFullKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cisFull, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *uinKey = "uin";
	node = json_object_get_member(pJsonObject, uinKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&uin, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *rnptKey = "rnpt";
	node = json_object_get_member(pJsonObject, rnptKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&rnpt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *gtdKey = "gtd";
	node = json_object_get_member(pJsonObject, gtdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&gtd, node, "std::string", "");
		} else {
			
		}
	}
}

OrderItemInstanceDTO::OrderItemInstanceDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderItemInstanceDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCis();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cisKey = "cis";
	json_object_set_member(pJsonObject, cisKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCisFull();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cisFullKey = "cisFull";
	json_object_set_member(pJsonObject, cisFullKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUin();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *uinKey = "uin";
	json_object_set_member(pJsonObject, uinKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRnpt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *rnptKey = "rnpt";
	json_object_set_member(pJsonObject, rnptKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGtd();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *gtdKey = "gtd";
	json_object_set_member(pJsonObject, gtdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OrderItemInstanceDTO::getCis()
{
	return cis;
}

void
OrderItemInstanceDTO::setCis(std::string  cis)
{
	this->cis = cis;
}

std::string
OrderItemInstanceDTO::getCisFull()
{
	return cisFull;
}

void
OrderItemInstanceDTO::setCisFull(std::string  cisFull)
{
	this->cisFull = cisFull;
}

std::string
OrderItemInstanceDTO::getUin()
{
	return uin;
}

void
OrderItemInstanceDTO::setUin(std::string  uin)
{
	this->uin = uin;
}

std::string
OrderItemInstanceDTO::getRnpt()
{
	return rnpt;
}

void
OrderItemInstanceDTO::setRnpt(std::string  rnpt)
{
	this->rnpt = rnpt;
}

std::string
OrderItemInstanceDTO::getGtd()
{
	return gtd;
}

void
OrderItemInstanceDTO::setGtd(std::string  gtd)
{
	this->gtd = gtd;
}


