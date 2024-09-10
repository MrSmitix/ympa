

#include "RegionDTO.h"

using namespace Tiny;

RegionDTO::RegionDTO()
{
	id = long(0);
	name = std::string();
	type = RegionType();
	parent = RegionDTO();
	children = std::list<RegionDTO>();
}

RegionDTO::RegionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

RegionDTO::~RegionDTO()
{

}

void
RegionDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        RegionType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *parentKey = "parent";

    if(object.has_key(parentKey))
    {
        bourne::json value = object[parentKey];




        RegionDTO* obj = &parent;
		obj->fromJson(value.dump());

    }

    const char *childrenKey = "children";

    if(object.has_key(childrenKey))
    {
        bourne::json value = object[childrenKey];


        std::list<RegionDTO> children_list;
        RegionDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            children_list.push_back(element);
        }
        children = children_list;


    }


}

bourne::json
RegionDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["type"] = getType().toJson();






	object["parent"] = getParent().toJson();




    std::list<RegionDTO> children_list = getChildren();
    bourne::json children_arr = bourne::json::array();

    for(auto& var : children_list)
    {
        RegionDTO obj = var;
        children_arr.append(obj.toJson());
    }
    object["children"] = children_arr;




    return object;

}

long
RegionDTO::getId()
{
	return id;
}

void
RegionDTO::setId(long  id)
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



