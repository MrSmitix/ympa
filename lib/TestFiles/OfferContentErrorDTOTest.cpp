
#include "OfferContentErrorDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_OfferContentErrorDTO_parameterId_is_assigned_from_json()
{






    bourne::json input =
    {
        "parameterId", 1
    };

    OfferContentErrorDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getParameterId());


}


void test_OfferContentErrorDTO_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    OfferContentErrorDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}




void test_OfferContentErrorDTO_parameterId_is_converted_to_json()
{



    bourne::json input =
    {
        "parameterId", 1
    };

    OfferContentErrorDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parameterId"] == output["parameterId"]);

}


void test_OfferContentErrorDTO_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    OfferContentErrorDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


