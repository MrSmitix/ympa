

#include "OfferWeightDimensionsDTO.h"

using namespace Tiny;

OfferWeightDimensionsDTO::OfferWeightDimensionsDTO()
{
	length = float(0);
	width = float(0);
	height = float(0);
	weight = float(0);
}

OfferWeightDimensionsDTO::OfferWeightDimensionsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferWeightDimensionsDTO::~OfferWeightDimensionsDTO()
{

}

void
OfferWeightDimensionsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *lengthKey = "length";

    if(object.has_key(lengthKey))
    {
        bourne::json value = object[lengthKey];



        jsonToValue(&length, value, "long");


    }

    const char *widthKey = "width";

    if(object.has_key(widthKey))
    {
        bourne::json value = object[widthKey];



        jsonToValue(&width, value, "long");


    }

    const char *heightKey = "height";

    if(object.has_key(heightKey))
    {
        bourne::json value = object[heightKey];



        jsonToValue(&height, value, "long");


    }

    const char *weightKey = "weight";

    if(object.has_key(weightKey))
    {
        bourne::json value = object[weightKey];



        jsonToValue(&weight, value, "long");


    }


}

bourne::json
OfferWeightDimensionsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["length"] = getLength();






    object["width"] = getWidth();






    object["height"] = getHeight();






    object["weight"] = getWeight();



    return object;

}

long
OfferWeightDimensionsDTO::getLength()
{
	return length;
}

void
OfferWeightDimensionsDTO::setLength(long  length)
{
	this->length = length;
}

long
OfferWeightDimensionsDTO::getWidth()
{
	return width;
}

void
OfferWeightDimensionsDTO::setWidth(long  width)
{
	this->width = width;
}

long
OfferWeightDimensionsDTO::getHeight()
{
	return height;
}

void
OfferWeightDimensionsDTO::setHeight(long  height)
{
	this->height = height;
}

long
OfferWeightDimensionsDTO::getWeight()
{
	return weight;
}

void
OfferWeightDimensionsDTO::setWeight(long  weight)
{
	this->weight = weight;
}



