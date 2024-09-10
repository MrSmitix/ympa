#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackCommentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackCommentDTO::GoodsFeedbackCommentDTO()
{
	//__init();
}

GoodsFeedbackCommentDTO::~GoodsFeedbackCommentDTO()
{
	//__cleanup();
}

void
GoodsFeedbackCommentDTO::__init()
{
	//id = long(0);
	//text = std::string();
	//canModify = bool(false);
	//parentId = long(0);
	//author = new GoodsFeedbackCommentAuthorDTO();
	//status = new GoodsFeedbackCommentStatusType();
}

void
GoodsFeedbackCommentDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(canModify != NULL) {
	//
	//delete canModify;
	//canModify = NULL;
	//}
	//if(parentId != NULL) {
	//
	//delete parentId;
	//parentId = NULL;
	//}
	//if(author != NULL) {
	//
	//delete author;
	//author = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
GoodsFeedbackCommentDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *canModifyKey = "canModify";
	node = json_object_get_member(pJsonObject, canModifyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&canModify, node, "bool", "");
		} else {
			
		}
	}
	const gchar *parentIdKey = "parentId";
	node = json_object_get_member(pJsonObject, parentIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&parentId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *authorKey = "author";
	node = json_object_get_member(pJsonObject, authorKey);
	if (node !=NULL) {
	

		if (isprimitive("GoodsFeedbackCommentAuthorDTO")) {
			jsonToValue(&author, node, "GoodsFeedbackCommentAuthorDTO", "GoodsFeedbackCommentAuthorDTO");
		} else {
			
			GoodsFeedbackCommentAuthorDTO* obj = static_cast<GoodsFeedbackCommentAuthorDTO*> (&author);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("GoodsFeedbackCommentStatusType")) {
			jsonToValue(&status, node, "GoodsFeedbackCommentStatusType", "GoodsFeedbackCommentStatusType");
		} else {
			
			GoodsFeedbackCommentStatusType* obj = static_cast<GoodsFeedbackCommentStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoodsFeedbackCommentDTO::GoodsFeedbackCommentDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackCommentDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("bool")) {
		bool obj = getCanModify();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *canModifyKey = "canModify";
	json_object_set_member(pJsonObject, canModifyKey, node);
	if (isprimitive("long long")) {
		long long obj = getParentId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *parentIdKey = "parentId";
	json_object_set_member(pJsonObject, parentIdKey, node);
	if (isprimitive("GoodsFeedbackCommentAuthorDTO")) {
		GoodsFeedbackCommentAuthorDTO obj = getAuthor();
		node = converttoJson(&obj, "GoodsFeedbackCommentAuthorDTO", "");
	}
	else {
		
		GoodsFeedbackCommentAuthorDTO obj = static_cast<GoodsFeedbackCommentAuthorDTO> (getAuthor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authorKey = "author";
	json_object_set_member(pJsonObject, authorKey, node);
	if (isprimitive("GoodsFeedbackCommentStatusType")) {
		GoodsFeedbackCommentStatusType obj = getStatus();
		node = converttoJson(&obj, "GoodsFeedbackCommentStatusType", "");
	}
	else {
		
		GoodsFeedbackCommentStatusType obj = static_cast<GoodsFeedbackCommentStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GoodsFeedbackCommentDTO::getId()
{
	return id;
}

void
GoodsFeedbackCommentDTO::setId(long long  id)
{
	this->id = id;
}

std::string
GoodsFeedbackCommentDTO::getText()
{
	return text;
}

void
GoodsFeedbackCommentDTO::setText(std::string  text)
{
	this->text = text;
}

bool
GoodsFeedbackCommentDTO::getCanModify()
{
	return canModify;
}

void
GoodsFeedbackCommentDTO::setCanModify(bool  canModify)
{
	this->canModify = canModify;
}

long long
GoodsFeedbackCommentDTO::getParentId()
{
	return parentId;
}

void
GoodsFeedbackCommentDTO::setParentId(long long  parentId)
{
	this->parentId = parentId;
}

GoodsFeedbackCommentAuthorDTO
GoodsFeedbackCommentDTO::getAuthor()
{
	return author;
}

void
GoodsFeedbackCommentDTO::setAuthor(GoodsFeedbackCommentAuthorDTO  author)
{
	this->author = author;
}

GoodsFeedbackCommentStatusType
GoodsFeedbackCommentDTO::getStatus()
{
	return status;
}

void
GoodsFeedbackCommentDTO::setStatus(GoodsFeedbackCommentStatusType  status)
{
	this->status = status;
}


