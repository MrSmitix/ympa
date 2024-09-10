
#include "CreateChatResultDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateChatResultDTO_chatId_is_assigned_from_json()
{






    bourne::json input =
    {
        "chatId", 1
    };

    CreateChatResultDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getChatId());


}



void test_CreateChatResultDTO_chatId_is_converted_to_json()
{



    bourne::json input =
    {
        "chatId", 1
    };

    CreateChatResultDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["chatId"] == output["chatId"]);

}


