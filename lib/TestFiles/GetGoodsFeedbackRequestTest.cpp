
#include "GetGoodsFeedbackRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetGoodsFeedbackRequest_dateTimeFrom_is_assigned_from_json()
{








}


void test_GetGoodsFeedbackRequest_dateTimeTo_is_assigned_from_json()
{








}





void test_GetGoodsFeedbackRequest_paid_is_assigned_from_json()
{




    bourne::json input =
    {
        "paid", true
    };

    GetGoodsFeedbackRequest obj(input.dump());

    TEST_ASSERT(true == obj.isPaid());




}



void test_GetGoodsFeedbackRequest_dateTimeFrom_is_converted_to_json()
{




}


void test_GetGoodsFeedbackRequest_dateTimeTo_is_converted_to_json()
{




}





void test_GetGoodsFeedbackRequest_paid_is_converted_to_json()
{


    bourne::json input =
    {
        "paid", true
    };

    GetGoodsFeedbackRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["paid"] == output["paid"]);


}


