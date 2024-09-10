#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoBestsellerInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoBestsellerInfoDTO::GetPromoBestsellerInfoDTO()
{
	//__init();
}

GetPromoBestsellerInfoDTO::~GetPromoBestsellerInfoDTO()
{
	//__cleanup();
}

void
GetPromoBestsellerInfoDTO::__init()
{
	//bestseller = bool(false);
	//entryDeadline = null;
}

void
GetPromoBestsellerInfoDTO::__cleanup()
{
	//if(bestseller != NULL) {
	//
	//delete bestseller;
	//bestseller = NULL;
	//}
	//if(entryDeadline != NULL) {
	//
	//delete entryDeadline;
	//entryDeadline = NULL;
	//}
	//
}

void
GetPromoBestsellerInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bestsellerKey = "bestseller";
	node = json_object_get_member(pJsonObject, bestsellerKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&bestseller, node, "bool", "");
		} else {
			
		}
	}
	const gchar *entryDeadlineKey = "entryDeadline";
	node = json_object_get_member(pJsonObject, entryDeadlineKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entryDeadline, node, "std::string", "");
		} else {
			
		}
	}
}

GetPromoBestsellerInfoDTO::GetPromoBestsellerInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromoBestsellerInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getBestseller();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *bestsellerKey = "bestseller";
	json_object_set_member(pJsonObject, bestsellerKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEntryDeadline();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entryDeadlineKey = "entryDeadline";
	json_object_set_member(pJsonObject, entryDeadlineKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
GetPromoBestsellerInfoDTO::getBestseller()
{
	return bestseller;
}

void
GetPromoBestsellerInfoDTO::setBestseller(bool  bestseller)
{
	this->bestseller = bestseller;
}

std::string
GetPromoBestsellerInfoDTO::getEntryDeadline()
{
	return entryDeadline;
}

void
GetPromoBestsellerInfoDTO::setEntryDeadline(std::string  entryDeadline)
{
	this->entryDeadline = entryDeadline;
}


