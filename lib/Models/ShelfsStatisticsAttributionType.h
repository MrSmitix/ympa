
/*
 * ShelfsStatisticsAttributionType.h
 *
 * Тип атрибуции:   * &#x60;CLICKS&#x60; — по кликам.   * &#x60;SHOWS&#x60; — по показам. &lt;br&gt;&lt;br&gt;  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
 */

#ifndef TINY_CPP_CLIENT_ShelfsStatisticsAttributionType_H_
#define TINY_CPP_CLIENT_ShelfsStatisticsAttributionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
 *
 *  \ingroup Models
 *
 */

class ShelfsStatisticsAttributionType{
public:

    /*! \brief Constructor.
	 */
    ShelfsStatisticsAttributionType();
    ShelfsStatisticsAttributionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ShelfsStatisticsAttributionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ShelfsStatisticsAttributionType_H_ */
