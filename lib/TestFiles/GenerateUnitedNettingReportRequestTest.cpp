
#include "GenerateUnitedNettingReportRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenerateUnitedNettingReportRequest_businessId_is_assigned_from_json()
{






    bourne::json input =
    {
        "businessId", 1
    };

    GenerateUnitedNettingReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBusinessId());


}


void test_GenerateUnitedNettingReportRequest_dateTimeFrom_is_assigned_from_json()
{








}


void test_GenerateUnitedNettingReportRequest_dateTimeTo_is_assigned_from_json()
{








}




void test_GenerateUnitedNettingReportRequest_bankOrderId_is_assigned_from_json()
{






    bourne::json input =
    {
        "bankOrderId", 1
    };

    GenerateUnitedNettingReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBankOrderId());


}


void test_GenerateUnitedNettingReportRequest_bankOrderDateTime_is_assigned_from_json()
{








}






void test_GenerateUnitedNettingReportRequest_businessId_is_converted_to_json()
{



    bourne::json input =
    {
        "businessId", 1
    };

    GenerateUnitedNettingReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["businessId"] == output["businessId"]);

}


void test_GenerateUnitedNettingReportRequest_dateTimeFrom_is_converted_to_json()
{




}


void test_GenerateUnitedNettingReportRequest_dateTimeTo_is_converted_to_json()
{




}




void test_GenerateUnitedNettingReportRequest_bankOrderId_is_converted_to_json()
{



    bourne::json input =
    {
        "bankOrderId", 1
    };

    GenerateUnitedNettingReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bankOrderId"] == output["bankOrderId"]);

}


void test_GenerateUnitedNettingReportRequest_bankOrderDateTime_is_converted_to_json()
{




}





