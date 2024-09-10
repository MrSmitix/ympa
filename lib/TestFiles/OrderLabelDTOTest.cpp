
#include "OrderLabelDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderLabelDTO_orderId_is_assigned_from_json()
{






    bourne::json input =
    {
        "orderId", 1
    };

    OrderLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrderId());


}


void test_OrderLabelDTO_placesNumber_is_assigned_from_json()
{
    bourne::json input =
    {
        "placesNumber", 1
    };

    OrderLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPlacesNumber());








}


void test_OrderLabelDTO_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    OrderLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}




void test_OrderLabelDTO_orderId_is_converted_to_json()
{



    bourne::json input =
    {
        "orderId", 1
    };

    OrderLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["orderId"] == output["orderId"]);

}


void test_OrderLabelDTO_placesNumber_is_converted_to_json()
{
    bourne::json input =
    {
        "placesNumber", 1
    };

    OrderLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["placesNumber"] == output["placesNumber"]);




}


void test_OrderLabelDTO_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    OrderLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}



