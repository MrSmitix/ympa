

#include "GoodsStatsWeightDimensionsDTO.h"

using namespace Tiny;

GoodsStatsWeightDimensionsDTO::GoodsStatsWeightDimensionsDTO()
{
	length = float(0);
	width = float(0);
	height = float(0);
	weight = float(0);
}

GoodsStatsWeightDimensionsDTO::GoodsStatsWeightDimensionsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsStatsWeightDimensionsDTO::~GoodsStatsWeightDimensionsDTO()
{

}

void
GoodsStatsWeightDimensionsDTO::fromJson(std::string jsonObj)
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
GoodsStatsWeightDimensionsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["length"] = getLength();






    object["width"] = getWidth();






    object["height"] = getHeight();






    object["weight"] = getWeight();



    return object;

}

long
GoodsStatsWeightDimensionsDTO::getLength()
{
	return length;
}

void
GoodsStatsWeightDimensionsDTO::setLength(long  length)
{
	this->length = length;
}

long
GoodsStatsWeightDimensionsDTO::getWidth()
{
	return width;
}

void
GoodsStatsWeightDimensionsDTO::setWidth(long  width)
{
	this->width = width;
}

long
GoodsStatsWeightDimensionsDTO::getHeight()
{
	return height;
}

void
GoodsStatsWeightDimensionsDTO::setHeight(long  height)
{
	this->height = height;
}

long
GoodsStatsWeightDimensionsDTO::getWeight()
{
	return weight;
}

void
GoodsStatsWeightDimensionsDTO::setWeight(long  weight)
{
	this->weight = weight;
}



