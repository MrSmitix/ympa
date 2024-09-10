#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ReturnDecisionType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ReturnDecisionType::ReturnDecisionType()
{
	//__init();
}

ReturnDecisionType::~ReturnDecisionType()
{
	//__cleanup();
}

void
ReturnDecisionType::__init()
{
}

void
ReturnDecisionType::__cleanup()
{
	//
}

void
ReturnDecisionType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

ReturnDecisionType::ReturnDecisionType(char* json)
{
	this->fromJson(json);
}

char*
ReturnDecisionType::toJson()
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


