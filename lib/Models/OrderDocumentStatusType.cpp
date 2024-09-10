

#include "OrderDocumentStatusType.h"

using namespace Tiny;

OrderDocumentStatusType::OrderDocumentStatusType()
{
}

OrderDocumentStatusType::OrderDocumentStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDocumentStatusType::~OrderDocumentStatusType()
{

}

void
OrderDocumentStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderDocumentStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



