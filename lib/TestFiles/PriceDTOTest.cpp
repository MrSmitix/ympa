
#include "PriceDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PriceDTO_value_is_assigned_from_json()
{








}


void test_PriceDTO_discountBase_is_assigned_from_json()
{








}



void test_PriceDTO_vat_is_assigned_from_json()
{
    bourne::json input =
    {
        "vat", 1
    };

    PriceDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVat());








}



void test_PriceDTO_value_is_converted_to_json()
{




}


void test_PriceDTO_discountBase_is_converted_to_json()
{




}



void test_PriceDTO_vat_is_converted_to_json()
{
    bourne::json input =
    {
        "vat", 1
    };

    PriceDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vat"] == output["vat"]);




}


