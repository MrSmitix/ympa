#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackCommentStatusType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackCommentStatusType::GoodsFeedbackCommentStatusType()
{
	//__init();
}

GoodsFeedbackCommentStatusType::~GoodsFeedbackCommentStatusType()
{
	//__cleanup();
}

void
GoodsFeedbackCommentStatusType::__init()
{
}

void
GoodsFeedbackCommentStatusType::__cleanup()
{
	//
}

void
GoodsFeedbackCommentStatusType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

GoodsFeedbackCommentStatusType::GoodsFeedbackCommentStatusType(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackCommentStatusType::toJson()
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


