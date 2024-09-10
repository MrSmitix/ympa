#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CategoryErrorDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CategoryErrorDTO::CategoryErrorDTO()
{
	//__init();
}

CategoryErrorDTO::~CategoryErrorDTO()
{
	//__cleanup();
}

void
CategoryErrorDTO::__init()
{
	//categoryId = long(0);
	//type = new CategoryErrorType();
}

void
CategoryErrorDTO::__cleanup()
{
	//if(categoryId != NULL) {
	//
	//delete categoryId;
	//categoryId = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
CategoryErrorDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *categoryIdKey = "categoryId";
	node = json_object_get_member(pJsonObject, categoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&categoryId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CategoryErrorType")) {
			jsonToValue(&type, node, "CategoryErrorType", "CategoryErrorType");
		} else {
			
			CategoryErrorType* obj = static_cast<CategoryErrorType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CategoryErrorDTO::CategoryErrorDTO(char* json)
{
	this->fromJson(json);
}

char*
CategoryErrorDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCategoryId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *categoryIdKey = "categoryId";
	json_object_set_member(pJsonObject, categoryIdKey, node);
	if (isprimitive("CategoryErrorType")) {
		CategoryErrorType obj = getType();
		node = converttoJson(&obj, "CategoryErrorType", "");
	}
	else {
		
		CategoryErrorType obj = static_cast<CategoryErrorType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CategoryErrorDTO::getCategoryId()
{
	return categoryId;
}

void
CategoryErrorDTO::setCategoryId(long long  categoryId)
{
	this->categoryId = categoryId;
}

CategoryErrorType
CategoryErrorDTO::getType()
{
	return type;
}

void
CategoryErrorDTO::setType(CategoryErrorType  type)
{
	this->type = type;
}


