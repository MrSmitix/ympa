

#include "ModelPriceDTO.h"

using namespace Tiny;

ModelPriceDTO::ModelPriceDTO()
{
	avg = float(0);
	max = float(0);
	min = float(0);
}

ModelPriceDTO::ModelPriceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModelPriceDTO::~ModelPriceDTO()
{

}

void
ModelPriceDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *avgKey = "avg";

    if(object.has_key(avgKey))
    {
        bourne::json value = object[avgKey];



        jsonToValue(&avg, value, "long");


    }

    const char *maxKey = "max";

    if(object.has_key(maxKey))
    {
        bourne::json value = object[maxKey];



        jsonToValue(&max, value, "long");


    }

    const char *minKey = "min";

    if(object.has_key(minKey))
    {
        bourne::json value = object[minKey];



        jsonToValue(&min, value, "long");


    }


}

bourne::json
ModelPriceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["avg"] = getAvg();






    object["max"] = getMax();






    object["min"] = getMin();



    return object;

}

long
ModelPriceDTO::getAvg()
{
	return avg;
}

void
ModelPriceDTO::setAvg(long  avg)
{
	this->avg = avg;
}

long
ModelPriceDTO::getMax()
{
	return max;
}

void
ModelPriceDTO::setMax(long  max)
{
	this->max = max;
}

long
ModelPriceDTO::getMin()
{
	return min;
}

void
ModelPriceDTO::setMin(long  min)
{
	this->min = min;
}



