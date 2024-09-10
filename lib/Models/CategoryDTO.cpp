

#include "CategoryDTO.h"

using namespace Tiny;

CategoryDTO::CategoryDTO()
{
	id = long(0);
	name = std::string();
	children = std::list<CategoryDTO>();
}

CategoryDTO::CategoryDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CategoryDTO::~CategoryDTO()
{

}

void
CategoryDTO::fromJson(std::string jsonObj)
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

    const char *childrenKey = "children";

    if(object.has_key(childrenKey))
    {
        bourne::json value = object[childrenKey];


        std::list<CategoryDTO> children_list;
        CategoryDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            children_list.push_back(element);
        }
        children = children_list;


    }


}

bourne::json
CategoryDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<CategoryDTO> children_list = getChildren();
    bourne::json children_arr = bourne::json::array();

    for(auto& var : children_list)
    {
        CategoryDTO obj = var;
        children_arr.append(obj.toJson());
    }
    object["children"] = children_arr;




    return object;

}

long
CategoryDTO::getId()
{
	return id;
}

void
CategoryDTO::setId(long  id)
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



