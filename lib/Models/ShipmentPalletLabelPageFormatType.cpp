

#include "ShipmentPalletLabelPageFormatType.h"

using namespace Tiny;

ShipmentPalletLabelPageFormatType::ShipmentPalletLabelPageFormatType()
{
}

ShipmentPalletLabelPageFormatType::ShipmentPalletLabelPageFormatType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShipmentPalletLabelPageFormatType::~ShipmentPalletLabelPageFormatType()
{

}

void
ShipmentPalletLabelPageFormatType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ShipmentPalletLabelPageFormatType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



