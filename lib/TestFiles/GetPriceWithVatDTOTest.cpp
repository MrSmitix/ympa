
#include "GetPriceWithVatDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetPriceWithVatDTO_value_is_assigned_from_json()
{








}


void test_GetPriceWithVatDTO_discountBase_is_assigned_from_json()
{








}



void test_GetPriceWithVatDTO_vat_is_assigned_from_json()
{
    bourne::json input =
    {
        "vat", 1
    };

    GetPriceWithVatDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVat());








}


void test_GetPriceWithVatDTO_updatedAt_is_assigned_from_json()
{








}



void test_GetPriceWithVatDTO_value_is_converted_to_json()
{




}


void test_GetPriceWithVatDTO_discountBase_is_converted_to_json()
{




}



void test_GetPriceWithVatDTO_vat_is_converted_to_json()
{
    bourne::json input =
    {
        "vat", 1
    };

    GetPriceWithVatDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vat"] == output["vat"]);




}


void test_GetPriceWithVatDTO_updatedAt_is_converted_to_json()
{




}


