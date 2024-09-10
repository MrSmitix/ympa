
/*
 * FieldStateType.h
 *
 * Фильтр по заполненности или незаполненности поля:  * &#x60;SPECIFIED&#x60; — вывести товары, у которых поле заполнено. * &#x60;EMPTY&#x60; — вывести товары, у которых поле не заполнено. 
 */

#ifndef TINY_CPP_CLIENT_FieldStateType_H_
#define TINY_CPP_CLIENT_FieldStateType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено. 
 *
 *  \ingroup Models
 *
 */

class FieldStateType{
public:

    /*! \brief Constructor.
	 */
    FieldStateType();
    FieldStateType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FieldStateType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FieldStateType_H_ */
