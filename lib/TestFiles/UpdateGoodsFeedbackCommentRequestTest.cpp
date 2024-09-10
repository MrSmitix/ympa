
#include "UpdateGoodsFeedbackCommentRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateGoodsFeedbackCommentRequest_feedbackId_is_assigned_from_json()
{






    bourne::json input =
    {
        "feedbackId", 1
    };

    UpdateGoodsFeedbackCommentRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFeedbackId());


}




void test_UpdateGoodsFeedbackCommentRequest_feedbackId_is_converted_to_json()
{



    bourne::json input =
    {
        "feedbackId", 1
    };

    UpdateGoodsFeedbackCommentRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feedbackId"] == output["feedbackId"]);

}



