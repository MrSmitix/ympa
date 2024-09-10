#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderPaymentType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderPaymentType::OrderPaymentType()
{
	//__init();
}

OrderPaymentType::~OrderPaymentType()
{
	//__cleanup();
}

void
OrderPaymentType::__init()
{
}

void
OrderPaymentType::__cleanup()
{
	//
}

void
OrderPaymentType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

OrderPaymentType::OrderPaymentType(char* json)
{
	this->fromJson(json);
}

char*
OrderPaymentType::toJson()
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


