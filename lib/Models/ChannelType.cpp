

#include "ChannelType.h"

using namespace Tiny;

ChannelType::ChannelType()
{
}

ChannelType::ChannelType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChannelType::~ChannelType()
{

}

void
ChannelType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChannelType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



