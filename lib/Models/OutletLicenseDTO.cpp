

#include "OutletLicenseDTO.h"

using namespace Tiny;

OutletLicenseDTO::OutletLicenseDTO()
{
	id = long(0);
	outletId = long(0);
	licenseType = LicenseType();
	number = std::string();
	dateOfIssue = std::string();
	dateOfExpiry = std::string();
}

OutletLicenseDTO::OutletLicenseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletLicenseDTO::~OutletLicenseDTO()
{

}

void
OutletLicenseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *outletIdKey = "outletId";

    if(object.has_key(outletIdKey))
    {
        bourne::json value = object[outletIdKey];



        jsonToValue(&outletId, value, "long");


    }

    const char *licenseTypeKey = "licenseType";

    if(object.has_key(licenseTypeKey))
    {
        bourne::json value = object[licenseTypeKey];




        LicenseType* obj = &licenseType;
		obj->fromJson(value.dump());

    }

    const char *numberKey = "number";

    if(object.has_key(numberKey))
    {
        bourne::json value = object[numberKey];



        jsonToValue(&number, value, "std::string");


    }

    const char *dateOfIssueKey = "dateOfIssue";

    if(object.has_key(dateOfIssueKey))
    {
        bourne::json value = object[dateOfIssueKey];



        jsonToValue(&dateOfIssue, value, "std::string");


    }

    const char *dateOfExpiryKey = "dateOfExpiry";

    if(object.has_key(dateOfExpiryKey))
    {
        bourne::json value = object[dateOfExpiryKey];



        jsonToValue(&dateOfExpiry, value, "std::string");


    }


}

bourne::json
OutletLicenseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["outletId"] = getOutletId();







	object["licenseType"] = getLicenseType().toJson();





    object["number"] = getNumber();






    object["dateOfIssue"] = getDateOfIssue();






    object["dateOfExpiry"] = getDateOfExpiry();



    return object;

}

long
OutletLicenseDTO::getId()
{
	return id;
}

void
OutletLicenseDTO::setId(long  id)
{
	this->id = id;
}

long
OutletLicenseDTO::getOutletId()
{
	return outletId;
}

void
OutletLicenseDTO::setOutletId(long  outletId)
{
	this->outletId = outletId;
}

LicenseType
OutletLicenseDTO::getLicenseType()
{
	return licenseType;
}

void
OutletLicenseDTO::setLicenseType(LicenseType  licenseType)
{
	this->licenseType = licenseType;
}

std::string
OutletLicenseDTO::getNumber()
{
	return number;
}

void
OutletLicenseDTO::setNumber(std::string  number)
{
	this->number = number;
}

std::string
OutletLicenseDTO::getDateOfIssue()
{
	return dateOfIssue;
}

void
OutletLicenseDTO::setDateOfIssue(std::string  dateOfIssue)
{
	this->dateOfIssue = dateOfIssue;
}

std::string
OutletLicenseDTO::getDateOfExpiry()
{
	return dateOfExpiry;
}

void
OutletLicenseDTO::setDateOfExpiry(std::string  dateOfExpiry)
{
	this->dateOfExpiry = dateOfExpiry;
}



