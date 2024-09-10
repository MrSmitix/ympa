
/*
 * ShowsSalesGroupingType.h
 *
 * Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
 */

#ifndef TINY_CPP_CLIENT_ShowsSalesGroupingType_H_
#define TINY_CPP_CLIENT_ShowsSalesGroupingType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
 *
 *  \ingroup Models
 *
 */

class ShowsSalesGroupingType{
public:

    /*! \brief Constructor.
	 */
    ShowsSalesGroupingType();
    ShowsSalesGroupingType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ShowsSalesGroupingType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ShowsSalesGroupingType_H_ */
