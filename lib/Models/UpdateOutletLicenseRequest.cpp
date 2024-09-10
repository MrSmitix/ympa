

#include "UpdateOutletLicenseRequest.h"

using namespace Tiny;

UpdateOutletLicenseRequest::UpdateOutletLicenseRequest()
{
	licenses = std::list<OutletLicenseDTO>();
}

UpdateOutletLicenseRequest::UpdateOutletLicenseRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOutletLicenseRequest::~UpdateOutletLicenseRequest()
{

}

void
UpdateOutletLicenseRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *licensesKey = "licenses";

    if(object.has_key(licensesKey))
    {
        bourne::json value = object[licensesKey];


        std::list<OutletLicenseDTO> licenses_list;
        OutletLicenseDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            licenses_list.push_back(element);
        }
        licenses = licenses_list;


    }


}

bourne::json
UpdateOutletLicenseRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OutletLicenseDTO> licenses_list = getLicenses();
    bourne::json licenses_arr = bourne::json::array();

    for(auto& var : licenses_list)
    {
        OutletLicenseDTO obj = var;
        licenses_arr.append(obj.toJson());
    }
    object["licenses"] = licenses_arr;




    return object;

}

std::list<OutletLicenseDTO>
UpdateOutletLicenseRequest::getLicenses()
{
	return licenses;
}

void
UpdateOutletLicenseRequest::setLicenses(std::list <OutletLicenseDTO> licenses)
{
	this->licenses = licenses;
}



