#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackDescriptionDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackDescriptionDTO::GoodsFeedbackDescriptionDTO()
{
	//__init();
}

GoodsFeedbackDescriptionDTO::~GoodsFeedbackDescriptionDTO()
{
	//__cleanup();
}

void
GoodsFeedbackDescriptionDTO::__init()
{
	//advantages = std::string();
	//disadvantages = std::string();
	//comment = std::string();
}

void
GoodsFeedbackDescriptionDTO::__cleanup()
{
	//if(advantages != NULL) {
	//
	//delete advantages;
	//advantages = NULL;
	//}
	//if(disadvantages != NULL) {
	//
	//delete disadvantages;
	//disadvantages = NULL;
	//}
	//if(comment != NULL) {
	//
	//delete comment;
	//comment = NULL;
	//}
	//
}

void
GoodsFeedbackDescriptionDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *advantagesKey = "advantages";
	node = json_object_get_member(pJsonObject, advantagesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&advantages, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *disadvantagesKey = "disadvantages";
	node = json_object_get_member(pJsonObject, disadvantagesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&disadvantages, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *commentKey = "comment";
	node = json_object_get_member(pJsonObject, commentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&comment, node, "std::string", "");
		} else {
			
		}
	}
}

GoodsFeedbackDescriptionDTO::GoodsFeedbackDescriptionDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackDescriptionDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdvantages();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *advantagesKey = "advantages";
	json_object_set_member(pJsonObject, advantagesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDisadvantages();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *disadvantagesKey = "disadvantages";
	json_object_set_member(pJsonObject, disadvantagesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getComment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *commentKey = "comment";
	json_object_set_member(pJsonObject, commentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GoodsFeedbackDescriptionDTO::getAdvantages()
{
	return advantages;
}

void
GoodsFeedbackDescriptionDTO::setAdvantages(std::string  advantages)
{
	this->advantages = advantages;
}

std::string
GoodsFeedbackDescriptionDTO::getDisadvantages()
{
	return disadvantages;
}

void
GoodsFeedbackDescriptionDTO::setDisadvantages(std::string  disadvantages)
{
	this->disadvantages = disadvantages;
}

std::string
GoodsFeedbackDescriptionDTO::getComment()
{
	return comment;
}

void
GoodsFeedbackDescriptionDTO::setComment(std::string  comment)
{
	this->comment = comment;
}


