
#include "ReturnDecisionDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ReturnDecisionDTO_returnItemId_is_assigned_from_json()
{






    bourne::json input =
    {
        "returnItemId", 1
    };

    ReturnDecisionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getReturnItemId());


}


void test_ReturnDecisionDTO_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "count", 1
    };

    ReturnDecisionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());








}


void test_ReturnDecisionDTO_comment_is_assigned_from_json()
{


    bourne::json input =
    {
        "comment", "hello"
    };

    ReturnDecisionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getComment().c_str());






}





void test_ReturnDecisionDTO_refundAmount_is_assigned_from_json()
{






    bourne::json input =
    {
        "refundAmount", 1
    };

    ReturnDecisionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRefundAmount());


}


void test_ReturnDecisionDTO_partnerCompensation_is_assigned_from_json()
{






    bourne::json input =
    {
        "partnerCompensation", 1
    };

    ReturnDecisionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPartnerCompensation());


}




void test_ReturnDecisionDTO_returnItemId_is_converted_to_json()
{



    bourne::json input =
    {
        "returnItemId", 1
    };

    ReturnDecisionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["returnItemId"] == output["returnItemId"]);

}


void test_ReturnDecisionDTO_count_is_converted_to_json()
{
    bourne::json input =
    {
        "count", 1
    };

    ReturnDecisionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);




}


void test_ReturnDecisionDTO_comment_is_converted_to_json()
{

    bourne::json input =
    {
        "comment", "hello"
    };

    ReturnDecisionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["comment"] == output["comment"]);



}





void test_ReturnDecisionDTO_refundAmount_is_converted_to_json()
{



    bourne::json input =
    {
        "refundAmount", 1
    };

    ReturnDecisionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refundAmount"] == output["refundAmount"]);

}


void test_ReturnDecisionDTO_partnerCompensation_is_converted_to_json()
{



    bourne::json input =
    {
        "partnerCompensation", 1
    };

    ReturnDecisionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partnerCompensation"] == output["partnerCompensation"]);

}



