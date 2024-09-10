
/*
 * CreateChatResultDTO.h
 *
 * Информация о созданном чате.
 */

#ifndef TINY_CPP_CLIENT_CreateChatResultDTO_H_
#define TINY_CPP_CLIENT_CreateChatResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о созданном чате.
 *
 *  \ingroup Models
 *
 */

class CreateChatResultDTO{
public:

    /*! \brief Constructor.
	 */
    CreateChatResultDTO();
    CreateChatResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор чата.
	 */
	long getChatId();

	/*! \brief Set Идентификатор чата.
	 */
	void setChatId(long  chatId);


    private:
    long chatId{};
};
}

#endif /* TINY_CPP_CLIENT_CreateChatResultDTO_H_ */
