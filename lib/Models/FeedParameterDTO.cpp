

#include "FeedParameterDTO.h"

using namespace Tiny;

FeedParameterDTO::FeedParameterDTO()
{
	deleted = bool(false);
	name = std::string();
	values = std::list<int>();
}

FeedParameterDTO::FeedParameterDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedParameterDTO::~FeedParameterDTO()
{

}

void
FeedParameterDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deletedKey = "deleted";

    if(object.has_key(deletedKey))
    {
        bourne::json value = object[deletedKey];



        jsonToValue(&deleted, value, "bool");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<int> values_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
FeedParameterDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["deleted"] = isDeleted();






    object["name"] = getName();





    std::list<int> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        values_arr.append(var);
    }
    object["values"] = values_arr;






    return object;

}

bool
FeedParameterDTO::isDeleted()
{
	return deleted;
}

void
FeedParameterDTO::setDeleted(bool  deleted)
{
	this->deleted = deleted;
}

std::string
FeedParameterDTO::getName()
{
	return name;
}

void
FeedParameterDTO::setName(std::string  name)
{
	this->name = name;
}

std::list<int>
FeedParameterDTO::getValues()
{
	return values;
}

void
FeedParameterDTO::setValues(std::list <int> values)
{
	this->values = values;
}



