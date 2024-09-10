
#include "EacVerificationResultDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_EacVerificationResultDTO_attemptsLeft_is_assigned_from_json()
{
    bourne::json input =
    {
        "attemptsLeft", 1
    };

    EacVerificationResultDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAttemptsLeft());








}




void test_EacVerificationResultDTO_attemptsLeft_is_converted_to_json()
{
    bourne::json input =
    {
        "attemptsLeft", 1
    };

    EacVerificationResultDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["attemptsLeft"] == output["attemptsLeft"]);




}


