

#include "MechanicsType.h"

using namespace Tiny;

MechanicsType::MechanicsType()
{
}

MechanicsType::MechanicsType(std::string jsonString)
{
	this->fromJson(jsonString);
}

MechanicsType::~MechanicsType()
{

}

void
MechanicsType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MechanicsType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



