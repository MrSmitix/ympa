
#include "CalculateTariffsOfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CalculateTariffsOfferDTO_categoryId_is_assigned_from_json()
{






    bourne::json input =
    {
        "categoryId", 1
    };

    CalculateTariffsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCategoryId());


}


void test_CalculateTariffsOfferDTO_price_is_assigned_from_json()
{








}


void test_CalculateTariffsOfferDTO_length_is_assigned_from_json()
{








}


void test_CalculateTariffsOfferDTO_width_is_assigned_from_json()
{








}


void test_CalculateTariffsOfferDTO_height_is_assigned_from_json()
{








}


void test_CalculateTariffsOfferDTO_weight_is_assigned_from_json()
{








}


void test_CalculateTariffsOfferDTO_quantity_is_assigned_from_json()
{
    bourne::json input =
    {
        "quantity", 1
    };

    CalculateTariffsOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getQuantity());








}



void test_CalculateTariffsOfferDTO_categoryId_is_converted_to_json()
{



    bourne::json input =
    {
        "categoryId", 1
    };

    CalculateTariffsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["categoryId"] == output["categoryId"]);

}


void test_CalculateTariffsOfferDTO_price_is_converted_to_json()
{




}


void test_CalculateTariffsOfferDTO_length_is_converted_to_json()
{




}


void test_CalculateTariffsOfferDTO_width_is_converted_to_json()
{




}


void test_CalculateTariffsOfferDTO_height_is_converted_to_json()
{




}


void test_CalculateTariffsOfferDTO_weight_is_converted_to_json()
{




}


void test_CalculateTariffsOfferDTO_quantity_is_converted_to_json()
{
    bourne::json input =
    {
        "quantity", 1
    };

    CalculateTariffsOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["quantity"] == output["quantity"]);




}


