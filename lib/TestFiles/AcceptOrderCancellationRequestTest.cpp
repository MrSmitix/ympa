
#include "AcceptOrderCancellationRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AcceptOrderCancellationRequest_accepted_is_assigned_from_json()
{




    bourne::json input =
    {
        "accepted", true
    };

    AcceptOrderCancellationRequest obj(input.dump());

    TEST_ASSERT(true == obj.isAccepted());




}




void test_AcceptOrderCancellationRequest_accepted_is_converted_to_json()
{


    bourne::json input =
    {
        "accepted", true
    };

    AcceptOrderCancellationRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accepted"] == output["accepted"]);


}



