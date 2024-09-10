
#include "OutletLicenseDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OutletLicenseDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    OutletLicenseDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_OutletLicenseDTO_outletId_is_assigned_from_json()
{






    bourne::json input =
    {
        "outletId", 1
    };

    OutletLicenseDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutletId());


}



void test_OutletLicenseDTO_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "number", "hello"
    };

    OutletLicenseDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNumber().c_str());






}


void test_OutletLicenseDTO_dateOfIssue_is_assigned_from_json()
{








}


void test_OutletLicenseDTO_dateOfExpiry_is_assigned_from_json()
{








}



void test_OutletLicenseDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    OutletLicenseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_OutletLicenseDTO_outletId_is_converted_to_json()
{



    bourne::json input =
    {
        "outletId", 1
    };

    OutletLicenseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["outletId"] == output["outletId"]);

}



void test_OutletLicenseDTO_number_is_converted_to_json()
{

    bourne::json input =
    {
        "number", "hello"
    };

    OutletLicenseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["number"] == output["number"]);



}


void test_OutletLicenseDTO_dateOfIssue_is_converted_to_json()
{




}


void test_OutletLicenseDTO_dateOfExpiry_is_converted_to_json()
{




}


