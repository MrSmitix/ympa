

#include "CategoryErrorDTO.h"

using namespace Tiny;

CategoryErrorDTO::CategoryErrorDTO()
{
	categoryId = long(0);
	type = CategoryErrorType();
}

CategoryErrorDTO::CategoryErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CategoryErrorDTO::~CategoryErrorDTO()
{

}

void
CategoryErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *categoryIdKey = "categoryId";

    if(object.has_key(categoryIdKey))
    {
        bourne::json value = object[categoryIdKey];



        jsonToValue(&categoryId, value, "long");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        CategoryErrorType* obj = &type;
		obj->fromJson(value.dump());

    }


}

bourne::json
CategoryErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["categoryId"] = getCategoryId();







	object["type"] = getType().toJson();


    return object;

}

long
CategoryErrorDTO::getCategoryId()
{
	return categoryId;
}

void
CategoryErrorDTO::setCategoryId(long  categoryId)
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



