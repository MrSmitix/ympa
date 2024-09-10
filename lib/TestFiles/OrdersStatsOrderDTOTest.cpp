
#include "OrdersStatsOrderDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrdersStatsOrderDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    OrdersStatsOrderDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}



void test_OrdersStatsOrderDTO_statusUpdateDate_is_assigned_from_json()
{








}



void test_OrdersStatsOrderDTO_partnerOrderId_is_assigned_from_json()
{


    bourne::json input =
    {
        "partnerOrderId", "hello"
    };

    OrdersStatsOrderDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerOrderId().c_str());






}



void test_OrdersStatsOrderDTO_fake_is_assigned_from_json()
{




    bourne::json input =
    {
        "fake", true
    };

    OrdersStatsOrderDTO obj(input.dump());

    TEST_ASSERT(true == obj.isFake());




}








void test_OrdersStatsOrderDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    OrdersStatsOrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}



void test_OrdersStatsOrderDTO_statusUpdateDate_is_converted_to_json()
{




}



void test_OrdersStatsOrderDTO_partnerOrderId_is_converted_to_json()
{

    bourne::json input =
    {
        "partnerOrderId", "hello"
    };

    OrdersStatsOrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partnerOrderId"] == output["partnerOrderId"]);



}



void test_OrdersStatsOrderDTO_fake_is_converted_to_json()
{


    bourne::json input =
    {
        "fake", true
    };

    OrdersStatsOrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fake"] == output["fake"]);


}







