
/*
 * BusinessDTO.h
 *
 * Информация о кабинете.
 */

#ifndef TINY_CPP_CLIENT_BusinessDTO_H_
#define TINY_CPP_CLIENT_BusinessDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о кабинете.
 *
 *  \ingroup Models
 *
 */

class BusinessDTO{
public:

    /*! \brief Constructor.
	 */
    BusinessDTO();
    BusinessDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор кабинета.
	 */
	long getId();

	/*! \brief Set Идентификатор кабинета.
	 */
	void setId(long  id);
	/*! \brief Get Название бизнеса.
	 */
	std::string getName();

	/*! \brief Set Название бизнеса.
	 */
	void setName(std::string  name);


    private:
    long id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_BusinessDTO_H_ */
