#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RegionDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RegionDTO::RegionDTO()
{
	//__init();
}

RegionDTO::~RegionDTO()
{
	//__cleanup();
}

void
RegionDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//type = new RegionType();
	//parent = new RegionDTO();
	//new std::list()std::list> children;
}

void
RegionDTO::__cleanup()
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
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(parent != NULL) {
	//
	//delete parent;
	//parent = NULL;
	//}
	//if(children != NULL) {
	//children.RemoveAll(true);
	//delete children;
	//children = NULL;
	//}
	//
}

void
RegionDTO::fromJson(char* jsonStr)
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
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionType")) {
			jsonToValue(&type, node, "RegionType", "RegionType");
		} else {
			
			RegionType* obj = static_cast<RegionType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parentKey = "parent";
	node = json_object_get_member(pJsonObject, parentKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionDTO")) {
			jsonToValue(&parent, node, "RegionDTO", "RegionDTO");
		} else {
			
			RegionDTO* obj = static_cast<RegionDTO*> (&parent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *childrenKey = "children";
	node = json_object_get_member(pJsonObject, childrenKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RegionDTO> new_list;
			RegionDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RegionDTO")) {
					jsonToValue(&inst, temp_json, "RegionDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			children = new_list;
		}
		
	}
}

RegionDTO::RegionDTO(char* json)
{
	this->fromJson(json);
}

char*
RegionDTO::toJson()
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
	if (isprimitive("RegionType")) {
		RegionType obj = getType();
		node = converttoJson(&obj, "RegionType", "");
	}
	else {
		
		RegionType obj = static_cast<RegionType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("RegionDTO")) {
		RegionDTO obj = getParent();
		node = converttoJson(&obj, "RegionDTO", "");
	}
	else {
		
		RegionDTO obj = static_cast<RegionDTO> (getParent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parentKey = "parent";
	json_object_set_member(pJsonObject, parentKey, node);
	if (isprimitive("RegionDTO")) {
		list<RegionDTO> new_list = static_cast<list <RegionDTO> > (getChildren());
		node = converttoJson(&new_list, "RegionDTO", "array");
	} else {
		node = json_node_alloc();
		list<RegionDTO> new_list = static_cast<list <RegionDTO> > (getChildren());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RegionDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RegionDTO obj = *it;
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
RegionDTO::getId()
{
	return id;
}

void
RegionDTO::setId(long long  id)
{
	this->id = id;
}

std::string
RegionDTO::getName()
{
	return name;
}

void
RegionDTO::setName(std::string  name)
{
	this->name = name;
}

RegionType
RegionDTO::getType()
{
	return type;
}

void
RegionDTO::setType(RegionType  type)
{
	this->type = type;
}

RegionDTO
RegionDTO::getParent()
{
	return parent;
}

void
RegionDTO::setParent(RegionDTO  parent)
{
	this->parent = parent;
}

std::list<RegionDTO>
RegionDTO::getChildren()
{
	return children;
}

void
RegionDTO::setChildren(std::list <RegionDTO> children)
{
	this->children = children;
}


