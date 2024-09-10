
/*
 * ReportSubStatusType.h
 *
 * Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей. 
 */

#ifndef TINY_CPP_CLIENT_ReportSubStatusType_H_
#define TINY_CPP_CLIENT_ReportSubStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. 
 *
 *  \ingroup Models
 *
 */

class ReportSubStatusType{
public:

    /*! \brief Constructor.
	 */
    ReportSubStatusType();
    ReportSubStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReportSubStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReportSubStatusType_H_ */
