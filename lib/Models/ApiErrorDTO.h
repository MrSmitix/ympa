
/*
 * ApiErrorDTO.h
 *
 * Общий формат ошибки.
 */

#ifndef TINY_CPP_CLIENT_ApiErrorDTO_H_
#define TINY_CPP_CLIENT_ApiErrorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Общий формат ошибки.
 *
 *  \ingroup Models
 *
 */

class ApiErrorDTO{
public:

    /*! \brief Constructor.
	 */
    ApiErrorDTO();
    ApiErrorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApiErrorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Код ошибки.
	 */
	std::string getCode();

	/*! \brief Set Код ошибки.
	 */
	void setCode(std::string  code);
	/*! \brief Get Описание ошибки.
	 */
	std::string getMessage();

	/*! \brief Set Описание ошибки.
	 */
	void setMessage(std::string  message);


    private:
    std::string code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_ApiErrorDTO_H_ */
