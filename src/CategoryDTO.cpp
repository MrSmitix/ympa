#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CategoryDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CategoryDTO::CategoryDTO()
{
	//__init();
}

CategoryDTO::~CategoryDTO()
{
	//__cleanup();
}

void
CategoryDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//new std::list()std::list> children;
}

void
CategoryDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(children != NULL) {
	//children.RemoveAll(true);
	//delete children;
	//children = NULL;
	//}
	//
}

void
CategoryDTO::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *childrenKey = "children";
	node = json_object_get_member(pJsonObject, childrenKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CategoryDTO> new_list;
			CategoryDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CategoryDTO")) {
					jsonToValue(&inst, temp_json, "CategoryDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			children = new_list;
		}
		
	}
}

CategoryDTO::CategoryDTO(char* json)
{
	this->fromJson(json);
}

char*
CategoryDTO::toJson()
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("CategoryDTO")) {
		list<CategoryDTO> new_list = static_cast<list <CategoryDTO> > (getChildren());
		node = converttoJson(&new_list, "CategoryDTO", "array");
	} else {
		node = json_node_alloc();
		list<CategoryDTO> new_list = static_cast<list <CategoryDTO> > (getChildren());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CategoryDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CategoryDTO obj = *it;
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
CategoryDTO::getId()
{
	return id;
}

void
CategoryDTO::setId(long long  id)
{
	this->id = id;
}

std::string
CategoryDTO::getName()
{
	return name;
}

void
CategoryDTO::setName(std::string  name)
{
	this->name = name;
}

std::list<CategoryDTO>
CategoryDTO::getChildren()
{
	return children;
}

void
CategoryDTO::setChildren(std::list <CategoryDTO> children)
{
	this->children = children;
}


