#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BriefOrderItemInstanceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BriefOrderItemInstanceDTO::BriefOrderItemInstanceDTO()
{
	//__init();
}

BriefOrderItemInstanceDTO::~BriefOrderItemInstanceDTO()
{
	//__cleanup();
}

void
BriefOrderItemInstanceDTO::__init()
{
	//cis = std::string();
	//uin = std::string();
	//rnpt = std::string();
	//gtd = std::string();
}

void
BriefOrderItemInstanceDTO::__cleanup()
{
	//if(cis != NULL) {
	//
	//delete cis;
	//cis = NULL;
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
BriefOrderItemInstanceDTO::fromJson(char* jsonStr)
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

BriefOrderItemInstanceDTO::BriefOrderItemInstanceDTO(char* json)
{
	this->fromJson(json);
}

char*
BriefOrderItemInstanceDTO::toJson()
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
BriefOrderItemInstanceDTO::getCis()
{
	return cis;
}

void
BriefOrderItemInstanceDTO::setCis(std::string  cis)
{
	this->cis = cis;
}

std::string
BriefOrderItemInstanceDTO::getUin()
{
	return uin;
}

void
BriefOrderItemInstanceDTO::setUin(std::string  uin)
{
	this->uin = uin;
}

std::string
BriefOrderItemInstanceDTO::getRnpt()
{
	return rnpt;
}

void
BriefOrderItemInstanceDTO::setRnpt(std::string  rnpt)
{
	this->rnpt = rnpt;
}

std::string
BriefOrderItemInstanceDTO::getGtd()
{
	return gtd;
}

void
BriefOrderItemInstanceDTO::setGtd(std::string  gtd)
{
	this->gtd = gtd;
}


