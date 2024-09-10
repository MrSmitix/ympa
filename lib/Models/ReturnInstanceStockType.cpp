

#include "ReturnInstanceStockType.h"

using namespace Tiny;

ReturnInstanceStockType::ReturnInstanceStockType()
{
}

ReturnInstanceStockType::ReturnInstanceStockType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnInstanceStockType::~ReturnInstanceStockType()
{

}

void
ReturnInstanceStockType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReturnInstanceStockType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



