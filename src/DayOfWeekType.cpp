#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DayOfWeekType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DayOfWeekType::DayOfWeekType()
{
	//__init();
}

DayOfWeekType::~DayOfWeekType()
{
	//__cleanup();
}

void
DayOfWeekType::__init()
{
}

void
DayOfWeekType::__cleanup()
{
	//
}

void
DayOfWeekType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

DayOfWeekType::DayOfWeekType(char* json)
{
	this->fromJson(json);
}

char*
DayOfWeekType::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}


