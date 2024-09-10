
#include "GetPromoPromocodeInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetPromoPromocodeInfoDTO_promocode_is_assigned_from_json()
{


    bourne::json input =
    {
        "promocode", "hello"
    };

    GetPromoPromocodeInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromocode().c_str());






}


void test_GetPromoPromocodeInfoDTO_discount_is_assigned_from_json()
{
    bourne::json input =
    {
        "discount", 1
    };

    GetPromoPromocodeInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDiscount());








}



void test_GetPromoPromocodeInfoDTO_promocode_is_converted_to_json()
{

    bourne::json input =
    {
        "promocode", "hello"
    };

    GetPromoPromocodeInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promocode"] == output["promocode"]);



}


void test_GetPromoPromocodeInfoDTO_discount_is_converted_to_json()
{
    bourne::json input =
    {
        "discount", 1
    };

    GetPromoPromocodeInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["discount"] == output["discount"]);




}


