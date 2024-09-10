#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedbackCommentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedbackCommentDTO::FeedbackCommentDTO()
{
	//__init();
}

FeedbackCommentDTO::~FeedbackCommentDTO()
{
	//__cleanup();
}

void
FeedbackCommentDTO::__init()
{
	//id = long(0);
	//parentId = long(0);
	//body = std::string();
	//createdAt = null;
	//updatedAt = null;
	//author = new FeedbackCommentAuthorDTO();
	//new std::list()std::list> children;
}

void
FeedbackCommentDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(parentId != NULL) {
	//
	//delete parentId;
	//parentId = NULL;
	//}
	//if(body != NULL) {
	//
	//delete body;
	//body = NULL;
	//}
	//if(createdAt != NULL) {
	//
	//delete createdAt;
	//createdAt = NULL;
	//}
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//if(author != NULL) {
	//
	//delete author;
	//author = NULL;
	//}
	//if(children != NULL) {
	//children.RemoveAll(true);
	//delete children;
	//children = NULL;
	//}
	//
}

void
FeedbackCommentDTO::fromJson(char* jsonStr)
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
	const gchar *parentIdKey = "parentId";
	node = json_object_get_member(pJsonObject, parentIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&parentId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *bodyKey = "body";
	node = json_object_get_member(pJsonObject, bodyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&body, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *createdAtKey = "createdAt";
	node = json_object_get_member(pJsonObject, createdAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&createdAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updatedAtKey = "updatedAt";
	node = json_object_get_member(pJsonObject, updatedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updatedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *authorKey = "author";
	node = json_object_get_member(pJsonObject, authorKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedbackCommentAuthorDTO")) {
			jsonToValue(&author, node, "FeedbackCommentAuthorDTO", "FeedbackCommentAuthorDTO");
		} else {
			
			FeedbackCommentAuthorDTO* obj = static_cast<FeedbackCommentAuthorDTO*> (&author);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *childrenKey = "children";
	node = json_object_get_member(pJsonObject, childrenKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FeedbackCommentDTO> new_list;
			FeedbackCommentDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FeedbackCommentDTO")) {
					jsonToValue(&inst, temp_json, "FeedbackCommentDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			children = new_list;
		}
		
	}
}

FeedbackCommentDTO::FeedbackCommentDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedbackCommentDTO::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getParentId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *parentIdKey = "parentId";
	json_object_set_member(pJsonObject, parentIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBody();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bodyKey = "body";
	json_object_set_member(pJsonObject, bodyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *createdAtKey = "createdAt";
	json_object_set_member(pJsonObject, createdAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updatedAtKey = "updatedAt";
	json_object_set_member(pJsonObject, updatedAtKey, node);
	if (isprimitive("FeedbackCommentAuthorDTO")) {
		FeedbackCommentAuthorDTO obj = getAuthor();
		node = converttoJson(&obj, "FeedbackCommentAuthorDTO", "");
	}
	else {
		
		FeedbackCommentAuthorDTO obj = static_cast<FeedbackCommentAuthorDTO> (getAuthor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authorKey = "author";
	json_object_set_member(pJsonObject, authorKey, node);
	if (isprimitive("FeedbackCommentDTO")) {
		list<FeedbackCommentDTO> new_list = static_cast<list <FeedbackCommentDTO> > (getChildren());
		node = converttoJson(&new_list, "FeedbackCommentDTO", "array");
	} else {
		node = json_node_alloc();
		list<FeedbackCommentDTO> new_list = static_cast<list <FeedbackCommentDTO> > (getChildren());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FeedbackCommentDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FeedbackCommentDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *childrenKey = "children";
	json_object_set_member(pJsonObject, childrenKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FeedbackCommentDTO::getId()
{
	return id;
}

void
FeedbackCommentDTO::setId(long long  id)
{
	this->id = id;
}

long long
FeedbackCommentDTO::getParentId()
{
	return parentId;
}

void
FeedbackCommentDTO::setParentId(long long  parentId)
{
	this->parentId = parentId;
}

std::string
FeedbackCommentDTO::getBody()
{
	return body;
}

void
FeedbackCommentDTO::setBody(std::string  body)
{
	this->body = body;
}

std::string
FeedbackCommentDTO::getCreatedAt()
{
	return createdAt;
}

void
FeedbackCommentDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

std::string
FeedbackCommentDTO::getUpdatedAt()
{
	return updatedAt;
}

void
FeedbackCommentDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}

FeedbackCommentAuthorDTO
FeedbackCommentDTO::getAuthor()
{
	return author;
}

void
FeedbackCommentDTO::setAuthor(FeedbackCommentAuthorDTO  author)
{
	this->author = author;
}

std::list<FeedbackCommentDTO>
FeedbackCommentDTO::getChildren()
{
	return children;
}

void
FeedbackCommentDTO::setChildren(std::list <FeedbackCommentDTO> children)
{
	this->children = children;
}


