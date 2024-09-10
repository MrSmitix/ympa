
#include "UpdateOrderStatusDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateOrderStatusDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    UpdateOrderStatusDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}





void test_UpdateOrderStatusDTO_errorDetails_is_assigned_from_json()
{


    bourne::json input =
    {
        "errorDetails", "hello"
    };

    UpdateOrderStatusDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getErrorDetails().c_str());






}



void test_UpdateOrderStatusDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    UpdateOrderStatusDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}





void test_UpdateOrderStatusDTO_errorDetails_is_converted_to_json()
{

    bourne::json input =
    {
        "errorDetails", "hello"
    };

    UpdateOrderStatusDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["errorDetails"] == output["errorDetails"]);



}


