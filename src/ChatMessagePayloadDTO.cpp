#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatMessagePayloadDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatMessagePayloadDTO::ChatMessagePayloadDTO()
{
	//__init();
}

ChatMessagePayloadDTO::~ChatMessagePayloadDTO()
{
	//__cleanup();
}

void
ChatMessagePayloadDTO::__init()
{
	//name = std::string();
	//url = std::string();
	//size = int(0);
}

void
ChatMessagePayloadDTO::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//
}

void
ChatMessagePayloadDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&size, node, "int", "");
		} else {
			
		}
	}
}

ChatMessagePayloadDTO::ChatMessagePayloadDTO(char* json)
{
	this->fromJson(json);
}

char*
ChatMessagePayloadDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("int")) {
		int obj = getSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatMessagePayloadDTO::getName()
{
	return name;
}

void
ChatMessagePayloadDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
ChatMessagePayloadDTO::getUrl()
{
	return url;
}

void
ChatMessagePayloadDTO::setUrl(std::string  url)
{
	this->url = url;
}

int
ChatMessagePayloadDTO::getSize()
{
	return size;
}

void
ChatMessagePayloadDTO::setSize(int  size)
{
	this->size = size;
}


